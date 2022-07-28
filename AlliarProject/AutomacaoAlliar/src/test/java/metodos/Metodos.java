package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	public static void main(String[] args) {
		
	}
	
	WebDriver driver;

	public void abrirNavegador(String url) {
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	
	public void preencher(By elemento, String texto) {
		
		
		driver.findElement(elemento).sendKeys(texto);
	
	}
	
	public void clicar(By elemento) {
		
		driver.findElement(elemento).click();
	}
	public void evidenciaTeste(String nomeEvidencia) throws IOException {

		TakesScreenshot scrShot = (TakesScreenshot) driver;
		File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./evidencias/" + nomeEvidencia + ".png");
		FileUtils.copyFile(scrFile, destFile);
		}
	
	public void scroll(int n1, int n2) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + ", " + n2 + ")");

	}
	public void fecharNavegador() {
		
		driver.quit();
	}
	
	
	

	}
