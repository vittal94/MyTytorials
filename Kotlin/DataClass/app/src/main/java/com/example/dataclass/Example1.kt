package com.example.dataclass

data class Example1(var name: String, var age: Int) {
    var id: Int = 0 // this property is used outside toString equals  hashcode and copy

    //you can create your own copy function
    fun copy(name: String,age: Int,id: Int) = Example1(name, age).apply {
        this.id = id
    }

    //you can explicitly implement equals, hashcode etc...
//    override fun equals(other: Any?): Boolean {
//        return super.equals(other)
//    }
}