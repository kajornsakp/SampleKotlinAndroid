package com.example.kajornsak.myapplication

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_first.*


/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [FirstFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment: Fragment(), View.OnClickListener{

    private var mParam1: String? = null
    var string : String? = null
    lateinit var buttonSubmit : Button
    lateinit var updateText : UpdateTextInterface

    override fun onClick(v: View?) {
        if(v == buttonSubmit){
            string = editText.text.toString()
            Toast.makeText(activity,string,Toast.LENGTH_SHORT).show()
            updateText.onTextUpdate(string!!)
        }
    }

    // TODO: Rename and change types of parameters

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        updateText = context as UpdateTextInterface


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater!!.inflate(R.layout.fragment_first, container, false)
        buttonSubmit = view.findViewById<Button>(R.id.buttonSubmit)
        buttonSubmit.setOnClickListener(this)
        return view
    }


    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String): FirstFragment {
            val fragment = FirstFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            fragment.arguments = args
            return fragment
        }
    }
}// Required empty public constructor

