package kodlama.io.dataAccess;

import kodlama.io.entities.Egitmenler;
import kodlama.io.entities.Kategori;
import kodlama.io.entities.Kurslar;

public interface IDao {
	public void addEgitmen(Egitmenler egitmenler);
	public void addKurs(Kurslar kurslar);
	public void addKategori(Kategori kategori);
	
}
