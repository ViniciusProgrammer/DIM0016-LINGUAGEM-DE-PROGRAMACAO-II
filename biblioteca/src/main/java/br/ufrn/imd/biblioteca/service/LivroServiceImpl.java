package br.ufrn.imd.biblioteca.service;

import java.util.List;

import br.ufrn.imd.biblioteca.exception.NegocioException;
import br.ufrn.imd.biblioteca.model.Livro;
import br.ufrn.imd.biblioteca.repository.LivroRepository;
import br.ufrn.imd.biblioteca.repository.LivroRepositoryImpl;

/**
 * @brief Implementação dos serviços relacionados ao gerenciamento de livros.
 *
 * Esta classe fornece a implementação dos métodos definidos na interface {@link LivroService},
 * utilizando o repositório {@link LivroRepository} para realizar as operações de persistência.
 */
public class LivroServiceImpl implements LivroService {

    private LivroRepository livroRepository = new LivroRepositoryImpl();

    /**
     * @brief Adiciona um livro ao sistema.
     *
     * Utiliza o repositório para salvar o livro na base de dados.
     *
     * @param livro O livro a ser adicionado.
     */
    public void adicionarLivro(Livro livro) {
        livroRepository.salvar(livro);
    }

    /**
     * @brief Lista todos os livros presentes no sistema.
     *
     * Utiliza o repositório para recuperar a lista de todos os livros da base de dados.
     *
     * @return Uma lista contendo todos os livros.
     */
    public List<Livro> listarTodos() {
        return livroRepository.listarTodos();
    }

    /**
     * @brief Busca um livro pelo título.
     *
     * Utiliza o repositório para buscar um livro na base de dados com o título fornecido.
     *
     * @param titulo O título do livro a ser buscado.
     * @return O livro correspondente ao título fornecido.
     * @throws NegocioException Se o livro não for encontrado.
     */
    public Livro buscarPorTitulo(String titulo) throws NegocioException {
        return livroRepository.buscarPorTitulo(titulo);
    }
}