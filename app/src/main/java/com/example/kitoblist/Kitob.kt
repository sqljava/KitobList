package com.example.kitoblist

data class Kitob(var nomi:String, var rasm :Int, var avtor:String, var info : String,) : java.io.Serializable{
    var liked : Boolean = false
}