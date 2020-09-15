package com.hitg.lembretedecompras.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hitg.lembretedecompras.models.RequestState
import com.hitg.lembretedecompras.models.Usuario

class UsuarioRepository {

    fun logar(usuario: Usuario): LiveData<RequestState<String>> {
        val response = MutableLiveData<RequestState<String>>()

        if (usuario.email == "compra@facil.com.br" &&
            usuario.senha == "123456"
        ) {
            response.value = RequestState.Success("")
        } else {
            response.value = RequestState.Error(Exception("Usuário ou senha invalido"))
        }

        return response
    }
}
