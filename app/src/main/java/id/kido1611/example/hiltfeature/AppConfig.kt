package id.kido1611.example.hiltfeature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlin.random.Random

class AppConfig {

    private val _randomNumber = MutableLiveData<Int>()
    val randomNumber: LiveData<Int> = _randomNumber

    fun generateNumber() {
        _randomNumber.value = Random.nextInt(0, 100)
    }
}