package id.kido1611.example.hiltfeature.fragment.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import id.kido1611.example.hiltfeature.AppConfig
import id.kido1611.example.hiltfeature.credential.Credential
import javax.inject.Inject

@HiltViewModel
class FirstViewModel @Inject constructor(
    private val credential: Credential,
    private val appConfig: AppConfig
) : ViewModel() {

    fun getNumber(): LiveData<Int> = appConfig.randomNumber
    fun getName(): LiveData<String> = credential.name

    fun generateNumber() {
        appConfig.generateNumber()
    }
}