package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface FruitTransactionService {
    List<FruitTransaction> getFruitTransactions(List<String> transactions);
}