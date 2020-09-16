package com.hitg.lembretedecompras.repository

import androidx.lifecycle.LiveData
import com.hitg.lembretedecompras.dao.ProdutoDao
import com.hitg.lembretedecompras.models.Produto

class ProdutoRepository(private val produtoDao: ProdutoDao) {

    val produtos: LiveData<List<Produto>> = produtoDao.getListaDeProdutos()

    suspend fun insert(produto: Produto) {
        produtoDao.insert(produto)
    }
}
