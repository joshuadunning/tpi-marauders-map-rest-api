package com.maraudersmap.app.service;


import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import java.lang.Integer;


import com.maraudersmap.app.domain.Note;
import com.maraudersmap.app.repository.NoteRepository;

@Service
public class NoteService {

    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository){
        this.noteRepository = noteRepository;
    }

    public Note findNoteById(Integer id){
        Logger.getLogger("Info").info("message");
        return noteRepository.findById(id).orElse(null);
    }
}
