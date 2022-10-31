package com.example.timepicker

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.timepicker.timepicker.TimePicker
import com.example.timepicker.timepicker.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener { setTimePicker() }
    }


    private fun setTimePicker() {
        val cal = Calendar.getInstance()
        val dialog = TimePickerDialog(
            this,
            object : TimePickerDialog.OnTimeSetListener {
                override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
                    Log.e("TAG", "${hourOfDay}  ${minute}")
                }
            }, cal[Calendar.HOUR_OF_DAY], cal[Calendar.MINUTE], false
        )
        dialog.show()


    }
}