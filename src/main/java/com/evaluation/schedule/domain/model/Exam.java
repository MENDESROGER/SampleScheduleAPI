package com.evaluation.schedule.domain.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.evaluation.schedule.domain.model.type.TypeCertification;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor
@Entity
@Table(name="exam")
@Setter
@Getter
public class Exam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@EqualsAndHashCode.Include
	@EmbeddedId
	private CandidateExamPK id = new CandidateExamPK();
			
	@ManyToOne
	@JoinColumn(name="availability_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Availability availability;
	
	@ManyToOne
	@JoinColumn(name="candidate_id", referencedColumnName = "id", insertable = false, updatable = false)
	private Candidate candidate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="datescheduling")
	private Date dateScheduling=new Date(0);
			
	@Enumerated(EnumType.STRING)
	@Column(name="typecertification")
	private TypeCertification typecertification;
		
}
