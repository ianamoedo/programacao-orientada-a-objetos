class Ebook extends Livro {
    private String formato;

    public Ebook(String titulo, String autor, String formato) {
        super(titulo, autor);
        this.formato = formato;
    }

    @Override
    public void reservar() {
        if (!reservado && !emprestado()) {
            reservado = true;
            System.out.println(titulo() + " foi reservado com sucesso" + "no formato de: " + formato);
        } else {
            System.out.println("Esse ebook não pode ser reservado neste momento.");
        }
    }

    @Override
    public void cancelarReserva() {
        System.out.println("A reserva do ebook foi cancelada.");
    }
}
