package com.siferga.collaboratorsManager.service;

import com.siferga.collaboratorsManager.exception.UserNotFoundException;
import com.siferga.collaboratorsManager.model.Collaborator;
import com.siferga.collaboratorsManager.repository.CollaboratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CollaboratorService {
    private final CollaboratorRepository collaboratorRepository;
    @Autowired
    public CollaboratorService(CollaboratorRepository collaboratorRepository) {
        this.collaboratorRepository = collaboratorRepository;
    }

    public Collaborator addCollaborator(Collaborator collaborator) {
        collaborator.setColCode(UUID.randomUUID().toString());
        return collaboratorRepository.save(collaborator);
    }

    public List<Collaborator> findAllCollaborators() {
        return collaboratorRepository.findAll();
    }

    public Collaborator updateCollaborator(Collaborator collaborator) {
        return collaboratorRepository.save(collaborator);
    }

   public Collaborator findCollaboratorById(Long id) {
        return collaboratorRepository.findCollaboratorById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));

    }

    public void deleteCollaborator(Long id) {
        collaboratorRepository.deleteCollaboratorById(id);
    }
}
