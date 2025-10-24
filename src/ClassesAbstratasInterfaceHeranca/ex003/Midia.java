package ClassesAbstratasInterfaceHeranca.ex003;

public abstract class Midia {
     public String titulo;
     public Integer anoPublicacao;

    public Midia(String titulo, Integer anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String gerarCod(){
        return "LIB-" +  titulo.substring(0,3) + anoPublicacao;
    }

    public abstract void exibirInfo();
}
