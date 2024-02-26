import java.util.Scanner;
public class Programa {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Livro Livro = new Livro();

        System.out.println("Digite o Nome do livro");
        Livro.setNome(scanner.nextLine());
        
        System.out.println("Digite o Nome do Autor");
        Livro.setAutor(scanner.nextLine());
        
        System.out.println("Digite o Nome da Editora");
        Livro.setEditora(scanner.nextLine());
        
        System.out.println("Nome: " + Livro.getNome());
        System.out.println("Autor: " + Livro.getAutor());
        System.out.println("Editora: " + Livro.getEditora());

        scanner.close();
    }
}
