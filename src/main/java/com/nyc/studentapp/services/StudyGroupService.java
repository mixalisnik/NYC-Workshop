package com.nyc.studentapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nyc.studentapp.entities.StudyGroup;
import com.nyc.studentapp.repositories.StudyGroupRepository;

@Service
public class StudyGroupService {
    
    private final StudyGroupRepository studyGroupRepository;
    
    @Autowired
    public StudyGroupService(StudyGroupRepository studyGroupRepository) {
        this.studyGroupRepository = studyGroupRepository;
    }
    
    // Create
    public StudyGroup createStudyGroup(StudyGroup studyGroup) {
        return studyGroupRepository.save(studyGroup);
    }
    
    // Read
    public List<StudyGroup> getAllStudyGroups() {
        return studyGroupRepository.findAll();
    }
    
    public Optional<StudyGroup> getStudyGroupById(Integer id) {
        return studyGroupRepository.findById(id);
    }
    
    // Update
    public StudyGroup updateStudyGroup(StudyGroup studyGroup) {
        if (!studyGroupRepository.existsById(studyGroup.getId())) {
            throw new IllegalArgumentException("Study group not found with id: " + studyGroup.getId());
        }
        return studyGroupRepository.save(studyGroup);
    }
    
    // Delete
    public void deleteStudyGroup(Integer id) {
        if (!studyGroupRepository.existsById(id)) {
            throw new IllegalArgumentException("Study group not found with id: " + id);
        }
        studyGroupRepository.deleteById(id);
    }
} 