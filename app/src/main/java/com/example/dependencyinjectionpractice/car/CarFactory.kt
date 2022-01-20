package com.example.dependencyinjectionpractice.car

import com.example.dependencyinjectionpractice.car.type.Sedan
import kotlin.reflect.KClass

abstract class CarFactory<T : BaseCar>(type: KClass<T>) {

    val baseCar: BaseCar

    init {
        baseCar = type.java.newInstance()
    }

}