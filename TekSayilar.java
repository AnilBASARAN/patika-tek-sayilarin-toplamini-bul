import java.util.Scanner;
public class TekSayilar {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.print("Sayı giriniz:  ");
            number = input.nextInt();
            // çift ve 4 ün katı dediği için sadece 4 ün katlarına bakmamız yeterli zaten her 4 ün katı
            // değer aynı zamanda çift sayı olacaktır
            if(number % 4 == 0) {
                sum += number;

            }
        }while(number % 2 == 0);

System.out.print(sum);

    }
}
