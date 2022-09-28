package intro.h1;

public class MukemmelSayi {

	public static void main(String[] args) {
		int sayi=5;
		int bolenToplam=0;
		for(int i=1;i<sayi;i++) {
			if(sayi%i==0) {
				bolenToplam=bolenToplam+i;
			}
		}
		if(bolenToplam==sayi) {
			System.out.println("mükemmel sayi");
		}
		else {
			System.out.println("mükemmel değil");
		}

	}

}
