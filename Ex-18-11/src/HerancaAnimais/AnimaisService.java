package HerancaAnimais;

public class AnimaisService {

    public void verificaAnimal(int n){
        switch (n){
            case 1:
                cachorro();
                break;
            case 2:
                gato();
                break;
        }
    }

    public void cachorro(){
        Cachorro cachorro = new Cachorro();
        System.out.println("\n"+cachorro.getLate());
    }

    public void gato(){
        Gatos gatos = new Gatos();
        System.out.println("\n"+gatos.getMia());
    }

    public void dados(String nome, String raca, String alimento, String dono){
        System.out.print("Nome: "+nome+
                "\nRaça: "+raca+
                "\nAlimentos: "+alimento+
                "\nDono: "+dono);
    }
}
