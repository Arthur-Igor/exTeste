package principal;

public class Aluno {

	private int matricula;
	private String nome;
	private String curso;
	
	private double nota1, nota2;
	
	public static final int NOTA_NAO_ATRIBUIDA = -1;
	
	public Aluno(int matricula, String nome, String curso) {
		setMatricula(matricula);
		setNome(nome);
		setCurso(curso);
		nota1 = NOTA_NAO_ATRIBUIDA;
		nota2 = NOTA_NAO_ATRIBUIDA;
	}
	

	/**
	 * Atribui um valor ao atributo nota1 do aluno
	 * 
	 * @param nota a ser atribuída
	 * @return verdadeiro se o valor for válido e falso caso contrário
	 */
	public boolean atribuirNota1(double nota) {
		if (nota >= 0 && nota <=10) {
			nota1 = nota;
			return true;
		}
		return false;
		
	}
	
	/**
	 * Atribui um valor ao atributo nota2 do aluno
	 * 
	 * @param nota a ser atribuída
	 * @return verdadeiro se o valor for válido e falso caso contrário
	 */
	public boolean atribuirNota2(double nota) {
		nota2 = nota;
		return true;
	}
	
	/**
	 * Obtém o valor do atributo nota1
	 * 
	 * @return o valor da nota 1
	 */
	public double getNota1() {
		return nota1;
	}
	
	/**
	 * Obtém o valor do atributo nota2
	 * 
	 * @return o valor da nota 2
	 */
	public double getNota2() {
		return nota2;
	}
	
	/**
	 * Obtem a informação se o aluno está aprovado ou reprovado baseando-se nas notas atribuídas.
	 * 
	 * @return Verdadeiro se o aluno estiver aprovado e falso caso contrário.
	 */
	public boolean estaAprovado() {
		double media = (nota1 + nota2) /2;
		return media >= 7;
	}
	
	/**
	 * Obtém o valor da matrícula do aluno
	 * 
	 * @return o valor da matrícula do aluno
	 */
	public int getMatricula() {
		return matricula;
	}
	
	/**
	 * Atribui um valor ao atributo matricula do aluno
	 * 
	 * @param matricula a ser atribuída
	 */
	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Obtém o valor do atributo nome
	 * 
	 * @return o nome do aluno
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Atribui um valor ao atributo nome do aluno
	 * 
	 * @param nome a ser atribuído
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obtém o valor do atributo curso do aluno
	 * 
	 * @return o curdo do aluno
	 */
	public String getCurso() {
		return curso;
	}
	
	/**
	 * Atribui um valor ao atributo curso do aluno
	 * 
	 * @param curso a ser atribuído
	 */
	private void setCurso(String curso) {
		this.curso = curso;
	}
}
