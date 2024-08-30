package br.ufrn.imd.biblioteca.util;

import java.util.List;

import br.ufrn.imd.biblioteca.model.ItemBiblioteca;

/**
 * @brief Classe utilitária para operações genéricas relacionadas à biblioteca.
 *
 * Esta classe fornece métodos utilitários que podem ser utilizados para operar com itens da biblioteca.
 */
public class GenericoUtil {

    /**
     * @brief Imprime a descrição de cada item em uma lista.
     *
     * Este método recebe uma lista de itens que estendem {@link ItemBiblioteca} e imprime a descrição
     * de cada item usando o método {@code getDescricao()}.
     *
     * @param lista A lista de itens a serem impressos. Cada item deve ser uma instância de {@link ItemBiblioteca}.
     */
    public static <T extends ItemBiblioteca> void imprimirLista(List<T> lista) {
        for (T item : lista) {
            System.out.println(item.getDescricao());
        }
    }
}
