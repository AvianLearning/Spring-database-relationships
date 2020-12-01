package com.codeclan.example.company_relationships.repositories;

import com.codeclan.example.company_relationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
