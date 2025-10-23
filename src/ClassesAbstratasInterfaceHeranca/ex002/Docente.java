package ClassesAbstratasInterfaceHeranca.ex002;

public class Docente extends Pessoa{
    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Docente: %s - Idade: %s Cargo: %s \n", this.nome, this.idade, this.disciplina);
    }
}
