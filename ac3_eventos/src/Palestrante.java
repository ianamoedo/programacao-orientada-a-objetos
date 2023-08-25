public class Palestrante {
    String nome;
    int telefone;
    String eMail;


    Palestrante(String nome, int telefone, String eMail) {
        this.nome = nome;
        this.telefone = telefone;
        this.eMail = eMail;
    }

    void eventoFuturo(String nomeEvento) {
        this.nome = nomeEvento;
    }

    void eventoFuturo(int histMudancas, String nomeEvento) {
        System.out.println("Esse é um evento futuro" + histMudancas);
        this.nome = nomeEvento;
    }
    
}
