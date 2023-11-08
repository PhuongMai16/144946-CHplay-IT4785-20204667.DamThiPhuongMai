package com.example.chplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list: ArrayList<store> = ArrayList<store>()

        var listApp: ArrayList<App> = ArrayList<App>()
        listApp.add(App("candycrush", R.drawable.so, 4.9))
        listApp.add(App("picachu", R.drawable.qua, 4.5))
        listApp.add(App("candycrush", R.drawable.so, 4.7))
        listApp.add(App("dao vang", R.drawable.qua, 4.8))
        list.add(store("Top games", listApp))


        var listApp1: ArrayList<App> = ArrayList<App>()
        listApp1.add(App("candycrush", R.drawable.so, 4.9))
        listApp1.add(App("picachu", R.drawable.qua, 4.5))
        listApp1.add(App("candycrush", R.drawable.so, 4.7))
        listApp1.add(App("dao vang", R.drawable.qua, 4.8))
        list.add(store("thinh hanh", listApp))

        var listApp2: ArrayList<App> = ArrayList<App>()
        listApp2.add(App("candycrush", R.drawable.so, 4.9))
        listApp2.add(App("picachu", R.drawable.qua, 4.5))
        listApp2.add(App("candycrush", R.drawable.so, 4.7))
        listApp2.add(App("dao vang", R.drawable.qua, 4.8))
        list.add(store("danh cho ban", listApp))

        var listApp3: ArrayList<App> = ArrayList<App>()
        listApp3.add(App("candycrush", R.drawable.so, 4.9))
        listApp3.add(App("picachu", R.drawable.qua, 4.5))
        listApp3.add(App("candycrush", R.drawable.so, 4.7))
        listApp3.add(App("dao vang", R.drawable.qua, 4.8))
        list.add(store("goi y ", listApp))

        var listApp4: ArrayList<App> = ArrayList<App>()
        listApp4.add(App("candycrush", R.drawable.so, 4.9))
        listApp4.add(App("picachu", R.drawable.qua, 4.5))
        listApp4.add(App("candycrush", R.drawable.so, 4.7))
        listApp4.add(App("dao vang", R.drawable.qua, 4.8))
        list.add(store(" he he", listApp))



        val customAdapter: StoreAdapter = StoreAdapter(list, this)

        val listView = findViewById<RecyclerView>(R.id.recyclerViewGroup)
        listView.adapter = customAdapter
        listView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )
    }


}