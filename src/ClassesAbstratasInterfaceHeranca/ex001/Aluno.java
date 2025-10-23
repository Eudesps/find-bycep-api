package ClassesAbstratasInterfaceHeranca.ex001;

public class Aluno {
    protected String nome;
    protected String tipo;

    public Aluno(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void identificar(){
        System.out.printf("Aluno: %s - Tipo: %s \n", nome, tipo);
    }
}
