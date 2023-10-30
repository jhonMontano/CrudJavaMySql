package com.example.CrudJavaMySql.service;

import com.example.CrudJavaMySql.model.StudentDTO;

import java.util.ArrayList;

public interface StudentService {

    ArrayList<StudentDTO> obtenerEstudiante();
    StudentDTO guardarEstudiante(StudentDTO studentDTO);

    ArrayList<StudentDTO> guadarEstudiantes(ArrayList<StudentDTO> studentDTO);

    String actualizarEstudiante(StudentDTO studentDTO);

    ArrayList<StudentDTO> obtenerPorAprobadoOreprobado(String approvedOrdisapproved);

    boolean eliminarEstudiante(Long id);
}
