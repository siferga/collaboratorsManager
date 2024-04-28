package com.siferga.collaboratorsManager.repository;

import com.siferga.collaboratorsManager.model.Collaborator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollaboratorRepository extends JpaRepository<Collaborator, Long> {
}
