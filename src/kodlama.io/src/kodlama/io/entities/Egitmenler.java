package kodlama.io.entities;

public class Egitmenler {
	private int egitmenId;
	private String egitmenAdi;
	
	public Egitmenler(int egitmenId, String egitmenAdi) {
		this.egitmenId = egitmenId;
		this.egitmenAdi = egitmenAdi;
	}
	public int getEgitmenId() {
		return egitmenId;
	}
	public void setEgitmenId(int egitmenId) {
		this.egitmenId = egitmenId;
	}
	public String getEgitmenAdi() {
		return egitmenAdi;
	}
	public void setEgitmenAdi(String egitmenAdi) {
		this.egitmenAdi = egitmenAdi;
	}
	
}
