package br.com.cpassos.entidades;

import org.junit.Assert;
import org.junit.Test;

import br.com.cpassos.servicos.LocacaoService;

public class LocacaoServiceTest {
	
	@Test
	public void testeLocacao() {
		//-//preparacao
		
		//instancia dos objetos
		//--Uma forma de fazer
		Filme filme = new Filme("Rambo", 3, 15.9);//inserindo os dados na classe filme  !OBS: Insira na ordem que a variável está declarada na classe
		//filme.setNome(Rambo);
		//filme.setEstoque(3);
		//filme.setPrecoLocacao(15.9);
		      
		//--Outra forma de fazer     
		Usuario usuario = new Usuario();
		usuario.setNome("Calian");
		
		LocacaoService locacaoS = new LocacaoService(); //Criando o objeto 'locacaoS' para chamar o método 'alugarFilmes'
				
		//-//acao
		Locacao retornoFilme = locacaoS.alugarFilme(usuario, filme);//'chamando' o método
				
		//-//verificacao
	//Validacao com Assert, teste unitário	
		//System.out.printf("Nome do filme: ") ; System.out.println(filme.getNome());//Mostra no console o que esta retornando o resultado desejado
		//*--Assert.assertTrue(retornoFilme.getFilme().getNome() == "Rambo");
		
		//System.out.printf("Valor da locação: R$") ; System.out.println(filme.getPrecoLocacao());
		//*--Assert.assertTrue(retornoFilme.getFilme().getPrecoLocacao() == 15.9);
		
		//System.out.printf("Pessoa que alugou: "); System.out.println(usuario.getNome());
		//*--Assert.assertTrue(retornoFilme.getUsuario.getNome() == "Cainã legal");
		
		
		//--Outra forma de fazer
		//System.out.println(retornoFilme.getValor());
	//
		
		//Outros Assert
		
		//1°
		Assert.assertFalse(retornoFilme.getFilme().getNome() == "Spider");
		//2°
		Assert.assertSame(retornoFilme.getValor(), retornoFilme.getValor());
		//3°
		Assert.assertNotNull(retornoFilme);
		//4°
		Assert.assertNotSame("Lego", retornoFilme.getFilme().getNome(), retornoFilme.getUsuario().getNome());
		//5°
		Assert.assertNotNull(retornoFilme.getValor());
		
		
		
	}
	

}
