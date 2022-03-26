package modelo

class Persona {
     var nombre:String = ""
        get() = field
        set(value) {
            field = value
        }

     var edad:Int = 0
        get() = field
        set(value) {
            field = value
        }
     var cedula:String = ""
        get() = field
        set(value) {
            field = value
        }
     var peso:Double = 0.0
        get() = field
        set(value) {
            field = value
        }
     var sexo:Char = 'H'
        get() = field
        set(value) {
            field = value
        }
     var altura:Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    constructor(nombre:String?, edad:Int?, cedula:String?, peso:Double?, sexo:Char?, altura:Double?){
        if (nombre != null) {
            this.nombre = nombre
        }
        if (cedula != null) {
            this.cedula = cedula
        }
        if (edad != null) {
            this.edad = edad
        }
        if (peso != null) {
            this.peso = peso
        }
        if (altura != null) {
            this.altura = altura
        }
        if (sexo != null) {
            this.sexo = sexo
        }
    }

    constructor(nombre:String?, edad:Int?, sexo:Char?){
        if (nombre != null) {
            this.nombre = nombre
        }
        if (edad != null) {
            this.edad = edad
        }
        if (sexo != null) {
            this.sexo = sexo
        }
    }

    constructor()
}