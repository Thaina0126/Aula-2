package Aula1;

public class Cachorro {
	public String nome;
	public String raca;
	public int idade;
	public double altura;

	void latir() {
		System.out.println("O cachorro: " + nome + "latiu");
	};

	void GetCachorro() {
		System.out.println(
				"O cachorro se chama:" + nome
				+ "\nTem idade: " + idade
				+ "\nRaça: " + raca
				+ "\nAltura: "+ altura);
	}
}

	
