package Services;

import Entities.Contrato;

public interface ServicoPagamento {

    double interests(double amount, int parcelas);
    double paymentFees(double amount);

}
