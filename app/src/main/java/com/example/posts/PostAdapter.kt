package com.example.posts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(var context:Context, var postList:List<Posts>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.activity_post_review,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentpost=postList.get(position)
//        holder.tvuserid.text= currentpost.userId.toString()
//        holder.tvid.text= currentpost.id.toString()
        holder.tvtitle.text= currentpost.title.toString()
        holder.tvbody.text= currentpost.body.toString()


    }

    override fun getItemCount(): Int {
        return postList.size
    }

}
class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvuserid=itemView.findViewById<TextView>(R.id.tvuserid)
    var tvid=itemView.findViewById<TextView>(R.id.tvid)
    var tvtitle=itemView.findViewById<TextView>(R.id.tvtitle)
    var tvbody=itemView.findViewById<TextView>(R.id.tvbody)


}
