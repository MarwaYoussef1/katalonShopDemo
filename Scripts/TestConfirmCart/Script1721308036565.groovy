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

WebUI.openBrowser('https://opencart.abstracta.us/index.php?route=account/logout')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_My Account_caret'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'))

WebUI.setText(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'), 'marwa.abdelrahmaan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Login/input_Password_password'), 'cYYE/iK6uDo=')

WebUI.click(findTestObject('Object Repository/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My Account/h2_My Account'), 'My Account')

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Components'))

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Show All Components'))

WebUI.click(findTestObject('Object Repository/Page_Components/a_Mice and Trackballs (0)'))

WebUI.click(findTestObject('Object Repository/Page_Mice and Trackballs/a_Phones  PDAs'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/div_Phones  PDAs         Success You have a_1ff597'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/button_2 item(s) - 200.00'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/strong_View Cart'))

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/a_Checkout'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/a_Logout'))

WebUI.click(findTestObject('Object Repository/Page_Account Logout/p_You have been logged off your account. It_3147bb'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Account Logout/p_You have been logged off your account. It_3147bb'), 
    'You have been logged off your account. It is now safe to leave the computer.')

WebUI.closeBrowser()

