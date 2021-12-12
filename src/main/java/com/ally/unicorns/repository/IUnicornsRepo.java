package com.ally.unicorns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ally.unicorns.entity.Unicorns;

@Repository
public interface IUnicornsRepo extends JpaRepository<Unicorns, Long> {

}
