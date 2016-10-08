package principal;

import java.util.ArrayList;
import java.util.List;

public class CadastroAluno {

	List<Aluno> alunosCadastrados;

	public CadastroAluno() {
		alunosCadastrados = new ArrayList<Aluno>();
	}

	/**
	 * Adiciona um aluno a lista de alunos já cadastrados
	 * 
	 * @param aluno
	 *            a ser adicionado ao cadastro
	 * 
	 * @return Verdadeiro se o aluno for adicionado e falso caso contrário
	 */
	public boolean adicionarAluno(Aluno aluno) {
		if (aluno == null) {
			return false;
		}

		alunosCadastrados.add(aluno);
		return true;
	}

	/**
	 * Remove um aluno da lista de alunos cadastrados pela sua matrícula.
	 * 
	 * @param matricula
	 *            do aluno a ser removido
	 * @return Verdadeiro se o aluno for removido com sucesso e falso caso
	 *         contrário.
	 */
	public boolean removerAluno(int matricula) {
		for (Aluno aluno : alunosCadastrados) {
			if (aluno.getMatricula() == matricula) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Obtém o número de alunos cadastrados.
	 * 
	 * @return O número de alunos cadastrados.
	 */
	public int getNumeroDeAlunos() {
		return alunosCadastrados.size();
	}

	/**
	 * Obtém o número de alunos aprovados dentre os cadastrados.
	 * 
	 * @return o número de alunos aprovados dentre os cadastrados.
	 */
	public int getNumeroDeAlunosAprovados() {
		int numeroAlunosAprovados = 0;
		for (Aluno aluno : alunosCadastrados) {
			if (aluno.estaAprovado()) {
				numeroAlunosAprovados++;
			}
		}
		return numeroAlunosAprovados;
	}

	/**
	 * Obtém o número de alunos reprovados dentre os cadastrados.
	 * 
	 * @return o número de alunos reprovados dentre os cadastrados.
	 */
	public int getNumeroDeAlunosReprovados() {
		return alunosCadastrados.size() - getNumeroDeAlunosAprovados();
	}
}
