package last.Q4;

public class DaoEx {
	public static void work(data d) {
		d.delete();
		d.insert();
		d.select();
		d.update();
	}

	public static void main(String[] args) {

		oracle o = new oracle();
		mysql m = new mysql();
		
		DaoEx.work(m);
		DaoEx.work(o);
		
		

	}

}
