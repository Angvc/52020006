/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QUIZ52020006;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;


/**
 *
 * @author kiyoshi
 */
public class OperasiIO {
    public void SimpanData(String stambuk,String nama, String tugas,String quiz, String mid,String finall){
        try{
            FileOutputStream fout=new FileOutputStream("sales.dat",true);
            DataOutputStream out=new DataOutputStream(fout);
            out.writeUTF(stambuk);
            out.writeUTF(nama);
            out.writeUTF(tugas);
            out.writeUTF(quiz);
            out.writeUTF(mid);
            out.writeUTF(finall);
            out.close();
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
        
    }
    
    
     public String ReadData(){
        String bufstambuk,bufnama,buftugas,bufquiz,bufmid,buffinall;
        String temp="",data="";
        try{
            FileInputStream fin=new FileInputStream("sales.dat");
            DataInputStream in=new DataInputStream(fin);
          
            while (in.available()>0){
                bufstambuk=in.readUTF();   
                bufnama=in.readUTF();  
                buftugas=in.readUTF();     
                bufquiz=in.readUTF();
                bufmid=in.readUTF();     
                buffinall=in.readUTF();
                temp="Stambuk="+bufstambuk+"\n nama="+bufnama+"\n tugas="+buftugas+"\n quiz="+bufquiz+"\n mid="+bufmid+"\n finall="+buffinall+"\n";  //bentuk string
                data+=temp; //masukkan setiap data ke string akhir
            }
                    
                    
            in.close();
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
        return(data);
    }
    
    
}
