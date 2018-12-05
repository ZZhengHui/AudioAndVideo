package com.faith.myapplication.audio.musics

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.faith.myapplication.R
import kotlinx.android.synthetic.main.item_music_list.view.*

/**
 * Created by 00829bill on 2018/12/5.
 */
class MusicListAdapter(val context: Context, val datas: MutableList<String>, val listener: MusicListAdapter.OnItemClickListener) : RecyclerView.Adapter<MusicListAdapter.MusicListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): MusicListHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_music_list, parent, false)
        return MusicListHolder(view)
    }

    override fun onBindViewHolder(holder: MusicListHolder, position: Int) {
        holder.bindDatas(datas, listener)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    class MusicListHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindDatas(datas: MutableList<String>, listener: OnItemClickListener) {
            view.musicNameTv.text = datas[layoutPosition]
            view.setOnClickListener({
                listener.onItemClick(datas[layoutPosition])
            })
        }
    }

    interface OnItemClickListener {
        fun onItemClick(music: String)
    }

}