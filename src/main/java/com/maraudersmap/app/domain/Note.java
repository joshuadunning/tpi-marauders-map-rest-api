package com.maraudersmap.app.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Note {

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

	private Integer version;
	private String createdById;
	private Date dateCreated;
	private String note;
	private String updatedById;

}