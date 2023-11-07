/**
 *
 * @author Melissa
 */
public class Livro {
    private int id;
    private String nome;
    private String autor;
    private String editora;

    public Livro(int id, String nome, String autor, String editora) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
    
    
}
