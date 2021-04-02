package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.textView)

        var one = findViewById<ImageView>(R.id.imageView1)
        var two = findViewById<ImageView>(R.id.imageView2)
        var three = findViewById<ImageView>(R.id.imageView3)

        one.setOnClickListener {
            text.text = getString(R.string.animal1)
        }

        two.setOnClickListener {
            text.text = getString(R.string.animal2)
        }
        three.setOnClickListener {
            text.text = getString(R.string.animal3)
        }
    }
}