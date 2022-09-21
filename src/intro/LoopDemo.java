package intro;
public class LoopDemo {

	public static void main(String[] args) {
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("for dongusu bitti");
		
		int i=1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while dongusu bitti");
		
		int j=1;
		do {
			System.out.println("loglandı");
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("do while dongusu bitti");
	}

}
