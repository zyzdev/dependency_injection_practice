package com.example.dependencyinjectionpractice.human

import com.example.dependencyinjectionpractice.car.BaseCar

enum class Gender{
    Male,Female
}
abstract class BaseHuman {
    abstract val name:String
    abstract var car:BaseCar
    abstract val gender:Gender
}