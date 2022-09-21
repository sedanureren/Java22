package intro;

public class AsalSayi {

	public static void main(String[] args) {
		int sayi=1;
		if(sayi==1) {
			System.out.println("sayi asal değil");
			return;
		}
		if(sayi<=0) {
			System.out.println("geçersiz sayi");
			return;
		}
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				System.out.println("Sayi asal değil bolundugu sayi: "+i);
			}
		}
		System.out.println("sayi asaldır");

	}

}
