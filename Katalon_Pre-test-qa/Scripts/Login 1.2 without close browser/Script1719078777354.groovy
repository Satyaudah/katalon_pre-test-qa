import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.verifyElementPresent(findTestObject('Main_Page/Cura_Healthcare_Service_Label1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/We_Care_About_Your_Health_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Cura_Healthcare_Service_2_Label1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Address_label1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Phone_number_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Mail_Label1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Facebook_Button1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Twitter_Logo'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Dribbble_Logo1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/Copyright_Label1'), 30)

WebUI.verifyElementPresent(findTestObject('Main_Page/CURA Healthcare_menu-toggle1'), 30)

WebUI.click(findTestObject('Main_Page/Make_Appointment_Button'))

WebUI.verifyElementPresent(findTestObject('Login_Page/Login_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Please_Login_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Cura_Healthcare_Service_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Address_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Phone_Number_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Mail_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Facebook_Logo2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Twitter_Logo2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Dribble_Logo2'), 30)

WebUI.verifyElementPresent(findTestObject('Login_Page/Copyright_Label2'), 30)

WebUI.setText(findTestObject('Login_Page/Username_Textfield'), 'John Doe')

WebUI.setText(findTestObject('Login_Page/Password_Textfield'), 'ThisIsNotAPassword')

WebUI.click(findTestObject('Login_Page/Login_Button'))

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Make_Appointment_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Facility_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Apply_For_Hospital_Readmission_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Healtcare_Program_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Medicare_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Medicaid_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/None_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Visit_Date_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Comment_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/CURA Healthcare_menu-toggle3'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Page/Book_Appointment_Button'), 30)

WebUI.click(findTestObject('Appointment_Page/Facility_Dropdown'))

WebUI.click(findTestObject('Appointment_Page/Apply_For_Hospital_Readmission_Chechbox'))

WebUI.click(findTestObject('Appointment_Page/Medicaid_Radiobutton'))

WebUI.click(findTestObject('Appointment_Page/Date_Picker'))

WebUI.click(findTestObject('Appointment_Page/27_Date'))

WebUI.setText(findTestObject('Appointment_Page/Comment_Textfield'), 'Set Appointment')

WebUI.click(findTestObject('Appointment_Page/Book_Appointment_Button'))

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Appointment_Confirmation_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Please_Be_Informed_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Facility_label2'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Facility_Summary_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Apply_For_Hospital_Readmission_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Apply_For_Hospital_Readmission_Summary_Label'), 
    30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Healtcare_Program_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Healthcare_Program_Summary_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Visit_Date_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Visit_Date_Summary_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Comment_Label2'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Comment_Summary_Label'), 30)

WebUI.verifyElementPresent(findTestObject('Appointment_Confirmation_Page/Go_to_homepage_Button'), 30)

WebUI.click(findTestObject('Appointment_Confirmation_Page/Go_to_homepage_Button'))

WebUI.closeBrowser()

