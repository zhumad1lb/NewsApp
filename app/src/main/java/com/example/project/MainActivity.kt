package com.example.project

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import androidx.browser.customtabs.CustomTabsIntent
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil.setContentView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
//import com.android.volley.Request
//import com.android.volley.Response
//import com.android.volley.toolbox.JsonObjectRequest

class MainActivity : AppCompatActivity() {
//
//    private lateinit var mAdaptor: NewsListAdaptor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val recyclerView: RecyclerView = findViewById(R.id.recyclerView
//        recyclerView.layoutManager = LinearLayoutManager(this)
//
//        fetchData()
//        mAdaptor = NewsListAdaptor(this)
//        recyclerView.adapter = mAdaptor

        //Initialize the bottom navigation view
        //create bottom navigation view object
        val bottomNavigationView = findViewById<BottomNavigationView
                >(R.id.bottom_navigation_view)
        val navController = findNavController(R.id.nav_fragment)
        bottomNavigationView.setupWithNavController(
            navController
        )
        navController.addOnDestinationChangedListener { _, destination, _ ->
            bottomNavigationView.isVisible = when (destination.id) {
                R.id.registerFragment,
                R.id.loginFragment -> false
                else -> true
            }
        }
    }
//
//    fun fetchData(){
//        val url = "https://saurav.tech/NewsAPI/top-headlines/category/health/in.json"
//        val jsonObjectRequest = JsonObjectRequest(
//            Request.Method.GET,url,null,
//            {
//                val newsJsonArray = it.getJSONArray("articles")
//                val newsArray = ArrayList<News>()
//                for(i in 0 until newsJsonArray.length()){
//                    val newsJsonObject = newsJsonArray.getJSONObject(i)
//                    val news = News(
//                        newsJsonObject.getString("title"),
//                        newsJsonObject.getString("author"),
//                        newsJsonObject.getString("url"),
//                        newsJsonObject.getString("urlToImage")
//                    )
//                    newsArray.add(news)
//                }
//                mAdaptor.updateNews(newsArray)
//            },
//            {
//
//            }
//        )
//    }
//
//    override fun ItemClick(items: News) {
//        val builder = CustomTabsIntent.Builder();
//        val customTabsIntent = builder.build();
//        customTabsIntent.launchUrl(this, Uri.parse(items.url));
//    }
}