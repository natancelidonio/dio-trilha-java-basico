public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "A";

        // Exemplo com switch case para exemplo complementar, sem uso do break
        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            } case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            } case "B": {
                System.out.println("100 minutos de ligação");
            }
        };

        // // Exemplo com if else
        // if(plano == "B") {
        //     System.out.println("100 minutos de ligação");
        // } else if (planoo == "M") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("WhatsApp e Instagram grátis");
        // } else if (planoo == "T") {
        //     System.out.println("100 minutos de ligação");
        //     System.out.println("WhatsApp e Instagram grátis");
        //     System.out.println("5Gb Youtube");
        // };



    };
};
