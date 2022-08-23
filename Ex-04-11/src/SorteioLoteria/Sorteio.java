package SorteioLoteria;

import java.util.*;

public class Sorteio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer nSorteados[] = new Integer[6];
        Integer nInformados[] = new Integer[6];
        Integer acertos = 0;

        for(int i = 0; i<6; i++){
            nInformados[i] = in.nextInt();
        }

        for(int j = 0; j<6; j++){
                nSorteados[j] = new Random().nextInt(100);
                System.out.println("Numeros Sorteados = " + nSorteados[j]);
        }

        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(nInformados[i] == nSorteados[j]){
                    acertos++;
                }
            }

            System.out.println(acertos);
        }
    }
}
