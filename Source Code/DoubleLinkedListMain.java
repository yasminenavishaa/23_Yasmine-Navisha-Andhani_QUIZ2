import java.util.Scanner;
public class DoubleLinkedListMain {
    private static int menu;
    public static void menu(){
        System.out.println("Menu : ");
        System.out.println("1. Tambah Antrean");
        System.out.println("2. Cetak Antrean");
        System.out.println("3. Hapus Antrean");
        System.out.println("4. Keluar");
        System.out.println("++++++++++++++++++++++++++++++");
    }
    
    public static void main(String[] args){
        Scanner scint = new Scanner (System.in);
        Scanner scstring = new Scanner (System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int pilih;
        do{
            menu();
            System.out.print("Nomor yang dipilih : ");
            pilih = scint.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("\n");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.println("Masukkan Data Pembeli");
                    System.out.println("++++++++++++++++++++++++++++++");
                    System.out.print("Nomor Antrian : ");
                    int noUrut = scint.nextInt();
                    System.out.print("Nama Customer : ");
                    String nama = scstring.nextLine();
                    System.out.print("Nomor HP : ");
                    String noHP = scstring.nextLine();
                    Pembeli input= new Pembeli(noUrut, nama, noHP);
                    dll.add(input);
                    System.out.println("------------------------------");
                    System.out.print("\n");
                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    dll.remove();
                    break;
                case 4:
                    System.out.println("Terimakasih");
                    break;
            }
            System.out.println("");
        }while(pilih != 4);
    }
}