package Entities;

import Services.ContractService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer NumContrato;
    private LocalDate dataContrato;
    private Double totalContrato;

    private List<Installment> installments = new ArrayList<>();

    public Contrato(Integer numContrato, LocalDate dataContrato, Double totalContrato) {
        NumContrato = numContrato;
        this.dataContrato = dataContrato;
        this.totalContrato = totalContrato;
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

    public List<Installment> getInstallments() {
        return installments;
    }

}
