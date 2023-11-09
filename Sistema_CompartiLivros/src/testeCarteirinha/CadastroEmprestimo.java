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
        Carteirinha c1 = new Carteirinha(1, "Lucas", "4499999999", "Rua das Flores", "021213325");
        Carteirinha c2 = new Carteirinha(2, "Melissa", "4499888888", "Rua das Flores 51", "31353625");
        
        List<Livro> livros = new ArrayList<>();
        livros.add(new Livro (1, "Os contos dos pássaros","Maria", "Reccoo"));
        livros.add(new Livro (2, "Os contos dos golfinhos","João", "Reccoo"));
        
        List<Emprestimo> novoEmprestimo = new ArrayList<>();
        novoEmprestimo.add(new Emprestimo(1, "07/11/2023", "20/11/2023", c2, (ArrayList<Livro>) livros));
        
        
        System.out.println(novoEmprestimo);
    }
}
