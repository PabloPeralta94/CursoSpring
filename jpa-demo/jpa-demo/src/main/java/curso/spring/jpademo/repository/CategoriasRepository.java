package curso.spring.jpademo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import curso.spring.jpademo.model.Categoria;

//public interface CategoriasRepository extends CrudRepository<Categoria, Integer> { 
public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}

