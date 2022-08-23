package Prova;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtde, maiorIdade = 0, menorIdade = 0, mulheres = 0;
        double mediaSalario = 0, menorSalario = 0;
        int j = 0;

        System.out.print("Infome a quantidade de pessoas: ");
        qtde = in.nextInt();

        Integer idade[] = new Integer[qtde];
        Double salario[] = new Double[qtde];
        String sexo[] = new String[qtde];

        for(int i=0; i<qtde; i++){

            //B) A maior e a menor idade do grupo
            System.out.print("Infome a idade da "+(i+1)+"°pessoa: ");
            idade[i] = in.nextInt();
            if(idade[i] < 0){
                System.out.print("Idade Invalida ");
                System.exit(0);
            }
            if(maiorIdade == 0){
                maiorIdade = idade[i];
            }
            if(menorIdade == 0){
                menorIdade = idade[i];
            }
            if(maiorIdade < idade[i]){
                maiorIdade = idade[i];
            }
            if(menorIdade > idade[i]){
                menorIdade = idade[i];
            }

            //C) A quantidade de mulheres na região
            System.out.print("Infome o sexo com M para masculino e F para feminino da "+(i+1)+"°pessoa: ");
            sexo[i] = in.next();
            if(sexo[i].equals("M") || sexo[i].equals("F") || sexo[i].equals("m") || sexo[i].equals("f")){
                if(sexo[i].equals("F")){
                    mulheres++;
                }
            }else{
                System.out.print("Sexo Invalido");
                System.exit(0);
            }

            //A) A media dos salarios do grupo
            System.out.print("Infome o salario da "+(i+1)+"°pessoa: ");
            salario[i] = in.nextDouble();
            if(salario[i] < 0){
                System.out.print("Salario Invalido ");
                System.exit(0);
            }
            mediaSalario = mediaSalario + salario[i];

            //D) A idade e o sexo da pessoa que possui o menor salário
            if(menorSalario == 0){
                menorSalario = salario[i];
                j = i;
            }

            if(menorSalario > salario[i]){
                menorSalario = salario[i];
                j = i;
            }

            System.out.println("");
        }

        //A) A media dos salarios do grupo
        mediaSalario = mediaSalario / qtde;
        System.out.println("A media dos salarios é R$"+mediaSalario);

        //B) A maior e a menor idade do grupo
        System.out.println("A maior idade é:" +maiorIdade);
        System.out.println("A menor idade é:" +menorIdade);

        //C) A quantidade de mulheres na região
        System.out.println("A quantidade de mulheres na região é: " +mulheres);

        //D) A idade e o sexo da pessoa que possui o menor salário
        System.out.println("A idade da pessoa que possui o menor salario é: "+idade[j]+" anos e o sexo é "+sexo[j]);
    }
}
