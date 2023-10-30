package com.example.CrudJavaMySql.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String name;
    private String email;
    private Float note;
    private String approvedOrdisapproved;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public String getApprovedOrdisapproved() {
        return approvedOrdisapproved;
    }

    public void setApprovedOrdisapproved(String approvedOrdisapproved) {
        this.approvedOrdisapproved = approvedOrdisapproved;
    }
}
