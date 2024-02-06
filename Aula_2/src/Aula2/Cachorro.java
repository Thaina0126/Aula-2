package Aula2;

public class Cachorro {
	private String nome;
	private String raca;
	private int idade;
	private String cor;
	
	public String GetCor() {
		return cor;
	}
	
	public String GetNome() {
		return nome;
	}
	
	public String GetRaca() {
		return raca;
	}
	
	public int GetIdade() {
		return idade;
	}
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public void SetRca(String raca) {
		this.raca = raca;
	}
	public void SetIdade(String idade) {
		this.idade = idade;
	}
	public void SetCor(String cor) {
		this.cor = cor;
	}




	public void Latir() {
		System.out.println("O cachorro: " + nome + " latiu");
	};

	public void GetCachorro() {
		System.out.println(
				"O cachorro se chama: " + nome
				+ "\nTem idade: " + idade
				+ "\nRaça: " + raca
				+ "\nCor: "+ cor);
	}
}

	
