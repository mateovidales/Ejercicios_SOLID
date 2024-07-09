public class PaymentProcessor {
    private PaymentMethod paymentType;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentType = paymentMethod;
    }

    public void paymentProcess() {
        this.paymentType.paymentProcess();
    }
}

interface PaymentMethod {
    String paymentProcess();
}

class PaypalPayment implements PaymentMethod {
    @Override
    public String paymentProcess() {
        // logica para procesar el pago
        return "paypal";
    }

    public class CreditCardPayment implements PaymentMethod {
        @Override
        public String paymentProcess() {
            // logica para pago con tarjeta
            return "credit";
        }

    }

}