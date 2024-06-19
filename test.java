import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        int n;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lutfen Bir Sayi Giriniz :");
        n = inp.nextInt();

        System.out.println("4'un Katlari :");
        for (int i = 1; i <= n; i*=4) {
            System.out.println(i);
        }
        System.out.println("5'in Katlari :");
        for (int i = 1; i <= n; i*=5) {
            System.out.println(i);
        }
    }
}





