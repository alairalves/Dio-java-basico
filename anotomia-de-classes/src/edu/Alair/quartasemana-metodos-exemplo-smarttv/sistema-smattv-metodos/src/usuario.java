public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv =  new smartTv();
        System.out.println("Canal Atual:" + smartTv.canal);
        smartTv.mudarCanal(21);
        System.out.println("Canal Atual:" + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual:" + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> : TV Ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> : TV Ligada? " + smartTv.ligada);

    }
}
