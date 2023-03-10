package com.myproject.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.demo.model.Students;
import com.myproject.demo.service.StudentsService;  


@RestController  
public class StudentsController   
{  
 
@Autowired  
StudentsService studentsService;  
  
@GetMapping("/student")  
private List<Students> getAllBooks()   
{  
return studentsService.getAllBooks();  
}  
 
@GetMapping("/student/{id}")  
private Students getBooks(@PathVariable("id") int id)   
{  
return studentsService.getBooksById(id);  
}  
  
@DeleteMapping("/student/{id}")  
private void deleteBook(@PathVariable("id") int id)   
{  
studentsService.delete(id);  
}  
 
@PostMapping("/students")  
private int saveBook(@RequestBody Students students)   
{  
studentsService.saveOrUpdate(students);  
return students.getId();  
}  

@PutMapping("/student")  
private Students update(@RequestBody Students students)   
{  
studentsService.saveOrUpdate(students);  
return students;  
}  
}  