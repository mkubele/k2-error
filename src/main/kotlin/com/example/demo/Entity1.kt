package com.example.demo

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "entity1")
class Entity1 {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_one_seq_gen")
    var id: Long = 0

    var createdDate: LocalDate = LocalDate.now()
}