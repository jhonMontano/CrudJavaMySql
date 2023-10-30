package com.example.CrudJavaMySql.controller;

import com.example.CrudJavaMySql.model.StudentDTO;
import com.example.CrudJavaMySql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "obtenerEstudiantes")
    public ArrayList<StudentDTO> obtenerEstudiantes(){
        return studentService.obtenerEstudiante();
    }
    @PostMapping(value = "guardarEstudiante")
    public StudentDTO guardarEstudiante(@RequestBody StudentDTO studentDTO){
        return this.studentService.guardarEstudiante(studentDTO);
    }
    @PostMapping(value = "guardarEstudiantes")
    public ArrayList<StudentDTO> guardarEstudiantes(@RequestBody ArrayList<StudentDTO> studentDTO){
        return this.studentService.guadarEstudiantes(studentDTO);
    }
    @PutMapping(value = "actualizarEstudiante")
    public String actualizarEstudiante(@RequestBody StudentDTO studentDTO){
        return this.studentService.actualizarEstudiante(studentDTO);
    }
    @GetMapping(value = "obtenerPorAprobadoOreprobado/{approvedOrdisapproved}")
    public ArrayList<StudentDTO> obtenerPorAprobadoOreprobado(@PathVariable String approvedOrdisapproved){
        return this.studentService.obtenerPorAprobadoOreprobado(approvedOrdisapproved);
    }
    @DeleteMapping(value = "eliminarEstudiante/{id}")
    public String eliminarEstudiante(@PathVariable ("id") Long id){
        boolean ok = this.studentService.eliminarEstudiante(id);
        if (ok){
            return "Se eliminó el estudiante con el id "+id;
        }else {
            return "No se encontró el estudiante con el id "+id;
        }
    }

}
