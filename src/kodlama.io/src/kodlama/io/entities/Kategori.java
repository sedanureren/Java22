package kodlama.io.entities;

public class Kategori {
	private int kategoriId;
	private String categoryName;
	
	public Kategori(int kategoriId, String categoryName) {
		super();
		this.kategoriId = kategoriId;
		this.categoryName = categoryName;
	}
	public int getKategoriId() {
		return kategoriId;
	}
	public void setKategoriId(int kategoriId) {
		this.kategoriId = kategoriId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
}
