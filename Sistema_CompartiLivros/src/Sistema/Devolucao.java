package Sistema;

/**
 *
 * @author melis
 */
public class Devolucao {
    private int id;
    private Emprestimo emprestimo;
    private String data_devolucao;

    public Devolucao(int id, Emprestimo emprestimo, String data_devolucao) {
        this.id = id;
        this.emprestimo = emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
    
    
}
