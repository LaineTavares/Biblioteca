
package Model;

import View.Livro;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@LocalBean
public class LivroEJB {

    
    @PersistenceContext(name="BibliotecaPU")
    EntityManager em;
    
      
    public void salvar(Livro livro) {
       em.merge(livro);
       System.out.println("Salvei o Livro!");
    }

//      public void apagar( Long id ){
//          System.out.println("Entrei no metodo apagar!");
//              Livro lv = em.find( Livro.class, id );
//              em.remove(lv);
//              System.out.println("Apaguei");
//     }
//    
}
