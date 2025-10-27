package ClassesAbstratasInterfaceHeranca.main;

public class Ex004 {
    public static void main(String[] args) {
        Notificacoes notificacoes = new Notificacoes();

        notificacoes.notificacoes("Olá");
        notificacoes.notificacoes("João", "Bom dia");
        notificacoes.notificacoes("Maria", "Atenção", 2);
    }
    public static class Notificacoes{
        void notificacoes(String mensagem){
            System.out.println("Mensagem enviada a todos: " + mensagem);
        }
        void notificacoes(String destinatario,String mensagem){
            System.out.println("Mensagem para " + destinatario + ": " + mensagem);
        }
        void notificacoes(String destinatario,String mensagem, int qtd){
            for (int i = 1; i <= qtd; i++){
                System.out.println("Mensagem para " + destinatario + ": " + mensagem);
            }

        }
    }
}
