package com.example.dependencyinjectionpractice.human

import com.example.dependencyinjectionpractice.car.BaseCar
import com.example.dependencyinjectionpractice.car.CarProduct
import com.example.dependencyinjectionpractice.car.type.Van

class Alice : BaseHuman() {

    override val name: String
        get() = javaClass.simpleName
    override var car: BaseCar = CarProduct(Van::class)
    override val gender: Gender
        get() = Gender.Female

    override fun toString(): String {
        return "Alice(name='$name', car=$car, gender=$gender)"
    }

}