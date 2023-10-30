package com.example.CrudJavaMySql.service.serviceImpl;

import com.example.CrudJavaMySql.model.StudentDTO;
import com.example.CrudJavaMySql.repository.StudenRepository;
import com.example.CrudJavaMySql.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudenRepository studenRepository;
    @Override
    public ArrayList<StudentDTO> obtenerEstudiante() {
        return (ArrayList<StudentDTO>) studenRepository.findAll();
    }

    @Override
    public StudentDTO guardarEstudiante(StudentDTO studentDTO) {
        return studenRepository.save(studentDTO);
    }

    @Override
    public ArrayList<StudentDTO> guadarEstudiantes(ArrayList<StudentDTO> studentDTO) {
        return (ArrayList<StudentDTO>) studenRepository.saveAll(studentDTO);
    }

    @Override
    public String actualizarEstudiante( StudentDTO studentDTO) {
        Optional<StudentDTO> existingStudent = studenRepository.findById(studentDTO.getId());
        if (existingStudent.isPresent()){
            studenRepository.save(studentDTO);
            return "Estudiante actualizado exitosamente";
        }
        return "No se encontró el estudiante a actualizar";
    }

    @Override
    public ArrayList<StudentDTO> obtenerPorAprobadoOreprobado(String approvedOrdisapproved) {
        return studenRepository.findByapprovedOrdisapproved(approvedOrdisapproved);
    }

    @Override
    public boolean eliminarEstudiante(Long id) {
        try {
            studenRepository.deleteById(id);
            return true;
        }catch (Exception error){
            return false;
        }
    }
}
