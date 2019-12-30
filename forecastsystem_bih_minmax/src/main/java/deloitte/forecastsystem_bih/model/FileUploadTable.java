package deloitte.forecastsystem_bih.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.joda.time.DateTime;

@Entity
@Table(name="df_file_upload")
public class FileUploadTable implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4002148602975101212L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID", nullable=false, updatable = true)
	private Long id;	
	
	@Column(name="Username", nullable=false)
	private String username;
	
    @Column(name = "Upload_datetime")
    private Date uploadDatetime;
    
	@Column(name="Filename", nullable=false)
	private String filename;
	
    @Column(name = "File_load_date")
    private Date fileLoadDate;	
	
	@Column(name="File_status", nullable=false)
	private Integer fileStatus;
	
	@Column(name="File_copy_status", nullable=false)
	private Integer fileCopyStatus;
	
	@Column(name="File_processing_status", nullable=false)
	private Integer fileProcessingStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getUploadDatetime() {
		return uploadDatetime;
	}

	public void setUploadDatetime(Date uploadDatetime) {
		this.uploadDatetime = uploadDatetime;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}	
	
	public Date getFileLoadDate() {
		return fileLoadDate;
	}

	public void setFileLoadDate(Date fileLoadDate) {
		this.fileLoadDate = fileLoadDate;
	}

	public Integer getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(Integer fileStatus) {
		this.fileStatus = fileStatus;
	}

	public Integer getFileCopyStatus() {
		return fileCopyStatus;
	}

	public void setFileCopyStatus(Integer fileCopyStatus) {
		this.fileCopyStatus = fileCopyStatus;
	}

	public Integer getFileProcessingStatus() {
		return fileProcessingStatus;
	}

	public void setFileProcessingStatus(Integer fileProcessingStatus) {
		this.fileProcessingStatus = fileProcessingStatus;
	}	
    

}
