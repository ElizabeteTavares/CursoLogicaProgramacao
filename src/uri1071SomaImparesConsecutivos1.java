import java.util.Scanner;

public class uri1071SomaImparesConsecutivos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int min, max;
        if (x < y) {
            min = y;
            max = x;
        } else {
            min = y;
            max = x;
        }

        int soma = 0;
        for (int i=min+1; i<max; i++){
            if (i % 2 != 0){
                soma = soma + i;
            }
        }
        System.out.println(soma);

        sc.close();
    }
}
