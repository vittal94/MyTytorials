package com.example.dataclass

import org.junit.Test
class Test {
    private fun example1(){
        val list = mutableListOf<Example1>()
        list.add(Example1("gul",25))
        list.add(Example1("fuc",22))

        list.forEach{ println(it.name)}
         val example1 = Example1("ds",4)
        example1.id = 45
        val copy = example1.copy(name = "sd",age = 56)
        val myCopy = example1.copy(name = "f",age = 6,89)
        val (id) = myCopy // using destructing declaration to extract id property from myCopy
        println(id)

        println(copy.toString())
        println(myCopy.id)

    }

    private fun destructingDeclaration() {
        val example1 = Example1("n",56)
        val (name, age) = example1

        println("$name $age")
    }
    @Test
    fun test() {
    //example1()
        destructingDeclaration()
    }
}