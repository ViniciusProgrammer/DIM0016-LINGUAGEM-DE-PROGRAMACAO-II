package br.ufrn.imd.biblioteca.controller;

import java.util.List;

import br.ufrn.imd.biblioteca.model.Livro;
import br.ufrn.imd.biblioteca.service.LivroServiceImpl;
import br.ufrn.imd.biblioteca.util.GenericoUtil;

/**
 * @class BibliotecaController
 * @brief Controlador responsável por gerenciar as operações relacionadas aos livros na biblioteca.
 *
 * A classe `BibliotecaController` fornece métodos para adicionar livros à biblioteca
 * e listar todos os livros disponíveis. Utiliza o serviço `LivroServiceImpl` para gerenciar
 * os livros e a classe `GenericoUtil` para imprimir listas de livros.
 */
public class BibliotecaController {

    /**
     * @brief Serviço utilizado para gerenciar operações com livros.
     *
     * A instância de `LivroServiceImpl` é utilizada para adicionar livros à biblioteca
     * e listar todos os livros disponíveis.
     */
    private LivroServiceImpl livroService = new LivroServiceImpl();

    /**
     * @brief Adiciona um novo livro à biblioteca.
     *
     * Cria uma nova instância de `Livro` com o título, autor e ISBN fornecidos e a adiciona
     * à biblioteca através do serviço `LivroServiceImpl`.
     *
     * @param titulo O título do livro a ser adicionado.
     * @param autor O autor do livro a ser adicionado.
     * @param isbn O ISBN do livro a ser adicionado.
     */
    public void adicionarLivro(String titulo, String autor, String isbn) {
        Livro livro = new Livro(titulo, autor, isbn);
        livroService.adicionarLivro(livro);
    }

    /**
     * @brief Lista todos os livros disponíveis na biblioteca.
     *
     * Obtém a lista de todos os livros da biblioteca através do serviço `LivroServiceImpl`
     * e utiliza a classe `GenericoUtil` para imprimir as descrições dos livros.
     */
    public void listarLivros() {
        List<Livro> livros = livroService.listarTodos();
        GenericoUtil.imprimirLista(livros);
    }
}