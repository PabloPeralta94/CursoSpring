package curso.spring.empleos.service;

import java.util.List;

import curso.spring.empleos.model.Vacante;


public interface IVacantesService {
	List<Vacante> buscarTodas();
	Vacante buscarPorId(Integer idVacante);
}
