package com.example.demo

import org.hibernate.annotations.QueryHints.CACHEABLE
import org.springframework.data.jpa.repository.QueryHints
import org.springframework.data.repository.CrudRepository
import java.time.LocalDate
import javax.persistence.QueryHint

interface Entity1Repository: CrudRepository<Entity1, Long> {

    @QueryHints(QueryHint(name = CACHEABLE, value = "true"))
    fun findAllByCreatedDateBefore(date: LocalDate): List<Entity1>
}