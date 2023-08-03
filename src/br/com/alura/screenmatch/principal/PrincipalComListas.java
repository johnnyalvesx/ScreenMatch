package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("The Lord of the Rings: The Fellowship of the Ring", 2001);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Exemplo de filme", 2009);
        outroFilme.avalia(8);
        Filme filmeNovo = new Filme("Dungeons and Dragons", 2023);
        filmeNovo.avalia(5);
        Serie theLeftovers = new Serie("The Leftovers", 2014);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeNovo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(theLeftovers);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());

            }
        }

//        Outros exemplos de for each
//        lista.forEach(item -> System.out.println(item));
//        lista.forEach(System.out::println);

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Margot Robiir");
        buscarPorArtista.add("Florence Pugh");
        buscarPorArtista.add("Anne Hathaway");
        System.out.println(buscarPorArtista);

        Collections.sort(buscarPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscarPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
