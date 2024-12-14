import java.util.Scanner;

public class LengthComparision {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of  point X11,Y11 of first line");
        int x11= sc.nextInt();
        int y11= sc.nextInt();
        System.out.println("Enter the co-ordinates of  point X21,Y21  of first line ");
        int x21= sc.nextInt();
        int y21= sc.nextInt();
        double length1= Math.sqrt(Math.pow(x21-x11,2)+ Math.pow(y21-y11,2));
        System.out.println("Enter the co-ordinates of  point X11,Y11 of first line");
        int x12= sc.nextInt();
        int y12= sc.nextInt();
        System.out.println("Enter the co-ordinates of  point X21,Y21  of first line ");
        int x22= sc.nextInt();
        int y22= sc.nextInt();
        double length2= Math.sqrt(Math.pow(x22-x12,2)+ Math.pow(y22-y12,2));
        if(Double.valueOf(length1).equals(length2)){
            System.out.println("Lines are Equal");
        }
        else
            System.out.println("Lines are not equal");


    }
}
