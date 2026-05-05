package Services;

import Entities.Contrato;

public interface ServicoPagamento {

    void parcelasContrato(Contrato contrato, int parcelas);

}
