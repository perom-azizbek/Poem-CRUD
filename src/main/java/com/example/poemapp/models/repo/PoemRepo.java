package com.example.poemapp.models.repo;

import com.example.poemapp.models.Poem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoemRepo extends JpaRepository<Poem, Long> {
}
//JpaRepository contains API for CRUD operations