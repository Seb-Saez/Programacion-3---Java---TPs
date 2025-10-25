package U6_JPA_practica_avanzada.repository;

import U6_JPA_practica_avanzada.model.Paciente;

import jakarta.persistence.*;
import java.util.List;

public class PacienteRepository {

    private final EntityManager em;

    public PacienteRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Paciente paciente) {
        em.persist(paciente);
    }

    public List<Paciente> findAll() {
        return em.createQuery("SELECT p FROM Paciente p", Paciente.class)
                .getResultList();
    }

    public List<Paciente> findByEdadGreaterThan(int edad) {
        TypedQuery<Paciente> q = em.createQuery(
                "SELECT p FROM Paciente p WHERE p.edad > :edad", Paciente.class);
        q.setParameter("edad", edad);
        return q.getResultList();
    }

    public List<Paciente> findByObraSocial(String obraSocial) {
        TypedQuery<Paciente> q = em.createQuery(
                "SELECT p FROM Paciente p WHERE p.obraSocial = :obraSocial", Paciente.class);
        q.setParameter("obraSocial", obraSocial);
        return q.getResultList();
    }
}
