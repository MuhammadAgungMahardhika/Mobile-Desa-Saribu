B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=13.1
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private MainScroll As ScrollView
	Private Navbar As Panel
	Private EditUsername As EditText
	Private EditFirstname As EditText
	Private EditLastname As EditText
	Private EditEmail As EditText
	Private EditPassword As EditText
	Private EditConfirmpassword As EditText
	Private BtnRegister As Button
	Public sessionID As String
	Public csrfToken As String
	Public manager As AHPreferenceManager
	Private PanelLogin As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("login - copy")
	Navbar.Visible = False
		
	If Navbar.Visible == False Then
		MainScroll.Top = MainScroll.Top - Navbar.Height
		MainScroll.Height = MainScroll.Height + Navbar.Height
		
	End If
	PanelLogin.Height = MainScroll.Height
	MainScroll.Panel.Height = MainScroll.Height

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub BtnRegister_Click
	Core.ExecuteUrl(Main.API&"register", "username="&EditUsername.Text&"&first_name="&EditFirstname.Text&"&last_name="&EditLastname.Text&"&email="&EditEmail.Text&"&password="&EditPassword.Text&"&confirm_password="&EditConfirmpassword.Text&"&role_id="&"2", "Register", Me)
End Sub
' Subroutine to handle the result of ANY HttpJob initialized with this module as target
Sub JobDone(Job As HttpJob)
	' Sembunyikan progress dialog jika ditampilkan sebelumnya (jika ada)
	ProgressDialogHide

	' Log the job name and success status for debugging
	Log("JobDone: JobName = " & Job.JobName & ", Success = " & Job.Success)

	' *** PENTING: Periksa JobName untuk memastikan ini adalah job yang benar ***
	If Job.JobName = "Register" Then
		' --- Mulai Logika untuk Job "Register" ---

		' Check if the HTTP request was successful
		If Job.Success Then
			' Try to process the response from the server
			Try
				Dim res As String
				res = Job.GetString ' Get the response body as a string
				Log("Response from server (Register Job): " & res) ' Log the raw response

				' Parse the JSON response
				Dim parser As JSONParser
				parser.Initialize(res)
				Dim map As Map = parser.NextObject ' Get the root JSON object as a Map

				' Extract status and message from the response
				Dim status As Int = map.Get("status")
				Dim message As Object = map.Get("message")
				Dim messageString As String

				' Handle different types for the 'message' field
				If message Is String Then
					messageString = message
				Else If message Is List Then
					' Handle PHP array message (ambil elemen pertama)
					Dim tempList As List = message
					If tempList.Size > 0 Then
						messageString = tempList.Get(0) ' Ambil pesan dari elemen pertama
					Else
						messageString = "Received an empty success message list."
					End If
					Log("Message field is a List: " & message)
				Else If message Is Map Then
					' Handle PHP validation errors (Map)
					Dim errorMap As Map = message
					Dim sbErrors As StringBuilder
					sbErrors.Initialize
					For Each key As String In errorMap.Keys
						sbErrors.Append(key).Append(": ").Append(errorMap.Get(key)).Append(CRLF) ' Gabungkan semua error
					Next
					messageString = sbErrors.ToString ' String berisi semua error validasi
					Log("Message field is a Map (Validation Errors): " & message)
				Else
					' Handle other types or null
					messageString = "Unknown or null message format received from server."
					Log("Message field has an unexpected type or is null.")
				End If

				' Check the status code from the server
				If status = 201 Then ' Assuming 201 means successful creation
					' Show success messages
					ToastMessageShow("Registration Successful!", False) ' Durasi singkat lebih umum untuk sukses
					' Gunakan messageString yang sudah diproses jika ingin menampilkan pesan dari server
					'MsgboxAsync("Welcome! Your account has been created. Server message: " & messageString, "Registration Successful")
					Log("Account created")
					Log(map) ' Log map untuk debugging
					' Extract user data and session info if available
					If map.ContainsKey("data") Then
						Dim data As Map = map.Get("data")
						If data <> Null And data.IsInitialized Then
							If data.ContainsKey("session_id") Then
								Dim sessionID As String = data.Get("session_id")
								manager.SetString("session_id", sessionID)
							End If
							If data.ContainsKey("csrf_token") Then
								Dim csrfToken As String = data.Get("csrf_token")
								manager.SetString("csrf_token", csrfToken)
							End If
							If data.ContainsKey("id") Then
								Dim id As String = data.Get("id")
								manager.SetString("user_id", id)
							End If
						Else
							Log("Data field received but is null or not initialized.")
						End If
					Else
						Log("Data field not found in the successful response.")
					End If


					' Update application state to reflect login
					manager.SetBoolean("is_login", False)
					manager.SetBoolean("user", True)
					manager.SetBoolean("visitor", False)

					' Close the current activity and navigate to the main activity
					Activity.Finish
					StartActivity(Main)
				Else
					' Show registration failed message using the extracted messageString
					' (Ini akan menampilkan pesan error validasi jika status 400)
					'MsgboxAsync("Registration Failed: " & CRLF & messageString, "Registration Failed")
					ToastMessageShow("Registration Failed. See details.", True) ' Pesan Toast singkat
				End If
			Catch
				' Catch any exceptions during response processing (JSON parsing, data extraction, etc.)
				Log("Error processing server response (Register Job):")
				Log(LastException) ' Log the full exception details
				' Show an async message box indicating an error occurred during response processing
				'MsgboxAsync("Error processing server response: " & LastException.Message, "Processing Error")
				ToastMessageShow("Error processing response.", True)
			End Try
		Else
			' Handle HTTP request failure (network error, server error, etc.)
			Log("Error in Register Job: " & Job.ErrorMessage) ' Log the HTTP job error message
			' Show an async message box indicating the HTTP request error
			'MsgboxAsync("Error connecting to server: " & Job.ErrorMessage, "Connection Error")
			ToastMessageShow("Error: " & Job.ErrorMessage, True) ' Also show a toast message
		End If

		' --- Akhir Logika untuk Job "Register" ---

	Else
		' Handle other jobs if this activity initiates more than one HttpJob
		Log("JobDone received for unexpected JobName: " & Job.JobName)
	End If

	' Release the job object to free up resources, regardless of which job it was
	Job.Release
End Sub


