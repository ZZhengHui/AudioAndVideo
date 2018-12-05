package com.faith.myapplication.audio.musics

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.faith.myapplication.R
import kotlinx.android.synthetic.main.dialog_music_list.*

/**
 * Created by 00829bill on 2018/12/5.
 * 音乐列表
 */
class MusicListDialog(context: Context) : Dialog(context) {

    private var musics: MutableList<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_music_list)
        initData()
        initView()
    }

    private fun initData() {
        musics = ArrayList()
        musics!!.add("music01")
        musics!!.add("music02")
        musics!!.add("music03")
        musics!!.add("music04")
    }

    private fun initView() {
        musicListRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        musicListRecycler.adapter = MusicListAdapter(context, musics!!, object : MusicListAdapter.OnItemClickListener {
            override fun onItemClick(music: String) {

            }
        })
    }
}