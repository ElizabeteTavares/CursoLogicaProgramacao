import java.util.Scanner;

public class PUMDiferente {



        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int inicio = 1;

            for (int i=1; i<=n; i++) {
                for (int j=0; j<3; j++) {

                    System.out.print(inicio + " ");
                    inicio++;
                }

                System.out.println("PUM");
                inicio++;

            }
        }

    }
