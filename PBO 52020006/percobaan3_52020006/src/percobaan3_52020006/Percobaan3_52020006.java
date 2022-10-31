/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package percobaan3_52020006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Lab20703
 */
public class Percobaan3_52020006 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        while(true){

System.out.println("Menu Pilihan");
System.out.println("1. Operasi Geometri Lingkaran");
System.out.println("2. Operasi Geometri SegiTiga");
System.out.println("3. Operasi Geometri persegipanjang");
System.out.println("4. Exit");
System.out.print("Pilihan anda? ");
String pilihan=key.readLine();
if(pilihan.equals("1")){
    System.out.print("Masukkan jari-jari lingkaran:");
        double r=Double.parseDouble(key.readLine());
        Lingkaran p=new Lingkaran(r);
                p.display();
}else if(pilihan.equals("2")){
    System.out.println("Lengkapi untuk Operasi SegiTiga.....");
    System.out.print("Masukkan alas SegiTiga:");
double a=Double.parseDouble(key.readLine());
    System.out.print("Masukkan tinggi SegiTiga:");
double t=Double.parseDouble(key.readLine());
    Segitiga q=new Segitiga(a,t);
    q.display();
    
}else if(pilihan.equals("3")){
    System.out.println("Lengkapi untuk Operasi Persegi panjang.....");
     System.out.print("Masukkan alas Persegi Panjang:");
double a=Double.parseDouble(key.readLine());
    System.out.print("Masukkan tinggi Persegi panjang:");
double t=Double.parseDouble(key.readLine());
    persegipanjang r=new persegipanjang(a,t);
    r.display();
    
}else if(pilihan.equals("4")){
    System.out.println("Bye-Bye");
    System.exit(0);
}else{
    System.out.println("Pilihan salah");
    
}
}
}
}

    

