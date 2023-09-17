package curso.spring.musicapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import curso.spring.musicapi.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
