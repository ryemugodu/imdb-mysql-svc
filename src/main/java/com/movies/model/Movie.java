package com.movies.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Movie {
	
	private String rank;
	private String title;
	private String description;
	private List<String> genre;
	private String rating;
	@Id
	private String id;
	private String year;
	private String imdbid;
	private String imdbLink;

}
