class BankAccount {
    int balance
    boolean openAcc
    
    // You cannot do any operations before you open the account.
    // An account opens with a balance of 0
    // You can reopen an account
    void open() {
        openAcc = true
    }

    // you cannot do any operations after you close the account
    void close() {
        openAcc = false
    }

    // this should increment the balance
    // you cannot deposit into a closed account
    // you cannot deposit a negative amount 
    void deposit(int amount) {
        if(openAcc &&  amount > 0) balance += amount
        else throw new Exception("Error. Either Account not opened or Amount to be deposited is negative!")
    }

    // this should decrement the balance
    // you cannot withdraw into a closed account
    // you cannot withdraw a negative amount 
    void withdraw(int amount) {
        if(openAcc && amount > 0 && amount <= balance) balance -= amount
        else throw new Exception("Error. Either Account not opened, Amount to be withdrawn is less than 0, or Amount to be withdrawn is greater than the balance of your account!")
    }

    // returns the current balance
    int getBalance() {
        if(openAcc) return balance
        else throw new Exception("Error. Account not opened!")
    }
}

