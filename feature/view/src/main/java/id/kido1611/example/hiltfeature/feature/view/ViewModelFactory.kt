package id.kido1611.example.hiltfeature.feature.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import id.kido1611.example.hiltfeature.AppConfig
import id.kido1611.example.hiltfeature.credential.Credential
import id.kido1611.example.hiltfeature.feature.view.fragment.view.ViewViewModel
import javax.inject.Inject

class ViewModelFactory @Inject constructor(
    private val credential: Credential,
    private val appConfig: AppConfig
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ViewViewModel::class.java) -> {
                ViewViewModel(credential, appConfig) as T
            }
            else -> throw IllegalArgumentException("Unknown model class")
        }
    }

}