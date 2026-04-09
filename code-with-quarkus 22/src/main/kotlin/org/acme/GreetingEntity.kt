package org.acme

import io.quarkus.hibernate.panache.PanacheEntity
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class GreetingEntity(val field: String? = null) : PanacheEntity() {
}
