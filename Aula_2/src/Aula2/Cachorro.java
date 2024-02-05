package Aula2;

public class Cachorro {
	public String nome;
	public String raca;
	public int idade;
	public String cor;

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

	
