B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
' Activity module: HomeUser
' Author: Anda
' Version: 1.0

#Region Activity Attributes
    #FullScreen: False
    #IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	' Asumsikan variabel ini sudah ada di Main module:
	' Public data As Map
	' Public id, username, email, first_name, last_name, avatar, address, phone As String
	Public status As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private LabelHeader As Label
	Private LabelLogout As Label
	Private LabelName As Label
	Private LabelUsername As Label
	Private PanelBanner As Panel
	Private PanelHome As Panel
	Private PanelMenu As Panel
	Private PanelProfile As Panel
	Private ProfileAvatar As ImageView
	Private BtnBack As Button
	Private MainScroll As ScrollView
	Private Navbar As Panel
	Private TitleNavbar As Label
	Private BtnLogout As Button
	Private BtnRG As Button
	Private LabelPackage As Label
	Private LabelRG As Label
	Private BtnGemma As Button
	Private LabelGemma As Label
	Private BtnPackage As Button

	' --- FLAG BARU ---
	Private profileDataLoaded As Boolean = False ' Penanda apakah data profil sudah dimuat
	' --- AKHIR FLAG BARU ---
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MainScrollView") ' Muat layout utama
	MainScroll.Panel.LoadLayout("HomeUser") ' Muat layout spesifik HomeUser ke panel scrollview
	PanelHome.Height = MainScroll.Height ' Sesuaikan tinggi panel home
	MainScroll.Panel.Height = MainScroll.Height ' Sesuaikan tinggi panel scrollview
	TitleNavbar.Text="Home User" ' Set judul navbar
	BtnBack.Visible = False ' Sembunyikan tombol kembali

	' Reset flag saat activity dibuat pertama kali (jika diperlukan)
	If FirstTime Then
		profileDataLoaded = False
	End If
End Sub

Sub Activity_Resume
	Log("HomeUser loaded (Resume)")

	Dim userId As String = Main.manager.GetString("user_id")

	' --- LOGIKA PEMANGGILAN API PROFIL DIPERBARUI ---
	' Panggil API HANYA jika userId ada DAN data belum dimuat (flag = False)
	If userId <> "" And Not(profileDataLoaded) Then
		Log("User ID found: " & userId & ". Profile data not loaded yet. Fetching profile...")
		Core.ExecuteUrlGet(Main.API & "user/" & userId, "Profile", Me)
	Else If userId = "" Then
		Log("User ID not found in manager. Cannot fetch profile.")
		' Tambahkan logika lain jika user_id tidak ada, misalnya kembali ke login?
		ToastMessageShow("Sesi tidak valid, silakan login kembali.", True)
		Activity.Finish
		StartActivity(Main) ' Kembali ke activity Main/Login
	Else
		Log("Profile data already loaded. Skipping API call.")
		' Jika data sudah ada, pastikan UI terupdate (jika perlu, tapi biasanya sudah saat JobDone)
	End If
	' --- AKHIR LOGIKA DIPERBARUI ---
End Sub

Sub Activity_Pause (UserClosed As Boolean)
	' Kode yang dijalankan saat activity dijeda
End Sub

