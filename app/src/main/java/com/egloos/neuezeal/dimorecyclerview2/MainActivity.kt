package com.egloos.neuezeal.dimorecyclerview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var girlList = listOf<SampleModel>(
            SampleModel(R.drawable.img1, "딸기"),
            SampleModel(R.drawable.img2, "오렌지"),
            SampleModel(R.drawable.img3, "바나나"),
            SampleModel(R.drawable.img4, "석류"),
            SampleModel(R.drawable.img5, "키위"),
            SampleModel(R.drawable.img6, "레몬")
        )

        val adapter = SampleDataAdapter(girlList, R.layout.item_box_3)
        sampleListView.adapter = adapter

        sampleListView.layoutManager = StaggeredGridLayoutManager( 2, RecyclerView.VERTICAL)
    }
}
