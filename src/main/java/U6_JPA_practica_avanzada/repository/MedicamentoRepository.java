package U6_JPA_practica_avanzada.repository;

import U6_JPA_practica_avanzada.model.Medicamento;

import jakarta.persistence.*;

import java.util.List;

public class MedicamentoRepository {

    private final EntityManager em;

    public MedicamentoRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Medicamento medicamento) {
        em.persist(medicamento);
    }

    public List<Medicamento> findAll() {
        return em.createQuery("SELECT m FROM Medicamento m", Medicamento.class)
                .getResultList();
    }
}
