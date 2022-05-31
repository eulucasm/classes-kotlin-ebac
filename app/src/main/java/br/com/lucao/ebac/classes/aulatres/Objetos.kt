package br.com.lucao.ebac.classes.aulatres

class Objetos {}

fun main (){
   val aluno = Person()
   val aluno2: Person = Person()
   val copiaAluno = aluno

   aluno.name = "lucas"
   aluno.phone = "9999999999"
   aluno.email = "aluno@mail.com"
   aluno.age = 30
   aluno.cpf = "321654987"
   aluno.printGreetings("olá")

   aluno2.name = "joana"
   aluno2.phone = "9999999998"
   aluno2.email = "aluno2@mail.com"
   aluno2.age = 10
   aluno2.cpf = "789456132"
   aluno2.printGreetings("Olá")

   copiaAluno.printGreetings("Olá")

   var palmeiras = Team()
   palmeiras.name = "Palmeiras"
   palmeiras.players.add(aluno)
   palmeiras.players.add(aluno2)
   palmeiras.players.add(copiaAluno)
   palmeiras.printAllPlayersEmailAndPhone()

}