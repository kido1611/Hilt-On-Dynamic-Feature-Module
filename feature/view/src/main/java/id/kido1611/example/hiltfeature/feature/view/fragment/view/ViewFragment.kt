package id.kido1611.example.hiltfeature.feature.view.fragment.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.EntryPointAccessors
import id.kido1611.example.hiltfeature.di.dependency.ViewModuleDependencies
import id.kido1611.example.hiltfeature.feature.view.ViewModelFactory
import id.kido1611.example.hiltfeature.feature.view.databinding.ViewFragmentBinding
import id.kido1611.example.hiltfeature.feature.view.di.DaggerViewComponent
import javax.inject.Inject

class ViewFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: ViewViewModel by viewModels {
        viewModelFactory
    }

    private var binding: ViewFragmentBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DaggerViewComponent.builder()
            .context(requireContext())
            .appDependencies(
                EntryPointAccessors
                    .fromApplication(
                        requireContext().applicationContext,
                        ViewModuleDependencies::class.java
                    )
            )
            .build()
            .inject(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = ViewFragmentBinding.inflate(
            inflater, container, false
        )
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}