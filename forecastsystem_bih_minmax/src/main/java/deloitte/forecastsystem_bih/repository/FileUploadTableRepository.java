package deloitte.forecastsystem_bih.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import deloitte.forecastsystem_bih.model.FileUploadTable;

@Repository("fileUploadTableRepository")
public interface FileUploadTableRepository extends CrudRepository<FileUploadTable, Long> {
		
	Optional<FileUploadTable> findById(Long id);
    List<FileUploadTable> findAll();
    <S extends FileUploadTable> S save(S entity);
    void delete(FileUploadTable entity);

}
