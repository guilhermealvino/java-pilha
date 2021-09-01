import java.util.Locale;
import java.util.Scanner;
	
public class MaiorEMenor2 {
	
	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.print("Entre com tres numeros: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			maior(a, b, c);
			
			sc.close();
		}
		
		public static void maior(int x, int y, int z) {
			int aux1 = 0;
			int aux2 = 0;
			
			if (x>y && x>z && y>z) {
				aux1 = x;
				aux2 = y;
			}
			else if (y>x && y>z && x>z ) {
				aux1 = y;
				aux2 = x;
			}
			
			
			System.out.println("Maior = " + aux1);
			System.out.println("Segundo maior = " + aux2);
		}
		
		public static void showResult(int valor) {
			
		}
	}
	
	
	
	
	
	
	
	
	
	

