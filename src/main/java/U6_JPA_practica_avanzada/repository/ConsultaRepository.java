package U6_JPA_practica_avanzada.repository;

import U6_JPA_practica_avanzada.model.Consulta;

import jakarta.persistence.*;

import java.util.List;

public class ConsultaRepository {

    private final EntityManager em;

    public ConsultaRepository(EntityManager em) {
        this.em = em;
    }

    public void save(Consulta consulta) {
        em.persist(consulta);
    }

    public List<Consulta> findAll() {
        return em.createQuery("SELECT c FROM Consulta c", Consulta.class)
                .getResultList();
    }

    public List<Consulta> findByMedicoId(Long medicoId) {
        TypedQuery<Consulta> q = em.createQuery(
                "SELECT c FROM Consulta c WHERE c.medico.id = :medicoId", Consulta.class);
        q.setParameter("medicoId", medicoId);
        return q.getResultList();
    }

    public List<Object[]> findConsultasWithPaciente() {
        TypedQuery<Object[]> q = em.createQuery(
                "SELECT c.diagnostico, c.paciente.nombre, c.paciente.apellido FROM Consulta c", Object[].class);
        return q.getResultList();
    }

    public List<Object[]> findMedicoWithCantidadConsultas() {
        TypedQuery<Object[]> q = em.createQuery(
                "SELECT c.medico.nombre, c.medico.apellido, COUNT(c) FROM Consulta c GROUP BY c.medico", Object[].class);
        return q.getResultList();
    }
}
