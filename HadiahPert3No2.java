import java.util.Scanner;
	public class HadiahPert3No2{
		public static void main(String[] args){
			Scanner masukan = new Scanner(System.in);
			
			int detik,menit,jam,totaldetik;
			
			System.out.print("Jam= ");
			jam = masukan.nextInt();
			System.out.print("Menit= ");
			menit = masukan.nextInt();
			System.out.print("Detik= ");
			detik = masukan.nextInt();
			
			totaldetik=jam*3600+menit*60+detik;
			
			System.out.println("Total Detik= " + totaldetik);
		}
	}