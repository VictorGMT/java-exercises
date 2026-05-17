package Services;

import Entities.Contrato;

public class PaypalService implements ServicoPagamento{
    private final double FEE_PERCENTAGE = 0.02;
    private final double INTEREST_PERCENTAGE = 0.01;

    @Override
    public double interests(double amount, int parcelas)
    {
        return amount * INTEREST_PERCENTAGE * parcelas;
    }

    @Override
    public double paymentFees(double amount)
        {
         return amount * FEE_PERCENTAGE;
        }
}
