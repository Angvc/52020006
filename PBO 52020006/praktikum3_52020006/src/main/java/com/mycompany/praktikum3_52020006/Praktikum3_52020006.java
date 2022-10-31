/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.praktikum3_52020006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lab20703
 */
public class Praktikum3_52020006 {

    public static void main(String[] args) throws IOException{
        BufferedReader key=new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        while(true){

System.out.println ("PENGOLAHAN DATA SALES\n" +
                    "PT. ABC SOLUTION\n" +
                    "–---------------------");
System.out.println("1. Entri Data Sales");
System.out.println("2. Lihat Seluruh Data");
System.out.println("3. Exit");
System.out.print("Pilihan anda: ");
String pilihan=key.readLine();
if(pilihan.equals("1")){
    System.out.print("Input Id Sales :");
        double i=Double.parseDouble(key.readLine());
    System.out.print("Nama :");
        double n=Double.parseDouble(key.readLine());  
    System.out.print("Wilayah :");
        double w=Double.parseDouble(key.readLine());
    System.out.print("Point :");
        double p=Double.parseDouble(key.readLine());
    System.out.print("Gaji Pokok Rp.::");
        double g=Double.parseDouble(key.readLine());
    System.out.print("Bonus Rp.:");
        double b=Double.parseDouble(key.readLine());
    System.out.print("Total Gaji Rp.::");
        double t=Double.parseDouble(key.readLine());
         Datasales p=new Datasales(i, n, w, p, g, b, t);
    p.display();  
}else if(pilihan.equals("4")){
    System.out.println("Bye-Bye");
    System.exit(0);
}else{
    System.out.println("Pilihan salah");
    
}
}
}
}

