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

WebUI.click(findTestObject('Object Repository/Page_Your Store/span_My Account_caret'))

WebUI.click(findTestObject('Object Repository/Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Account Login/input_E-Mail Address_email'), 'marwa.abdelrahmaan@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Account Login/input_Password_password'), 'cYYE/iK6uDo=')

WebUI.click(findTestObject('Object Repository/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account/h2_My Account'), 0)

WebUI.click(findTestObject('Object Repository/Page_My Account/a_Phones  PDAs'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/a_Tablets'))

WebUI.click(findTestObject('Object Repository/Page_Tablets/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Tablets/button_2 item(s) - 300.99'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Tablets/strong_View Cart'), 0)

WebUI.click(findTestObject('Object Repository/Page_Tablets/strong_View Cart'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shopping Cart/a_iPhone'), 'iPhone')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Shopping Cart/a_Samsung Galaxy Tab 10.1'), 'Samsung Galaxy Tab 10.1')

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/i_100.00_fa fa-times'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/i_100.00_fa fa-times'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Shopping Cart/a_Phones  PDAs'))

WebUI.navigateToUrl('https://opencart.abstracta.us/index.php?route=product/category&path=24')

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/button_1 item(s) - 279.99'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Phones  PDAs/a_Palm Treo Pro'), 0)

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/i_279.99_fa fa-times'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/a_My Account'))

WebUI.click(findTestObject('Object Repository/Page_Phones  PDAs/a_Logout'))

WebUI.closeBrowser()

