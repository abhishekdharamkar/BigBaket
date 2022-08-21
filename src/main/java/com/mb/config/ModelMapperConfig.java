package com.mb.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.mb.audit.AuditorAwareImpl;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class ModelMapperConfig
{
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	@Bean
	public AuditorAware<String> auditorAware()
	{
		return new AuditorAwareImpl();
	}
}
