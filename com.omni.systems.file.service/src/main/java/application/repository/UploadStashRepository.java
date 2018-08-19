package application.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import application.domain.UploadStash;

public interface UploadStashRepository extends CrudRepository<UploadStash, Long> {

	@Query("SELECT upload_stash_id, upload_stash_uuid, upload_stash_path, upload_stash_source_type, "
		 + "       upload_stash_timestamp, upload_stash_status, upload_stash_chunk, upload_stash_size, "
		 + "       upload_stash_sha1, upload_stash_major_mime, upload_stash_minor_mime, upload_stash_media_type "
		 + "  FROM UploadStash "
		 + " WHERE upload_stash_id = ?1 AND upload_stash_uuid = ?2")
	Optional<UploadStash> findById(Integer upload_stash_id, Integer upload_stash_uuid);

	@Query("SELECT upload_stash_id, upload_stash_uuid, upload_stash_path, upload_stash_source_type, "
		 + "       upload_stash_timestamp, upload_stash_status, upload_stash_chunk, upload_stash_size, "
		 + "       upload_stash_sha1, upload_stash_major_mime, upload_stash_minor_mime, upload_stash_media_type "
		 + "  FROM UploadStash "
		 + " WHERE upload_stash_uuid = ?1")
	Iterable<UploadStash> findUsersUploadStash(Integer uuid);

}
