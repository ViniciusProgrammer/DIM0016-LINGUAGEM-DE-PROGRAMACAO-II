package br.ufrn.imd.biblioteca.view;

import br.ufrn.imd.biblioteca.model.Livro;
import br.ufrn.imd.biblioteca.exception.NegocioException;
import br.ufrn.imd.biblioteca.service.LivroServiceImpl;
import br.ufrn.imd.biblioteca.util.GenericoUtil;

import java.util.Scanner;

public class BibliotecaApplication {

    private final Scanner in = new Scanner(System.in);

    private final LivroServiceImpl livroService = new LivroServiceImpl();

    private int opcao;

    public  void run(){
        do {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Buscar Livro");
            System.out.println("3 - Ver todos os Livros");
            System.out.println("0 - Encerrar");
            opcao = in.nextInt();
            direcionarOpcao();
        }while (opcao != 0);
    }

    public void direcionarOpcao(){
        switch (opcao){
            case 1:
                livroService.adicionarLivro(lerLivro());
                break;
            case 2:
                buscarLivro();
                break;
            case 3:
                imprimirLivros();
                break;
            case 0:
                System.out.println("Encerrando o programa");

        }
    }

    public Livro lerLivro(){
        Livro livro = new Livro();
        in.nextLine();
        System.out.println("Digite o titulo do livro");
        livro.setTitulo(in.nextLine());

        System.out.println("Digite o autor do livro");
        livro.setAutor(in.nextLine());

        System.out.println("Digite o ISBN do livro");
        livro.setIsbn(in.nextLine());

       System.out.println( livro.getDescricao());
        return livro;
    }

    public void buscarLivro(){
        System.out.println("Digite o titulo do livro");
        in.nextLine();
        try {
            System.out.println(livroService.buscarPorTitulo(in.nextLine()).getDescricao());
        } catch (NegocioException e) {
            System.out.println(e.getMessage());
        }
    }

    public void imprimirLivros(){
        System.out.println("-------------LISTAGEM (" + livroService.listarTodos().size() +") livros cadastrados--------------");
        GenericoUtil.imprimirLista(livroService.listarTodos());
        System.out.println("---------------------------");
    }
}
