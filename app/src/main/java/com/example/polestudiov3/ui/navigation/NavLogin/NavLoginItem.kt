package com.example.polestudiov3.ui.navigation.NavLogin

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavArgs
import androidx.navigation.NavType

sealed class NavLoginItem(
    val baseUrl:String,
    val navArgs: List<NavArgs> = emptyList()
) {
}
enum class NavArgs(val key:String, val navType: NavType<*>){

}