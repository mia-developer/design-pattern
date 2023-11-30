package behavioral.strategy;

import java.math.BigDecimal;

public interface TaxStrategy {

	BigDecimal getTaxRate();

	long calculate(final long amount);
}
