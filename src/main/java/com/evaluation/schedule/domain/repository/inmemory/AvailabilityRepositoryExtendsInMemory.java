package com.evaluation.schedule.domain.repository.inmemory;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.evaluation.schedule.domain.exception.ServiceException;
import com.evaluation.schedule.domain.model.Availability;

import lombok.AllArgsConstructor;

public class AvailabilityRepositoryExtendsInMemory extends AvailabilityRepositoryInMemory {
	
		
	public AvailabilityRepositoryExtendsInMemory() {
		super();
	}

	private Optional<Availability> allAvailability = Optional.empty();
	
	@Override
	public <S extends Availability> S save(S entity) {
		System.out.print("antes");
		
		
		//Availability availability = availabilityAssember.toEntity(availabilityImput);

		boolean availabilityFound = findByAvailabilityRoom(entity.getRoom().getId(), entity.getAvailableTimeStart())
				.stream().anyMatch(availabilityExist -> !availabilityExist.getRoom().equals(entity.getRoom().getId()));

		if (availabilityFound) {
			System.out.println("erro");
			throw new ServiceException("There is an appointment for this room at the same time");
		}
				
		System.out.println("sala:"+entity.getRoom().getId());
		allAvailability = Optional.of(entity);				
		System.out.println("persiste"+entity.getId());
		return entity;
	}
	
	@Override
	public Optional<Availability> findByAvailabilityRoom(Long roomId, OffsetDateTime availableTimeStart) {
					  
		
		System.out.println("igual"+allAvailability.isEmpty());
		
		return allAvailability
		.filter(availabilityExist -> availabilityExist.getRoom().getId().equals(roomId) 
				&& availabilityExist.getAvailableTimeEnd().isAfter(availableTimeStart));
	    	    	   	    	  				
	}
	

}
