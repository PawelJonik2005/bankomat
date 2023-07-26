
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double obecneSaldo = 0;
        System.out.println("Twoje saldo w banku wynosi: " + obecneSaldo+ "zł");
        while (true) {
            System.out.println("Wybierz typ operacji: ");
            System.out.println("0. Wyjdź z bankomatu");
            System.out.println("1. Wpłata środków");
            System.out.println("2. Wypłata środków");
            int opcja = scanner.nextInt();
            switch (opcja) {
                case 1:
                    System.out.println("Podaj jaką kwotę chcesz wpłacić: ");
                    double kwota1 = scanner.nextDouble();
                    obecneSaldo += kwota1;
                    System.out.println("Saldo po wpłacie: " + obecneSaldo + "zł");
                    continue;
                case 2:
                    System.out.println("Podaj jaką kwotę chcesz wypłacić: ");
                    double kwota2 = scanner.nextDouble();
                    obecneSaldo -= kwota2;
                    System.out.println("Saldo po wpłacie: " + obecneSaldo+ "zł");
                    continue;
            }
            if (opcja == 0) {
                System.out.println("Opuszczasz bankomat");
                break;
            } else {
                System.out.println("Wybrano złą opcję, spróbuj ponownie");
            }
            scanner.close();
        }
    }
}