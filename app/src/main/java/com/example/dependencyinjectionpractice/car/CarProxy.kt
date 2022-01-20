package com.example.dependencyinjectionpractice.car

import kotlin.reflect.KClass

open class CarProxy<T : BaseCar>(type: KClass<T>) : CarFactory<T>(type), BaseCar {

    override fun launch() {
        baseCar.launch()
    }

    override fun flameout() {
        baseCar.flameout()
    }

    override fun straight() {
        baseCar.straight()
    }

    override fun reverse() {
        baseCar.reverse()
    }

    override fun turnRight() {
        baseCar.turnRight()
    }

    override fun turnLeft() {
        baseCar.turnLeft()
    }

    override fun speedUp() {
        baseCar.speedUp()
    }

    override fun slowDown() {
        baseCar.slowDown()
    }

    override fun turnOnHeadLight() {
        baseCar.turnOnHeadLight()
    }

    override fun turnOffHeadLight() {
        baseCar.turnOffHeadLight()
    }

}