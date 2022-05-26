package com.example.databinding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingConversion
import com.squareup.picasso.Picasso

@BindingAdapter("app:loadUrl")
fun loadImage(imageView: ImageView, url : String){
    Picasso.get().load(url).into(imageView);
}

@BindingConversion
fun getHobbies(list: List<String>) : String {
    val stringBuilder = StringBuilder()
    list.forEach {
        stringBuilder.append("$it ")
    }
    return stringBuilder.toString()
}