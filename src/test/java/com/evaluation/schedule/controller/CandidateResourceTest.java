package com.evaluation.schedule.controller;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.evaluation.schedule.api.controller.AvailabilityController;
import com.evaluation.schedule.api.controller.CandidateResource;
import com.evaluation.schedule.domain.repository.AvailabilityRepository;
import com.evaluation.schedule.domain.repository.CandidateRepository;


@SpringBootTest
@AutoConfigureMockMvc
public class CandidateResourceTest {

/*	@Autowired
	private CandidateResource candidateResource;
		
	@MockBean
	private CandidateRepository candidateRepository;
	
	@Autowired
	MockMvc mockMvc;
	
	@Test void candidateTestGetAll() throws Exception {
		mockMvc.perform(get("/candidate/listar2")).andExpect(status().isOk());
	}*/
	
 }



