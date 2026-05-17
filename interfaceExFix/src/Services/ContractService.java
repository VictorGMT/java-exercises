package Services;

import Entities.Contrato;
import Entities.Installment;

public class ContractService{
    private ServicoPagamento servicoPagamento;

    public ContractService(ServicoPagamento servicoPagamento) {
        this.servicoPagamento = servicoPagamento;
    }

    public void processContract(Contrato contrato, int parcelas) {

        double valorParcela = contrato.getTotalContrato()/ parcelas;
        for  (int i = 1; i <= parcelas; i++)
        {
            double interest = servicoPagamento.interests(valorParcela, i);
            double paymentFees = servicoPagamento.paymentFees(valorParcela + interest);
            double valorFinal = valorParcela + interest + paymentFees;
            contrato.getInstallments().add(new Installment(contrato.getDataContrato().plusMonths(i),valorFinal));

        }
    }

}
