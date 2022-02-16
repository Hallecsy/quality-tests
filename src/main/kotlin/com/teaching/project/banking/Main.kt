package com.teaching.project.banking

import com.teaching.project.banking.domain.Account
import com.teaching.project.banking.domain.Bank

fun main() {

    val account1 = Account("iban1", 100.00)
    val account2 = Account("iban2", 150.00)

    val bank = Bank(
        mutableMapOf(
            "iban1" to account1,
            "iban2" to account2
        )
    )

    val account3 = Account("iban3", 1_500_000.00)
    bank.register(account3)

    account1.deposit(16.00)
    account1.transfer(account2, 15.00)

    account3.withdraw(1_500.0)

    bank.dashboard()

}
