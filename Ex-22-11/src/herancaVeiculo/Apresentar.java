package herancaVeiculo;

import java.util.Scanner;

public class Apresentar {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        Scanner in = new Scanner(System.in);

        System.out.println("Ligar ou Desligar");
        int n = in.nextInt();

        if(n==1){
            veiculo.Ligar();
        }
        else{
            veiculo.Desligar();
        }

    }
}
