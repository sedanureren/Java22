package intro.h1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("hello world!");
		
		String ortaMetin="ilginiz çekebilir";
		String altMetin="Vade süresi";
		System.out.println(ortaMetin);
		
		
		double dolarDun=18.14;
		double dolarBugun=18.14;
		
		boolean dolarDustuMu=false;
		String okYonu=" ";
		if (dolarBugun<dolarDun) {
			 okYonu="down.svg";
			System.out.println(okYonu);
			
		} else if(dolarBugun>dolarDun)
		{
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		
		String[] krediler= {"Hızlı kredi","maaşını halkbanktan alanlar","mutlu emekli"};
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
			
		}

}
