package com.maraudersmap.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.lang.Integer;


import com.maraudersmap.app.domain.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, String> {

	public Optional<Note> findById(Integer id);

}
