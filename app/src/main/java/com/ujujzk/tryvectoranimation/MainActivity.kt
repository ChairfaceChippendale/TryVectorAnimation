package com.ujujzk.tryvectoranimation

import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.vectordrawable.graphics.drawable.Animatable2Compat
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//
//        AnimatedVectorDrawableCompat.create(this, R.drawable.ic_file_download_animated_black_24dp)?.also {
//            it.registerAnimationCallback(object : Animatable2Compat.AnimationCallback(){
//                override fun onAnimationEnd(drawable: Drawable?) {
//                    icon.postDelayed(
//                        { it.start() },
//                        500
//                    )
//                }
//            })
//            icon.setImageDrawable(it)
//        }?.start()




        AnimatedVectorDrawableCompat.create(this, R.drawable.ic_file_download_animated_2_black_24dp)?.also {
            it.registerAnimationCallback(object : Animatable2Compat.AnimationCallback(){
                override fun onAnimationEnd(drawable: Drawable?) {
                    icon.postDelayed(
                        { it.start() },
                        500
                    )
                }
            })
            icon.setImageDrawable(it)
        }?.start()



    }
}
