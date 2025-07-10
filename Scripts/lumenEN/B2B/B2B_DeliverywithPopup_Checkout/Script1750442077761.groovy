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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_Quebecs largest distributor of electri_502989/button_Accept All'))

CustomKeywords.'MyKeywords.B2Blogin'()

WebUI.click(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_B2B  Quebecs largest distributor of el_3fb5b3/i_fe fe-shopping-cart'))

WebUI.setText(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/input_Enter product code'), 
    'cab6rw90blk')

WebUI.click(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/i_fe fe-plus'))

WebUI.setText(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/input_length'), '2')

WebUI.click(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/span_Delivery'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/select_shipTo'), 
    'Centre de Distribution', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/input_checkout-btn'))

WebUI.click(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Shopping Cart/input_checkout-btn'))

WebUI.setText(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Checkout/input_Customer PO _'), '345')

WebUI.verifyElementPresent(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Checkout/input_Review Order'), 
    0)

WebUI.click(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Checkout/input_Review Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Checkout/input_Submit Order'), 
    0)

WebUI.click(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Checkout/input_Submit Order'))

WebUI.verifyElementText(findTestObject('Object Repository/B2B_DeliverywithPopup_Checkout/Page_Checkout/div_Thank you for your order'), 
    'Thank you for your order')

