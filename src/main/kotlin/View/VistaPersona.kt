package View

import controller.PersonaController
import modelo.Persona

class VistaPersona {
    var persona1: Persona
    var persona2: Persona
    var persona3: Persona
    var personaController: PersonaController

    constructor() {
        this.persona1 = Persona()
        this.persona2 = Persona()
        this.persona3 = Persona()
        this.personaController = PersonaController()
    }

    fun  menu(){
        println("==================================================")
        println("              COMPLETE LA INFORMACION             ")
        println("==================================================")
        println("Ingrese su nombre: ")
        var nombre : String? = readLine()
        println("Ingrese su edad: ")
        var edad: Int? = readLine()?.toInt()
        println("Ingrese su sexo: ")
        var sexo: String? = readLine()
        println("Ingrese su peso: ")
        var peso: Double? = readLine()?.toDouble()
        println("Ingrese su altura: ")
        var altura: Double? = readLine()?.toDouble()

        persona1= Persona(nombre, edad, "208160780", peso, sexo?.first(), altura)

        persona2= Persona(nombre, edad, sexo?.first())

        persona3= Persona()

        persona3.nombre = "Sofia"
        persona3.cedula = "208160780"
        persona3.edad = 21
        persona3.sexo = 'M'
        persona3.peso = 67.2
        persona3.altura = 1.65

        println("El peso de la persona 1 es: ")
        calcularPeso(persona1)
        println("El peso de la persona 2 es: ")
        calcularPeso(persona2)
        println("El peso de la persona 3 es: ")
        calcularPeso(persona3)

        println("La persona es: ")
        calcularEdad(persona1)
        println("La persona es: ")
        calcularEdad(persona2)
        println("La persona es: ")
        calcularEdad(persona3)

        println("==================================================")
        println("              INFORMACION PERSONA 1               ")
        println("==================================================")
        imprimirInfo(persona1)

        println("==================================================")
        println("              INFORMACION PERSONA 2               ")
        println("==================================================")
        imprimirInfo(persona2)

        println("==================================================")
        println("              INFORMACION PERSONA 3               ")
        println("==================================================")
        imprimirInfo(persona3)
    }

    fun calcularPeso(persona: Persona) {
        this.personaController = PersonaController(persona)
        if(this.personaController.calcularIMC() == -1){
            println("Esta por debajo de su peso ideal")
        }else if(this.personaController.calcularIMC() == 0){
            println("Esta por debajo de su peso ideal")
        }else{
            println("Esta en sobrepeso")
        }
    }

    fun imprimirInfo(persona: Persona) {
        this.personaController = PersonaController(persona)
        println(this.personaController.toString())
    }

    fun calcularEdad(persona: Persona) {
        this.personaController = PersonaController(persona)
        if(this.personaController.esMayorDeEdad() == true){
            println("Es mayor de edad")
        }else{
            println("Es menor de edad")
        }
    }
}