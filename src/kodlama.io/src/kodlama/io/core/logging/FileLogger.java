package kodlama.io.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("dosyaya loglama yapıldı:"+mesaj);
		
	}

}
