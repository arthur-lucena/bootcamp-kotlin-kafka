package com.example.consumer

import com.fasterxml.jackson.annotation.JsonProperty

data class Product(
    @JsonProperty("name")
    val name: String ?= null,
    @JsonProperty("sku")
    val sku: String ?= null
)