package kodlama.io.dataAccess;

import kodlama.io.entities.Egitmenler;
import kodlama.io.entities.Kategori;
import kodlama.io.entities.Kurslar;

public class HibernateDao implements IDao {

	@Override
	public void addEgitmen(Egitmenler egitmenler) {
		System.out.println("Egitmen eklendi:"+egitmenler.getEgitmenAdi());
		
	}

	@Override
	public void addKurs(Kurslar kurslar) {
		System.out.println("Kurs eklendi:"+kurslar.getName());
		
	}

	@Override
	public void addKategori(Kategori kategori) {
		System.out.println("Kurs eklendi:"+kategori.getCategoryName());
		
	}

}
