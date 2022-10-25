package kodlama.io.business;


import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.IDao;
import kodlama.io.entities.Kurslar;

public class KursManager {
	private IDao dao;
	private Logger[] loggers;
	private List<Kurslar> kurslar;

	public KursManager(IDao dao,Logger[] loggers,List<Kurslar> kurslar) {
		this.dao=dao;
		this.loggers=loggers;
		this.kurslar=kurslar;
		
	}
	public void add(Kurslar kurs) throws Exception{
		if(kurs.getPrice()<0) {
			throw new Exception("ürün fiyatı 10 dan küçük olamaz.");
		}
		for (Kurslar k : kurslar) {
			if (k.getName().equals(kurs.getName())) {
				throw new Exception("kurs ismi ayni olamaz.");
			}
		}
		dao.addKurs(kurs);
		kurslar.add(kurs);
		for (Logger logger : loggers) {
			logger.log(kurs.getName());
		}
		
	}
}
