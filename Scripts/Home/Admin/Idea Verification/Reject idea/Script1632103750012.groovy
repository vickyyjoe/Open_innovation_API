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

WebUI.openBrowser(GlobalVariable.staging)

WebUI.setText(findTestObject('Object Repository/Create Ideas/input_Email'), GlobalVariable.accMaster)

WebUI.setText(findTestObject('Object Repository/Create Ideas/input_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Object Repository/Create Ideas/button_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Ideas/h1_Kalbe Idea Platform'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Object Repository/Admin/Master TOpik/button_Admin'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Idea Verif/button_Idea Verification'))

WebUI.click(findTestObject('Admin/Idea Verif/btn_actionIdeaVerif'))

WebUI.click(findTestObject('Admin/Idea Verif/Reject/button_Reject'))

WebUI.setText(findTestObject('Admin/Idea Verif/Reject/textarea_rejectNote'), 'Reject')

WebUI.click(findTestObject('Admin/Idea Verif/Reject/button_RejectOK'))

WebUI.refresh()

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Admin/Idea Verif/Accept/span_Accepted'), 'Rejected')

WebUI.closeBrowser()

