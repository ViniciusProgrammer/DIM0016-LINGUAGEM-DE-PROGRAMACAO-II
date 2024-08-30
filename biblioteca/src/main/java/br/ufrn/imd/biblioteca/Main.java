package br.ufrn.imd.biblioteca;

import br.ufrn.imd.biblioteca.view.BibliotecaApplication;

/**
 * @brief Classe principal que inicia a aplicação da biblioteca.
 *
 * Esta classe contém o método {@link #main(String[])} que serve como ponto de entrada
 * para a execução da aplicação. O método {@code main} cria uma instância de
 * {@link BibliotecaApplication} e inicia a aplicação chamando o método {@code run()}.
 */
public class Main {

	/**
	 * @brief Ponto de entrada para a aplicação.
	 *
	 * Este método é chamado quando a aplicação é iniciada. Ele cria uma nova instância
	 * da classe {@link BibliotecaApplication} e executa a aplicação chamando o método
	 * {@code run()} dessa instância.
	 *
	 * @param args Argumentos de linha de comando passados para a aplicação. Atualmente, não são utilizados.
	 */
	public static void main(String[] args) {
        new BibliotecaApplication().run();
	}
	
}
