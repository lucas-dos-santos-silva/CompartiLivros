package testeCarteirinha;
import Sistema.Carteirinha;
//import Sistema.Emprestimo;

public class CadastroCarteirinha extends MenuCarteirinha{

    
     
    public static void main(String[] args) {
       
        
        
        
        Carteirinha c1 = new Carteirinha(1, "Lucas", "4499999999", "Rua das Flores","414","casab", "021213325");
        Carteirinha c2 = new Carteirinha(2, "Melissa", "4499888888","Rua das Flores","414","casab", "31353625");
//        Emprestimo e1 = new Emprestimo(1, "12/04/2029", "20/04/2029");
        
        System.out.println(c2);
    }
    
}
