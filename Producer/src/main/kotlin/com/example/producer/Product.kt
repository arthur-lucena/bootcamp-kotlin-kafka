package com.example.producer

import com.fasterxml.jackson.annotation.JsonProperty

data class Product(
    @JsonProperty("name")
    var name: String ?= null,
    @JsonProperty("sku")
    var sku: String ?= null
)