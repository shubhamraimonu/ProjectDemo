package com.Entity;

import java.util.List;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class File {

	public File() {
		// TODO Auto-generated constructor stub
	}
	
 List<CommonsMultipartFile> multipartFile;

public List<CommonsMultipartFile> getMultipartFile() {
	return multipartFile;
}

public void setMultipartFile(List<CommonsMultipartFile> multipartFile) {
	this.multipartFile = multipartFile;
}

public File(List<CommonsMultipartFile> multipartFile) {
	super();
	this.multipartFile = multipartFile;
}

@Override
public String toString() {
	return "File [multipartFile=" + multipartFile + "]";
}
 
 
	

}
