package br.com.lucao.ebac.classes.exercicios

class Veiculo {
   private var velocity: Long = 0
   private var acceleration: Long = 10
   var model: String = ""

   fun accelerationUp(){
      velocity += acceleration
   }

   fun accelerationDown(): Long{
      velocity -= acceleration
      if( velocity < 0){
         velocity = 0
      }
      return velocity
   }

   fun velocityNow(){
      println("Velocidade do veiculo é: ${this.velocity}")
   }

}