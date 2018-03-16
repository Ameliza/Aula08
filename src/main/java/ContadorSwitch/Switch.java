package ContadorSwitch;

import java.util.Random;

public class Switch {

    //Contexto: ativo de rede

    //Atributos:
    private boolean ativo;  //Switch ligado ou desligado
    private int allPortas;  //Quantos computadores poderão se conectar à ele
    private int portas; //Portas ativas
    private int velocidade; //1Gb

    /**
     * Construtor, para que o usuário determine o total
     * de portas que o switch tem, ou seja, quantos
     * computadores ele suporta fazer conexão
     * @param totalPortas espera o total de portas suportada por este switch
     * @param veloc espera a velocidade que o usuário deseja para cada conexão
     */
    public Switch(int totalPortas, int veloc){
        allPortas = totalPortas;
        velocidade = veloc;
    }

    /**
     * Recebe o status do switch (ligado ou desligado)
     * @param ligado espera receber do usuário se o switch está ligado ou não
     */
    public void ligar(boolean ligado){
        ativo = ligado;
        if(!ativo){
            portas = 0;
            velocidade = 0;
        }
    }

    /**
     * Ativa portas aleatóriamente
     * @return quantas portas foram ativas
     */
    public int estabeleceConexoes(){
        Random rand = new Random();
        portas = rand.nextInt(allPortas);
        return portas;
    }

    /**
     * Diminui 1 porta das portas ativas
     */
    public void liberaConexoes(){
        if(portas > 0){ //Se o número de portas ativas for maior que zero
            portas--;
        }
    }

    /**
     * @return as portas ativas
     */
    public int portasAtivas(){
        return portas;
    }

    /**
     * Se há portas ativas, tem velocidade, portanto retorna seu valor
     * @return a velocidade das conexões
     */
    public int obtemVelocidade(){
        if(portas > 0){ //Se o número de portas ativas for maior que zero
            return velocidade;
        }
        return 0;
    }

}
