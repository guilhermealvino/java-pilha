import java.util.Scanner;
	
public class MaiorEMenor {
	
	public static void main(String[] args) {
		
		int maior = 0;
		int menor = 0;
		int qtdNumerosDigitados;
		int arrayValores[];		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Informque a quantidade de numero que pretende comparar: ");
		qtdNumerosDigitados = sc.nextInt();
		arrayValores = new int[qtdNumerosDigitados];
		
		for(int i = 0; i < qtdNumerosDigitados; i++) {
			System.out.print("\nInformque o numero na posicao: " +(i + 1) +": ");
			arrayValores[i] = sc.nextInt();
			
			maior = arrayValores[i];
			menor = arrayValores[i];
		}
		for(int i = 0; i < qtdNumerosDigitados; i++) {
			
			if(arrayValores[i] > maior) {
				maior = arrayValores[i];
				} else if (arrayValores[i] < menor) {
					menor = arrayValores[i];
				}
		}
		System.out.println("Numero maior: " +maior);
		System.out.println("Numero menor: " +menor);
			
	}
}
	
	
	
	
	
	
	
	
	
	

