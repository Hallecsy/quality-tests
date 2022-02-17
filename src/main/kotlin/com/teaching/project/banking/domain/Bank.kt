package com.teaching.project.banking.domain;

data class Bank(val accounts: MutableMap<String, Account> = mutableMapOf()) {

    fun register(account: Account) {
        accounts[account.iban] = account
        println("---------------")
        println("Ajout d'un compte : $account ")
        println("---------------")
    }

    fun transfer(sender: Account, receiver: Account, amount: Double) {}

    fun dashboard() {
        println("---------------")
        println("Liste de tous les comptes :")
        for (account in accounts)  {
            println(account)
        }
        println("---------------")
    }

}
