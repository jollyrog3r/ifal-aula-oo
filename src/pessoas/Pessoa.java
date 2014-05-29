package pessoas;

public abstract class Pessoa {
	private String nome;
	
	public Pessoa() {}
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public abstract void trabalhar();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

 