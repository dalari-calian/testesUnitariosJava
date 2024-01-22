package br.com.cpassos.servicos;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import br.com.cpassos.entidades.Filme;
import br.com.cpassos.entidades.Locacao;
import br.com.cpassos.entidades.Usuario;
import br.com.cpassos.utils.DataUtils;

public class LocacaoServiceTest {
	//ErrorCollector
	
	@Rule
	public ErrorCollector error = new ErrorCollector();
		
	@Test
	public void testExample() {
				
		//Preparacao
		Usuario usuario = new Usuario(null);
		Filme filme = new Filme(null, 2, 5.0);
		LocacaoService service = new LocacaoService();

		//Acao Estoque Filme
		
		try {
			service.alugarFilme(usuario, filme);
			//error.checkThat(locacao.getValor(), CoreMatchers.is(5.0));//primeiro atual
			//assertEquals( 12.0 , locacao.getValor(), 0.0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertFalse(true);
		}
		//Acao Nome usuario vazio 
		
		
		//Acao Nome filme vazio
		
		
	}
	
	
	@Test
	public void testUsuario() throws Exception{
				
		//Preparacao
		Usuario usuario = new Usuario("Calian");
		Filme filme = new Filme("Rambo", 2, 5.0);
		LocacaoService service = new LocacaoService();
		
		//Acao
		try {
			service.alugarFilme(usuario, filme);
		}
		catch (Exception e){
			e.printStackTrace();
			Assert.assertFalse(true);
		}
		
		//error.checkThat(locacao.getValor(), is(5.0));
		//error.checkThat(locacao.getValor(), is(equalTo(5.0)));
		//error.checkThat(locacao.getValor(), is(not(6.0)));
	}
	
	@Test
	public void testFilme() {
				
		//Preparacao
		Usuario usuario = new Usuario("Calian");
		Filme filme = new Filme("Rambo na Selva", 2, 5.0);
		LocacaoService service = new LocacaoService();

		//Acao Estoque Filme
		
		try {
			service.alugarFilme(usuario, filme);
			//error.checkThat(locacao.getValor(), CoreMatchers.is(5.0));//primeiro atual
			//assertEquals( 12.0 , locacao.getValor(), 0.0);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertFalse(true);
		}
		//Acao Nome usuario vazio 
		
		
		//Acao Nome filme vazio
		
		
	}
}