package Ex01;

import java.util.Scanner;

public class DistanciaObjeto {

    public void leitura(){
        Scanner in = new Scanner(System.in);
        System.out.println("Entre com as cordenadas x e y dos pontos nesta ordem:");
        double x1=in.nextDouble();
        double y1=in.nextDouble();
        double x2=in.nextDouble();
        double y2=in.nextDouble();

        System.out.println("A distancia é:" + objeto(x1,y1,x2,y2));
    }
    private double objeto(double x1, double y1, double x2, double y2){
        return Math.pow(Math.pow(x2-x1,2) + Math.pow(y2-y1,2), 1/2);
    }
}
