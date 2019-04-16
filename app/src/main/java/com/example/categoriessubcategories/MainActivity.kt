package com.example.categoriessubcategories

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val lala: Array<Array<IntArray>> = arrayOf(A, B, C, D, E, F, G, H, I, J, K)
    private val lalala: Array<Array<IntArray>> = arrayOf(A, B, C, D, E, F, G, H, I, J, K)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.apply {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            addItemDecoration(DividerItemDecoration(this@MainActivity, RecyclerView.VERTICAL))
        }


        sort.setOnClickListener {
            lalala.sortBy { it.size }

            list.apply {
                adapter = ArrayAdapter(lalala)
            }
        }

        reset.setOnClickListener {
            list.apply {
                adapter = ArrayAdapter(lala)
            }

        }

    }


    companion object {

        val a: IntArray = intArrayOf(2)
        val b: IntArray = intArrayOf(1, 3, 5, 6)
        val d: IntArray = intArrayOf(1, 3, 7)
        val f: IntArray = intArrayOf(0, 3)
        val g: IntArray = intArrayOf(1, 3, 5, 6, 5, 4)
        val h: IntArray = intArrayOf(1)
        val i: IntArray = intArrayOf(1, 3, 5, 6, 7, 8, 9)
        val j: IntArray = intArrayOf(1, 3, 0)

        val A: Array<IntArray> = arrayOf(a, b, d, f, g, h, i, j)
        val B: Array<IntArray> = arrayOf(a, b, d, f, g, h, i)
        val C: Array<IntArray> = arrayOf(a, b, d, f, g, h)
        val D: Array<IntArray> = arrayOf(a, b, d, h, i, j)
        val E: Array<IntArray> = arrayOf(a, b, f, g, h, i, j)
        val F: Array<IntArray> = arrayOf(f, g, h, i, j)
        val G: Array<IntArray> = arrayOf(a, d, f, g, h, i, j)
        val H: Array<IntArray> = arrayOf(a, b, g, h, i, j)
        val I: Array<IntArray> = arrayOf(a, b, g)
        val J: Array<IntArray> = arrayOf(a, h, i, j)
        val K: Array<IntArray> = arrayOf(a, b, h, i, j)

    }
}
