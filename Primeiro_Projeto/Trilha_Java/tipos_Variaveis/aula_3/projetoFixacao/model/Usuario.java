package Primeiro_Projeto.Trilha_Java.tipos_Variaveis.aula_3.projetoFixacao.model;

public class Usuario {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.mudarCanal(13);
        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual:" + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV ligada? " + smartTV.ligada);

    }
}
