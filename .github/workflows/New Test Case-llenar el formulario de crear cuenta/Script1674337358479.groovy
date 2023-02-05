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

WebUI.navigateToUrl('https://www.mercadolibre.com.ve/')

WebUI.click(findTestObject('Object Repository/Page_Mercado Libre Venezuela - Envos Gratis_1bb2b0/a_Crea tu cuenta'))

WebUI.setText(findTestObject('Page_Regstrate en Mercado Libre/input_Nombre_firstName'), 'carlos')

WebUI.setText(findTestObject('Page_Regstrate en Mercado Libre/input_Apellido_lastName'), 'gonzalez')

WebUI.setText(findTestObject('Page_Regstrate en Mercado Libre/input_Documento_identification'), '123456')

WebUI.setText(findTestObject('Page_Regstrate en Mercado Libre/input_E-mail_email'), 'test1@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Regstrate en Mercado Libre/input_Clave_password'), 'HwXnxaZD17M=')

WebUI.click(findTestObject('Object Repository/Page_Regstrate en Mercado Libre/input_Clave_tyc_checkbox'))

WebUI.closeBrowser()

