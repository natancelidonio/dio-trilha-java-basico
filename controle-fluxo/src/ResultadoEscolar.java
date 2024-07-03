public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 6;

        //###################################################
        // //Exemplo condição ternária
        // String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        // System.out.println(resultado);

        //###################################################
        // Exemplo 2 - condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
        
        
        //###################################################
        // //Exemplos de condicional composta e encadeada
        // if (nota >= 7) {
        //     System.out.println("Aprovado");
        // }else if (nota >= 5 && nota < 7) {
        //     System.out.println("Prova Recuperação");
        // } else {
        //     System.out.println("Reprovado");
        // };
        

    };
};
