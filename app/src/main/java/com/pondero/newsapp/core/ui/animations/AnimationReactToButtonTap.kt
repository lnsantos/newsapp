package com.pondero.newsapp.core.ui.animations

import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils

object AnimationReactToButtonTap {

    fun onTapAnimation(context: Context, view: View){
        view.startAnimation(AnimationUtils.loadAnimation(context,view.id))
    }

}