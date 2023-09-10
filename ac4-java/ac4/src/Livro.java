class Livro {
     String titulo;
     String autor;
     boolean reservado = false; 
     boolean emprestado = false;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String titulo() {
        return titulo;
    }

    public boolean emprestado() {
        return emprestado;
    }

    public void reservar() {
        if (!emprestado && !reservado) {
            reservado = true;
            System.out.println(titulo + " foi reservado com sucesso!");
        } else {
            System.out.println("Esse livro não pode ser reservado neste momento.");
        }
    }

    public void cancelarReserva() {
        if (reservado) {
            reservado = false;
            System.out.println("Sua reserva do livro: " + titulo + ", " + "foi cancelada.");
        } else {
            System.out.println("Este livro não está reservado.");
        }
    }

    public void emprestar() {
        if (reservado && !emprestado) {
            emprestado = true;
            reservado = false;
            System.out.println(titulo + "Emprestado com sucesso!");
        } else if (emprestado) {
            System.out.println("Esse livro já está emprestado!");
        } else {
            System.out.println("Este livro precisa ser reservado primeiro!");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
            System.out.println(titulo + " foi devolvido com sucesso.");
        }
    }
}

class LivroFisico extends Livro {
    public LivroFisico(String titulo, String autor) {
        super(titulo, autor);
    }
}
