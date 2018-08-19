package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.Files;

public interface FilesRepository extends CrudRepository<Files, Long>{

	@Query("SELECT count(file_id) FROM Files WHERE upload_stash_id = ?1")
	Long countFilesForUploadStash(Integer upload_stash_id);

	@Query("SELECT file_id, file_name, upload_stash_id FROM Files WHERE upload_stash_id = ?1")
	Iterable<Files> findFilesForUploadStash(Integer upload_stash_id);

	@Query("SELECT file_id, file_name, upload_stash_id FROM Files WHERE upload_stash_id = ?1 AND file_id = ?2")
	Optional<Object> findFile(Integer file_id, Integer upload_stash_id);

}
