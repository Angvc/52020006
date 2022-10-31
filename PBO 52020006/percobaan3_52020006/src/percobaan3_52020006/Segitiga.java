/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package percobaan3_52020006;

/**
 *
 * @author Lab20703
 */
public class Segitiga {
    private final double alas;
    private final double tinggi;
public Segitiga(double a,double t){
alas=a;
tinggi=t;
}
public double getluas(){
return(alas*tinggi*0.5);
}
public void display(){
System.out.println("Luas Segitiga ="+getluas());

}
}


