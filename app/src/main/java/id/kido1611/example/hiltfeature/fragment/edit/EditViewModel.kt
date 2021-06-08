package id.kido1611.example.hiltfeature.fragment.edit

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import id.kido1611.example.hiltfeature.credential.Credential
import javax.inject.Inject

@HiltViewModel
class EditViewModel @Inject constructor(
    private val credential: Credential
) : ViewModel() {

    val name: LiveData<String> = credential.name

    fun setName(name: String) {
        credential.setName(name)
    }
}