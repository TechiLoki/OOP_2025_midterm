package midterm.t2.sub;

import midterm.t2.fruit.orchestra.A22;
import midterm.t2.toaster.A21;

public class R21 {
    
    public static void main(String[] args){
        A21 obj_A21 = new A21();
        A22 obj_A22 = new A22();

        int width = obj_A21.getWidth();
        int height = obj_A21.getHeight();

        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
		System.out.println("The area of the rectangle is: " + width*height);

        int month = obj_A22.getMonth();
	
        String month_word = "";

        switch(month) {
            case 1: month_word = "January"; break;
            case 2: month_word = "February"; break;
            case 3: month_word = "March"; break;
            case 4: month_word = "April"; break;
            case 5: month_word = "May"; break;
            case 6: month_word = "June"; break;
            case 7: month_word = "July"; break;
            case 8: month_word = "August"; break;
            case 9: month_word = "September"; break;
            case 10: month_word = "October"; break;
            case 11: month_word = "November"; break;
            case 12: month_word = "December"; break;
            default: month_word = "ERROR"; break;
        }

        System.out.println("Month provided in A22 is " + month_word);

	}
    
	
}
