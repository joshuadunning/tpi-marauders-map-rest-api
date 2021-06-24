package com.maraudersmap.app.controller;
import com.maraudersmap.app.domain.Note;

import java.lang.Integer;

import javax.annotation.security.PermitAll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.maraudersmap.app.service.NoteService;

@RestController
@RequestMapping("/note")
@PermitAll()
public class NoteController {

	private NoteService noteService;

	public NoteController(NoteService noteService){
        this.noteService = noteService;
	}

	@GetMapping(value = "/{id}")
	public Note findById(@PathVariable("id") Integer id) {
		return noteService.findNoteById(id);
	}
}
