package Sistema;

/**
 *
 * @author melis
 */
public class Carteirinha {
    private int id;
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;
    private Emprestimo emprestimo;

    public Carteirinha(int id, String nome, String telefone, String endereco, String cpf) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.emprestimo = emprestimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public static void main(String[] args) {
        
    }

    @Override
    public String toString() {
        return "Carteirinha{" + "id=" + id + ", nome=" + nome + '}';
    }
}
