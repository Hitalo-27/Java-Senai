package Ex01;

public class Mes {
    public String getMesPorExtenso(int mes, int idioma){
        if(idioma == 1) {
            switch (mes) {
                case 1:
                    return "Janeiro";

                case 2:
                    return "Fevereiro";

                case 3:
                    return "Março";

                case 4:
                    return "Abril";

                case 5:
                    return "Maio";

                case 6:
                    return "Junho";

                case 7:
                    return "Julho";

                case 8:
                    return "Agosto";

                case 9:
                    return "Setembro";

                case 10:
                    return "Outubro";

                case 11:
                    return "Novembro";

                case 12:
                    return "Dezembro";

                default:
                    return "Mês Invalido";

            }
        }
        else if (idioma == 2){
            switch (mes) {
                case 1:
                    return "January";

                case 2:
                    return "February";

                case 3:
                    return "March";

                case 4:
                    return "April";

                case 5:
                    return "May";

                case 6:
                    return "June";

                case 7:
                    return "July";

                case 8:
                    return "August";

                case 9:
                    return "September";

                case 10:
                    return "October";

                case 11:
                    return "November";

                case 12:
                    return "December";

                default:
                    return "Invalid Month";

            }
        } else{
            return "Mês Invalido";
        }
    }
}
