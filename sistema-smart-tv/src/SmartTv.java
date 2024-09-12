public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;


    // Botão de ligar desligar
    public void ligar(){
         ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


    // Volume aumentando || diminuindo
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume para " + volume);
    }


    // Troca de canais

    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Trocando canais " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Trocando canais " + canal);
    }


}
