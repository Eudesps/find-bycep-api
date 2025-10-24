package ClassesAbstratasInterfaceHeranca.ex003;

public class Revista extends Midia{
    private int edicao;

    public Revista(String titulo, Integer anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }


    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Revista: %s - Edição: %s \n", this.gerarCod(), this.titulo, this.edicao);
    }
}
