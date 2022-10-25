package kodlama.io;


import kodlama.io.business.KategoriManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.HibernateDao;
import kodlama.io.entities.Kategori;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers1= {new DatabaseLogger() ,new FileLogger()};
		KategoriManager kategoriManager = new KategoriManager(new HibernateDao(),loggers1);
	    Kategori kategori = new Kategori(1, "Frontend");
        Kategori kategori2 = new Kategori(2, "Backend");
		kategoriManager.add(kategori2);
		kategoriManager.add(kategori);
		
	}

}
