package intro;

public class ReCapDemo {

	public static void main(String[] args) {
		double[] liste= {1.2,2.2,3.3};
		double total=0;
		double max=liste[0];
		for(double sayi:liste) {
			if(max<sayi) {
				max=sayi;
			}
			total=total+sayi;
			System.out.println(sayi);
		}
		System.out.println("toplam:"+total);
		System.out.println("max:"+max);

	}

}
