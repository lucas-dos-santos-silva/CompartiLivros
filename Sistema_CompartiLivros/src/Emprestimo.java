
import java.util.ArrayList;

/**
 *
 * @author Melissa
 */
public class Emprestimo {
    private int id;
    private String dataEmprestimo;
    private String devolucao;
    private ArrayList<emprestavel> emprestados;

    public Emprestimo(int id, String dataEmprestimo, String devolucao, ArrayList<emprestavel> emprestados) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.devolucao = devolucao;
        this.emprestados = emprestados;
    }

   
}
