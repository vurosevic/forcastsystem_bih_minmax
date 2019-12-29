package deloitte.forecastsystem_bih.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import deloitte.forecastsystem_bih.model.FileUploadTable;
import deloitte.forecastsystem_bih.repository.FileUploadTableRepository;
import deloitte.forecastsystem_bih.service.FileUploadTableService;

@Service("fileUploadTableService")
public class FileUploadTableServiceImpl implements FileUploadTableService {

	@Autowired
	FileUploadTableRepository fileUploadTableRepository; 
	
	@Override
	public Optional<FileUploadTable> findById(Long id) {
		// TODO Auto-generated method stub
		return fileUploadTableRepository.findById(id);
	}

	@Override
	public List<FileUploadTable> findAll() {
		// TODO Auto-generated method stub
		return fileUploadTableRepository.findAll(); 
	}

	@Override
	public <S extends FileUploadTable> S save(S entity) {
		// TODO Auto-generated method stub
		return fileUploadTableRepository.save(entity); 
	}

	@Override
	public void delete(FileUploadTable entity) {
		// TODO Auto-generated method stub
		fileUploadTableRepository.delete(entity); 
	}

}
