package net.springboot.javaguides.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

// Default take the class name as a document. But if you want to take different name from class name then you can use @Document annotation forte same.
@Document (collection = "product")
@Data
public class Product {
	
	@Id
	private long id;
	
	@NotBlank
    @Size(max=100)
    @Indexed(unique=true)
	private String name;
	private String description;
	private Date dateOfBirth;
}
