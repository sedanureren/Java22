package intro.h1;

public class StringDemo {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		
		/*System.out.println("eleman sayısı:"+mesaj.length());
		System.out.println("5. eleman:"+ mesaj.charAt(4));
		System.out.println(mesaj.concat("yaşasın"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		char[] karakter=new char[5];
		mesaj.getChars(0, 5, karakter, 0);
		System.out.println(karakter);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("e"));
		*/
		String yeniMesaj=mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));
		for(String kelime:mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		
	}

}
