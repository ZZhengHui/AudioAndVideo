package com.faith.myapplication.audio

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.faith.myapplication.R
import kotlinx.android.synthetic.main.activity_start_audio.*


/**
 * Created by 00829bill on 2018/12/5.
 * 播放音频
 */
class StartAudioActivity : Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_audio)
        initView()
        initClick()
    }

    private fun initView() {

    }

    private fun initClick() {
        previousIv.setOnClickListener(this)
        startAndPauseIv.setOnClickListener(this)
        nextIv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.previousIv -> {    //上一首
                lastOne()
            }
            R.id.startAndPauseIv -> {   //播放或者暂停
                startOrPause()
            }
            R.id.nextIv -> {    //下一首
                nextOne()
            }
        }
    }

    private fun lastOne() {
        Toast.makeText(applicationContext, "上一首", Toast.LENGTH_SHORT).show()
    }

    private fun startOrPause() {
        Toast.makeText(applicationContext, if (startAndPauseIv.isSelected) "播放" else "暂停", Toast.LENGTH_SHORT).show()
        startAndPauseIv.isSelected = !startAndPauseIv.isSelected
    }

    private fun nextOne() {
        Toast.makeText(applicationContext, "下一首", Toast.LENGTH_SHORT).show()
    }
}