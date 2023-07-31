public class Principal {
    public static void main(String[] args) {
        Filme favorito = new Filme();

        favorito.setNome("The Lord of the Rings: The Fellowship of the Ring");
        favorito.setAnoDeLancamento(2001);
        favorito.setDuracaoEmMinutos(178);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(10);
        favorito.avalia(9.5);
        favorito.avalia(9);

        System.out.println("A média de avaliações do filme: " + favorito.pegaMedia());
    }
}