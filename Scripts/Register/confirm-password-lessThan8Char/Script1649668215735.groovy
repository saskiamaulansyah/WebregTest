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

WebUI.navigateToUrl('https://webreg.abicommodity.co.id/')

WebUI.click(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/input_Nama lengkap_form-input'), 
    'saskia')

WebUI.setText(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/input_Email_form-input'), 
    'user@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/input_Username_form-input'), 
    'saskiacoba')

WebUI.setText(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/input_No Telepon_form-input'), 
    '081252070448')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/input_Password_form-input'), 
    'P9ET2sDE0SE=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/input_Konfirmasi password_form-input'), 
    'P9ET2sDE0SE=')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/select_Pilih Platform yang ingin digunakanJ_ccd3e9'), 
    'JFXGoldX', true)

WebUI.click(findTestObject('Object Repository/Page_Webreg ABI Commodity 11/Page_Webreg ABI Commodity/div_Daftar'))

WebUI.verifyElementPresent(findTestObject('Page_Webreg ABI Commodity/div_Konfirmasi password minimal 8 karakter'), 0)

WebUI.closeBrowser()

