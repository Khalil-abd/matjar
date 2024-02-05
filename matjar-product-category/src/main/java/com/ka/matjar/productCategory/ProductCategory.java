package com.ka.matjar.productCategory;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document
public class ProductCategory {

    @Id
    private String id;
    @Indexed(unique = true)
    private Long categoryId;
    private String categoryName;
    @Setter(AccessLevel.NONE)
    private LocalDateTime createdAt = LocalDateTime.now();

}
