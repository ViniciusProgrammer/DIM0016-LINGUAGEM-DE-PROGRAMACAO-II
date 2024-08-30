package br.ufrn.imd.biblioteca.service;

import br.ufrn.imd.biblioteca.exception.NegocioException;
import br.ufrn.imd.biblioteca.model.Livro;
import br.ufrn.imd.biblioteca.repository.LivroRepository;
import br.ufrn.imd.biblioteca.repository.LivroRepositoryImpl;

import java.util.List;

/**
 * @brief Interface para os serviços relacionados ao gerenciamento de livros.
 *
 * Define os métodos para adicionar um livro, listar todos os livros e buscar um livro por título.
 *
 * @see Livro
 * @see LivroRepository
 */
public interface LivroService {

    /**
     * @brief Adiciona um livro ao sistema.
     *
     * @param livro O livro a ser adicionado.
     */
    void adicionarLivro(Livro livro);

    /**
     * @brief Lista todos os livros presentes no sistema.
     *
     * @return Uma lista contendo todos os livros.
     */
    List<Livro> listarTodos();

    /**
     * @brief Busca um livro pelo título.
     *
     * @param titulo O título do livro a ser buscado.
     * @return O livro correspondente ao título fornecido.
     * @throws NegocioException Se o livro não for encontrado.
     */
    Livro buscarPorTitulo(String titulo) throws NegocioException ;

}
