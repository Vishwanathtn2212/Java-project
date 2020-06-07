package org.vishwanath.java_spring_application.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/example/transactions")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @PostMapping("add")
    public void createTransaction(@RequestBody Transaction transaction) {
        transactionService.saveTransaction(transaction);
    }

    @GetMapping("fetchAll")
    public Iterable<Transaction> viewAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("fetch/{id}")
    public Transaction viewTransaction(@PathVariable Long id) {
        Optional<Transaction> transaction = transactionService.getTransaction(id);
        return transaction.get();
    }
}
