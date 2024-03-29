import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.orangehrm.com/')

WebUI.click(findTestObject('Object Repository/Page_HR Management System  HR Management Software  OrangeHRM/div_We'))

WebUI.click(findTestObject('Object Repository/Page_HR Management System  HR Management Software  OrangeHRM/a_Accept Cookies'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/canvas_Employee Distribution by Subunit_flot-overlay'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/td_Finance'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Assign Leave'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input__assignleavetxtEmployeeempName'), 'd')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/li_Linda Anderson'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/img__ui-datepicker-trigger'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_13'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OrangeHRM/select_--Select--FMLA'), '2', true)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input__assignBtn'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/div_Successfully Assigned       Close'))

WebUI.closeBrowser()

