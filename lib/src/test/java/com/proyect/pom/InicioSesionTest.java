package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class InicioSesionTest {
	private WebDriver driver;
	InicioSesion inicio;
	@Before
	public void setUp() throws Exception {
		inicio= new InicioSesion(driver);
		driver=inicio.chromeDriverConnection();
		inicio.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		inicio.inicio();
		//assertEquals("Sign out",inicio.mensajeInicio());
	}
}
