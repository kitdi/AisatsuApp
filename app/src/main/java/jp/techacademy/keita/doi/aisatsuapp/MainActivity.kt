package jp.techacademy.keita.doi.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val LOG_TAG = "AisatsuApp"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                when (hour) {
                    in 2..9 -> {
                        Log.d(LOG_TAG, "hour in 2..9")
                        textview.text = "おはよう"
                    }
                    in 10..17 -> {
                        Log.d(LOG_TAG, "10..17")
                        textview.text = "こんにちは"
                    }
                    else -> {
                        Log.d(LOG_TAG, "else")
                        textview.text = "こんばんわ"
                    }
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }
}