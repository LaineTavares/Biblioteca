package Controler;

import Model.AlunoEJB;
import View.Aluno;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ManagedBean
@RequestScoped
public class AlunoMB {

    @PersistenceContext
    EntityManager em;
    @EJB
    AlunoEJB alunoEJB;
    private Aluno aluno = new Aluno();

    public void salvar() {
        System.out.println("Entrei!");
        alunoEJB.salvar(aluno);
        setAluno(new Aluno());
       
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<Aluno> findAllAlunos() {

        javax.persistence.Query query = em.createQuery("select a from Aluno a ");
        return query.getResultList();
    }

    public AlunoMB() {
    }
}
