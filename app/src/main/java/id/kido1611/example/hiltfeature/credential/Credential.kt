package id.kido1611.example.hiltfeature.credential

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class Credential {

    private val _name = MutableLiveData("kido1611")
    val name: LiveData<String> = _name

    fun setName(name: String) {
        _name.value = name
    }
}