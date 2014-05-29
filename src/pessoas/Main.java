package pessoas;

public class Main {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		Pessoa pessoa1 = new Medico();
		Pessoa pessoa2 = new Jogador();
		Pessoa pessoa3 = new Advogado();
		
		pessoa1.trabalhar();
		pessoa2.trabalhar();
		pessoa3.trabalhar();
		
		JogadorIniciante iniciante = new JogadorIniciante();
		iniciante.trabalhar();
		iniciante.trabalhar("Vendas");
		
		carro.dirigir(pessoa1);
		carro.dirigir(pessoa2);
		carro.dirigir(new Advogado());

	}
}

