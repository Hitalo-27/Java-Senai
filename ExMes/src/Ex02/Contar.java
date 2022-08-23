package Ex02;

public class Contar {
    public void Contagem(){
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
    }

    public void Contagem(int fim){
        for (int i=1; i<=fim; i++){
            System.out.println(i);
        }
    }

    public void Contagem(int inicio, int fim){
        for (int i=inicio; i<=fim; i++){
            System.out.println(i);
        }
    }

    public void Contagem(int inicio, int fim, int pausa ) throws InterruptedException{
        for (; inicio <= pausa; inicio++){
            System.out.println(inicio);
            Thread.sleep(pausa*1000, 1);
        }
    }
}
