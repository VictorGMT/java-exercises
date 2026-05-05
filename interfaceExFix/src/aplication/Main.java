package aplication;

import Entities.Contrato;
import Services.PagamentoService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite o numero do contrato: ");
        Integer nome = sc.nextInt();
        System.out.println("Digite a data do contrato(DD/MM/YYYY): ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);

        System.out.println("Digite o valor total do contrato: ");
        Double total = sc.nextDouble();

        Contrato contrato = new Contrato(nome, data, total);

        System.out.println("Digite a quantidade de parcelas: ");
        Integer numParcelas = sc.nextInt();

        System.out.println("Parcelas: ");
        contrato.getParcelasContrato(contrato, numParcelas);

    }
}
