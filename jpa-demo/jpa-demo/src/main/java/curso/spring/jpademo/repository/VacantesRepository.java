package curso.spring.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.spring.jpademo.model.Vacante;

public interface VacantesRepository extends JpaRepository <Vacante, Integer> {

}
