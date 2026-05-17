package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate DataContrato;
    private double quantity;

    public Installment(LocalDate dataContrato, double quantity) {
        DataContrato = dataContrato;
        this.quantity = quantity;
    }

    public LocalDate getDataContrato() {
        return DataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        DataContrato = dataContrato;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return DataContrato.format(fmt) + " - " + String.format("%.2f", quantity);
    }
}
