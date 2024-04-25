import java.util.Locale;
import java.util.Scanner;

public class uri1078Tabuada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i=1; i<=10; i++) {
            int produto = i * N;
            System.out.println(i + " X " + N + " = " + produto);
        }

        sc.close();
    }
}
