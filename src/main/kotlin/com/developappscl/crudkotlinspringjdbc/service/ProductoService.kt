package com.developappscl.crudkotlinspringjdbc.service

import com.developappscl.crudkotlinspringjdbc.dto.ProductoDto
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping

interface ProductoService {
    fun getAllProducts(): List<ProductoDto>

    fun getProductById(id: Int): ResponseEntity<ProductoDto>

    fun createProduct(dto: ProductoDto):String

    fun updateProductById(id: Int,dto: ProductoDto):String

    fun deleteProductById(id: Int):String
}