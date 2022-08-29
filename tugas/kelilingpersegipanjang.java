public class kelilingpersegipanjang {
     public static void main(String[] args) {
        double kll,p,l;
        p=6;
        l=3;

        // flush / clear
        System.out.println("\033[H\033[2J");
        System.out.flush();
        kll=(2+p)+(2*1);
        System.out.println("Keliling Persegi Panjang: " +kll);
    }
}
