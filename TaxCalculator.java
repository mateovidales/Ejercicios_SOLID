public class TaxCalculator {
    private TaxStrategy taxStrategy;

    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    public double calculateTax() {
        return this.taxStrategy.calculateTax();
    }

    interface TaxStrategy {
        double calculateTax();
    }

    class UsaTaxStrategy implements TaxStrategy {
        @Override
        public double calculateTax() {
            // logica para calcular impuesto usa
            return 0.1;
        }
    }

    class UkTaxStrategy implements TaxStrategy {
        @Override
        public double calculateTax() {
            // logica para calcular impuesto UK
            return 0.2;
        }
    }
}
