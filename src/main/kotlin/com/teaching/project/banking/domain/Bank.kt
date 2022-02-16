package com.teaching.project.banking.domain;

data class Bank(val accounts: MutableMap<String, Account> = mutableMapOf()) {

    fun register(account: Account) = accounts.put(account.iban, account)

    fun transfer(sender: Account, receiver: Account, amount: Double) = sender.transfer(receiver, amount)

    fun dashboard() = accounts.values.map { it.toString() }

}
