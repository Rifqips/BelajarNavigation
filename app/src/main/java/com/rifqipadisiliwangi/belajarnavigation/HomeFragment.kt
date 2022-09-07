package com.rifqipadisiliwangi.belajarnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUser = arguments?.getString("datauser")
        tv_nama_user.text = getUser
        Toast.makeText(context,getUser,Toast.LENGTH_LONG).show()

        btn_input.setOnClickListener {
            val dataUserHome = tv_nama_user.text.toString()
            val dataUmur = et_input_data_satu.text.toString()
            val resultKurang = 2022
            val resultHasil = resultKurang - dataUmur.toInt()
            var bun = Bundle()
            bun.putString("dataumur", resultHasil.toString())
            bun.putString("datauser", dataUserHome)
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_contactsFragment,bun)
        }

        circleImageView.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_profileFragment)
        }
    }
}
