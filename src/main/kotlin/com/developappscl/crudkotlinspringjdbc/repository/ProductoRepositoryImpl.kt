package com.developappscl.crudkotlinspringjdbc.repository

import com.developappscl.crudkotlinspringjdbc.dto.ProductoDto
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class ProductoRepositoryImpl(
    private val jdbcTemplate: NamedParameterJdbcTemplate
) :ProductoRepository {
    override fun getAllProducts():List<ProductoDto> {

        val sql = "SELECT * FROM portafolio.productos"
        return jdbcTemplate.query(sql, emptyMap<String, Any>()) { rs, _ ->
            ProductoDto(
                id = rs.getLong("id"),
                name = rs.getString("name"),
                description = rs.getString("description"),
                id_categoria = rs.getLong("id_categoria"),
                id_marca = rs.getLong("id_marca"),
                status = rs.getString("status"),
                image_small = rs.getString("image_small"),
                image_large = rs.getString("image_large"),
                measures = rs.getString("measures"),
                qty = rs.getLong("qty"),
                datecreated = rs.getString("datecreated")
            )
        }
    }


  override fun getProductById(): ProductoDto {
        TODO("Not yet implemented")
    }

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