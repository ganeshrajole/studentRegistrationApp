package com.jdc.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jdc.entity.Gender;

@Repository 
public interface GenderRepository extends JpaRepository<Gender, Serializable>{

	
	@Query("select genderName from Gender")
	public List<String> getGenderName();
}
