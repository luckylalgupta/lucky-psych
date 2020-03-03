package com.psych.game.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentWriter extends JpaRepository<ContentWriter,Long> {
}
