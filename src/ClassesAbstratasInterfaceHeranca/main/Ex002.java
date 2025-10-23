package ClassesAbstratasInterfaceHeranca.main;

import ClassesAbstratasInterfaceHeranca.ex002.Aluno;
import ClassesAbstratasInterfaceHeranca.ex002.Docente;

public class Ex002 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        Docente docente1 = new Docente("Marta", 34, "Matematica");
        Docente docente2 = new Docente("Pedro", 46, "Quimica");

        aluno1.exibirDados();
        aluno2.exibirDados();

        docente1.exibirDados();
        docente2.exibirDados();

    }

}
