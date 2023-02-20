package model

/*
DATA CLASS är bra för oss för denna klass skall bara hålla DATA!

Kompilatorn ger automagiskt dessa metoder på properties i Primary Constructor, dvs name, inte inChargeOf listan kommer ingå i toString()

equals()/hashCode() pair

toString() of the form "User(name=John, age=42)"

componentN() functions corresponding to the properties in their order of declaration.

copy() function (see below).
 */

data class Tomte(val name: String) {
    // Blir inkapslad automagiskt, gör ej Kotlin private, då kommer vi ej åt inChargeOf listan
     val inChargeOf = mutableListOf<Tomte>()
}