package br.ufrn.imd.biblioteca.model;

/**
 * @class ItemBiblioteca
 * @brief Classe abstrata que representa um item na biblioteca.
 *
 * A classe `ItemBiblioteca` serve como base para todos os itens da biblioteca, contendo os atributos comuns
 * como título e autor, além de definir um método abstrato para obter a descrição do item.
 */

public abstract class ItemBiblioteca {
    /**
     * @brief Título do item da biblioteca.
     */
    private String titulo;
    /**
     * @brief Autor do item da biblioteca.
     */
    private String autor;

    /**
     * @brief Construtor da classe `ItemBiblioteca`.
     *
     * Inicializa um item da biblioteca com o título e o autor fornecidos.
     *
     * @param titulo O título do item.
     * @param autor O autor do item.
     */

    public ItemBiblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * @brief Obtém o título do item.
     * @return O título do item.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @brief Obtém o título do item.
     * @return O título do item.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @brief Define o título do item.
     * @param titulo O novo título do item.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @brief Define o autor do item.
     * @param autor O novo autor do item.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @brief Método abstrato para obter a descrição do item.
     *
     * Este método deve ser implementado pelas subclasses para fornecer uma descrição detalhada do item.
     *
     * @return A descrição do item.
     */
    public abstract String getDescricao();
}

