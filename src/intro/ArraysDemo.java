package intro;

public class ArraysDemo {

	public static void main(String[] args) {
		String ogrenciler[]=new String[4];
		ogrenciler[0]="seda";
		ogrenciler[1]="nur";
		ogrenciler[2]="eren";
		ogrenciler[3]="123";
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("--------------------------");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
