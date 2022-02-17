package com.teaching.project.banking.domain

data class Account(val iban: String, var balance: Double = 0.0) {

    init {
        // initialization
    }

    fun deposit(amount: Double) {
        balance += amount
        println("Dépot d'un montant de $amount€ par $iban")
    }

    fun withdraw(amount: Double) {
        balance -= amount
        println("Débit d'un montant de $amount€ par $iban")
    }

    fun transfer(receiver: Account, amount: Double) {
        balance -= amount
        receiver.deposit(amount)
        println("Transfert d'un montant de $amount€ par $iban à ${receiver.iban}")
    }

}