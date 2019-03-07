package com.sai.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.Data;

@Table("person") 
@Data
public class Person { 
 
 @PrimaryKey 
 private Long id; 
 
 private String name; 
 private Long age; 
 
}