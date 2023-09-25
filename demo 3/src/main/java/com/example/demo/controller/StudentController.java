package com.example.demo.controller;


import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Students")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping
    public ResponseEntity<String> save(@RequestBody StudentDto student)
    {
        String message=studentService.save(student);
        return ResponseEntity.ok(message);

    }
    @PutMapping("{rollNo}")
    public ResponseEntity<String> updateStudent(@PathVariable String rollNo,@RequestBody StudentDto studentDto)
    {
        String message=studentService.updateStudent(rollNo,studentDto);
        if(message!=null) {
            return ResponseEntity.ok(message);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not Found");
        }
    }
    @GetMapping("{rollNo}")
    public ResponseEntity<StudentDto> getStudent(@PathVariable String rollNo){
        return ResponseEntity.ok(studentService.getStudent(rollNo));
    }

    @DeleteMapping("{rollNo}")
    public ResponseEntity<String> deleteStudent(@PathVariable String rollNo)
    {
        String message=studentService.deleteStudent(rollNo);
        if(message!=null){
            return ResponseEntity.ok(message);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not Found");
    }
}
