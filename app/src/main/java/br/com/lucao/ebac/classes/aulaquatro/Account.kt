package br.com.lucao.ebac.classes.aulaquatro

import kotlin.random.Random

class Account(name: String) {
   private var balance: Double
   var nameAccount: String
   private var id: Int
   var addres: String

   init {
      this.nameAccount = name
      this.balance = 0.0
      this.addres = ""
      this.id = Random.nextInt(0, 160000)
   }

   fun getBalance() = this.balance

   fun print(){
      println("saldo: ${this.balance}, name: ${this.nameAccount}, address: ${this.addres}, id: ${this.id}")
   }

   fun deposit(amount: Double){
      balance += amount
   }

   fun checkout(amount: Double): Double{
      balance -= amount
      if(balance < 0){
         balance = 0.0
      }
      return balance
   }
}

fun main() {

   val account = Account("Lucas")
   account.print()
   println(account.getBalance())

   account.deposit(100.0)
   println(account.getBalance())

   account.checkout(20.0)
   println(account.getBalance())

   account.deposit(30.0)
   println(account.getBalance())

   account.checkout(100.0)
   println(account.getBalance())
}
