/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Muhammad Raynar
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int pilihanSub = 0, jumlah;
        double total = 0, harga, diskon, uangBayar, uangKembalian;
        
        System.out.println("======================================================");
        System.out.println("KASIR WARUNG SEDERHANA");
        System.out.println("DAFTAR MENU : ");
        System.out.println("(1). SATE \n(a). Sate Ayam : Rp 1.500 / Tusuk \n(b). Sate Kambing : Rp 3.000 / Tusuk");
        System.out.println("\n(2). PECEL \n(a). Lauk Ayam : Rp 13.000 / Porsi \n(b). Lauk Empal : Rp 15.000 / Porsi");
        System.out.println("\n(3). PENYETAN \n(a). Lauk Tahu/Tempe : Rp 5.000 / Porsi \n(b). Lauk Telur : Rp 7.000 / Porsi \n(c). Lauk Ayam : Rp 10.000 / Porsi");
        System.out.print("\n======================================================\n ");
        System.out.print("\nPilih menu sesuai nomor yang di sediakan (1/2/3)   : ");
        int pilihanMain = sc.nextInt();
        
        switch (pilihanMain) {
             case 1: 
                  System.out.print("Pilih submenu sesai nomor yang di sediakan (1/2) : ");
                  pilihanSub = sc.nextInt();
                  
                  if(pilihanSub == 1){
                      harga = 1500;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }else if(pilihanSub == 2){
                      harga = 3000;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }
                break;
               case 2:
                  System.out.print("Pilih submenu sesai nomor yang di sediakan (1/2) : ");
                  pilihanSub = sc.nextInt();
                  
                  if(pilihanSub == 1){
                      harga = 13000;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }else if(pilihanSub == 2){
                      harga = 15000;
                      System.out.print("Masukkan jumlah pembelian : ");
                      jumlah = sc.nextInt();
                      total = harga * jumlah;
                  }
                   break;
               case 3:
                    System.out.print("Pilih submenu sesuai nomor yang disediakan (1/2/3) : ");
                    pilihanSub = sc.nextInt();

                    switch(pilihanSub) {
                        case 1: 
                            harga = 5000;
                            System.out.print("Masukkan jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = harga * jumlah;
                            break;
                        case 2:
                            harga = 7000;
                            System.out.print("Masukkan jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = harga * jumlah;
                            break;
                        case 3:
                            harga = 10000;
                            System.out.print("Masukkan jumlah pembelian : ");
                            jumlah = sc.nextInt();
                            total = harga * jumlah;
                            break;

                        default:
                            System.out.println("Pilihan tidak valid");
                            return;
                    }
                    break;

                    default:
                    System.out.println("Pilihan tidak valid");
                    return;
        }
        
        System.out.print("\nApakah anda memiliki kartu Member? (y/n) : ");
        String member = sc.next();   
        
        if(member.equalsIgnoreCase("y")){
            diskon = 0.05 * total;
            total -= diskon;
            System.out.println("Anda mendapatkan diskon senilai = Rp " + diskon);
            System.out.println("Total biaya yang harus di bayar = Rp " + total);
        }else if(member.equalsIgnoreCase("n")){
            System.out.println("Total biaya yang harus di bayar = Rp " + total);
        }
        
        System.out.print("\nMasukkan jumlah uang pembayaran : ");
        uangBayar = sc.nextDouble();
        System.out.print("\n======================================================\n ");
        
        uangKembalian = uangBayar - total;
        
        System.out.println("\nUang  yang anda bayarkan senilai Rp " + uangBayar);
        System.out.println("Total pembelian anda senilai     Rp " + total);
        System.out.println("Total kembalian anda adalah      Rp " + uangKembalian);
        System.out.print("\n======================================================\n ");
        
    }
    
}
