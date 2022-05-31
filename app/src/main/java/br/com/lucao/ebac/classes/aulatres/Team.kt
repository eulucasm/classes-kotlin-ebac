package br.com.lucao.ebac.classes.aulatres


class Team {
   var players: MutableList<Person> = mutableListOf()
   var name: String= ""

   fun getAllPlayerWithNameBiggerThan(size: Int): List<Person>{
      return this.players.filter{it ->
         it.name.length > size
      }
   }

   fun printAllPlayersEmailAndPhone(): Unit {
      this.players.forEach{player ->
         println(player.getEmailAndPhone())
      }
   }
}