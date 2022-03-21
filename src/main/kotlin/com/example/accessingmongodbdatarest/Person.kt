package com.example.accessingmongodbdatarest

import org.springframework.data.annotation.Id


@Suppress("unused")
data class Person(
    var firstName: String? = null,
    var lastName: String? = null,
    @Id
    var id: String? = null
)