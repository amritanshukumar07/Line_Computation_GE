import java.util.Scanner;

public class LengthCalculation {
    public static void main( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the co-ordinates of first point X1,Y1");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        System.out.println("Enter the co-ordinates of first point X2,Y2");
        int x2= sc.nextInt();
        int y2= sc.nextInt();
        double length= Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));

        System.out.println("Length of the line is "+ length);

    }
}
