public class MyClass {

    /* Primeira letra Maiuscula e Segundas palavras também */

    public static void main(String[] args) {
        // Metódo Main para class executavéis

        System.out.println("Hello Word");

        // Estrutura Variável
        String primeiroNome = "Raphael";
        String segundoNome = "Barros";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    // Estrutura de método
    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
