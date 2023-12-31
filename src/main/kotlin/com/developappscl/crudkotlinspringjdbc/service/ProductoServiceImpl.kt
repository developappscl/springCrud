package com.developappscl.crudkotlinspringjdbc.service

import com.developappscl.crudkotlinspringjdbc.dto.ProductoDto
import com.developappscl.crudkotlinspringjdbc.repository.ProductoRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service

@Service
class ProductoServiceImpl(
    private val productoRepository: ProductoRepository
):ProductoService {
    override fun getAllProducts(): List<ProductoDto> = productoRepository.getAllProducts()

    override fun getProductById(id: Int): ResponseEntity<ProductoDto> = productoRepository.getProductById(id)

    override fun createProduct(dto: ProductoDto): String {
        TODO("Not yet implemented")
    }

    override fun updateProductById(id: Int, dto: ProductoDto): String {
        TODO("Not yet implemented")
    }

    override fun deleteProductById(id: Int): String {
        TODO("Not yet implemented")
    }


}