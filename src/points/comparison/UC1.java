package points.comparison;

import java.util.Scanner;

public class UC1 {
    Scanner s=new Scanner(System.in);
    int x=s.nextInt();
    int y=s.nextInt();
    int a=s.nextInt();
    int b=s.nextInt();

    double lengthOfPoints(){
        System.out.print("("+x+","+y+")");
        System.out.println("("+a+","+b+")");
        double l;
        l=Math.sqrt((int)Math.pow((a-x),2)+(int)Math.pow((b-y),2));
        int w=(int)Math.pow((a-x),2);
        return l;
    }
    public static void main(String[] args) {
        UC1 uc1 =new UC1();
       System.out.println("Length is: "+ uc1.lengthOfPoints());
    }
}
