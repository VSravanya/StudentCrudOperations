package com.example.demo.service;

import com.example.demo.dto.StudentDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private List<StudentDto> list= new ArrayList<>();

    public String save(StudentDto studentDto)
    {
        list.add(studentDto);
        return "Student with"+studentDto.getRollNo()+" id Saved successfully";

    }

    public StudentDto getStudent(String rollNo) {
        list.add(new StudentDto("1","Sravanya", "v","24"));

        for(StudentDto studentDto:list){
            if(studentDto.getRollNo().equals(rollNo)){
                return studentDto;
            }
        }
        return null;
    }
    public String updateStudent(String rollNo,StudentDto studentDto){
        for(StudentDto student:list){
            if(student.getRollNo().equals(rollNo)){
                student.setAge(studentDto.getAge());
                student.setfName(studentDto.getfName());
                student.setlName(studentDto.getlName());
                String message=save(student);
                return message;
            }
        }
        return null;
    }

    public String deleteStudent(String rollNo){
        for(StudentDto student:list){
            if(student.getRollNo().equals(rollNo)){
                list.remove(student);
                return "Student with "+rollNo+" id is deleted successfully";
            }
        }
        return null;
    }

}
