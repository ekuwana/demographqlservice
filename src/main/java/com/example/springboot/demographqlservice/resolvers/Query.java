package com.example.springboot.demographqlservice.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.springboot.demographqlservice.domain.TestEntity;
import com.example.springboot.demographqlservice.repos.EntityRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {

  private final Logger logger = LogManager.getLogger();
  
  @Autowired
  private EntityRepo entityRepo;

  public Iterable<TestEntity> getAllEntities() {
    logger.debug("executing GraphQL query: getAllEntities");
    return entityRepo.getAllEntities();
  }

  public Iterable<TestEntity> getEntitiesByName(String name) {
    logger.debug("executing GraphQL query: getEntitiesByName");
    return entityRepo.getEntitiesByName(name);
  }

  public Optional<TestEntity> getEntityById(String id) {
    logger.debug("executing GraphQL query: getEntitiesById");
    return entityRepo.getEntityById(id);
  }
}