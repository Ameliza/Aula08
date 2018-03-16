package ContadorSwitch;

public class Contador {
    //Atributos:
    private int valorAtual;

    /**
     * Incrementa 1 ao contador
     * @return o valor atual, após o incremento
     */
    public int incrementa(){
        return valorAtual++;
    }

    /**
     * Recebe um valor para ser o novo valor atual
     * @param valor o usuário digitará o valor desejado para começar o contador
     */
    public void valorInicial(int valor){
        valorAtual = valor;
    }

    /**
     * Usado para obter o valor atual
     * @return o valor atual
     */
    public int obtemValorAtual(){
        return valorAtual;
    }

}
