package miniProjeAsalSayi;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//bug
		int number = 1;
		int remainder = number % 2;
		/* System.out.println(remainder); */
		boolean isPrime = true;
		
		if (number == 1) {
			System.out.println("Sayı Asal Değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayı Girdiniz.");
		}
		
		
		for(int i = 2; i<number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
			
		}
		if(isPrime){
			System.out.println("Sayı Asaldır.");
			
		}
		else {
			System.out.println("Sayı Asal Değildir.");
		}

	}

}
