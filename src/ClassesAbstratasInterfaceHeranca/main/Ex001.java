package ClassesAbstratasInterfaceHeranca.main;

import ClassesAbstratasInterfaceHeranca.ex001.Aluno;
import ClassesAbstratasInterfaceHeranca.ex001.Bolsista;

public class Ex001 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Fernanda", "regular");
        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();
    }
}
