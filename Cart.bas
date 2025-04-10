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
	Private MyWebViewExtras As WebViewExtras
	Private MainScroll As ScrollView
	Private TitleNavbar As Label
	Public sessionID As String
	Public csrfToken As String
	Public manager As AHPreferenceManager
	Private WebViewGemma As WebView
	Private Navbar As Panel
	Dim userId As String
	Private btnCart As B4XView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Activity.LoadLayout("MainScrollView")
	MainScroll.Panel.LoadLayout("Gemma")
	WebViewGemma.Height = MainScroll.Height

	MainScroll.Panel.Height = MainScroll.Height
	TitleNavbar.Text = "Cart"
	btnCart.Visible = False
	MyWebViewExtras.addWebChromeClient(WebViewGemma, "WebViewGemma")
	MyWebViewExtras.clearCache(WebViewGemma,True)
	WebViewGemma.JavaScriptEnabled = True
	WebViewGemma.AllowFileAccess = True
	userId = manager.GetString("user_id")
	WebViewGemma.LoadUrl(Main.server&"mobile/reservation/"&userId)
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Public Sub SetUserId
	Log("Set User Id")
	Dim exectFunction As String
    
	userId = manager.GetString("user_id")
	Log("User ID: " & userId)
    
	If userId <> "" And userId <> Null Then
		exectFunction = "receiveUserIdFromB4A('" & userId & "')"
		MyWebViewExtras.executeJavascript(WebViewGemma, exectFunction)
	Else
		Log("User ID is empty or null")
	End If
End Sub

Private Sub WebViewGemma_PageFinished (Url As String)
	Log("page finished")
	SetUserId
End Sub

Private Sub BtnBack_Click
	Log("Going back to previous activity")
	Activity.Finish
End Sub
