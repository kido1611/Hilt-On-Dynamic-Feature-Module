package id.kido1611.example.hiltfeature

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.android.play.core.splitinstall.SplitInstallManagerFactory
import dagger.hilt.android.AndroidEntryPoint
import id.kido1611.example.hiltfeature.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val manager = SplitInstallManagerFactory.create(this)
        Log.e("SplitInstall", "Installed modules: ${manager.installedModules}")
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}