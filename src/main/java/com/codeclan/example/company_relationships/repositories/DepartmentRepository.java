package com.codeclan.example.company_relationships.repositories;

import com.codeclan.example.company_relationships.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
