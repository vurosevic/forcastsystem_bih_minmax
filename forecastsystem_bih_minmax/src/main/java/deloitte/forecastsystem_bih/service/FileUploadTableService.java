package deloitte.forecastsystem_bih.service;

import java.util.List;
import java.util.Optional;

import deloitte.forecastsystem_bih.model.FileUploadTable;

public interface FileUploadTableService {

	Optional<FileUploadTable> findById(Long id);
    List<FileUploadTable> findAll();
    <S extends FileUploadTable> S save(S entity);
    void delete(FileUploadTable entity);	
	
}
