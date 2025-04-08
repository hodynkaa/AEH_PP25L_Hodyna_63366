package pl.pp;
import java.util.Scanner;
public class mojaPiataAplikacja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj znak: ");
        char x = input.next().charAt(0);
        System.out.println("Podaj liczbę znaków w wierszu: ");
        int a = input.nextInt();
        System.out.println("Podaj liczbę linii: ");
        int b = input.nextInt();

        tablica(x, a, b);
    }
    public static void tablica(char x, int a, int b){
        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
