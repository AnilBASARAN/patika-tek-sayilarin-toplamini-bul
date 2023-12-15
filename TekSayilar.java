import java.util.Scanner;
public class TekSayilar {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        int sum = 0;
        do {
            System.out.print("Sayı giriniz:  ");
            number = input.nextInt();
            if(number % 2 != 0 && number > 0) sum += number;
        }while(number > 0);
        // if i kullanmamızın nedeni
        // sum değerine eksi değer olmasına rağmen toplama ekliyor son girilen eksi değeri
        // ama if koyarsak sadece pozitif sayıları ekliyor sum değerine

System.out.print(sum);

    }
}
