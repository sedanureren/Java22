package kodlama.io.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("maille loglama yapıldı:"+mesaj);
		
	}
}
