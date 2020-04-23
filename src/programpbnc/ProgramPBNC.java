/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programpbnc;

import java.util.Scanner;
public class ProgramPBNC {

    static String kelompok(String kel){
        return kel;
    }
    static String praktikan1(){
        return "Daniel Parningotan Alexander Sibarani 21120119130086";
    }
    static String praktikan2(){
        return "Satria Bimantara Dharmawan 21120119130096";
    }
    public void pembatas(){
        System.out.println("=========================");
    }
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println(kelompok("KELOMPOK 70"));
        System.out.println(praktikan1());
        System.out.println(praktikan2());
        Scanner sc = new Scanner(System.in); {
        int username, option,jumlah,proses = 0,lanjut,kategori,code;
        System.out.println("#############");
        System.out.println("-------------");
        System.out.println("   WELCOME   ");
        System.out.println("    PBNC     ");
        System.out.println("TICKET CORNER");
        System.out.println("-------------");
        System.out.println("#############");
        System.out.println("MASUKAN USERNAME ANDA");
        System.out.print(":");
        username=sc.nextInt();
        
        if (5==username)
        {
            do{
                System.out.println("MENU UTAMA");
                System.out.println("a.n Daniel Bimantara");
                System.out.println("PILIH OPTION");
                System.out.println("1.BELI TIKET PBNC");
                System.out.println("2.LIHAT KATEGORI TIKET");
                System.out.println("3.CETAK TIKET PBNC");
                System.out.println("4.KELUAR");
                System.out.println("===========");
            
                System.out.print("PILIH> ");
                option=sc.nextInt();
                
                switch(option){
                    case 1:
                    System.out.println("--------------------");
                    System.out.println("PEMBELIAN TIKET PBNC");
                    System.out.println("--------------------");
                    System.out.print("Masukkan kategori tiket yang akan dibeli>");
                    kategori=sc.nextInt();
                    if(kategori==1)
                    {
                        System.out.println("HARGA UNTUK TIKET KATEGORI 1 ADALAH Rp. 200000");
                        lanjut=sc.nextInt();
                        System.out.print("Lanjut beli? 1. lanjut/2. tidak");
                            if (lanjut==1){
                              System.out.println("Generating Code");
                              System.out.println("Code anda : 20200101");
                              System.out.println("TRANSAKSI BERHASIL TERIMA KASIH");
                    }
                    else if(kategori==2)
                    {
                        System.out.println("HARGA UNTUK TIKET KATEGORI 2 ADALAH RP 300000");
                        lanjut=sc.nextInt();
                        System.out.print("Lanjut beli? 1. lanjut/2. tidak");
                            if (lanjut==1){
                              System.out.println("Generating Code");
                              System.out.println("Code anda : 20200201");
                              System.out.println("TRANSAKSI BERHASIL TERIMA KASIH");
                    }
                    else if(kategori==3)
                    {
                        System.out.println("HARGA UNTUK TIKET KATEGORI 3 ADALAH RP 400000");
                        lanjut=sc.nextInt();
                        System.out.print("Lanjut beli? 1. lanjut/2. tidak");
                            if (lanjut==1){
                              System.out.println("Generating Code");
                              System.out.println("Code anda : 20200301");
                              System.out.println("TRANSAKSI BERHASIL TERIMA KASIH");
                    }
                    else if(kategori==4)
                    {
                        System.out.println("HARGA UNTUK TIKET KATEGORI 4 ADALAH RP 500000");
                        lanjut=sc.nextInt();
                        System.out.print("Lanjut beli? 1. lanjut/2. tidak");
                            if (lanjut==1){
                              System.out.println("Generating Code");
                              System.out.println("Code anda : 20200401");
                              System.out.println("TRANSAKSI BERHASIL TERIMA KASIH");
                    }
                    else{
                        System.out.println("MASUKAN SALAH");
                    }            
                    break;
                    
                    case 2;
                    System.out.println("--------------");
                    System.out.println("KATEGORI TIKET");
                    System.out.println("--------------");
                    System.out.println("KATEGORI TIKET 1 RP 200000");
                    System.out.println("KATEGORI TIKET 2 RP 300000");
                    System.out.println("KATEGORI TIKET 3 RP 400000");
                    System.out.println("KATEGORI TIKET 4 RP 500000");
                    break;
                    
                    case 3:
                        System.out.println("MASUKKAN CODE PEMBELIAN ANDA: ");
                        code=sc.nextInt();
                        if (code==20200101){
                            System.out.println("-----------------");
                            System.out.println("--code:20200101--");
                            System.out.println("-username:200915-");
                            System.out.println("-harga:Rp.200000-");
                            System.out.println("---6 JUNI 2020---");
                            System.out.println("----AT ICEBSD----");
                    }
                        else if (code==20200201){
                            System.out.println("-----------------");
                            System.out.println("--code:20200201--");
                            System.out.println("-username:200915-");
                            System.out.println("-harga:Rp.300000-");
                            System.out.println("---6 JUNI 2020---");
                            System.out.println("----AT ICEBSD----");
                    }
                        else if (code==20200301){
                            System.out.println("-----------------");
                            System.out.println("--code:20200301--");
                            System.out.println("-username:200915-");
                            System.out.println("-harga:Rp.400000-");
                            System.out.println("---6 JUNI 2020---");
                            System.out.println("----AT ICEBSD----");
                    }
                        else if (code==20200401){
                            System.out.println("-----------------");
                            System.out.println("--code:20200401--");
                            System.out.println("-username:200915-");
                            System.out.println("-harga:Rp.500000-");
                            System.out.println("---6 JUNI 2020---");
                            System.out.println("----AT ICEBSD----");
                    }
                    break;
                    default:
                    
                    System.out.println("TERIMA KASIH SUDAH MEMBELI TIKET PBNC2020");
                }
                    System.out.println("\nTEKAN 0 UNTUK KEMBALI KE MENU");
                    System.out.println(">>");
                    proses=sc.nextInt();
                    ++proses;
            }
            while(proses<=1);
                    System.out.println("TRANSAKSI GAGAL,COBA LAGI");
        }
        else{
            System.out.println("-----------USERNAME SALAH------------");
            System.out.println("KUNJUNGI WEBSITE KAMI DI PBNC2020.com");
        }
    }       
    }
}
