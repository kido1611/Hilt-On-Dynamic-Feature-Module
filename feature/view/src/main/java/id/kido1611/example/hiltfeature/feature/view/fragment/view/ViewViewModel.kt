package id.kido1611.example.hiltfeature.feature.view.fragment.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.kido1611.example.hiltfeature.AppConfig
import id.kido1611.example.hiltfeature.credential.Credential
import javax.inject.Inject

class ViewViewModel @Inject constructor(
    private val credential: Credential,
    private val appConfig: AppConfig
) : ViewModel() {
    fun getName(): LiveData<String> = credential.name

    fun number(): LiveData<Int> = appConfig.randomNumber
}