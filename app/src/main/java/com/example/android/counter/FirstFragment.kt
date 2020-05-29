package com.example.android.counter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.android.counter.databinding.FragmentFirstBinding


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

           // binding.buttonCount.setOnClickListener {}
        binding.buttonCountUp.setOnClickListener {
            countUp(view)
        }


        binding.buttonCountDown.setOnClickListener {
            countDown(view)
        }

        binding.buttonRandom.setOnClickListener {
            if (binding.number.text.toString().toInt() > 0) {
            val showCountTextView = view.findViewById<TextView>(R.id.number)
            val currentCount = showCountTextView.text.toString().toInt()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(currentCount)
            findNavController().navigate(action)}
            else{
                // create a Toast with some text, to appear for a short time
                val myToast = Toast.makeText(context, "Please make count positive getting a random number", Toast.LENGTH_SHORT)
                // show the Toast
                myToast.show()

            }


        }


       binding.buttonToast.setOnClickListener {
            // create a Toast with some text, to appear for a short time
            val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
            // show the Toast
            myToast.show()
        }
    }

    private fun countUp (view: View){
        val showCountTextView = binding.number
        val countString= showCountTextView.text.toString()
        var count= countString.toInt()
        count ++
        showCountTextView.text= count.toString()


    }

    private fun countDown (view: View){
        val showCountTextView = binding.number
        val countString= showCountTextView.text.toString()
        var count= countString.toInt()
        count --
        showCountTextView.text= count.toString()


    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
