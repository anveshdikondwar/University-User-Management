package com.example.UserEventmanagement.Repository;

import com.example.UserEventmanagement.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository<Student,Integer> {
}
