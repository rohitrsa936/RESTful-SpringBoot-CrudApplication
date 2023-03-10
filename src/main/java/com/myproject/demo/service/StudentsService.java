package com.myproject.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.demo.model.Students;
import com.myproject.demo.repository.StudentsRepository;  
 

@Service  
public class StudentsService   
{  
@Autowired  
StudentsRepository studentsRepository;  
  
public List<Students> getAllBooks()   
{  
List<Students> students = new ArrayList<Students>();  
studentsRepository.findAll().forEach(students1 -> students.add(students1));  
return students;  
}  
 
public Students getBooksById(int id)   
{  
return studentsRepository.findById(id).get();  
}  
 
public void saveOrUpdate(Students students)   
{  
studentsRepository.save(students);  
}  

public void delete(int id)   
{  
studentsRepository.deleteById(id);  
}  

public void update(Students students, int id)   
{  
studentsRepository.save(students);  
}  
}  