Sub JobDone (Job As HttpJob)
	Log("JobName = " & Job.JobName & ", Success = " & Job.Success)
	If Job.Success Then
		Dim res As String
		res = Job.GetString
		Dim parser As JSONParser
		parser.Initialize(res)
		Log("Response from server :"&res)
		Select Job.JobName
			Case "Profile"
				Try
					Dim map As Map
					map = parser.NextObject
					Dim profileData As Map ' Gunakan variabel lokal untuk data profil
					profileData = map.Get("data")
					If profileData = Null Then
						Log("Error: 'data' field is null in profile response.")
						profileDataLoaded = False ' Gagal memuat
						Return ' Keluar jika data null
					End If

					' Ambil data dari profileData
				
					Dim tempUsername As String = profileData.Get("username")
					Dim tempFirstName As String = profileData.Get("first_name")
					Dim tempLastName As String = profileData.Get("last_name")
					Dim tempAvatar As String = profileData.Get("avatar")


					' --- Logika Menampilkan Nama Lengkap ---
					Dim validFirstName As String = ""
					Dim validLastName As String = ""

					If tempFirstName <> Null Then
						Dim trimmedFirstName As String = tempFirstName.Trim
						If trimmedFirstName <> "" And trimmedFirstName.ToLowerCase <> "null" Then
							validFirstName = tempFirstName
						End If
					End If

					If tempLastName <> Null Then
						Dim trimmedLastName As String = tempLastName.Trim
						If trimmedLastName <> "" And trimmedLastName.ToLowerCase <> "null" Then
							validLastName = tempLastName
						End If
					End If

					Dim fullName As String = ""
					If validFirstName <> "" Then fullName = validFirstName
					If validLastName <> "" Then
						If fullName <> "" Then fullName = fullName & " " & validLastName
					Else 
						fullName = validLastName
					End If

					LabelName.Text = fullName
					LabelUsername.Text = "@" & tempUsername ' Gunakan tempUsername
					' --- Akhir Logika Nama Lengkap ---

					' --- Pemeriksaan Avatar yang Lebih Kuat ---
					Dim isAvatarValid As Boolean = False
					If tempAvatar <> Null Then
						Dim trimmedAvatar As String = tempAvatar.Trim
						If trimmedAvatar <> "" And trimmedAvatar.ToLowerCase <> "null" Then
							isAvatarValid = True
						End If
					End If
					' --- Akhir Pemeriksaan Avatar ---

					If isAvatarValid Then
						Log("Avatar check passed. Avatar value: """ & tempAvatar & """. Attempting download.")
						Dim avatarMap As Map
						Dim avatarPath As String
						avatarPath = Main.server & "media/photos/" & tempAvatar
						Log("Attempting to download avatar from: " & avatarPath)
						avatarMap.Initialize
						avatarMap.Put(ProfileAvatar, avatarPath)
						CallSubDelayed2(Starter, "Download", avatarMap)
					Else
						Log("Avatar check failed. Avatar is Null, empty string, or the string ""null"". Skipping download.")
						' ProfileAvatar.Bitmap = LoadBitmap(File.DirAssets, "placeholder_avatar.png") ' Contoh placeholder
					End If

					' --- SET FLAG SETELAH SUKSES ---
					profileDataLoaded = True  ' Tandai bahwa data sudah berhasil dimuat
					Log("Profile data successfully processed and loaded.")
					' --- AKHIR SET FLAG ---

				Catch
					Log("Error processing profile data: " & LastException)
					profileDataLoaded = False ' Set false jika ada error saat proses
				End Try

			Case "Logout"
				Try
					Dim map As Map
					map = parser.NextObject
					status = map.Get("status")
					If status == 200 Then
						MsgboxAsync("Successfully logged out", "Log Out")
						Main.manager.SetBoolean("is_login", False)
						Main.manager.SetBoolean("visitor", False)
						Main.manager.SetBoolean("user", False)
						Main.manager.SetString("user_id", "") ' Kosongkan user_id juga
						Log("Successfully logged out")
						Activity.Finish
						StartActivity(Main) ' Kembali ke activity Main/Login
					Else
						MsgboxAsync("Logout failed. Status: " & status, "Log Out Error")
					End If
				Catch
					Log("Error processing logout response: " & LastException)
					MsgboxAsync("Error during logout process.", "Log Out Error")
				End Try
		End Select

	Else ' Job.Success = False
		Dim errorParser As JSONParser
		errorParser.Initialize(Job.ErrorMessage)
		Dim errorMap As Map
		errorMap = errorParser.NextObject
		Log("Error: " & Job.ErrorMessage)

		Dim errorMsg As String = "Unknown error"
		If errorMap <> Null And errorMap.ContainsKey("message") Then
			errorMsg = errorMap.Get("message")
		Else if Job.ErrorMessage.Contains("java.net.") Then ' Cek error jaringan
			errorMsg = "Network error. Please check your connection."
		End If

		ToastMessageShow("Error: " & errorMsg, True)

		' --- PASTIKAN FLAG FALSE JIKA API GAGAL ---
		If Job.JobName = "Profile" Then
			profileDataLoaded = False ' Set false agar bisa coba lagi nanti
			Log("API call for Profile failed. Flag reset to false.")
		End If
		' --- AKHIR PENANGANAN FLAG GAGAL ---
	End If
	Job.Release
End Sub

' --- Event Handler untuk Tombol ---

Private Sub BtnRG_Click
	Log("Redirect to MapsRG Activity")
	StartActivity(MapsRG)
End Sub

Private Sub BtnLogout_Click
	Log("Attempting to logout...")
	' Tampilkan konfirmasi sebelum logout
	 Msgbox2Async("Are you sure you want to log out?", "Confirm Logout", "Yes", "", "No", Null,False)
	Wait For Msgbox_Result(Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Log("Logout confirmed. Calling API...")
		Core.ExecuteUrlGet(Main.API & "logout", "Logout", Me)
		Activity.Finish
	Else
		Log("Logout cancelled.")
	End If
End Sub

Private Sub BtnPackage_Click
	Log("Redirect to List Package")
	StartActivity(ListPackage)
End Sub

Private Sub BtnGemma_Click
	Log("Redirect to Gemma Activity")
	StartActivity(Gemma)
End Sub

' Asumsikan ada tombol Cart, uncomment jika ada
Private Sub btnCart_Click
	Log("Redirect to Cart Activity")
	StartActivity(Cart)
End Sub

' Event handler untuk tombol back di navbar (jika ada dan visible)
Private Sub BtnBack_Click
	Activity.Finish ' Kembali ke activity sebelumnya
End Sub
