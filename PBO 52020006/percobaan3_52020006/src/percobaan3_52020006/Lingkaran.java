/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan3_52020006;

/**
 *
 * @author Lab20703
 */
public class Lingkaran {
    final double phi=3.14;
    private final double jarijari;
    
public Lingkaran(double r){
jarijari=r;
}
public double getluas(){
return(jarijari*jarijari*phi);
}
public void display(){
System.out.println("Luas Lingkaran ="+getluas());
}
}
