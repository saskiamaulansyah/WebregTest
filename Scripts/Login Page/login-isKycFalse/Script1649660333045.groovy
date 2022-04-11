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
import com.kms.katalon.core.exception.StepFailedException as StepFailedException

WebUI.openBrowser('')

WebUI.navigateToUrl('https://webreg.abicommodity.co.id/')

WebUI.click(findTestObject('Object Repository/Page_Webreg ABI Commodity 7/Page_Webreg ABI Commodity/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Page_Webreg ABI Commodity 7/Page_Webreg ABI Commodity/input_Email Username No Telepon_data_pribadi'), 
    '0895630495344')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Webreg ABI Commodity 7/Page_Webreg ABI Commodity/input_Password_form-input'), 
    'fzqqY0qJjYRVrxTAfQ5f7A==')

WebUI.click(findTestObject('Object Repository/Page_Webreg ABI Commodity 7/Page_Webreg ABI Commodity/div_Login'))

String currentUrl = WebUI.getUrl()
if (currentUrl == 'https://webreg.abicommodity.co.id/konfirmasi-akun') {
    println "OK"
} else {
    throw new StepFailedException("Wrong URL")
}

WebUI.closeBrowser()

