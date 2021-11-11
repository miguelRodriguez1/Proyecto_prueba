package com.proyect.pom;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PaginaRegistro extends Base {
	By inicioSesion = By.linkText("Sign in");
	By crearUsuaurio = By.id("SubmitCreate");
	By correoUsuario= By.id("email_create");
	//By titulo =By.className("radio-inline");
	By firstName=By.name("customer_firstname");
	By lastName=By.id("customer_lastname");
	By Email= By.id("email");
	By password=By.id("passwd");
	By day=By.id("days");
	By mounth=By.id("months");
	By year=By.id("years");
	By Check1= By.id("newsletter");
	By Check2=By.id("optin");
	By firsName2=By.id("firstname");
	By lastName2=By.id("lastname");
	By company=By.id("company");
	By address= By.id("address1");
	By address2= By.id("address2");
	By city= By.id("city");
	By state= By.id("id_state");
	By zipCode=By.id("postcode");
	By country=By.cssSelector("United States");;
	By AInformation=By.id("other");
	By HomePhone=By.name("phone");
	By MobilePhone=By.name("phone_mobile");
	By AAddress= By.name("alias");
	By Registro = By.id("submitAccount");
	By autenticador= By.className("page-heading");
	By confirmacion= By.cssSelector("MY ACCOUNT");
	public PaginaRegistro(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void registro() throws InterruptedException {
		click(inicioSesion);
		Thread.sleep(2000);
		if(isDisplayed(autenticador)) {
			type("miguel@gmaiadasdasdasdl.com",correoUsuario);
			click(crearUsuaurio);
			Thread.sleep(2000);
			//type("miguel@gmaiadasdasdasdl.com",correoUsuario);
			type("miguel",firstName);
			type("Rodriguez",lastName);
			//type("",Email);
			type("12345",password);
			//type("1",day);
			//type("",mounth);
			//type("2001",year);
			//type("",firsName2);
			//type("miguel@gmaiadasdasdasdl.com",lastName2);
			type("mirs",company);
			type("calle xxx",address);
			type("calle yyy",address2);
			type("Bogota",city);
			//type(selectList().toString(),state);
			type("00000",zipCode);
			//type("21",country);
			type("dasdasdasdasdsadasdas",AInformation);
			type("123",HomePhone);
			type("123",MobilePhone);
			//type("miguel@gmaiadasdasdasdl.com",AAddress);
			click(Registro);
		}else {
			System.out.println("la pagina de resitro no fue encontrada");
		}
		
	}
	public String selectList() {
	Select selectList =new Select(findElement(state));
	selectList.deselectByVisibleText("Alabama");
	return getText(selectList.getFirstSelectedOption());
	}
	public String mensajeRegistro() {
		return getText(confirmacion);
	}
	
}
