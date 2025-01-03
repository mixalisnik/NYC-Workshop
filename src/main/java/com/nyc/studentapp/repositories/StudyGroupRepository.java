package com.nyc.studentapp.repositories;

import com.nyc.studentapp.entities.StudyGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyGroupRepository extends JpaRepository<StudyGroup, Integer> {
}
