import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MyKeywords {
	@Keyword
	def hello() {
		println ("Hello World")
	}
	@Keyword(keywordObject = "B2CLogin")
	def B2Clogin() {
		WebUI.click(findTestObject('Object Repository/Page_Quebecs largest distributor of electri_502989/i_Promotion_fe fe-log-in'))
		WebUI.setText(findTestObject('Object Repository/Page_Login/input__EmailAddress'), 'tejalb2c@test.com')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input__Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')
		WebUI.click(findTestObject('Object Repository/Page_Login/input_Uncheck if using a public device_login'))
	}
	@Keyword(keywordObject = "B2BLogin")
	def B2Blogin() {
		WebUI.click(findTestObject('Object Repository/Page_Quebecs largest distributor of electri_502989/i_Promotion_fe fe-log-in'))
		WebUI.setText(findTestObject('Object Repository/Page_Login/input__EmailAddress'), 'tejal.patel_ext@sonepar.ca')
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input__Password'), 'cvW8qx4B2o3F4VwP/kNsqA==')
		WebUI.click(findTestObject('Object Repository/Page_Login/input_Uncheck if using a public device_login'))
	}
}
