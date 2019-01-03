package br.edu.rodrigocoradi.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/aprender_cucumber.feature", //camiho do arquivo de features
		glue = "br.edu.rodrigocoradi.steps", //caminho para os passos
		plugin = "pretty", //pra aparecer no console a descricao da historia 
		monochrome = true, //para remover os caracteres de formatacao
		snippets = SnippetType.CAMELCASE, //para deixar os nomes dos metodos com CamelCase
		dryRun = false, //validar se esta tudo correto com os metodos criados, ele nao era executar os testes, apenas validar
		strict = false, //valida se todos os passos estao com seus metodos criados, se tiver algum sem ser criado, o junit recusará o teste
		tags = "~@ignore" //serve para mostrar qual cenários executar ou não
		)
public class Runner {

}
