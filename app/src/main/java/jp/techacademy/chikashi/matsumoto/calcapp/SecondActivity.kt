package jp.techacademy.chikashi.matsumoto.calcapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var value1 = intent.getDoubleExtra("VALUE1", 0.00)
        var value2 = intent.getDoubleExtra("VALUE2", 0.00)

        if(intent.getBooleanExtra("TASU_FLG", false)){
            textView1.text = "${value1}" + "+" + "${value2}" + "=" + "${value1 + value2}"
        }else if(intent.getBooleanExtra("HIKU_FLG", false)){
            textView1.text = "${value1}" + "-" + "${value2}" + "=" + "${value1 - value2}"
        }else if(intent.getBooleanExtra("KAKERU_FLG", false)){
            textView1.text = "${value1}" + "×" + "${value2}" + "=" + "${value1 * value2}"
        }else if(intent.getBooleanExtra("WARU_FLG", false)){
            textView1.text = "${value1}" + "÷" + "${value2}" + "=" + "${value1 / value2}"
        }
    }
}