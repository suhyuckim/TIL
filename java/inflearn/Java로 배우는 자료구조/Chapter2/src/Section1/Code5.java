package Section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code5 {

	static MyRectangle1[] rects = new MyRectangle1[100];
	static int n = 0;
	
	
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("data.txt"));
			while(in.hasNext()) {
				rects[n] = new MyRectangle1();
				rects[n].lu = new MyPoint1();
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
				n ++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않습니다.");
			System.exit(1);
		}
		bubblesort();
		
		for(int i=0; i<n; i++) {
			System.out.println(rects[i].lu.x + " " + rects[i].lu.y + " " + rects[i].width + " " + rects[i].height);
		}
		
		private static void bubblesort() {
			for(int i=n-1; i>0; i--) {
				for(int j=0; j<1; j++) {
					if(calcArea(rects[j]) > calcArea(rects[j+1])){
						MyRectangle1 tmp = rects[j];
						rects[j] = rects[j+1];
						rects[j+1] = tmp;
					}
					
				}
			}
		}
	private static int calcArea(MyRectangle1 r) {
		return r.width * r.height;
	}
}