package kodlama.io.business;

import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.IDao;
import kodlama.io.entities.Egitmenler;

public class EgitmenManager {
	private IDao dao;
	private Logger[] loggers;
	private List<Egitmenler> egitmenler;
	public EgitmenManager(IDao dao, Logger[] loggers) {
		
		this.dao = dao;
		this.loggers = loggers;
	}
	public void add(Egitmenler egitmen) throws Exception{
		dao.addEgitmen(egitmen);
		egitmenler.add(egitmen);
		for (Logger logger : loggers) {
			logger.log(egitmen.getEgitmenAdi());
		}
	}
	
}
