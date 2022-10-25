package kodlama.io.business;
import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.IDao;
import kodlama.io.entities.Kategori;

public class KategoriManager {
	private IDao dao;
	private Logger[] loggers;
	private List<Kategori> kategoriler;

	public KategoriManager(IDao dao,Logger[] loggers) {
		this.dao=dao;
		this.loggers=loggers;
		
	}
	public void add(Kategori kategori) throws Exception{
		for (Kategori k : kategoriler) {
			if (k.getCategoryName().equals(kategori.getCategoryName())) {
				throw new Exception("kurs ismi ayni olamaz.");
			}
		}
		dao.addKategori(kategori);
		kategoriler.add(kategori);
		for (Logger logger : loggers) {
	         logger.log(kategori.getCategoryName());
	     }
	}
	 
}
