package FactoryMethodExample;

public class FactoryMethod {
    public static Pessoa createPessoa(String nome, String tipo){
        if(tipo.equalsIgnoreCase("Professor")){
            return new Professor(nome, tipo);
        }
        if(tipo.equalsIgnoreCase("Aluno")){
            return new Aluno(nome, tipo);
        }
        return null;
    }
}
