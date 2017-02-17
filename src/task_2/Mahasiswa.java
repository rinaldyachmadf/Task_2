/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_2;

/**
 *
 *  NIM = 1301154357  
 *  Nama = Rinaldy Achmad Fauzy
 * @author Rinaldy A
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    private String NIM;
    private String Nama;
    private String Status = "Tidak Lulus";
    char[]Nilai = new char[10];
    int i = 0;
    
    Mahasiswa(){
    
    }
    
    public String getNim(){
        return NIM;
    }
    
    public void setNIM(String NIM){
        this.NIM = NIM;
    }
    
    public String getStatus(){
        return Status;
    }
    
    public void setStatus(String Status){
        this.Status= Status;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    
    public char [] getNilai(){
        return Nilai;
    }
    
    public void setNilai(char[]Nilai){
        this.Nilai = Nilai;
    }
    
    public void addNilai (char nilai1){
        i++;
                if (i<=10){
                    Nilai[i] = nilai1;
                }
    }
    
    public char getNilai(int i){
        return Nilai[i+1];
    }
    
    public String toString(){
        String a = NIM + ","+Nama+","+Status+","+"Nilai = ";
        for (int b = 0; b<=i; b++){
            a=a+Nilai[b]+",";
        }
        
        return a;
    }
    
    public Mahasiswa(String NIMs, String Namas){
        NIM = NIMs;
        Nama = Namas;
    }
    
    char cekNilai (Mahasiswa m2){
        char a = 0;
        for (char b='A'; b<'E'; b++){
            for(int x = 0; x<i; x++){
                if (Nilai[x]== b){
                    for (int bc=0; bc<m2.i; bc++){
                        if(m2.Nilai[bc]==b){
                            return b;
                        }
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
