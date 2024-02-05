package Aula2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curriculo curriculo_1 = new Curriculo ();
		
		curriculo_1.nome="Laura";
		curriculo_1.idade=500;
		curriculo_1.email="Lauramikaelson@outlook.com";
		curriculo_1.cpf="000.000.000-01";
		curriculo_1.escolaridade="Ensino Superior Completo";
		
		curriculo_1.GetCurriculo();
		
Curriculo curriculo_2 = new Curriculo ();
		
		curriculo_2.nome="Yuri";
		curriculo_2.idade=501;
		curriculo_2.email="yurimikaelson@outlook.com";
		curriculo_2.cpf="000.000.000-00";
		curriculo_2.escolaridade="Ensino medio - cursando";
		
		curriculo_2.GetCurriculo();
			
		}

}

