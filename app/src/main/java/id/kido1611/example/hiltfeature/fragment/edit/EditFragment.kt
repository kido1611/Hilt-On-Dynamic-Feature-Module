package id.kido1611.example.hiltfeature.fragment.edit

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import id.kido1611.example.hiltfeature.databinding.EditFragmentBinding

@AndroidEntryPoint
class EditFragment : Fragment() {

    private var binding: EditFragmentBinding? = null
    private val viewModel: EditViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val fragmentBinding = EditFragmentBinding.inflate(
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

            edName.doAfterTextChanged {
                viewModel.setName(it.toString())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}