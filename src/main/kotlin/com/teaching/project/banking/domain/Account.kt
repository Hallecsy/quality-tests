package com.teaching.project.banking.domain

data class Account(val iban: String, var balance: Double = 0.0) {

    init {
        // initialization
        if (!Regex("^FR[0-9]{25}")
                .matches(iban)
        )
            throw RuntimeException("$iban is not a valid iban")
    }

    fun deposit(amount: Double) {
        balance += amount
    }

    fun withdraw(amount: Double) {
        balance -= amount
    }

    fun transfer(receiver: Account, amount: Double) {
        receiver.deposit(amount)
        withdraw(amount)
    }

}