package herancaVeiculo;

import java.util.Scanner;

public class Veiculo {
    private Integer velocidade;
    private boolean status;

    public Integer getValocidade() {
        return velocidade;
    }

    public void setValocidade(Integer valocidade) {
        this.velocidade = valocidade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void Ligar(){
        status = true;
        Acelerar();
        Mostrar();
    }

    void Desligar(){
        status = false;
        velocidade = 0;
        Mostrar();
    }

    void Acelerar(){
        Scanner in = new Scanner(System.in);
        System.out.println("Velocidade: ");
        velocidade = in.nextInt();
    }

    void Mostrar(){
        System.out.println("Status: "+status);
        System.out.println("Velocidade: "+velocidade+"km");
    }
}
