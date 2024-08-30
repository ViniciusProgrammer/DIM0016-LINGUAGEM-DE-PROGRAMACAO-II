package br.ufrn.imd.biblioteca.repository;

import br.ufrn.imd.biblioteca.exception.NegocioException;
import br.ufrn.imd.biblioteca.model.Livro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @brief Implementação do repositório para gerenciar operações com livros na base de dados.
 *
 * Esta classe realiza operações CRUD na tabela "livro" usando JDBC.
 *
 * @see LivroRepository
 */
public class LivroRepositoryImpl implements LivroRepository {

    private static final String JDBC_URL = "jdbc:h2:~/biblioteca";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    /**
     * @brief Construtor da classe.
     *
     * Inicializa a conexão com o banco de dados e cria a tabela "livro" se ela não existir.
     */
    public LivroRepositoryImpl() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS livro (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "titulo VARCHAR(255) NOT NULL, " +
                    "autor VARCHAR(255) NOT NULL, " +
                    "isbn VARCHAR(20) NOT NULL)";
            connection.createStatement().execute(createTableSQL);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inicializar o banco de dados", e);
        }
    }

    /**
     * @brief Salva um livro na base de dados.
     *
     * @param livro O livro a ser salvo.
     * @throws RuntimeException Se ocorrer um erro ao salvar o livro.
     */
    @Override
    public void salvar(Livro livro) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String insertSQL = "INSERT INTO livro (titulo, autor, isbn) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
            preparedStatement.setString(1, livro.getTitulo());
            preparedStatement.setString(2, livro.getAutor());
            preparedStatement.setString(3, livro.getIsbn());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar o livro", e);
        }
    }

    /**
     * @brief Lista todos os livros presentes na base de dados.
     *
     * @return Uma lista contendo todos os livros.
     * @throws RuntimeException Se ocorrer um erro ao listar os livros.
     */
    @Override
    public List<Livro> listarTodos() {
        List<Livro> livros = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String selectSQL = "SELECT * FROM livro";
            ResultSet resultSet = connection.createStatement().executeQuery(selectSQL);
            while (resultSet.next()) {
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String isbn = resultSet.getString("isbn");
                Livro livro = new Livro(titulo, autor, isbn);
                livros.add(livro);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar os livros", e);
        }
        return livros;
    }

    /**
     * @brief Busca um livro na base de dados pelo título.
     *
     * @param titulo O título do livro a ser buscado.
     * @return O livro encontrado.
     * @throws NegocioException Se o livro não for encontrado.
     * @throws RuntimeException Se ocorrer um erro ao buscar o livro.
     */
    @Override
    public Livro buscarPorTitulo(String titulo) throws NegocioException {
        Livro livro = null;
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
            String selectSQL = "SELECT * FROM livro WHERE titulo = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, titulo);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String autor = resultSet.getString("autor");
                String isbn = resultSet.getString("isbn");
                livro = new Livro(titulo, autor, isbn);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar o livro", e);
        }
        if (livro == null) {
            throw new NegocioException("Livro não existe");
        }
        return livro;
    }
}
