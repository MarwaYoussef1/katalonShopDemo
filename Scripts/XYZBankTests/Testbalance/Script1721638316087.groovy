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

WebUI.openBrowser('https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login')

WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customer Login'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_XYZ Bank/select_---Your Name---       Hermoine Grang_6e895b'), 
    '2', true)

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_XYZ Bank/strong_0'), '0')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51'), '200')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Deposit_1'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/strong_200'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_XYZ Bank/strong_200'), '200')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Logout'))

WebUI.closeBrowser()

