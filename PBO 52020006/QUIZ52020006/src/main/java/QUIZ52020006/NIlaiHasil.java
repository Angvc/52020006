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


public class NIlaiHasil {
    public void SimpanData(String stambuk,String nama, String tugas,String quiz, String mid,String finall,String akhir){
        try{
            FileOutputStream fout=new FileOutputStream("sales.dat",true);
            DataOutputStream out=new DataOutputStream(fout);
            out.writeUTF(stambuk);
            out.writeUTF(nama);
            out.writeUTF(tugas);
            out.writeUTF(quiz);
            out.writeUTF(mid);
            out.writeUTF(finall);
            out.writeUTF(akhir);
            out.close();
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
        
    }
    
    
     public String ReadData(){
        String bufstambuk,bufnama,buftugas,bufquiz,bufmid,buffinall,bufakhir;
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
                bufakhir=in.readUTF();
                temp="Jumlah data="+bufstambuk+"\n Jumlah mahasisiwa="+bufnama+"\n Jumlah mahasisiwa yang tidak lulus="+buftugas+"\n ";  //bentuk string
                data+=temp; //masukkan setiap data ke string akhir
                //bufakhir=buftugas*0.2 + bufquiz*0,2 + bufmid*0.3 + buffinall*0.3;    
                    }
                    
        
            in.close();
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
        return(data);
    }
    
    
}
