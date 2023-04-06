package com.example.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "FacultyCourse")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
	@Id
	@javax.persistence.GeneratedValue(strategy = GenerationType.AUTO)
	public int cid;
	public String cname;
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "tid")
	List<Teacher> teachers;

}
