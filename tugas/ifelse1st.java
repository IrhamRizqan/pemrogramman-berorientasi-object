import java.util.*;
public class ifelse1st{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Pick a number between 1 and 20: ");
        int num=sc.nextInt();
        if (num >= 20){
            System.out.println("No higher than 20");
        }
        if (num <= 0){
            System.out.println("No lower than 0");
        }
        else{
            System.out.println("You picked a number: " + num);
        }
    }
}