package hust.soict.it2.aims;

public class MemoryDaemon implements java.lang.Runnable {
	public long memoryUsed = 0;
	public MemoryDaemon() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		Runtime rt = Runtime.getRuntime();
		long used;
		while(true) {
			used = rt.totalMemory() - rt.freeMemory();
			if (used != memoryUsed) {
				System.out.println("\tMemory used = " + used);
				memoryUsed = used;
			}
		}
	}

}
