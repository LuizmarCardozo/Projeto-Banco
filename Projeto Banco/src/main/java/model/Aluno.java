package model;

public class Aluno {
	
	private int id;
	private String nome;
	private String email;
	private String curso;

	public Aluno(String nome, String email, String curso) {
		this.nome = nome;
		this.email = email;
		this.curso = curso;
		
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

}
