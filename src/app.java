import java.util.Scanner;

public class app {
    public static void main(String[] args){
        System.out.println("This programme returns human weight on the surface of Solar System planets");

        Scanner a= new Scanner(System.in);
        System.out.println("Please enter Your weight in kilograms");
        
        int weight = a.nextInt();
        System.out.println("If You land on Mercury You will weigh " + weight*0.378 +"kg");
        System.out.println("If You land on Venus You will weigh " + weight*0.907 +"kg");
        System.out.println("If You land on Earth You will weigh " + weight+"kg");
        System.out.println("If You land on Mars You will weigh " + weight*0.377 +"kg");
        System.out.println("If You land on Jupiter You will weigh " + weight*2.528 +"kg");
        System.out.println("If You land on Saturn You will weigh " + weight*1.064 +"kg");
        System.out.println("If You land on Uranium You will weigh " + weight*0.899 +"kg");
        System.out.println("If You land on Neptune You will weigh " + weight*1.125 +"kg");
        
    }
}
