package org.acme

import io.quarkus.hibernate.panache.PanacheEntity
import io.quarkus.hibernate.panache.PanacheRepository
import jakarta.enterprise.context.ApplicationScoped
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@ApplicationScoped
class GreetingRepository : PanacheRepository.Managed<GreetingEntity, Long>