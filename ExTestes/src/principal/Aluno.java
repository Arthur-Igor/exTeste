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
	 * @param nota a ser atribu�da
	 * @return verdadeiro se o valor for v�lido e falso caso contr�rio
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
	 * @param nota a ser atribu�da
	 * @return verdadeiro se o valor for v�lido e falso caso contr�rio
	 */
	public boolean atribuirNota2(double nota) {
		nota2 = nota;
		return true;
	}
	
	/**
	 * Obt�m o valor do atributo nota1
	 * 
	 * @return o valor da nota 1
	 */
	public double getNota1() {
		return nota1;
	}
	
	/**
	 * Obt�m o valor do atributo nota2
	 * 
	 * @return o valor da nota 2
	 */
	public double getNota2() {
		return nota2;
	}
	
	/**
	 * Obtem a informa��o se o aluno est� aprovado ou reprovado baseando-se nas notas atribu�das.
	 * 
	 * @return Verdadeiro se o aluno estiver aprovado e falso caso contr�rio.
	 */
	public boolean estaAprovado() {
		double media = (nota1 + nota2) /2;
		return media >= 7;
	}
	
	/**
	 * Obt�m o valor da matr�cula do aluno
	 * 
	 * @return o valor da matr�cula do aluno
	 */
	public int getMatricula() {
		return matricula;
	}
	
	/**
	 * Atribui um valor ao atributo matricula do aluno
	 * 
	 * @param matricula a ser atribu�da
	 */
	private void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * Obt�m o valor do atributo nome
	 * 
	 * @return o nome do aluno
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Atribui um valor ao atributo nome do aluno
	 * 
	 * @param nome a ser atribu�do
	 */
	private void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Obt�m o valor do atributo curso do aluno
	 * 
	 * @return o curdo do aluno
	 */
	public String getCurso() {
		return curso;
	}
	
	/**
	 * Atribui um valor ao atributo curso do aluno
	 * 
	 * @param curso a ser atribu�do
	 */
	private void setCurso(String curso) {
		this.curso = curso;
	}
}
