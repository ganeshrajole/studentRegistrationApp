package com.jdc.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jdc.entity.Timings;

@Repository
public interface TimingsRepository extends JpaRepository<Timings, Serializable> {
	
	
	@Query("select timingName from Timings")
	public List<String> getTimings();

}
