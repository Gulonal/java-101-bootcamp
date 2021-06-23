package Not;
import java.util.Scanner;
public class Hesap {

        public static void main(String[] args) {

            int mat, fizik, kimya, turkce, tarih,muzik;

            Scanner ing = new Scanner (System.in);

            System.out.print("Matematik des notunu giriniz : ");
            mat = ing.nextInt();

            System.out.print("Fizik des notunu giriniz : ");
            fizik = ing.nextInt();

            System.out.print("Kimya des notunu giriniz : ");
            kimya = ing.nextInt();

            System.out.print("Turkce des notunu giriniz : ");
            turkce = ing.nextInt();

            System.out.print("Tarih des notunu giriniz : ");
            tarih = ing.nextInt();

            System.out.print("Müzik des notunu giriniz : ");
            muzik = ing.nextInt();

            int toplam = (mat + fizik + kimya + turkce +tarih + muzik);
            double sonuc = toplam / 6 ; //ortalama bulmak için yapılan işlem
            System. out.println("oratalamanız : "+ sonuc);

            String son;
            son = sonuc >= 60 ? "Sınıfı geçtiniz tebrikler" : "üzgünüm sınıf tekrarı"; //karşılaştırma işlemi yapam operatördür ?
            System.out.println("Sonuc: "+son);
        }

    }
