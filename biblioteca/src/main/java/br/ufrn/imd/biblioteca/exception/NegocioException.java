package br.ufrn.imd.biblioteca.exception;

/**
 * @class NegocioException
 * @brief Exceção personalizada para erros de negócios.
 *
 * A classe `NegocioException` é uma exceção personalizada que estende a classe `Exception`.
 * Ela é usada para representar erros específicos de negócios que podem ocorrer durante a execução
 * da aplicação.
 */
public class NegocioException extends Exception {

    /**
     * @brief Construtor da exceção `NegocioException`.
     *
     * Inicializa uma nova instância de `NegocioException` com a mensagem fornecida.
     *
     * @param message A mensagem que descreve o erro ocorrido.
     */
    public NegocioException(String message) {
        super(message);
    }

}
