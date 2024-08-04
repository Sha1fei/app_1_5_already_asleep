package ru.sha1fei.lareadysllep

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val catText:TextView = findViewById(R.id.textView);
        val catText2:TextView = findViewById(R.id.textView3);
        val catText3:TextView = findViewById(R.id.textView4);
        val catText4:TextView = findViewById(R.id.textView2);
        val imageButton: ImageView = findViewById(R.id.imageView6);
        val phrases = listOf(
            "Уже 6 часов утра, Полин",
            "Вставай, мы там всё уронили",
            "Мы уронили вообще всё, Полин, честно",
            "Полин, ты чё опять лежишь?",
            "Часики-то тикают",
            "Мужика-то хоть нашла себе?",
            "Уже дитачек пора рожать вообще-то");

        imageButton.setOnClickListener{
            val shuffeledPhrases = phrases.shuffled();
            catText.setText(shuffeledPhrases[0]);
            catText2.setText(shuffeledPhrases[1]);
            catText3.setText(shuffeledPhrases[2]);
            catText4.setText(shuffeledPhrases[3]);
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}