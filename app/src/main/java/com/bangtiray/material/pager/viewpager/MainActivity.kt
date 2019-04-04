package com.bangtiray.material.pager.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bangtiray.material.pager.lib.util.init
import com.bangtiray.material.pager.viewpager.fragment.OneFragment
import com.bangtiray.material.pager.viewpager.fragment.ThreeFragment
import com.bangtiray.material.pager.viewpager.fragment.TwoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainToolbar.title="View Pager W/O adapter"

        mainPage.init(mainTabLayout){
            addPages("ONE",OneFragment())
            addPages("TWO", TwoFragment())
            addPages("Three", ThreeFragment())
        }
    }
}
