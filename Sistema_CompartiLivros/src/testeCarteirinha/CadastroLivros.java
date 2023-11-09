package testeCarteirinha;

import Sistema.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Melissa
 */
public class CadastroLivros {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro (1, "Os contos dos pássaros","Maria", "Reccoo"));
        livros.add(new Livro (2, "Os contos dos golfinhos","João", "Reccoo"));
        
        
        
        System.out.println(livros);
    }
}
