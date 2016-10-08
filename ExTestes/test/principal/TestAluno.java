package principal;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestAluno {
	
	//declaração de variaveis fixas utilizadas
		int matricula = 0;
		String nome = "usuario";
		String curso = "teste";

	@Test
	public void atribuirNota1() {
		
		Aluno a = new Aluno(matricula, nome, curso);
	
		Assert.assertEquals(-1, a.getNota1(), 0.0001);
		Assert.assertEquals(-1, a.getNota2(), 0.0001);
	
		a.atribuirNota1(-2);
	
		Assert.assertEquals(-1, a.getNota1(), 0.0001);
		Assert.assertEquals(-1, a.getNota2(), 0.0001);
	}
	//Teste de atribuição da Nota 2 do aluno
	@Test
	public void atribuirNota2(){
		
		Aluno a = new Aluno(matricula, nome, curso);
		
		Assert.assertEquals(-1, a.getNota2(), 0.0001);
		Assert.assertEquals(-1, a.getNota1(), 0.0001);
		
		a.atribuirNota2(-2);
		
		Assert.assertEquals(-1,a.getNota1(), 0.0001);
		Assert.assertEquals(-1,a.getNota2(), 0.0001);
		
	}
	//Teste de aprovação de aluno
	@Test
	public void verificaAprovacao(){
	
	Aluno a = new Aluno(matricula, nome, curso);
	
	Assert.assertEquals(-1, a.getNota1(), 0.0001);
	Assert.assertEquals(-1, a.getNota2(), 0.0001);
	
	a.atribuirNota1(7);
	a.atribuirNota2(7);
	
	Assert.assertTrue(a.estaAprovado());
	
	
	
	}
	//Teste de reprovação de aluno
	@Test
	public void verificaReprovacao(){
	
	Aluno a = new Aluno(matricula, nome, curso);
	
	Assert.assertEquals(-1, a.getNota1(), 0.0001);
	Assert.assertEquals(-1, a.getNota2(), 0.0001);
	
	a.atribuirNota1(1);
	a.atribuirNota2(1);
	
	Assert.assertFalse(a.estaAprovado());
	
	}
	//Teste de dados de retorno do usuário
	@Test
	public void verificaDadosUser(){
	
	Aluno a = new Aluno(matricula, nome, curso);

	Assert.assertEquals(0, a.getMatricula());
	
	Assert.assertEquals("usuario",a.getNome());
	
	Assert.assertEquals("teste",a.getCurso());
	

	}



}
