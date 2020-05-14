package com.example.springboot.demographqlservice.repos;

import java.util.Optional;

public interface EntityRepo<T> {

  Iterable<T> getAllEntities();

  Iterable<T> getEntitiesByName(String name);

  Optional<T> getEntityById(String id);
}
