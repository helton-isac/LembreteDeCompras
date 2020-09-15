package com.hitg.lembretedecompras.repository

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hitg.lembretedecompras.models.RequestState
import com.hitg.lembretedecompras.models.Usuario

class LoginViewModel : ViewModel() {

    private val usuarioRepository = UsuarioRepository()

    val loginState = MutableLiveData<RequestState<String>>()

    fun doLogin(usuario: Usuario) {
        loginState.value = usuarioRepository.logar(usuario).value
    }

}
