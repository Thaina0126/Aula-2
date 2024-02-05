package Aula1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Cachorro cachorro_1 = new Cachorro();
			
			cachorro_1.nome = "Alex ";
			cachorro_1.raca = "Chiwuawua";
			cachorro_1.idade = 10;
			cachorro_1.altura = 1.5;
		
			cachorro_1.latir();
			cachorro_1.GetCachorro();
	}
}
