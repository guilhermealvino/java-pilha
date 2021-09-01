import java.util.Scanner;

public class teste2 {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			String s = "casa maca laranja";
			char[] array = s.toCharArray();

			String [] vetor = s.split(" ");
			String x = vetor[0];
			String y = vetor[1];
			String z = vetor[2];

			System.out.println("String original: -" + s);
			System.out.println("Vetor 0: " + x);
			System.out.println("Vetor 1: " + y);
			System.out.println("Vetor 2: " + z);
			
		
			sc.close();
		}
	}


