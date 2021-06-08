package id.kido1611.example.hiltfeature.fragment.first

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import id.kido1611.example.hiltfeature.R
import id.kido1611.example.hiltfeature.databinding.FragmentFirstBinding

@AndroidEntryPoint
class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    private val viewModel: FirstViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = FragmentFirstBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            vm = viewModel
            fragment = this@FirstFragment
        }
    }

    fun generateNumber() {
        viewModel.generateNumber()
    }

    fun editName() {
        findNavController().navigate(R.id.action_FirstFragment_to_editFragment)
    }

    fun seeProfile() {
        findNavController().navigate(R.id.action_FirstFragment_to_view_navigation)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}