package com.example.springboot.demographqlservice.app;

import com.example.springboot.demographqlservice.domain.TestEntity;
import com.example.springboot.demographqlservice.repos.EntityRepo;
import com.example.springboot.demographqlservice.repos.TestEntityRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

  @Bean
  public EntityRepo<TestEntity> entityRepo() {
    return new TestEntityRepo();
  }
}
