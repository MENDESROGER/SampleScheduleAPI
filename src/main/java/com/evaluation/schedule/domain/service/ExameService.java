package com.evaluation.schedule.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.evaluation.schedule.api.assembler.AvailabilityAssember;
import com.evaluation.schedule.api.assembler.ExamAssember;
import com.evaluation.schedule.api.model.AvailabilityImput;
import com.evaluation.schedule.api.model.ExamImput;
import com.evaluation.schedule.domain.exception.ServiceException;
import com.evaluation.schedule.domain.model.Availability;
import com.evaluation.schedule.domain.model.Candidate;
import com.evaluation.schedule.domain.model.Exam;
import com.evaluation.schedule.domain.model.Room;
import com.evaluation.schedule.domain.repository.AvailabilityRepository;
import com.evaluation.schedule.domain.repository.CandidateRepository;
import com.evaluation.schedule.domain.repository.ExamRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ExameService {
	
	private ExamRepository examRepository;
	
	private CandidateRepository candidateRepository;
	
	private AvailabilityRepository availabilityRepository;
	
	private CandidateService candidateService;
	
	private AvailabilityService availabilityService;

	private ExamAssember examAssember;
	
	@Transactional
	public Exam save(ExamImput examImput) {
		Exam exam = examAssember.toEntity(examImput);
		
		boolean candidateFound = candidateRepository.findById(examImput.getCandidate().getId())
				.stream()
				.anyMatch(candidateExist -> !candidateExist.equals(exam.getCandidate()));
		
		if (candidateFound) {
			throw new ServiceException("Candidato is not found");
		}else {		
			Candidate candidate = candidateService.findCandidate(examImput.getCandidate().getId());				
			exam.setCandidate(candidate);					
		}
		
		
		boolean availabilityFound = availabilityRepository.findById(examImput.getAvailability().getId())
				.stream()
				.anyMatch(availabilityExist -> !availabilityExist.equals(exam.getCandidate()));
		
		if (availabilityFound) {
			throw new ServiceException("Availability is not found");
		}else {		
			Availability availability = availabilityService.findAvailability(examImput.getAvailability().getId());				
			exam.setAvailability(availability);				
		}
					
		return examRepository.save(exam);
		
	}

}
