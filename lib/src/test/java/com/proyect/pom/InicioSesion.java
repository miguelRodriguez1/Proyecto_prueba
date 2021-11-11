package com.proyect.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InicioSesion extends Base {

	public InicioSesion(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By inicioSesion = By.linkText("Sign in");
	By cerrarSesion =By.linkText("Sign out");
	By correo = By.id("email");
	By password=By.id("passwd");
	By inicio=By.name("SubmitLogin");
	By autenticador= By.className("page-heading");
	
	
	public void inicio() throws InterruptedException {
		click(inicioSesion);
		Thread.sleep(2000);
		if(isDisplayed(autenticador)) {
			type("mirs6796@gmail.com",correo);
			type("12345",password);
			click(inicio);
			Thread.sleep(2000);
			if(isDisplayed(cerrarSesion)) {
				click(cerrarSesion);
			}
			
		}else {
			System.out.println("la pagina de resitro no fue encontrada");
		}
		
	}
	public String mensajeInicio() {
		System.out.println(getText(cerrarSesion));
		return getText(cerrarSesion);
	}
	
	
}
