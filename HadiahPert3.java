import java.util.Scanner;

public class HadiahPert3{
	public static void main (String[] args){
		
		float panjang;
		float lebar;
		float luas;
	Scanner masukan = new Scanner(System.in);
	
	System.out.print("Masukkan Panjang= ");
	panjang = masukan.nextFloat();
	System.out.print("Masukka Lebar= ");
	lebar = masukan.nextFloat();
		
		luas = panjang * lebar;
		
	System.out.println("Luas Persegi Panjang= " +panjang+ " * " +lebar+ " = " +luas);
	}
}