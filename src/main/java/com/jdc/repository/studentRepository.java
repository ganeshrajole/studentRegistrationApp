package com.jdc.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jdc.entity.StudentEntity;

@Repository
public interface studentRepository extends JpaRepository<StudentEntity, Serializable>{

}
