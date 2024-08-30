package br.ufrn.imd.biblioteca.repository;

import java.util.List;

import br.ufrn.imd.biblioteca.exception.NegocioException;
import br.ufrn.imd.biblioteca.model.Livro;

/**
 * @interface LivroRepository
 * @brief Interface para operações de persistência de livros.
 *
 * A interface `LivroRepository` define os métodos para salvar, listar e buscar livros
 * em um repositório. Implementações desta interface devem fornecer a lógica para
 * armazenar e recuperar livros.
 */
public interface LivroRepository {

    /**
     * @brief Salva um livro no repositório.
     *
     * Este método persiste o livro fornecido no repositório. Se o livro já existir, ele pode
     * ser atualizado ou substituído dependendo da implementação.
     *
     * @param livro O livro a ser salvo.
     */
    void salvar(Livro livro);

    /**
     * @brief Lista todos os livros armazenados no repositório.
     *
     * Este método retorna uma lista de todos os livros presentes no repositório.
     *
     * @return Uma lista contendo todos os livros.
     */
    List<Livro> listarTodos();

    /**
     * @brief Busca um livro pelo título.
     *
     * Este método procura um livro com o título especificado. Se o livro não for encontrado,
     * uma exceção `NegocioException` é lançada.
     *
     * @param titulo O título do livro a ser buscado.
     * @return O livro encontrado com o título especificado.
     * @throws NegocioException Se não houver nenhum livro com o título fornecido.
     */
    Livro buscarPorTitulo(String titulo) throws NegocioException;
}