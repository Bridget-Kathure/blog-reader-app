package com.example.article

import Article
import BlogAdapter
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blog_reader_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecyclerView.layoutManager=LinearLayoutManager(this)
        displayArticles()

    }
    fun displayArticles(){
        val article1=Article("Kathure","2023","The woods","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article2=Article("Nabacwa","2022","The man","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article3=Article("Nyaga","2021","Gaint","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article4=Article("Bridget","2020","Hero","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article5=Article("Karen","2012","Grow","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article6=Article("Temko","2013","From","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article7=Article("Joy","2013","Become","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")
        val article8=Article("Pearl","2009","Accidental","TThe woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search")

        val article= listOf(article1,article2,article3,article5,article6,article7,article8,article4)
        val blogAdapter=BlogAdapter(article)
        binding.rvRecyclerView.adapter=blogAdapter
    }
}