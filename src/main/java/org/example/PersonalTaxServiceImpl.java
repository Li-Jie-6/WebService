package org.example;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.PersonalTaxService")
public class PersonalTaxServiceImpl implements PersonalTaxService {

    @Override
    public double calculateTax(double income) {
        double tax = 0;
        if (income <= 5000) {
            tax = income * 0.03;
        } else if (income <= 20000) {
            tax = 5000 * 0.03 + (income - 5000) * 0.1;
        } else {
            tax = 5000 * 0.03 + 15000 * 0.1 + (income - 20000) * 0.2;
        }
        return tax;
    }
}
