package ru.andreysozonov.geekkotlin.task1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import ru.andreysozonov.geekkotlin.R

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)


        button_main.setOnClickListener{
            viewModel.viewState().observe(this, Observer {it ->
                text_view_main.text = it
                text_view_main.setTextColor(Color.BLUE)
            })
        }
    }
}
