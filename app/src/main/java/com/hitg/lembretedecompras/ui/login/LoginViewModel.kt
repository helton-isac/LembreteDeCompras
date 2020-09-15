package com.hitg.lembretedecompras.ui.login

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.hitg.lembretedecompras.models.RequestState
import com.hitg.lembretedecompras.models.Usuario
import com.hitg.lembretedecompras.repository.UsuarioRepository

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val usuarioRepository = UsuarioRepository(application)

    val loginState = MutableLiveData<RequestState<String>>()

    fun doLogin(usuario: Usuario) {
        loginState.value = usuarioRepository.logar(usuario).value
    }

}
