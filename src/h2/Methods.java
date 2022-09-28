package h2;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5 };
		int aranacak=1;
		boolean varMi=false;
		for(int sayi:sayilar)
		{
			if (sayi == aranacak) {
				varMi=true;
				break;
				
			}
			
		}
		if(varMi) {
			mesajVer("sayi mevcut:"+aranacak);
		}
		else {
			mesajVer("sayi yok");
		}
		
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
