package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entities.Certificate;
import com.cg.placementmanagement.entities.Student;

public interface IStudentService {
public Student addStudent(Student student);  // C
public Student updateStudent(Student student);  // U
public Student searchStudentById(long id);  // R

public Student searchStudentByHallTicket(long id); // R

public Certificate addCertificate(Certificate certificate); // C
public Certificate updateCertificate(Certificate certificate); // U
public boolean deleteStudent(long id); // D
}
