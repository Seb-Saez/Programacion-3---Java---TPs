package U6_JPA_practica_avanzada;

import U6_JPA_practica_avanzada.model.*;
import U6_JPA_practica_avanzada.repository.*;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


// No esta funcionando el TP 6 de JPA, despues lo arreglare, me voy a poner con SPRING
public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("miPU");
        EntityManager em = emf.createEntityManager();

        // Inicializamos repositorios
        PacienteRepository pacienteRepo = new PacienteRepository(em);
        MedicoRepository medicoRepo = new MedicoRepository(em);
        ConsultaRepository consultaRepo = new ConsultaRepository(em);
        MedicamentoRepository medicamentoRepo = new MedicamentoRepository(em);
        HistoriaClinicaRepository historiaRepo = new HistoriaClinicaRepository(em);

        em.getTransaction().begin();

        // ----- 1. Crear Medicamentos -----
        Medicamento med1 = new Medicamento();
        med1.setNombre("Paracetamol");
        med1.setDroga("Paracetamol");
        med1.setPesoEnGramos(500);
        medicamentoRepo.save(med1);

        Medicamento med2 = new Medicamento();
        med2.setNombre("Ibuprofeno");
        med2.setDroga("Ibuprofeno");
        med2.setPesoEnGramos(400);
        medicamentoRepo.save(med2);

        Medicamento med3 = new Medicamento();
        med3.setNombre("Amoxicilina");
        med3.setDroga("Amoxicilina");
        med3.setPesoEnGramos(250);
        medicamentoRepo.save(med3);

        // ----- 2. Crear Historias Clínicas -----
        HistoriaClinica hc1 = new HistoriaClinica();
        hc1.setDescripcion("Paciente con hipertensión controlada");
        historiaRepo.save(hc1);

        HistoriaClinica hc2 = new HistoriaClinica();
        hc2.setDescripcion("Paciente con diabetes tipo 2");
        historiaRepo.save(hc2);

        // ----- 3. Crear Pacientes -----
        Paciente p1 = new Paciente();
        p1.setNombre("Juan");
        p1.setApellido("Perez");
        p1.setEdad(35);
        p1.setDni(12345678);
        p1.setObraSocial("OSDE");
        p1.setFechaNacimiento(LocalDate.of(1988, 5, 10));
        p1.setSexo('M');
        p1.setHistoriaClinica(hc1);
        p1.setMedicamentos(Arrays.asList(med1, med2));
        pacienteRepo.save(p1);

        Paciente p2 = new Paciente();
        p2.setNombre("Ana");
        p2.setApellido("Gomez");
        p2.setEdad(28);
        p2.setDni(87654321);
        p2.setObraSocial("SwissMedical");
        p2.setFechaNacimiento(LocalDate.of(1995, 2, 20));
        p2.setSexo('F');
        p2.setHistoriaClinica(hc2);
        p2.setMedicamentos(Arrays.asList(med2, med3));
        pacienteRepo.save(p2);

        Paciente p3 = new Paciente();
        p3.setNombre("Luis");
        p3.setApellido("Martinez");
        p3.setEdad(42);
        p3.setDni(11223344);
        p3.setObraSocial("OSDE");
        p3.setFechaNacimiento(LocalDate.of(1994, 9, 5));
    }}