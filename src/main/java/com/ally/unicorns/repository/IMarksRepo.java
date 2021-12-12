package com.ally.unicorns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ally.unicorns.entity.IdentifibleMarks;

@Repository
public interface IMarksRepo extends JpaRepository<IdentifibleMarks, Long> {

}
