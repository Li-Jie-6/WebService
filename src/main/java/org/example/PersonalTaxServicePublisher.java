package org.example;

import javax.xml.ws.Endpoint;

public class PersonalTaxServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/personaltaxservice/?wsdl";
        Endpoint.publish(url, new PersonalTaxServiceImpl());
        System.out.println("Service is published at " + url);
    }
}
