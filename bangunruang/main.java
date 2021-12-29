package bangunruang;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        
        Scanner userinput1 = new Scanner(System.in);
        
        belah_ketupat blhketupat = new belah_ketupat();        
        bola bola = new bola(3.14);
        SetengahBola stb = new SetengahBola(3.14);
        
        int i,j;
        boolean k;
        int h = 1;
       
        
        while(h==1){
            
        System.out.println("\n~~~~PERHITUNGAN BANGUN RUANG & BANGUN DATAR~~~~\n");
        System.out.println("Menu pilihan\n"+ "1.Belah Ketupat\n"+"2.Bola\n"+"3.Setengah Bola");
        System.out.print(" Pilihan : ");
        i = userinput1.nextInt();
        System.out.println("\n");
        
        
        switch (i){
            
            case 1:
               System.out.print("pilih menu :\n1.keliling belah ketupat\n2.luas belah ketupat\nPilihan\t: ");
               j = userinput1.nextInt();
               
               switch (j){
                   case 1:
                      blhketupat.keliling();
                      break;
                      
                   case 2:
                        blhketupat.luas();
                        break;
                    
                   default:
                     System.out.println("menu salah");
               }break;
               
            
            case 2:
               System.out.print("pilih menu :\n1.Volume bola\n2.luas permukaan bola\nPilihan\t: ");
               j = userinput1.nextInt();
               
               switch (j){
                   case 1:
                       bola.volume();
                       break;
                       
                   case 2:
                       bola.LuasPermukaan();
                       break;
                       
                   default:
                     System.out.println("menu salah");
               }break;
               
               
            case 3:
                System.out.print("pilih menu :\n1.luas permukaan bola berongga \n2.luas permukaan bola pejal\nPilihan\t: ");
                j = userinput1.nextInt();
                
                switch (j){
                    case 1 :
                        stb.LuasPermukaanBolaBerongga();
                       break;
                       
                   case 2:
                       stb.LuasPermukaanBolaPejal();
                       break;
                       
                   default:
                     System.out.println("menu salah");
                }break;
               
            default:
                System.out.println("MENU SALAH");
        }

        System.out.println("\nINGIN MENCOBA LAGI ? (TRUE/FALSE)");
        k = userinput1.nextBoolean();
        if(k == false){
            h++;
            System.out.println("\n\nTERIMA KASIH\n");
        }
      } 
        
    }
}