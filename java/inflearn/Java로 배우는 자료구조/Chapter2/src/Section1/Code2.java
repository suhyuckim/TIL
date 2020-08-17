package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code2 {
	
	static Person1[] members;
	static int n = 0;
	
	public static void main(String[] args) {
		members = new Person1[100];
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			while(sc.hasNext()) {
				String name = sc.next();
				String number = sc.next();
				
				members[n] = new Person1();
				members[n].name = name;
				members[n].number = number;
				
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
		}
		for(int i=0; i<n; i++) {
			System.out.println(members[i].name+ ", "+members[i].number);
		}
	}
}