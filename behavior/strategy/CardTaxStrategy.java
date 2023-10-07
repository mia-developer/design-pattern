package behavior.strategy;

import java.math.BigDecimal;

public class CardTaxStrategy implements TaxStrategy {

	private final BigDecimal taxRate = BigDecimal.valueOf(0.1);

	@Override
	public BigDecimal getTaxRate() {
		return this.taxRate;
	}

	@Override
	public long calculate(final long amount) {
		return BigDecimal.valueOf(amount).multiply(this.getTaxRate()).longValue();
	}
}
