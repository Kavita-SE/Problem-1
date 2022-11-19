import java.util.Scanner;


public class TwoPoints {

     public static int inputX(){
        do{
            System.out.print("Enter location of X: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();

            if(x < 1 || x > 12)
                System.out.println("Invalid Location! Please Re-Enter the location.");
            else
                return x;
        }while(true);
    }

    public static int inputY(){
        do{
            System.out.print("Enter location of Y: ");
            Scanner sc = new Scanner(System.in);
            int y = sc.nextInt();

            if(y < 1 || y > 12)
                System.out.println("Invalid Location! Please Re-Enter the location.");
            else
                return y;
        }while(true);
    }

    public static int computePointOfInterception(int x, int y) {

        if( x == y)
            return x+1;
        
        while( x != y){
            x = (x+=2)%12;
            y = (y+=1)%12;
        }
        return x+1;
    }
    
    public static void main(String[] args) {

        int arr[] = new int[12];
        int x = inputX();
        int y = inputY();
        System.out.println("Point of Intersection: " + computePointOfInterception(x-1, y-1));
    }

    
}