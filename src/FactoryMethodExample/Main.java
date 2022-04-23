package FactoryMethodExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("Criando novo professor:");
        Pessoa p = FactoryMethod.createPessoa("Fausto", "Professor");
        System.out.println("Criado o professor: " + p.nome + ", " + p.tipo);

        System.out.println("----------");

        System.out.println("Criando um novo aluno:");
        Pessoa a = FactoryMethod.createPessoa("Rickelme", "aluno");
        System.out.println("Criado o aluno: " + a.nome + ", " + a.tipo);
    }
}
