package Services;

import Entities.Contrato;

public class Paypal implements ServicoPagamento {


    public void parcelasContrato(Contrato contrato, int parcelas) {

        double valorContrato = contrato.getTotalContrato()/ parcelas;
        for  (int i = 0; i < parcelas; i++)
        {

        }
    }
}
