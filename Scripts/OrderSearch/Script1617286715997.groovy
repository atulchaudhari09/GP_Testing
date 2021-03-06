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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import org.openqa.selenium.WebElement as WebElement
WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev-recycling-portal.azurewebsites.net/account/singlesignon?logintoken=pals.wadhe@gmail.com')

WebUI.click(findTestObject('Object Repository/OrderSearch/Page_My Account - GP Recycling/a_I Agree'))

WebUI.navigateToUrl('https://dev-recycling-portal.azurewebsites.net/profile/myorders')

WebUI.setText(findTestObject('OrderSearch/Page_My Orders - GP Recycling/input_SEARCH ORDERS_OrderNumber'), findTestData(
        'OrderSearch').getValue(1, 1))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Page_My Orders - GP Recycling/input_All_criteriasearch'),30)
WebUI.executeJavaScript("arguments[0].click()", Arrays.asList(element))


WebUI.verifyTextNotPresent('No Search Result(s) found', false)

