package com.example.categoriessubcategories

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private val lala: Categories = arrayOf(A, B, C, D, E, F, G, H, I, J, K)
//    private val lalala: Array<Array<IntArray>> = arrayOf(A, B, C, D, E, F, G, H, I, J, K)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        list.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(this@MainActivity, RecyclerView.VERTICAL))
        }


        sort.setOnClickListener {
            list.apply {
                adapter = ArrayAdapter(categories1.sortedBy { it.subcategories.size })
            }
        }

        reset.setOnClickListener {
            list.apply {
                adapter = ArrayAdapter(categories2)
            }

        }

    }


    companion object {

        val a = listOf(2)
        val b = listOf(1, 3, 5, 6)
        val d = listOf(1, 3, 7)
        val f = listOf(0, 3)
        val g = listOf(1, 3, 5, 6, 5, 4)
        val h = listOf(1)
        val i = listOf(1, 3, 5, 6, 7, 8, 9)
        val j = listOf(1, 3, 0)

        val k = listOf("arjun", "manoj", "iamawesome", "alwaysbaked")
        val l = listOf("arjun", "iamawesome", "alwaysbaked")
        val m = listOf("arjun", "manoj", "alwaysbaked")
        val n = listOf("manoj", "iamawesome", "alwaysbaked")

        val Aa = listOf(a, b, d, f, g, h, i, j)
        val Bb = listOf(a, b, d, f, g, h, i)
        val Cc = listOf(a, b, d, f, g, h)
        val Dd = listOf(a, b, d, h, i, j)
        val Ee = listOf(a, b, f, g, h, i, j)

        val Ff = listOf(f, g, k, l, m, n)
        val Gg = listOf(k, l, n, f, g, h, i, j, f, d, k ,d, m)
        val Hh = listOf(a, b, g, h, i, j)
        val Ii = listOf(a, k, l)
        val Jj = listOf(k, l, m, n)
        val Kk = listOf(k, n, j, l, m)

        val categories1 : List<Categories> = listOf(
                Categories(Gg),
                Categories(Ff),
                Categories(Hh),
                Categories(Ii),
                Categories(Jj),
                Categories(Kk),
                Categories(Aa)
        )

        val categories2 : List<Categories> = listOf(
                Categories(Gg),
                Categories(Ff),
                Categories(Hh),
                Categories(Ii),
                Categories(Jj),
                Categories(Kk),
                Categories(Aa)
        )
    }
}
