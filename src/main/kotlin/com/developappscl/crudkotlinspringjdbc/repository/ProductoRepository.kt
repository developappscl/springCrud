package com.developappscl.crudkotlinspringjdbc.repository

import com.developappscl.crudkotlinspringjdbc.dto.ProductoDto

interface ProductoRepository {

    fun getAllProducts(): List<ProductoDto>

    fun getProductById(): ProductoDto

    fun createProduct(dto: ProductoDto):String

    fun updateProductById(id: Int,dto: ProductoDto):String

    fun deleteProductById(id: Int):String
}