package com.developappscl.crudkotlinspringjdbc.model


data class Producto (
    val id: Long,
    val name: String,
    val description: String,
    val id_categoria: Long,
    val id_marca: Long,
    val status: String,
    val image_small: String,
    val image_large: String,
    val measures: String,
    val qty: Long,
    val datecreated: String
)
