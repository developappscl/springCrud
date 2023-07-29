package com.developappscl.crudkotlinspringjdbc.repository

import com.developappscl.crudkotlinspringjdbc.dto.ProductoDto
import org.springframework.http.ResponseEntity

interface ProductoRepository {

    fun getAllProducts(): List<ProductoDto>

    fun getProductById(id: Int): ResponseEntity<ProductoDto>

    fun createProduct(dto: ProductoDto):String

    fun updateProductById(id: Int,dto: ProductoDto):String

    fun deleteProductById(id: Int):String
}