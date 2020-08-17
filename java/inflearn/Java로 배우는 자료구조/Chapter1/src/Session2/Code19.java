package Session2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {

	public static void main(String[] args) {
		String[] name = new String[1000];
		String[] number = new String[1000];
		int n = 0;
		try {
			Scanner inFile = new Scanner(new File("input.txt"));
			while(inFile.hasNext()) { // 파일의 끝에 도달했는지 확인 
				name[n] = inFile.next();
				number[n] = inFile.next();
				n++;
			}
			inFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file");
			System.exit(0); //프로그램 자체 종료 
		}
		for(int i=0; i<n; i++) {
			 System.out.println(name[i] + ": "+ number[i]);
		}
	}
}