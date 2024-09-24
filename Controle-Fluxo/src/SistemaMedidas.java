public class SistemaMedidas {

    public static void main(String[] args) {
        String tamanho = "G";

    //Condicionais If/else

        if (tamanho == "P") {
            System.out.println("Pequeno");
        }else if (tamanho == "M"){
            System.out.println("Médio");
        }else if (tamanho == "G"){
            System.out.println("Grande");
        }else
        System.out.println("Indefinido");

        //Switch case
        switch (tamanho) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Indefinido");
                break;
        }
    }

}