package Model;

import View.Aluno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AlunoEJB {

    @PersistenceContext(name="BibliotecaPU")
    EntityManager em;
    
      
    public void salvar(Aluno aluno) {
       em.merge(aluno);
        System.out.println("Salvei");
    }
}
