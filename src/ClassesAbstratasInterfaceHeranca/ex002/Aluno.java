package ClassesAbstratasInterfaceHeranca.ex002;

public class Aluno extends Pessoa{
    private double nota;

    public Aluno(String nome, int idade, double nota) {
        super(nome, idade);
        this.nota = nota;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s - Idade: %s Nota: %s \n", this.nome, this.idade, this.nota);
    }
}
