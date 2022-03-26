package controller

import modelo.Persona

class PersonaController {

    lateinit var persona: Persona

    constructor(persona: Persona){
        this.persona = persona
    }

    constructor()

    fun calcularIMC(): Int {
        var pesoIdeal = (this.persona.peso / Math.pow(this.persona.altura.toDouble(),2.0))
        if(this.persona.peso < pesoIdeal){
            return -1;
        } else if(this.persona.peso.toDouble() == pesoIdeal){
            return 0;
        }else{
            return 1;
        }
    }

    fun esMayorDeEdad(): Boolean {
        if(persona.edad > 18){
            return true;
        }else{
            return false;
        }
    }

    fun comprobarSexo(sexo: Char) {
        if(sexo == 'H' || sexo == 'M'){
            this.persona.sexo = sexo
        }else{
            this.persona.sexo = 'H'
        }
    }

    override fun toString(): String {
        return "Persona(nombre='${this.persona.nombre}', edad=${this.persona.edad}, cedula='${this.persona.cedula}', peso=${this.persona.peso}, sexo=${this.persona.sexo}, altura=${this.persona.altura})"
    }
}