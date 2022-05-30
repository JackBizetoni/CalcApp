package jp.techacademy.chikashi.matsumoto.calcapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tasu.setOnClickListener(this)
        hiku.setOnClickListener(this)
        kakeru.setOnClickListener(this)
        waru.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val CalcApp = Intent(this, SecondActivity::class.java)

        if (editText1.text.toString().isNullOrBlank() || editText1.text.toString().isNullOrBlank()) {
            error.text = "エラー"
            return
        }

        if (v.id == R.id.tasu) {
            CalcApp.putExtra("TASU_FLG", true)
        } else if (v.id == R.id.hiku) {
            CalcApp.putExtra("HIKU_FLG", true)
        } else if (v.id == R.id.kakeru) {
            CalcApp.putExtra("KAKERU_FLG", true)
        } else if (v.id == R.id.waru) {
            CalcApp.putExtra("WARU_FLG", true)
        }

        CalcApp.putExtra("VALUE1", editText1.text.toString().toDoubleOrNull())
        CalcApp.putExtra("VALUE2", editText2.text.toString().toDoubleOrNull())
        startActivity(CalcApp)
    }
}