package br.com.lucao.ebac.classes.aulatres


class Person {
   var name: String = ""
   var age: Int = 0
   var email: String = ""
   var phone: String = ""
   var cpf: String = ""

   fun getEmailAndPhone(): String {
      return "Email: ${this.email} and phone: ${this.phone}"
   }

   fun printGreetings(hello: String) {
      println("$hello ${this.name}")
   }

   fun isOlderThan(targetAge: Int): Boolean {
      return this.age > targetAge
   }
}
