package U6_JPA_practica_avanzada.repository;

import U6_JPA_practica_avanzada.model.HistoriaClinica;

import jakarta.persistence.*;

import java.util.List;

public class HistoriaClinicaRepository {

    private final EntityManager em;

    public HistoriaClinicaRepository(EntityManager em) {
        this.em = em;
    }

    public void save(HistoriaClinica historia) {
        em.persist(historia);
    }

    public List<HistoriaClinica> findAll() {
        return em.createQuery("SELECT h FROM HistoriaClinica h", HistoriaClinica.class)
                .getResultList();
    }
}
