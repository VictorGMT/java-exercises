package Entities;

import Services.PagamentoService;

import java.time.LocalDate;

public class Contrato {
    private Integer NumContrato;
    private LocalDate dataContrato;
    private Double totalContrato;

    private PagamentoService ps = new PagamentoService();

    public Contrato(Integer numContrato, LocalDate dataContrato, Double totalContrato) {
        NumContrato = numContrato;
        this.dataContrato = dataContrato;
        this.totalContrato = totalContrato;
    }

    public void getParcelasContrato(Contrato contrato, int parcelas) {
        ps.parcelasContrato(contrato, parcelas);
    }

    public Integer getNumContrato() {
        return NumContrato;
    }


    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public Double getTotalContrato() {
        return totalContrato;
    }

}
