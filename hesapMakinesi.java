import java.util.Scanner;
//Kullanıcıdan istenen sayı değerleri ile 4 işlem yapan hesap makinesi -- switchCase
public class hesapMakinesi
{

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        int sonuc;

    System.out.println("1. değer   : ");
    int sayi1=scan.nextInt();   //Sayi1 degeri alindi.
    System.out.println("2. değer   :  ");
    int sayi2 = scan.nextInt();   //Sayi2 degeri alindi.
        System.out.println("İşlem Menüsü \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme \n");
        int islem;
        System.out.println("Lütfen İşlem Seçiniz (1-4) :");
        islem = scan.nextInt();   //Hangi islem yapilacaksa kullanicidan secmesi istendi.
    switch (islem){
        case 1:
          sonuc=  sayi1+sayi2;
          System.out.println("Toplama işlemi sonucu    : " + sonuc);
            break;
        case 2:
            sonuc=sayi1-sayi2;
            System.out.println("Çıkarma işlemi sonucu  : " + sonuc);
            break;
        case 3:
            sonuc=sayi1*sayi2;
            System.out.println("Çarpma işlemi sonucu    : "+sonuc);
            break;
        case 4:
            sonuc=sayi1/sayi2;
            System.out.println("Bölme işlemi sonucu    :" +sonuc);
            break;
    }
    }
    }