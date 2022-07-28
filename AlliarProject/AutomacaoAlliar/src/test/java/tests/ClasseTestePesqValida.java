package tests;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;

public class ClasseTestePesqValida {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Before
	public void setUp() throws Exception {

		metodos.abrirNavegador("https://www.olx.com.br/");

	}

	@After
	public void tearDown() throws Exception {
		
		metodos.fecharNavegador();
	}

	@Test
	public void test() throws IOException {

		metodos.preencher(el.campoPesquisar, "ps5");
		metodos.clicar(el.btnLupaPesquisa);
		metodos.scroll(0, 400);
		metodos.evidenciaTeste("Evidencia - Teste pesquisa válida");
	}	

}
