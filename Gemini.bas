B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=13.1
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private Panel As Panel
	Private Label1 As Label
	Private ScrollView1 As ScrollView
	Private EditText1 As EditText
	Private Button1 As Button
	Private Label2 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("ChatLayout")
	Label1.Text = "Chat AI Desa Saribu"
	Label2.Text = "Silahkan mulai percakapan"
	Panel.Height = ScrollView1.Height
	ScrollView1.Panel.Height = ScrollView1.Height
	'Set up button click event


End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Button1_Click
	Dim inquiry As String = EditText1.Text.Trim
    
	If inquiry = "" Then
		ToastMessageShow("Silakan masukkan pertanyaan", False)
		Return
	End If
    
	'Nanti akan diisi dengan logika pengiriman pertanyaan ke AI
	Label2.Text = "Memproses pertanyaan: " & inquiry
	EditText1.Text = ""
End Sub