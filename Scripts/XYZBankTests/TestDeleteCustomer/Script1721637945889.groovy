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

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Bank Manager Login'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51'), 'Anas')

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Last Name_form-control ng-pristine ng_64913d'), 'Youssef')

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_Post Code_form-control ng-pristine ng_b8fd27'), '12315')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Add Customer_1'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Customers'))

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/td_Anas'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_XYZ Bank/td_Anas'), 'Anas')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/button_Delete'))

WebUI.setText(findTestObject('Object Repository/Page_XYZ Bank/input_First Name_form-control ng-pristine n_693e51'), 'anas')

WebUI.click(findTestObject('Object Repository/Page_XYZ Bank/div_First Name                             _0d1c16'))

WebUI.closeBrowser()

