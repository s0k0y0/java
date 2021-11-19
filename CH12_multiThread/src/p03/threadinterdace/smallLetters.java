package p03.threadinterdace;

public class smallLetters implements Runnable  {
	
	@Override
	public void run() {
		for(char c='a'; c<='z'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.getMessage();
			}
		}
		
	}
}

