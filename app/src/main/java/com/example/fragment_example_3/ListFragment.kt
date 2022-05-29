package com.example.fragment_example_3

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_list, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageView1 = view.findViewById<ImageView>(R.id.imageView1)
        val imageView2 = view.findViewById<ImageView>(R.id.imageView2)
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            imageView1.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.mail_container, MailFragment()).commit()
                Toast.makeText(context, "ImageView1", Toast.LENGTH_SHORT).show()
            }

            imageView2.setOnClickListener {
                parentFragmentManager.beginTransaction().replace(R.id.mail_container, DescriptionFragment()).commit()
                Toast.makeText(context, "ImageView2", Toast.LENGTH_SHORT).show()
            }
        } else {
            imageView1.setOnClickListener {
                startActivity(Intent(context, MainActivity2::class.java))
            }
        }

    }
}




