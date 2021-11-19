package p05.trywithresouces;

//438
public class fileInputStream implements AutoCloseable {

	private String file;
	
	
	public fileInputStream(String file) {
		super();
		this.file = file;
	}


	@Override
	public void close() throws Exception {//문제가 생겼을시 실행되는 메소드?
		System.out.println(file+" close");
	}

	public void read() {
		System.out.println(file+"read");
	}
	
	
	
	
	
	
	
	
	
}
