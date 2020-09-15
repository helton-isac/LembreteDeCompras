package com.hitg.lembretedecompras.ui.login

import android.os.Bundle
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.hitg.lembretedecompras.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    private lateinit var animacaoDoMascote: Animation
    private lateinit var animacaoDoFormulario: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        iniciarAnimacao()
        esconderTeclado()
    }

    private fun iniciarAnimacao() {
        animacaoDoMascote = AnimationUtils.loadAnimation(this, R.anim.frombottom)
        animacaoDoFormulario = AnimationUtils.loadAnimation(this, R.anim.frombottom2)
        containerLogin.clearAnimation()
        ivLogin.clearAnimation()
        containerLogin.startAnimation(animacaoDoMascote)
        ivLogin.startAnimation(animacaoDoFormulario)
    }

    private fun esconderTeclado() {
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN)
    }

}
