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
    public StudyGroup updateStudyGroup(Integer id, StudyGroup updatedStudyGroup) {
        updatedStudyGroup.setId(id);
        return studyGroupRepository.save(updatedStudyGroup);
    }
    
    // Delete
    public void deleteStudyGroup(Integer id) {
        studyGroupRepository.deleteById(id);
    }
} 