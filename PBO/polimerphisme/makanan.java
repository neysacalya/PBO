package polimerphisme;
import java.util.Scanner;
public abstract class makanan {
    Scanner scan = new Scanner(System.in);
    public int jenisMakanan(){
        int harga=0;
        System.out.println("Tulis Pilihan Jenis : (Ayam/Ikan)");
      String pilihan=scan.nextLine();
      switch (pilihan) {
        case "Ayam":harga=10000;
            
            break;
        case "Ikan":harga=13000;
            break;
      
        default: harga=0;
            break;
      }
    
        return harga;


        }    
        public abstract void tampilJenis(String jenis);
    }
   

