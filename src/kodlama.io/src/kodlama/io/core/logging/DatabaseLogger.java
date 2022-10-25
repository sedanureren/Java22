package kodlama.io.core.logging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("veritabanına loglama yapıldı:"+mesaj);
		
	}
}
