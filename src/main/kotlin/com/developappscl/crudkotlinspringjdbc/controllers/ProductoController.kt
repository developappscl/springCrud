package com.developappscl.crudkotlinspringjdbc.controllers

import com.developappscl.crudkotlinspringjdbc.config.Constantes
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping(Constantes.URL_API_PRODUCTO)
class ProductoController {

    @GetMapping("/getAllProducts")
    fun getAllProducts(): String  {
        return "getAllProducts"
    }

    @GetMapping("/getProductById")
    fun getProductById(): String{
        return "getProductById"
    }

    @PostMapping("/createProduct")
    fun createProduct():String {
        return "createProduct"
    }

    @PutMapping("/updateProduct")
    fun updateProduct():String{
        return "updateProduct"
    }
    @DeleteMapping("/deleteProduct")
    fun deleteProduct():String {
        return "deleteProduct"
    }



}