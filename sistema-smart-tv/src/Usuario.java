public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        
        smartTv.mudarCanal(50);
        System.out.println("Canal atual: " + smartTv.canal);
        

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        


        smartTv.desligar();
        System.out.println("Novo status -> TV desligada? " + smartTv.ligada);


    };
};
