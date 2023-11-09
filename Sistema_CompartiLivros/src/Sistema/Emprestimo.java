package Sistema;

import testeCarteirinha.CadastroLivros;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Melissa
 */
public class Emprestimo {
    private int id;
    private String dataEmprestimo;
    private String devolucao;
    private Carteirinha idCarteirinha;
    private ArrayList<Livro> emprestados; 

    public Emprestimo(int id, String dataEmprestimo, String devolucao, Carteirinha idCarteirinha, ArrayList<Livro> array) {
        this.id = id;
        this.dataEmprestimo = dataEmprestimo;
        this.devolucao = devolucao;
        this.idCarteirinha = idCarteirinha;
        this.emprestados = array;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(String devolucao) {
        this.devolucao = devolucao;
    }

    public Carteirinha getIdCarteirinha() {
        return idCarteirinha;
    }

    public void setIdCarteirinha(Carteirinha idCarteirinha) {
        this.idCarteirinha = idCarteirinha;
    }

    public ArrayList<Livro> getEmprestados() {
        return emprestados;
    }

    public void setEmprestados(ArrayList<Livro> emprestados) {
        this.emprestados = emprestados;
    }

    @Override
    public String toString() {
        return "Emprestimo{" + "id=" + id + ", dataEmprestimo=" + dataEmprestimo + ", devolucao=" + devolucao + ", idCarteirinha=" + idCarteirinha + ", emprestados=" + emprestados + '}';
    }
    
    
   
   
}
