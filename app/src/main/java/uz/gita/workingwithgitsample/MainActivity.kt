package uz.gita.workingwithgitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TTT", "onCreate: Hello everyone!")
        Log.d("ttt","ALLAMLAR MENIQIYNADI ALALAMLAR ")
        Log.d("TTT", "Jahongir: Hello everyone!")
        Toast.makeText(this,"dgs",Toast.LENGTH_LONG).show()
    }
}