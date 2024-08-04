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

WebUI.navigateToUrl('https://opencart.abstracta.us/index.php')

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'), 'marwa.abdelrahmaan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Login/input_Password_password'), 'cYYE/iK6uDo=')

WebUI.click(findTestObject('Object Repository/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Phones  PDAs'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/a_Cameras'))

WebUI.click(findTestObject('Object Repository/Page_Cameras/span_Add to Cart'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenCart - Canon EOS 5D/select_--- Please Select ---               _05c2cc'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Page_OpenCart - Canon EOS 5D/button_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_OpenCart - Canon EOS 5D/span_2 item(s) - 180.00'))

WebUI.click(findTestObject('Object Repository/Page_OpenCart - Canon EOS 5D/strong_View Cart'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Shopping Cart/img_OpenCart_bitnami-close-banner-button'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/a_Checkout'))

WebUI.navigateToUrl('https://opencart.abstracta.us/index.php?route=checkout/checkout')

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Region  State_button-payment-address'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Region  State_button-shipping-address'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Add Comments About Your Order_button-_543ebe'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Terms  Conditions_agree'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_Terms  Conditions_button-payment-method'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Checkout/td_185.00'), '$185.00')

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_185.00_button-confirm'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Your order has been placed/h1_Your order has been placed'), 
    10)

WebUI.click(findTestObject('Object Repository/Page_Your order has been placed/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Your order has been placed/a_Logout'))

WebUI.closeBrowser()

