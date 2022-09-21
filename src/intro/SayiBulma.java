package intro;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 1, 2, 3, 4, 5 };
		int aranacak=7;

		for(int sayi:sayilar)
		{
			if (sayi == aranacak) {
				System.out.println("sayivar");
			}
		}
		System.out.println("sayi yok");

	}


}


