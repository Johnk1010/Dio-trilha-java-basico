public class ResultadoEscolar {

    public static void main(String[] args) {
        double nota = 7;

        //condicional simples
        if (nota >= 7) 
            System.out.println(nota + " Aprovado, Parabéns");

        else
        System.out.println(nota + " Reprovado, Estude mais");
        System.out.println(" ");
       
        //Condicional encadeada
        if (nota >= 7) {
            System.out.println(nota + " Aprovado, Parabéns");

        }else if(nota >=5 && nota <=7) {
        System.out.println(nota + " Recuperaçao, Estude mais");
        System.out.println(" ");

        }else 
        System.out.println("Reprovado, boa sorte na próxima");

        //Condição ternária = Forma de expressar uma condição de forma resumida 
        //no código.

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(resultado);
        System.out.println(" ");

        String resultado2 = nota >= 7  ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado2);
    }
}
