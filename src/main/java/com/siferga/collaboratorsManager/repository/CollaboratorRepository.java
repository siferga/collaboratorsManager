package com.siferga.collaboratorsManager.repository;

import com.siferga.collaboratorsManager.model.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
    void deleteCollaboratorById(Long id);

    Optional<Collaborator> findCollaboratorById(Long id);
}
