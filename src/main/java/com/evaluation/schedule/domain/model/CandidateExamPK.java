package com.evaluation.schedule.domain.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CandidateExamPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="candidate_id")
	private Long candidateId;
	
	@Column(name="availability_id")
	private Long availabilityId;
		

	public CandidateExamPK() {
		super();
	}


	public CandidateExamPK(Long candidateId, Long availabilityId) {
		super();
		this.candidateId = candidateId;
		this.availabilityId = availabilityId;
	}


	public Long getCandidateId() {
		return candidateId;
	}


	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}


	public Long getAvailabilityId() {
		return availabilityId;
	}


	public void setAvailabilityId(Long availabilityId) {
		this.availabilityId = availabilityId;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		return Objects.hash(availabilityId, candidateId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandidateExamPK other = (CandidateExamPK) obj;
		return Objects.equals(availabilityId, other.availabilityId) && Objects.equals(candidateId, other.candidateId);
	}

	
}
