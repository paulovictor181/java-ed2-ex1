package app;
import java.util.Scanner;

import runners.run_aula1;
import runners.run_aula2;
import runners.run_aula3;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
      
        System.out.print("Escolha qual aula deseja rodar: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                run_aula1 aula1 = new run_aula1();
                aula1.run();
                break;
            case 2:
                run_aula2 aula2 = new run_aula2();
                aula2.run();
                break;
            case 3:
                run_aula3 aula3 = new run_aula3();
                aula3.run();
                break;
            default:
                break;
        }

        sc.close();
        

    }
}
