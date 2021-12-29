package bangunruang;

import java.util.Scanner;

public class SetengahBola{ 
   
    Scanner userinput = new Scanner(System.in);
    
    double pi;
    
    SetengahBola(double pi){
        this.pi = pi;
    }
    
   void LuasPermukaanBolaBerongga(){
   
       double r,L;
       
       System.out.println("----MENGHITUNG LUAS PERMUKAAN SETENGAH BOLA----\n");
        
        System.out.print("Masukkan jari-jari =\t");
        r = userinput.nextDouble();
        
        //mencari luas permukaan bola
        L = 2*pi*(r*r);
        
        System.out.println("Luas permukaan Setengah bola Berongga=\t"+L +"cm");
        System.out.println("====================================\n\n");
   }
   
   
   void LuasPermukaanBolaPejal(){
       
       double r,L;
       
       System.out.println("----MENGHITUNG LUAS PERMUKAAN SETENGAH BOLA----\n");
        
        System.out.print("Masukkan jari-jari =\t");
        r = userinput.nextDouble();
        
        //mencari luas permukaan bola
        L = 3*pi*(r*r);
        
        System.out.println("Luas permukaan Setengah bola pejal=\t"+L +"cm");
        System.out.println("====================================\n\n");  
   }
}
