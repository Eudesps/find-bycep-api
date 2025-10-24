package ClassesAbstratasInterfaceHeranca.ex003;

public class Livro extends Midia{
    private String autor;

    public Livro(String titulo, Integer anoPublicacao, String autor) {
        super(titulo, anoPublicacao);
        this.autor = autor;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("Código: %s | Livro: %s - Autor: %s \n", this.gerarCod(), this.titulo, this.autor);
    }
}
