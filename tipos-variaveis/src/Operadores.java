public class Operadores {
    public static void main(String[] args) {
        
        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);
        



        System.out.println("###################################");

        numero = 5;
        
        System.out.println(numero++);
        
        System.out.println(++numero);
        
        System.out.println(numero--);
        
        System.out.println(--numero);
    



        System.out.println("###################################");
        
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1+1+1+"1";

        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+1;
        
        System.out.println(concatenacao);
        
        concatenacao = 1+"1"+1+"1";
        
        System.out.println(concatenacao);
        
        concatenacao = "1"+1+1+1;
        
        System.out.println(concatenacao);
        
        concatenacao = "1" + (1+1+1);
        
        System.out.println(concatenacao);




        System.out.println("###################################");

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);




        System.out.println("###################################");

        int a, b;

        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);




        System.out.println("###################################");

        int numero1 = 1;
        int numero2 = 2;
        
        boolean simNao = numero1 == numero2;
        
        System.out.println("numeroUm é igual a numeroDois? " + simNao);
        
        simNao = numero1 != numero2;
        
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);
        
        simNao = numero1 > numero2;
        
        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    };
};
