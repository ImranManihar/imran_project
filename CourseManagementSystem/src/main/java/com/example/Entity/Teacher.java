package com.example.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="FacultyTeacher")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
	@Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	public int tid;
	public String tname;
	public int tfees;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cid")
	Course course;
	
	

}
