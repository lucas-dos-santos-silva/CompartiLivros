package testeCarteirinha;

import Sistema.Carteirinha;
import Sistema.Emprestimo;
import Sistema.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melis
 */
public class CadastroEmprestimo {

    public static void main(String[] args) {
        
        
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro (1, "Os contos dos pássaros","Maria", "Reccoo"));
        livros.add(new Livro (2, "Os contos dos golfinhos","João", "Reccoo"));
        
        List<Emprestimo> novoEmprestimo = new ArrayList<>();
//        novoEmprestimo.add(new Emprestimo(1, "07/11/2023", "20/11/2023", c2, (ArrayList<Livro>) livros));
        
        
        System.out.println(novoEmprestimo);
    }
}
