import java.util.*;
public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan, looped;
        System.out.print("Mau bilangan berapa? ");
        bilangan = input.nextInt();
        System.out.print("Mau diloop berapa kali? ");
        looped = input.nextInt();

        while (bilangan <= looped) {
            System.out.println("Looped to "+bilangan);
            bilangan+=2;
        }
        
        // CLEAR SCREEN
        System.out.print("Press enter to clear screen");
            try{System.in.read();}
                catch(Exception e){}
            System.out.print("\033[H\033[2J");  
            System.out.flush();
        // CLEAR SCREEN END
    }
}
