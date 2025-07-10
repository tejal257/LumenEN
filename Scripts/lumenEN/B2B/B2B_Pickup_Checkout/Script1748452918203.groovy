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
//Add to the imports section for use with "driver.switchTo().frame(0)"
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_Quebecs largest distributor of electri_502989/button_Accept All'))

CustomKeywords.'MyKeywords.B2Blogin'()

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Account Dashboard/a_Products'))

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Account Dashboard/a_Power distribution'))

WebUI.enhancedClick(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Power distribution/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Power distribution/i_Promotion_fe fe-shopping-cart'))

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Shopping Cart/span_Pickup'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Shopping Cart/select_shipTo'), 'Centre de Distribution', 
    true)

WebUI.verifyElementClickable(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Shopping Cart/input_checkout-btn'))

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Shopping Cart/input_checkout-btn'))

WebUI.setText(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/input_Customer PO _'), '1234')

WebUI.verifyElementPresent(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/input_Review Order'), 0)

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/input_Review Order'))

WebUI.verifyElementVisible(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/input_Submit Order'))

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/input_Submit Order'))

WebUI.click(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/div_Thank you for your order'))

WebUI.verifyElementText(findTestObject('Object Repository/B2B_Pickup_Checkout/Page_Checkout/div_Thank you for your order'), 
    'Thank you for your order')

WebUI.closeBrowser()

