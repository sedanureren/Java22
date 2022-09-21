package intro;

public class Conditionals {

	public static void main(String[] args) {
		int sayi = 24;
		if (sayi < 20) {
			System.out.println("sayi 20 den küçüktür.");
		} else if (sayi == 20) {
			System.out.println("sayi 20 ye eşittir");
		} else {
			System.out.println("sayi 20 den büyüktür");
		}

		int sayi1 = 24;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("en buyuk sayi: " + enBuyuk);

		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("mükemmel geçtiniz");
			break;
		case 'B':
			System.out.println("güzel geçtiniz");
			break;
		case 'C':
			System.out.println("iyi geçtiniz");
		case 'D':
			System.out.println("fena değil");
			break;
		case 'F':
			System.out.println("kaldınız");
			break;
		default:
			System.out.println("geçersiz not girildi");
		}
		
		
	}

}
