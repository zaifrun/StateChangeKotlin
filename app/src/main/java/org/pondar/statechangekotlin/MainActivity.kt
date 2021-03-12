package org.pondar.statechangekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val KEY = "savedName"
    private val TAG = "stateChange"
    private var name = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameView.text = resources.getString(R.string.saved_named_label,"")


        Log.d(TAG, "onCreate")

       //do we have some saved state?
        val saved = savedInstanceState?.getString(KEY)
        if (saved!=null)
            name = saved

        //initialize our text field
        nameView.text = resources.getString(R.string.saved_named_label,name)
        //add a click listener to our save button
        saveButton.setOnClickListener{
            name = editNameView.text.toString()
            nameView.text = resources.getString(R.string.saved_named_label,name)

        }
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }

    //This method is called before our activity is destroyed
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState")
        /* Here we put code now to save the state */
        //outState.putString(KEY, name)

    }
}
