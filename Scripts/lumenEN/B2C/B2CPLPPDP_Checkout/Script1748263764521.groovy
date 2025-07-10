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

CustomKeywords.'MyKeywords.B2Clogin'()

WebUI.click(findTestObject('Object Repository/B2C_Checkout/Page_B2C  Quebecs largest distributor of el_4bbf35/a_level1'))

WebUI.click(findTestObject('Object Repository/B2C_Checkout/Page_B2C  Quebecs largest distributor of el_4bbf35/a_Lighting'))

WebUI.click(findTestObject('Object Repository/B2C_Checkout/Page_Lighting/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/B2C_Checkout/Page_Lighting/a_SCELVPFLEDV2HAZ'))

WebUI.click(findTestObject('Object Repository/B2C_Checkout/Page_IPEX 277121 Sceptalight 15 W LED LVPF _8674e1/button_ADD TO CART'))

WebUI.closeBrowser()

