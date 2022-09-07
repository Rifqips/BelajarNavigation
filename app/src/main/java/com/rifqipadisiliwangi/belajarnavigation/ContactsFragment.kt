package com.rifqipadisiliwangi.belajarnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_contacts.*

class ContactsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contacts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getUmur = arguments?.getString("dataumur")
        var getNamaUserContacts = arguments?.getString("datauser")
        tv_hasil_umur.text = getUmur.toString()
        tv_hasil_nama.text = getNamaUserContacts
        Toast.makeText(context, getUmur, Toast.LENGTH_LONG).show()
    }



}