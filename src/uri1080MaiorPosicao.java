import java.util.Scanner;

public class uri1080MaiorPosicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maior = 0;
        int pos = 1;

        for (int i = 1; i <= 100; i++) {
            int x = sc.nextInt();

            if (i == 1) {
                maior = x;
                pos = 1;
            } else if (x > maior) {
                maior = x;
                pos = i;

            }
        }
        System.out.println(maior);
        System.out.println(pos);

        sc.close();
    }
}
