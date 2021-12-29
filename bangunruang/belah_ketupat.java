package bangunruang;

// mengimport file library file Scanner didalam util didalam java agar bisa membuat objek Scanner
import java.util.Scanner; 

public class belah_ketupat {
    
    //membuat objek untuk inputan menggunakn Scanner,System in berupa masukan String
    Scanner userinput = new Scanner(System.in); 
    
    //method untuk mencar keliling belah ketupat
    void keliling(){ 
        float a,b,c,d,K;
        System.out.println("----MENGHITUNG KELILING BELAH KETUPAT----\n");
        
        System.out.print("Masukkan nilai a =\t");
        // deklarasi var a tipe float, nextFload agar bisa menginput nilai bertipe float (bukan string)
        a = userinput.nextFloat();
        
        System.out.print("Masukkan nilai b =\t");
        b = userinput.nextFloat();
        
        System.out.print("Masukkan nilai c =\t");
        c = userinput.nextFloat();
        
        System.out.print("Masukkan nilai d =\t");
        d = userinput.nextFloat();
        
        K = a+b+c+d; // rumus mencar nilai Keliling  belah ketupat
        
        System.out.println("Keliling Belah ketupat =  "+K +" cm");
        System.out.println("==============================\n\n");
        
    }
    
    
    void luas(){
        
        float d1, d2, L;
        
        System.out.println("----MENGHITUNG LUAS BELAH KETUPAT----\n");
        
        System.out.print("Masukkan nilai d1 =\t");
        d1 = userinput.nextFloat();
        
        System.out.print("Masukkan nilai d2 =\t");
        d2 = userinput.nextFloat();
        
        L = (d1*d2)/2; // rumus mencari nilai Luas belah ketupat
        
        System.out.println("Luas Belah Ketupat =  "+L +" cm");
        System.out.println("==============================\n\n");
    }
}
