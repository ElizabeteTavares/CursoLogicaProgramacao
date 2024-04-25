import java.util.Scanner;

public class uri1143QuadradoCubo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {

            //System.out.println(i + " " + i * i + " " + i * i * i);

            int segundo = i * i;
            int terceiro = i * i * i;
            System.out.printf("%d %d %d%n", i, segundo, terceiro);
        }

        sc.close();
    }
}
