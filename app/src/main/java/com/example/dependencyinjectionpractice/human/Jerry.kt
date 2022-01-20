package com.example.dependencyinjectionpractice.human

import com.example.dependencyinjectionpractice.car.BaseCar
import com.example.dependencyinjectionpractice.car.CarProduct
import com.example.dependencyinjectionpractice.car.type.Mpv

class Jerry : BaseHuman() {

    override val name: String
        get() = javaClass.simpleName
    override var car: BaseCar = CarProduct(Mpv::class)
    override val gender: Gender
        get() = Gender.Male

    override fun toString(): String {
        return "Jerry(name='$name', car=$car, gender=$gender)"
    }
}