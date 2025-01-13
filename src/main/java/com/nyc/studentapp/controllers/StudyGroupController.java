package com.nyc.studentapp.controllers;

import org.springframework.stereotype.Controller;

// TODO : Add imports

@Controller
public class StudyGroupController {
// TODO : Uncomment this when you have the service


    // private final StudyGroupService studyGroupService;

    // @Autowired
    // public StudyGroupController(StudyGroupService studyGroupService) {
    //     this.studyGroupService = studyGroupService;
    // }

    // @GetMapping("/studygroup")
    // public String index() {
    //     return "studygroupIndex";
    // }

    // // Test endpoints for development
    // @GetMapping("/studygroup/test/create")
    // @ResponseBody
    // public ResponseEntity<StudyGroup> testCreateGroup() {
    //     StudyGroup newGroup = new StudyGroup();
    //     newGroup.setGroupName("Test Study Group");
    //     newGroup.setGroupDescription("This is a test study group for development");
    //     StudyGroup createdGroup = studyGroupService.createStudyGroup(newGroup);
    //     return ResponseEntity.ok(createdGroup);
    // }

    // @GetMapping("/studygroup/test/update/{id}")
    // @ResponseBody
    // public ResponseEntity<StudyGroup> testUpdateGroup(@PathVariable Integer id) {
    //     try {
    //         StudyGroup group = studyGroupService.getStudyGroupById(id).orElse(null);
    //         if (group == null) {
    //             return ResponseEntity.notFound().build();
    //         }
    //         group.setGroupName("Updated Test Group");
    //         StudyGroup updatedGroup = studyGroupService.updateStudyGroup(group);
    //         return ResponseEntity.ok(updatedGroup);
    //     } catch (IllegalArgumentException e) {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    // @GetMapping("/studygroup/test/delete/{id}")
    // @ResponseBody
    // public ResponseEntity<Void> testDeleteGroup(@PathVariable Integer id) {
    //     try {
    //         studyGroupService.deleteStudyGroup(id);
    //         return ResponseEntity.ok().build();
    //     } catch (IllegalArgumentException e) {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    // // Actual CRUD endpoints for the frontend
    // @PostMapping("/studygroup/create")
    // @ResponseBody
    // public ResponseEntity<StudyGroup> createStudyGroup(@RequestBody StudyGroup studyGroup) {
    //     StudyGroup createdGroup = studyGroupService.createStudyGroup(studyGroup);
    //     return ResponseEntity.ok(createdGroup);
    // }

    // @GetMapping("/studygroup/read")
    // @ResponseBody
    // public ResponseEntity<List<StudyGroup>> getAllStudyGroups() {
    //     List<StudyGroup> groups = studyGroupService.getAllStudyGroups();
    //     return ResponseEntity.ok(groups);
    // }

    // @GetMapping("/studygroup/read/{id}")
    // @ResponseBody
    // public ResponseEntity<StudyGroup> getStudyGroupById(@PathVariable Integer id) {
    //     return ResponseEntity.ok(studyGroupService.getStudyGroupById(id).orElseThrow());
    // }

    // @PutMapping("/studygroup/update/{id}")
    // @ResponseBody
    // public ResponseEntity<StudyGroup> updateStudyGroup(@PathVariable Integer id, @RequestBody StudyGroup studyGroup) {
    //     try {
    //         studyGroup.setId(id);
    //         StudyGroup updatedGroup = studyGroupService.updateStudyGroup(studyGroup);
    //         return ResponseEntity.ok(updatedGroup);
    //     } catch (IllegalArgumentException e) {
    //         return ResponseEntity.notFound().build();
    //     }
    // }

    // @DeleteMapping("/studygroup/delete/{id}")
    // @ResponseBody
    // public ResponseEntity<Void> deleteStudyGroup(@PathVariable Integer id) {
    //     try {
    //         studyGroupService.deleteStudyGroup(id);
    //         return ResponseEntity.ok().build();
    //     } catch (IllegalArgumentException e) {
    //         return ResponseEntity.notFound().build();
    //     }
    // }
} 