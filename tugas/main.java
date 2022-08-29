import java.lang.reflect.Method;
import java.util.function.Function;

public class main{
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String nama="IrhamR";
        String kelas="11_RPL";
        double NilaiMTK=83.5;
        double NilaiPKN=75.8;
        double NilaiBIND=88.1;
        double NilaiAkhir=(NilaiMTK+NilaiPKN+NilaiBIND)/3;
        int umur= 17;
        String jenisKelamin="laki-laki";
        String alamat="Jakarta";
        Boolean status=true;
        double tinggiBadan=170.5;
        ;
        // Create a new instance of the class
        System.out.println("Nama : "+nama);
        System.out.println("Kelas : "+kelas);
        System.out.println("Nilai MTK : "+NilaiMTK);
        System.out.println("Nilai PKN : "+NilaiPKN);
        System.out.println("Nilai BIND : "+NilaiBIND);
        System.out.println("Nilai Akhir : "+NilaiAkhir);
        System.out.println("Umur : "+umur);
        System.out.println("Jenis Kelamin : "+jenisKelamin);
        System.out.println("Alamat : "+alamat);
        System.out.println("Status : "+status);
        System.out.println("Tinggi Badan : "+tinggiBadan);
        System.out.println("\n");
        // Call the method
    }

}