package curso.spring.musicapi.service;

import java.util.List;

import curso.spring.musicapi.entity.Album;


public interface IAlbumsService {

	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);
}
