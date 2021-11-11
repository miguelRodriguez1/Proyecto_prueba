package com.proyect.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class RegistroTest {

	private WebDriver driver;
	PaginaRegistro pRegistro;
	@Before
	public void setUp() throws Exception {
		pRegistro= new PaginaRegistro(driver);
		driver=pRegistro.chromeDriverConnection();
		pRegistro.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
	pRegistro.registro();
	assertEquals("MY ACCOUNT",pRegistro.mensajeRegistro());
	}

}
