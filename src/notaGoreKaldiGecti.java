import java.util.Scanner;

public class notaGoreKaldiGecti {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz:");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz:");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz:");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz:");
        muzik = input.nextInt();

        double ort = (mat + fizik + turkce + kimya + muzik) / 5;


        if (ort >= 55) {
            System.out.println("Geçtiniz.");
        } else {
            System.out.println("Kaldınız.");
        }
        System.out.print("Ortalamanız:" + ort);

    }
}
