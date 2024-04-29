package com.siferga.collaboratorsManager.controller;

import com.siferga.collaboratorsManager.model.Collaborator;
import com.siferga.collaboratorsManager.service.CollaboratorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collaborator")
public class CollaboratorController {
    private CollaboratorService collaboratorService;
    public CollaboratorController(CollaboratorService collaboratorService) {
        this.collaboratorService = collaboratorService;
    }
    //returning a list of collaborators

    @GetMapping("/all")
    public ResponseEntity<List<Collaborator>> getAllEmployees () {
        List<Collaborator> employees = collaboratorService.findAllCollaborators();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Collaborator> getCollaboratorById (@PathVariable("id") Long id) {
        Collaborator collaborator = collaboratorService.findCollaboratorById(id);
        return new ResponseEntity<>(collaborator, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Collaborator> addEmployee(@RequestBody Collaborator collaborator) {
        Collaborator newEmployee = collaboratorService.addCollaborator(collaborator);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Collaborator> updateCollaborator(@RequestBody Collaborator collaborator) {
        Collaborator updateCollaborator = collaboratorService.updateCollaborator(collaborator);
        return new ResponseEntity<>(updateCollaborator, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCollaborator(@PathVariable("id") Long id) {
        collaboratorService.deleteCollaborator(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
