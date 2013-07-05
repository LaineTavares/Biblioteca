package Controler;

import Model.EmprestimoEJB;
import View.Aluno;
import View.Emprestimo;
import View.Livro;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.eclipse.persistence.internal.jpa.parsing.EscapeNode;

@ManagedBean
@RequestScoped
public class EmprestimoMB {

    
    @PersistenceContext
    EntityManager em;
    
    @EJB
    EmprestimoEJB emprestimoEJB;
    
    public Emprestimo emprestimo = new Emprestimo();
    public Emprestimo emprest = new Emprestimo();

    public Emprestimo getEmprest() {
        return emprest;
    }

    public void setEmprest(Emprestimo emprest) {
        this.emprest = emprest;
    }

       
    public Livro livro = new Livro();
    public Aluno aluno = new Aluno();

    public Livro getLivro() {
	return livro;
    }

    public void setLivro(Livro livro) {
	this.livro = livro;
    }

    public Aluno getAluno() {
	return aluno;
    }

    public void setAluno(Aluno aluno) {
	this.aluno = aluno;
    }
    /************/

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    public EmprestimoMB() {
    }
    
    public void salvar() {
       System.out.println("Entrei!");
       /*************/
       emprestimo.setLivro(this.livro);
       emprestimo.setAluno(this.aluno);
       /************/ 
       emprestimoEJB.salvar(emprestimo);
       setEmprestimo(new Emprestimo());
    }
    public List<Emprestimo> findAllEmprestimo(){
                   
        javax.persistence.Query query = em.createQuery("SELECT e FROM Emprestimo e");
        return query.getResultList();
    }
        
    }
        
    
