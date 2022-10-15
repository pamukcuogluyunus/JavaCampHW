package loopDemo;

public class Main {

	public static void main(String[] args) {
	   //FOR LOOP
	   for (int i = 2; i<10; i+=2) {
		   System.out.println(i);
		   
		   
	   }
	   System.out.println("For Döngüsü Bitti");
	   
	   int i=1;
	   //While
	   while(i<10) {
		   System.out.println(i);
		   i++;
		  
	   }
//INFINITE LOOP
	   System.out.println("While Döngüsü Bitti");
	   
	   //DO WHILE LOOP
	   int j = 1;
	   do {
		   System.out.println(j);
		   j++;
		  
	   }while(j<10);
	   System.out.println("Do-While Döngüsü Bitti");
	   

	}

}
