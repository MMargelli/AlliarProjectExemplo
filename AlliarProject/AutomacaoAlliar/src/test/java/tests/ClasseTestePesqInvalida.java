package tests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class ClasseTestePesqInvalida {
	
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();

	@Before
	public void setUp() throws Exception {
		
		metodos.abrirNavegador("https://www.olx.com.br/");
		
	}

	@After
	public void tearDown() throws Exception {
		
		metodos.fecharNavegador();
	}

	@Test
	public void test() throws IOException, InterruptedException {
		metodos.preencher(elementos.campoPesquisar, "caramba carambolhetas");
		metodos.clicar(elementos.btnLupaPesquisa);
		metodos.scroll(0, 200);
		Thread.sleep(2000);
		metodos.evidenciaTeste("Evidencia - Teste pesquisa inválida");
		
	}

}
