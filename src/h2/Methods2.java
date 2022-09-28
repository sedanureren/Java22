package h2;

import java.util.Iterator;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj="bugun hava güzel";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		int sayi=topla(5,7);
		int sayi2=topla2(1,2,3,4,5);
		System.out.println(sayi2);
	}
	public static void ekle()
	{
		System.out.println("eklendi");
	}
	public static void sil()
	{
		System.out.println("silindi");
	}
	public static void guncelle()
	{
		System.out.println("guncellendi");
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		return "sakarya";
	}
	public static int topla2(int... sayilar) {
		int toplam=0;
		for(int sayi:sayilar){
			toplam+=sayi;
		}
		return toplam;
		
	}
	
}
