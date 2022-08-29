import java.util.*;
public class nyobaScanner {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        Scanner UserInput = new Scanner(System.in);
        int pil;
        int UserInputForMainMenu;
        // FLUSH // CLEAR SCREEN
        System.out.println("\033[H\033[2J");
        System.out.flush();
        // FLUSH // CLEAR SCREEN END
            // PROJECT START
            System.out.println("========================");
            System.out.println("Main Menu Project ");
            System.out.println("========================");
            System.out.println("1. About Program");
            System.out.println("2. Cloud Computing Services");
            System.out.print("Enter Your Selection: ");
                UserInputForMainMenu = UserInput.nextInt();
            if (UserInputForMainMenu == 1) {
                System.out.println(" ");
                System.out.println("This Program Using Java");
                System.out.println("========================");
                System.out.println("Author: Rekayasa Perangkat Lunak XI");
                System.out.println(" ");
            }
            if (UserInputForMainMenu == 2) {
                    System.out.println(" ");
                    System.out.println("====Service Cloud Computing=====");
                    System.out.println("1. Azure");
                    System.out.println("2. Cloud Computing Services");
                    System.out.println("3. Amazon Web Services");
                    System.out.println("4. Alibaba Cloud Services");
                    System.out.println("5. End Service");
                    System.out.println("========================");
                    System.out.println(" ");
                    System.out.print("Enter Your Selection: ");
                    pil = masuk.nextInt();

                switch(pil){
                    case 0:System.out.println("0 Is Not a Valid Input");
                    break;
                    case 1:System.out.println("https://azure.microsoft.com/");
                    break;
                    case 2:System.out.println("https://cloud.google.com/");
                    break;
                    case 3:System.out.println("https://aws.amazon.com/");
                    break;
                    case 4:System.out.println("https://id.alibabacloud.com");
                    break;
                    case 5:System.out.println("Service Ended!");
                    break;
                    default:System.out.println("Invalid Selection!");
                    break;
            // PROJECT END
            }
        }
    }
}
