package br.edu.rodrigocoradi.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/", //camiho do arquivo de features
		glue = "br.edu.rodrigocoradi.steps", //caminho para os passos
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"}, //forma com que apareca o resultado - (pretty - pra aparecer no console a descricao da historia)
		monochrome = true, //para remover os caracteres de formatacao
		snippets = SnippetType.CAMELCASE, //para deixar os nomes dos metodos com CamelCase
		dryRun = false, //validar se esta tudo correto com os metodos criados, ele nao era executar os testes, apenas validar
		strict = false, //valida se todos os passos estao com seus metodos criados, se tiver algum sem ser criado, o junit recusará o teste
		tags = "@funcionais" //serve para mostrar qual cenários executar ou não
		)
public class RunnerFuncionalTest {
	
	@BeforeClass
	public static void reset() {
		System.setProperty("webdriver.chrome.driver", "/media/hdcoradi/Projetos/Utils/chromedriver_linux64/chromedriver");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("wcrodrigo@hotmail.com");
		driver.findElement(By.name("senha")).sendKeys("jesuseuteamo");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}

}
