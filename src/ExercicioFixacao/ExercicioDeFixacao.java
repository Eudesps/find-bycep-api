package ExercicioFixacao;

public class ExercicioDeFixacao {
    public static void main(String[] args) {
        Livro livro001 = new Livro();

        livro001.setTitulo("O Pequeno principe");
        livro001.setAutor("Antoine de Saint-Exupéry");
        livro001.setnPagina(96);
        livro001.setPrecoUnidade(37.9);
        livro001.setCategoria('F');

        if(livro001.getCategoria() == 'F'){
            System.out.println("Livro cadastrado: "+livro001.getTitulo()+", de"+ livro001.getAutor()+". " +
                    "Ele possui"+livro001.getnPagina() +"páginas, custa "+livro001.getPrecoUnidade()+" e pertence à categoria Ficção.");
        }
    }
}
