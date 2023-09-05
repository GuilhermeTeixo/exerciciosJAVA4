package exerciciosJAVA4;

import java.util.Scanner;

public class ex4 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			
			double media = (n1/n2);
			
			if (n2==0) {
				System.out.println("divisao impossivel");
			}
			
			System.out.println(media);
		}
		
		sc.close();
	}
}
	
