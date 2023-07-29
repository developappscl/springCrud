package com.developappscl.crudkotlinspringjdbc.config

class Constantes {
    companion object {
        private const val URL_API_BASE="/api"
        private const val URL_API_VERSION="/v1"
        private const val URL_BASE= URL_API_BASE + URL_API_VERSION

        // por modelo
        const val URL_API_PRODUCTO="$URL_BASE/producto"


    }
}