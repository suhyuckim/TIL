package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code3 {
	
	static Person1[] members;
	static int n = 0;
	
	public static void main(String[] args) {
		members = new Person1[100];
		try {
			Scanner sc = new Scanner(new File("input.txt"));
			while(sc.hasNext()) {
				String nm = sc.next();
				String nb = sc.next();
				
				members[n] = new Person1();
				members[n].name = nm;
				members[n].number = nb;
				
				n++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.out.println("No File");
		}
		bubblesort();
		for(int i=0; i<n; i++) {
			System.out.println(members[i].name+ ", "+members[i].number);
		}
	}

	private static void bubblesort() {
		for(int i=n-1; i>0; i++) {
			for(int j=0; j<i; j++) {
				if(members[j].name.compareTo(members[j+1].name) > 0) { // compare names of j-th (j+1)-th person
					// swap two person
					Person1 tmp = members[j];
					members[j] = members[j+1];
					members[j+1] = tmp;
				}
			}
		}
	}
}