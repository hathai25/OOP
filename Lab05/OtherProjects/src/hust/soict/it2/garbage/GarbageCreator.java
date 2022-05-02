package hust.soict.it2.garbage;

import java.io.File;
import java.util.Scanner;

public class GarbageCreator {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		File garbage = new File("/home/hathai15/Desktop/Workspace/oop/Lab05/OtherProjects/src/hust/soict/it2/garbage/garbage.txt");
		String s = "";
		Scanner garbageReader = new Scanner(garbage);
		while (garbageReader.hasNextLine()) {
			s += garbageReader.nextLine();
		}
		garbageReader.close();
		System.out.println(System.currentTimeMillis() - start);
	}
}
