package com.example.UserEventmanagement.Controller;

import com.example.UserEventmanagement.Model.Department;
import com.example.UserEventmanagement.Model.Student;
import com.example.UserEventmanagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addAStudent(@RequestBody Student s){
        return studentService.addAStudent(s);
    }
    @PostMapping("students")
    public String addStudents(@RequestBody List<Student> s){
        return studentService.addStudents(s);
    }
    @GetMapping("students")
    public Iterable<Student> getAllStudents(){

        return studentService.getAllStudents();
    }
    @GetMapping("student/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
    @PutMapping("student/{id}/{department}")
    public String updateStudentDepartment(@PathVariable Integer id, @PathVariable Department department){
        return studentService.updateStudentDepartment(id, department);
    }
    @DeleteMapping("student/{id}")
    public String removeStudentById(@PathVariable Integer id){
        return studentService.removeStudentById(id);
    }
}
