import br.com.alura.screenmatch.calculation.FiltroRecomendacao;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.calculation.CalculadoraDeTempo;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("The Lord of the Rings: The Fellowship of the Ring");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(178);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(9.5);
        meuFilme.avalia(6);

        System.out.println("A média de avaliações do filme: " + meuFilme.pegaMedia());

        Serie theLeftovers = new Serie();
        theLeftovers.setNome("The Leftovers");
        theLeftovers.setAnoDeLancamento(2014);
        theLeftovers.exibeFichaTecnica();
        theLeftovers.setTemporadas(3);
        theLeftovers.setEpisodiosPorTemporada(10);
        theLeftovers.setMinutosPorEpisodio(60);
        System.out.println("Duração da maratona de " + theLeftovers.getNome() + ": " + theLeftovers.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Exemplo de filme: ");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(142);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(theLeftovers);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theLeftovers);
        episodio.setTotalVisualizacoes(500);
        filtro.filtra(episodio);

    }
}