package curso.spring.empleos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.spring.empleos.model.Perfil;


public interface PerfilesRepository extends JpaRepository<Perfil, Integer> {

}
