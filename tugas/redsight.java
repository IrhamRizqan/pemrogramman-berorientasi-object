public class redsight {
    
    public static void main(String[] args){
        int a, t;
        a = 5;
        t = 2;
        double modulus = a % t;
        double luas = 0.5 * a * t;
        double keliling = a + t + modulus;
        System.out.println("Keliling Segitiga: " + keliling);
        System.out.println("Modulus Segitiga: " + modulus);
        System.out.println("Luas Segitiga: " +luas);
    }
}
