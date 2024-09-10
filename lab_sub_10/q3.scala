object q3 {

  class Account(val accountNumber: String, initialBalance: Double) {
    private var balance: Double = initialBalance

    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
        println(
          s"Deposited $$${amount} into account $accountNumber. New balance: $$${balance}"
        )
      } else {
        println(
          s"Deposit amount must be positive. Provided amount: $$${amount}"
        )
      }
    }

    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
        println(
          s"Withdrew $$${amount} from account $accountNumber. New balance: $$${balance}"
        )
      } else if (amount > balance) {
        println(
          s"Insufficient funds in account $accountNumber. Available balance: $$${balance}"
        )
      } else {
        println(
          s"Withdrawal amount must be positive. Provided amount: $$${amount}"
        )
      }
    }

    def transfer(amount: Double, toAccount: Account): Unit = {
      if (amount > 0 && amount <= balance) {
        this.withdraw(amount)
        toAccount.deposit(amount)
        println(
          s"Transferred $$${amount} from account $accountNumber to account ${toAccount.accountNumber}."
        )
      } else if (amount > balance) {
        println(
          s"Insufficient funds in account $accountNumber to transfer $$${amount}. Available balance: $$${balance}"
        )
      } else {
        println(
          s"Transfer amount must be positive. Provided amount: $$${amount}"
        )
      }
    }

    def getBalance: Double = balance

    override def toString: String =
      s"Account Number: $accountNumber, Balance: $$${balance}"
  }

  def main(args: Array[String]): Unit = {
    val account1 = new Account("0073516329", 100000.0)
    val account2 = new Account("80012745178", 50000.0)

    println(account1)
    println(account2)

    account1.deposit(2000.0)
    account1.withdraw(1500.0)
    account1.transfer(3000.0, account2)

    println("Final Account States:")
    println(account1)
    println(account2)
  }
}