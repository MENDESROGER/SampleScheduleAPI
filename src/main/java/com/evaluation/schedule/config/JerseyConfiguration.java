package com.evaluation.schedule.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.evaluation.schedule.api.controller.CandidateResource;

@Component
@ApplicationPath("JAX-RS")
public class JerseyConfiguration extends ResourceConfig {
 public JerseyConfiguration(Class<?> ... classes) {
	packages("com.evaluation.schedule.api.controller");
 }
}