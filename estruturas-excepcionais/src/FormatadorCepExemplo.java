public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506400");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("ERRO: O cep não corresponde com o número de digitos esperado (8).\n Verifique o cep digitado e tente novamente.");
        }
    }

    static String formatarCep (String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }

        // simulando um cep formatado
        return "23765-064";
    }
}
