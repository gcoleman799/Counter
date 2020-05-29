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

//private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
//        val binding = DataBindingUtil.inflate<FragmentFirstBinding>(inflater,
//            R.layout.fragment_first,container,false)
//        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

           // binding.buttonCount.setOnClickListener {}
        view.findViewById<Button>(R.id.button_count).setOnClickListener {
            countUp(view)
        }

        view.findViewById<Button>(R.id.button_random).setOnClickListener {
//
            val showCountTextView = view.findViewById<TextView>(R.id.number)
//            val currentCount = showCountTextView.text.toString().toInt()
//            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(currentCount)
//            findNavController().navigate(action)


        }




        view.findViewById<Button>(R.id.button_toast).setOnClickListener {
            // create a Toast with some text, to appear for a short time
            val myToast = Toast.makeText(context, "Hello Toast!", Toast.LENGTH_SHORT)
            // show the Toast
            myToast.show()
        }
    }

    private fun countUp (view: View){
//        val showCountTextView = binding.number
//        val countString= showCountTextView.text.toString()
//        var count= countString.toInt()
//        count ++
//        showCountTextView.text= count.toString()

        // Get the text view
        val showCountTextView = view.findViewById<TextView>(R.id.number)

        // Get the value of the text view.
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count = countString.toInt()
        count++

        // Display the new value in the text view.
        showCountTextView.text = count.toString()

    }
}
