package Biodata;

import java.util.Scanner;

public class biodata{
   public static void main(){

System.out.println("****** Biodata ******");
    
   Scanner scanner = new Scanner(System.in);

	
	String fayad;
	int Nim;

 System.out.print("Masukkan Nama Anda: ");
 fayad= scanner.nextLine();
 System.out.print("Masukkan Nim Anda: ");
 Nim= scanner.nextInt();
 System.out.println("Nama Anda: "+fayad);
 System.out.println("Nama Anda: "+Nim);

}
}
 