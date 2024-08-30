package br.ufrn.imd.biblioteca.model;

/**
 * @class Livro
 * @brief Representa um livro na biblioteca.
 *
 * A classe `Livro` é uma extensão da classe `ItemBiblioteca` e representa um livro específico
 * na biblioteca. Inclui atributos e métodos relacionados a livros, como o ISBN e a descrição do livro.
 */
public class Livro extends ItemBiblioteca {

    /**
     * @brief ISBN do livro.
     *
     * O ISBN (International Standard Book Number) é um identificador único para o livro.
     */
    private String isbn;

    /**
     * @brief Construtor padrão da classe `Livro`.
     *
     * Inicializa uma nova instância de `Livro` com título e autor vazios.
     */
    public Livro(){
        super("", "");
    };

    /**
     * @brief Construtor da classe `Livro` com parâmetros.
     *
     * Inicializa uma nova instância de `Livro` com o título, autor e ISBN fornecidos.
     *
     * @param titulo O título do livro.
     * @param autor O autor do livro.
     * @param isbn O ISBN do livro.
     */
    public Livro(String titulo, String autor, String isbn) {
        super(titulo, autor);
        this.isbn = isbn;
    }

    /**
     * @brief Obtém o ISBN do livro.
     * @return O ISBN do livro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @brief Define o ISBN do livro.
     * @param isbn O novo ISBN do livro.
     */
    public void setIsbn(String isbn) {this.isbn = isbn;}

    /**
     * @brief Obtém a descrição do livro.
     * @return A descrição do livro no formato "Título - Autor (ISBN: ISBN)".
     */
    @Override
    public String getDescricao() {
        return  getTitulo() + " - " + getAutor() + " (ISBN: " + isbn + ")";
    }
}
