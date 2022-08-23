package Matriz;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Integer matriz[][] = new Integer[3][5];

        for (int i = 0; i<3;i++){
            for (int j=0; j<5; j++){
                matriz[i][j] = new Random().nextInt(101);
            }
        }

        for (int i = 0; i<3;i++){
            for (int j=0; j<5; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
