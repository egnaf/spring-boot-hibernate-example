package com.company.app.repository;

import com.company.app.entity.Elective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ElectiveRepository extends JpaRepository<Elective, UUID> {
}
