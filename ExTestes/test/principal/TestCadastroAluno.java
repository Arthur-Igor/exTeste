package principal;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TestCadastroAluno {
	
	//declaração de variaveis fixas utilizadas
	int matricula = 0;
	String nome = "usuario";
	String curso = "teste";

	//Testa o cadastro do usuário
	@SuppressWarnings("deprecation")
	@Test
	public void testeCadastro() {
	
	
		Aluno a = new Aluno(matricula, nome, curso);
		CadastroAluno c = new CadastroAluno();
	
	Assert.assertTrue(c.adicionarAluno(a));
	
	}
	//Testa a remoção de um aluno
	@Test
	public void removeAluno(){
		
		Aluno a = new Aluno(matricula, nome, curso);
		CadastroAluno c = new CadastroAluno();	
			
		c.adicionarAluno(a);
	
	Assert.assertTrue(c.removerAluno(0));
		
	}
	//Teste para verificar o retorno da quantidade de alunos cadastrados
	@Test
	public void quantidadeCadastrada(){
			
			CadastroAluno c = new CadastroAluno();
			Aluno a = new Aluno(matricula, nome, curso);
	Assert.assertEquals(0, c.getNumeroDeAlunos());
			
		c.adicionarAluno(a);
		c.adicionarAluno(a);
	
	Assert.assertEquals(2, c.getNumeroDeAlunos());
	
	}
	//Testa a quantidade de alunos aprovados
	@Test
	public void quantidadeAprovado(){
			
		CadastroAluno c = new CadastroAluno();
		
		Aluno a = new Aluno(matricula, nome, curso);
		
		a.atribuirNota1(7); //Atribuindo nota 1 á ser testada
		a.atribuirNota2(6); //atribuindo nota 2 com '7'
		c.adicionarAluno(a);
		
		Assert.assertEquals(0, c.getNumeroDeAlunosAprovados());
		
		Aluno b = new Aluno(matricula, nome, curso);
		
		c.adicionarAluno(b);
		b.atribuirNota1(7);
		b.atribuirNota2(7);
		Assert.assertEquals(1, c.getNumeroDeAlunosAprovados());
	
	}
	//Testa a quantidade de alunos reprovados
	@Test
	public void quantidadeReprovado(){
		CadastroAluno ca = new CadastroAluno();
		
		Aluno a = new Aluno(matricula, nome, curso);
		
		a.atribuirNota1(7); 
		a.atribuirNota2(6); 
		ca.adicionarAluno(a);
		
		Aluno b = new Aluno(matricula, nome, curso);
		
		ca.adicionarAluno(b);
		b.atribuirNota1(7);
		b.atribuirNota2(7);
		
		Aluno c = new Aluno(matricula, nome, curso);
		ca.adicionarAluno(b);
		c.atribuirNota1(7);
		c.atribuirNota2(7);
		Assert.assertEquals(1, ca.getNumeroDeAlunosReprovados());
	}


}


