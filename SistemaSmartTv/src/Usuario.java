public class Usuario {
    

    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv Ligada : " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        //Teste ligar/desligar TV
        smartTv.ligar();
        System.out.println("Tv Ligada : " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Tv Ligada : " + smartTv.ligada);

        // Teste aumentar/diminuir volume
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        // Teste mudar canal
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarCanal(14);
        System.out.println("Novo canal: " + smartTv.canal);

    }
}
