package curso.spring.jpademo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.spring.jpademo.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
