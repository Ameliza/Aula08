package ContadorSwitch;

public class Principal {

    /**
     * Método que é chamado pelo sistema operacional
     * @param args argumentos de linha de comando
     */
    public static void main(String[] args) {

        //********** CONTADOR **********
        Contador c = new Contador();

        c.valorInicial(7);
        c.incrementa();
        //System.out.println("Valor atual: " + c.obtemValorAtual());

        //********** SWITCH **********
        Switch s = new Switch(10, 1);
        System.out.println("*** Switch ligado ***");
        s.ligar(true);
        s.estabeleceConexoes();
        System.out.println("Portas ativas: " + s.portasAtivas());
        System.out.println("Velocidade: " + s.obtemVelocidade() + " Gb");
        s.liberaConexoes();
        s.liberaConexoes();
        System.out.println("Portas ativas: " + s.portasAtivas());
        System.out.println("\n*** Switch desligado ***");
        s.ligar(false);
        System.out.println("Portas ativas: " + s.portasAtivas());
        System.out.println("Velocidade: " + s.obtemVelocidade() + " Gb");
    }
}
