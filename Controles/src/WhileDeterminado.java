import java.util.Scanner;

public class WhileDeterminado {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double somaDasNotas =0;
		double nota = 0;
		
		int indice =0;
		//La�o while com apenas 3 la�os
		 while (indice <3) {
			 nota = scanner.nextDouble();
			 somaDasNotas += nota;
			 indice++;
			 

		 }
		 scanner.close();
		 System.out.println("A m�dia �: " + somaDasNotas/3);
	}

}
