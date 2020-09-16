package com.hitg.lembretedecompras.ui.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.hitg.lembretedecompras.dao.LembretedeComprasRoomDatabase
import com.hitg.lembretedecompras.models.Produto
import com.hitg.lembretedecompras.repository.ProdutoRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val repository: ProdutoRepository

    val produtos: LiveData<List<Produto>>

    init {
        val produtoDao = LembretedeComprasRoomDatabase.getDatabase(application).produtoDao()
        repository = ProdutoRepository(produtoDao)
        produtos = repository.produtos
    }

    fun insert(produto: Produto) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(produto)
    }
}
