package com.example.dependencyinjectionpractice.car

import android.util.Log
import com.example.dependencyinjectionpractice.car.BaseCar

open class CarBaseImpl : BaseCar {

    val dTag: String = javaClass.simpleName

    override fun launch() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun flameout() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun straight() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun reverse() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun turnRight() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun turnLeft() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun speedUp() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun slowDown() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun turnOnHeadLight() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun turnOffHeadLight() {
        val methodName = Throwable().stackTrace[0].methodName
        Log.d(dTag, methodName)
    }

    override fun toString(): String {
        return dTag
    }


}