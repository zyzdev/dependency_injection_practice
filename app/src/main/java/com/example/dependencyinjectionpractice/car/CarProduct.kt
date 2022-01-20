package com.example.dependencyinjectionpractice.car

import kotlin.reflect.KClass

class CarProduct<T : BaseCar>(type: KClass<T>) : CarProxy<T>(type) {
    override fun toString(): String {
        return baseCar.toString()
    }
}

