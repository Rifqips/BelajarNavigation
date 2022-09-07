package com.rifqipadisiliwangi.belajarnavigation

import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*
import java.security.AuthProvider

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_login.setOnClickListener {
            val namaUser = et_username.text.toString()
            val etPassword = et_password.text.toString()
            if (etPassword.isEmpty()){
//                Toast.makeText(this,  Toast.LENGTH_LONG).show()
                Toast.makeText(context,"Masukkan Password Gaes",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if (etPassword != "admin01"){
//                Toast.makeText(this,  Toast.LENGTH_LONG).show()
                Toast.makeText(context,"Password Salah Ya",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(etPassword == "admin01"){
                var progressDialog = ProgressDialog(context,
                R.style.Theme_BelajarNavigation)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
            }

            val nameBundle = bundleOf()
            nameBundle.putString("datauser", namaUser)
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_homeFragment,nameBundle)

        }

        tv_forgot_pasword.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }

        tv_sign_up.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_registerFragment)
        }

        tv_contact.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_contactsFragment)
        }

        tv_help.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_helpFragment)
        }

    }
}