public class Conta {
    
    //Variável da classe conta
    double saldo = 10.0;

    public void sacar(double valor) {
        //variavel local de metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        //disponivel em toda classe
        System.out.println(saldo);
        //somente o metodo sacar sonhece esta variavel
        // System.out.println(novoSaldo);
    }

    public double calcularDividaExponencial() {
        //varialvel local  de metodo
        double valorParcela = 50.0;
        double valorMontante = 0.0; //Começando/iniciando a variável
        for (int i = 0; i <= 5; i++) { //x variavel de escopo de 
            //esta variavel sera reiniciada a cada execucao
            double valorCalculado = valorParcela * i;
            valorMontante = valorMontante + valorCalculado;
        }
        //escopo de fluxo
        //x e valorCalculado nunca estarao deisponiveis fora do for
        return valorMontante;
    }
    
    public static void main(String[] args) throws Exception {

    }
}
