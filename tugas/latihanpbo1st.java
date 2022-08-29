import java.util.*;
public class latihanpbo1st {
    public static void main(String[] args) {
        int kkm;
        kkm = 75;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Berapa Nilaimu? ");
        int nilai=input.nextInt();
        if (nilai < kkm){
            System.out.println("Nilai kamu kurang dari kkm");
        }
        if (nilai > 100){
            System.out.println("ingpalit");
        }
    }    
}
