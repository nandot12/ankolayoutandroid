package com.example.nandoseptianhusni.ankolayoutandroid

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)


        CobaUi().setContentView(this)

    }


    class CobaUi : AnkoComponent<MainActivity> {
        override fun createView(ui: AnkoContext<MainActivity>)= with(ui) {
           // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.


            verticalLayout {

                textView {
                    text = "Kalkulator sederhana"
                    textColor = Color.BLACK
                    textSize = 16f
                    gravity = Gravity.CENTER
                }

                var input1 = editText {

                    hint = "Angka Pertama"
                }.lparams {
                    topMargin = 10
                    width = matchParent
                    height = wrapContent
                }

                var input2 = editText {
                    hint = "Anga Kedua"
                }

                linearLayout {
                    orientation = LinearLayout.HORIZONTAL
                    button {
                        text = "Kali"
                        width = matchParent
                        height = wrapContent
                        onClick {
                            //konvert nilai inputan 1
                            var convert1 = input1.text.toString().toDouble()
                            var convert2 = input2.text.toString().toDouble()

                            var hasil = convert1 * convert2
                            toast(hasil.toString())


                        }
                    }.lparams {
                        weight = 1F
                    }
                    button {
                        text = "Tambah"
                        width = matchParent
                        height = wrapContent
                        onClick {
                            //konvert nilai inputan 1
                            var convert1 = input1.text.toString().toDouble()
                            var convert2 = input2.text.toString().toDouble()

                            var hasil = convert1 + convert2
                            toast(hasil.toString())


                        }
                    }.lparams {
                        weight = 1F

                    }  }





            }

        }
    }
}
