import java.util.Locale;
import java.util.Scanner;

public class uri1094Experiencias {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x, n, totalCobaias = 0, totalCoelhos = 0, totalRatos = 0, totalSapos = 0;
        double percentualRatos = 0, percentualSapos = 0, percentualCoelhos = 0;
        String animal;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            animal = sc.next();
            totalCobaias += x;

            if (animal.equals("C")) {
                totalCoelhos += x;
            } else if (animal.equals("R")) {
                totalRatos += x;
            } else if (animal.equals("S")) {
                totalSapos += x;
            }

            percentualRatos = (double) (totalRatos * 100) / totalCobaias;
            percentualSapos = (double) (totalSapos * 100) / totalCobaias;
            percentualCoelhos = (double) (totalCoelhos * 100) / totalCobaias;
        }

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("total de sapos: " + totalSapos);
        System.out.printf("Percetual de coelhos: %.2f%%%n", percentualCoelhos);
        System.out.printf("Percetual de ratos: %.2f%%%n", percentualRatos);
        System.out.printf("Percetual de sapos: %.2f%%%n", percentualSapos);

        sc.close();
    }
}
