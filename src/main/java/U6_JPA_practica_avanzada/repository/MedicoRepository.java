package U6_JPA_practica_avanzada.repository;

import U6_JPA_practica_avanzada.model.Medico;

import jakarta.persistence.*;

import java.util.List;

public class MedicoRepository {

    private final EntityManager em;

    public MedicoRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Medico medico) {
        em.persist(medico);
    }

    public List<Medico> findAll() {
        return em.createQuery("SELECT m FROM Medico m", Medico.class)
                .getResultList();
    }
}
