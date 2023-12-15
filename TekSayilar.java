import java.util.Scanner;
public class TekSayilar {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.print("Sayı giriniz:  ");
            number = input.nextInt();
            if(number % 2 != 0) sum += number;
        }while(number > 0);

System.out.print(sum);

    }
}
