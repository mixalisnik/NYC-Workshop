package com.nyc.studentapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nyc.studentapp.entities.StudyGroup;
import com.nyc.studentapp.services.StudyGroupService;

@RestController
public class StudyGroupController {

    private final StudyGroupService studyGroupService;

    @Autowired
    public StudyGroupController(StudyGroupService studyGroupService) {
        this.studyGroupService = studyGroupService;
    }

    // Create
    @GetMapping("/group/create")
    public ResponseEntity<StudyGroup> createStudyGroup() {
        StudyGroup newGroup = new StudyGroup();
        newGroup.setGroupName("Java Study Group");
        newGroup.setGroupDescription("A group for studying Java programming");
        StudyGroup createdGroup = studyGroupService.createStudyGroup(newGroup);
        return ResponseEntity.ok(createdGroup);
    }

    // Read all
    @GetMapping("/group/read")
    public ResponseEntity<List<StudyGroup>> getAllStudyGroups() {
        List<StudyGroup> groups = studyGroupService.getAllStudyGroups();
        return ResponseEntity.ok(groups);
    }

    // Read one
    @GetMapping("/group/read/{id}")
    public ResponseEntity<StudyGroup> getStudyGroupById(@PathVariable Integer id) {
        return ResponseEntity.ok(studyGroupService.getStudyGroupById(id).orElseThrow());
    }

    // Update
    @GetMapping("/group/update/{id}")
    public ResponseEntity<StudyGroup> updateStudyGroup(@PathVariable Integer id) {
        try {
            StudyGroup group = studyGroupService.getStudyGroupById(id).orElse(null);
            group.setGroupName("Updated Java Study Group");
            StudyGroup updatedGroup = studyGroupService.updateStudyGroup(id, group);
            return ResponseEntity.ok(updatedGroup);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete
    @GetMapping("/group/delete/{id}")
    public ResponseEntity<Void> deleteStudyGroup(@PathVariable Integer id) {
        try {
            studyGroupService.deleteStudyGroup(id);
            return ResponseEntity.ok().build();
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        }
    }
} 