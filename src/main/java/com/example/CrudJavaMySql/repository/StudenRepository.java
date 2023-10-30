package com.example.CrudJavaMySql.repository;

import com.example.CrudJavaMySql.model.StudentDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StudenRepository extends CrudRepository<StudentDTO, Long> {

    public abstract ArrayList<StudentDTO> findByapprovedOrdisapproved(String approvedOrdisapproved);
}
