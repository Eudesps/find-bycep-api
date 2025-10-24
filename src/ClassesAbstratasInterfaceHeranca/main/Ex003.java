package ClassesAbstratasInterfaceHeranca.main;

import ClassesAbstratasInterfaceHeranca.ex003.Ebook;
import ClassesAbstratasInterfaceHeranca.ex003.Livro;
import ClassesAbstratasInterfaceHeranca.ex003.Revista;

public class Ex003 {
    public static void main(String[] args) {
        Livro livro = new Livro("O Guia do Mochileiro das Galáxias", 1979,"Douglas Adams");
        Revista revista = new Revista("National Geographic", 2023, 245);
        Ebook ebook = new Ebook("Clean Code", 2008, "PDF");

        livro.exibirInfo();
        revista.exibirInfo();
        ebook.exibirInfo();
    }
}
