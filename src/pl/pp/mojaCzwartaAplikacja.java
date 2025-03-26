package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter lower and upper integer limits: ");
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = x, sum1 = x * x;
            while (x != y) {
                x += 1;
                sum1 += (x * x);
            }
            System.out.println("The sums of the squares from ");
            System.out.println(n * n + " to " + y * y + " is " + sum1);
            break;

        }
        while (true) {
            System.out.println("Enter next set of limits: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int sum2 = a * a, m = a;
            if (a == b) {
                System.out.println("Done");
                break;
            } else {
                while (a != b) {
                    a += 1;
                    sum2 += (a * a);
                }
                System.out.println("The sums of the squares from ");
                System.out.println(m * m + " to " + b * b + " is " + sum2);



        }
        scanner.close();
    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prosze wybracz operacje (lub -1, aby zakończyć)" + "\n");
        while (true){
            System.out.println("Dodawania - 1" + "\n");
            System.out.println("Odejmowania - 2" + "\n");
            System.out.println("Mnożenia - 3" + "\n");
            System.out.println("Dzielenia - 4" + "\n");

            int a = scanner.nextInt();
            if(a!=1 && a!=2 && a!=3 && a!=4){break;}

            System.out.println("Prosze podać dwie liczby (lub -1, aby zakończyć)" + "\n");

            int x = scanner.nextInt();
            if (x == -1) {break;}
            int y = scanner.nextInt();


                if (a == 1){
                    System.out.println(x+y);
                }
                else if(a == 2){
                    System.out.println((x-y) + " lub " + (y-x));
                }
                else if(a == 3){
                    System.out.println(x*y);
                }
                else if(a == 4){
                    System.out.println((x/y) + " lub " + (y/x));
                }
                else break;
            System.out.println("Prosze podać dwie liczby" + "\n");

        }
        scanner.close();
    }
}

