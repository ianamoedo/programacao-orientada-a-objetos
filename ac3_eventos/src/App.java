

public class App {
    public static void main(String[] args) throws Exception {
        Eventos ev1, ev2;

        ev1 = new Eventos("Party", "Sabado", "Barra", 2000);
        ev1.nome = "Party";
        ev1.data = "Sabado";
        ev1.local = "Barra";
        ev1.numeroMaxParticipantes = 2000;
        System.out.println("Informações do evento 1: " + "nome: " + ev1.nome + ", " + "data: " + ev1.data + ", " + "local: " + ev1.local + ", " + "Numero max de participantes :" + ev1.numeroMaxParticipantes);


        ev2 = new Eventos("Palestra", "Domingo", "Recreio", 1000);
        ev2.nome = "Palestra";
        ev2.data = "Domingo";
        ev2.local = "Recreio";
        ev2.numeroMaxParticipantes = 1000;
        System.out.println("Informações do evento 2: " + "nome: " + ev2.nome + ", " + "data: " + ev2.data + ", " + "local: " + ev2.local + ", " + "Numero max de participantes :" + ev2.numeroMaxParticipantes);
        System.out.println("Informações adicionais: Melhorar as apresentações ");
        

        Alunos al1, al2;

        al1 = new Alunos("Ian", 1234);
        al1.nome = "Ian";
        al1.matricula = 1234;
        System.out.println("Nome do aluno: " + al1.nome + ", " + "Matricula: " + al1.matricula);

        al2 = new Alunos("Gabriel", 1456);
        al2.nome = "Gabriel";
        al2.matricula = 1456;
        System.out.println("Nome do aluno: " + al2.nome + ", " + "Matricula: " + al2.matricula);


    
    
    }

}
