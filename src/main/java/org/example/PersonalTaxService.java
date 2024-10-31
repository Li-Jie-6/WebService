package org.example;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PersonalTaxService {
    @WebMethod
    double calculateTax(double income);
}

