import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int toplam = 0;

        System.out.print("Bir sayi giriniz: ");
        int sayi = inp.nextInt();

        for(int i = 1; i < sayi; i++)
        {
            if(sayi % i == 0) {
                toplam += i;
            }
        }
        if(sayi == toplam) {
            System.out.println(sayi + " Mukemmel bir sayidir");
        }
        else {
            System.out.println(sayi + " Mukemmel bir sayi degildir.");
        }
    }
}
