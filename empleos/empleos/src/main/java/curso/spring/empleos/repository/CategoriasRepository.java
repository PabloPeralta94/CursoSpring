package curso.spring.empleos.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import curso.spring.empleos.model.Categoria;


public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {
	
}