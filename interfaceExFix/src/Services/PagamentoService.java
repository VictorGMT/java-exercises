package Services;

import Entities.Contrato;

public class PagamentoService implements ServicoPagamento {


    public void parcelasContrato(Contrato contrato, int parcelas) {

        double valorParcela = contrato.getTotalContrato()/ parcelas;
        for  (int i = 1; i < parcelas + 1; i++)
        {
            double valorComJuros = valorParcela + (valorParcela * 0.01 * i);
            valorComJuros += valorComJuros * 0.02;
            System.out.println(contrato.getDataContrato().plusMonths(i) + " - " +  valorComJuros);
        }
    }
}
