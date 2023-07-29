package com.developappscl.crudkotlinspringjdbc.controllers

import com.developappscl.crudkotlinspringjdbc.config.Constantes
import com.developappscl.crudkotlinspringjdbc.dto.ProductoDto
import com.developappscl.crudkotlinspringjdbc.service.ProductoService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(Constantes.URL_API_PRODUCTO)
class ProductoController(
     private val productoService: ProductoService
) {

    @GetMapping("/getAllProducts")
    fun getAllProducts(): List<ProductoDto> = productoService.getAllProducts()

    @GetMapping("/getProductById")
    fun getProductById(): String{
        return "getProductById"
    }

    @PostMapping("/createProduct")
    fun createProduct():String {
        return "createProduct"
    }

    @PutMapping("/updateProduct")
    fun updateProductById():String{
        return "updateProduct"
    }
    @DeleteMapping("/deleteProduct")
    fun deleteProductById():String {
        return "deleteProduct"
    }



}