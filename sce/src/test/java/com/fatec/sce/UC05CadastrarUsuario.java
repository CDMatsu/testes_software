package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.Livro;
import com.fatec.sce.model.Usuario;

public class UC05CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			
			// acao
			umUsuario.setRa("FIP201856648");
			umUsuario.setNome("João da Silva");
			
			System.out.println(umUsuario.getRa()+" - "+umUsuario.getNome());
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComRaEmBranco() {
			// cenario
			Usuario umUsuario = new Usuario();
			umUsuario.setNome("João da Silva");
		try {	
			// acao
			umUsuario.setRa("");
			fail("Deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComRaNull() {
			// cenario
			Usuario umUsuario = new Usuario();
			umUsuario.setNome("João da Silva");
		try {	
			// acao
			umUsuario.setRa(null);
			fail("Deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComNomeEmBranco() {
		//cenário
		Usuario umUsuario = new Usuario();
		umUsuario.setRa("FIP201855648");
		try {
			umUsuario.setNome("");
			fail("Deveria lançar uma execção");
		}catch(RuntimeException e){
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComNomeNull() {
		//cenário
		Usuario umUsuario = new Usuario();
		umUsuario.setRa("FIP201855648");
		try {
			umUsuario.setNome(null);
			fail("Deveria lançar uma execção");
		}catch(RuntimeException e){
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT06CadastrarUsuarioEqualsComObjetoIgual() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			
			// acao
			umUsuario.equals(umUsuario);
			
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT07CadastrarUsuarioEqualsComObjetoNull() {
		//cenário
		Usuario umUsuario = new Usuario();
		try {
			umUsuario.equals(null);
			fail("Deveria lançar uma execção");
		}catch(RuntimeException e){
			assertEquals("Usuario não é objeto", e.getMessage());
		}
	}
	
	@Test
	public void CT08CadastrarUsuarioEqualsComObjetoDiferenteUsuario() {
		//cenário
		Usuario umUsuario = new Usuario();
		Livro umLivro = new Livro();
		try {
			umUsuario.equals(umLivro);
			fail("Deveria lançar uma execção");
		}catch(RuntimeException e){
			assertEquals("Objeto não é classe Usuario", e.getMessage());
		}
	}
	
	@Test
	public void CT09CadastrarUsuarioEqualsComNomeNull() {
		//cenário
		Usuario umUsuario = new Usuario();
		umUsuario.setRa("FIP201856648");
		umUsuario.setNome("João da Silva");
		
		Usuario outroUsuario = new Usuario();
		outroUsuario.setRa("FIP201856648");
		outroUsuario.setNome(null);
		try {
			umUsuario.equals(outroUsuario);
			fail("Deveria lançar uma execção");
		}catch(RuntimeException e){
			assertEquals("Nome é diferente de null", e.getMessage());
		}
	}
	
	public void CT10CadastrarUsuarioEqualsComNomesDiferentes() {
		//cenário
		Usuario umUsuario = new Usuario();
		umUsuario.setRa("FIP201856648");
		umUsuario.setNome("João da Silva");
		
		Usuario outroUsuario = new Usuario();
		outroUsuario.setRa("FIP201856648");
		outroUsuario.setNome("João dos Santos");
		try {
			umUsuario.equals(outroUsuario);
			fail("Deveria lançar uma execção");
		}catch(RuntimeException e){
			assertEquals("Nomes são diferentes", e.getMessage());
		}
	}
	

}
