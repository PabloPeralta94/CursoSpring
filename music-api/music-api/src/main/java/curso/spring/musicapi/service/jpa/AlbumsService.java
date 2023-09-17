package curso.spring.musicapi.service.jpa;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.spring.musicapi.entity.Album;
import curso.spring.musicapi.repository.AlbumsRepository;
import curso.spring.musicapi.service.IAlbumsService;
@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	public List<Album> buscarTodos() {
		return repoAlbums.findAll();
	}

	public void guardar(Album album) {
		repoAlbums.save(album);
	}

	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
	}

}