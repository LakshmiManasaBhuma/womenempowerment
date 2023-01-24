package com.womenempowerment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Nischay
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Scheme {

	@Id
	@GeneratedValue
	private long schemeId;
	@NotNull
	private String schemeName;
	private int launchYear;
	@NotNull
	private String schemeObjective;
	private String schemeEligibility;
	
	
	
}