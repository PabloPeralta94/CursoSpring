package curso.spring.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import curso.spring.jpademo.model.Perfil;



public interface PerfilesRepository extends JpaRepository<Perfil, Integer> {

}
