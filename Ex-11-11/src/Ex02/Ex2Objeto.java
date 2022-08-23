package Ex02;

public class Ex2Objeto {
    private String nome;
    private double preco, valor, total;
    private int qtde;

    public Ex2Objeto(String nome, double preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }

    public void calcular() {
        valor = preco * qtde;
        if (qtde <= 10) {
            total = valor;
        } else if (qtde >= 11 && qtde <= 20) {
            total = valor - ((valor) * 10 / 100);

        } else if (qtde >= 21 && qtde <= 50) {
            total = valor - ((valor) * 20 / 100);

        } else if (qtde > 50) {
            total =valor - ((valor) * 25 / 100);
        }


    }

    public void imprimir(){
        calcular();
        System.out.println("----------------------------------------------------------------------------------");
        System.out.printf("Produto: %s \nPreço: %.2f \nQtde: %d \nTotal: %.2f \nTotal com desconto: %.2f", nome, preco, qtde, valor, total);
    }


}
