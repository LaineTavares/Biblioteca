
package Model;

import View.Emprestimo;
import View.Livro;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class EmprestimoEJB {

    
    @PersistenceContext(name="BibliotecaPU")
    EntityManager em;
    
      
    public void salvar(Emprestimo emprestimo) {
       em.merge(emprestimo);
       System.out.println("Salvei o Emprestimo!");
    }
    
}
