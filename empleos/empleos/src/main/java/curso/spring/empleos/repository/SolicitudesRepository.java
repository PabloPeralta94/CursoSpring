package curso.spring.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.spring.empleos.model.Solicitud;


public interface SolicitudesRepository extends JpaRepository<Solicitud, Integer> {

}
