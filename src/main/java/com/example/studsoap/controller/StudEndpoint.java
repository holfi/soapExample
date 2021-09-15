package com.example.studsoap.controller;

import com.example.studsoap.schemas.ContactMos;
import com.example.studsoap.schemas.FindStudentMFCRequest;
import com.example.studsoap.schemas.FindStudentMFCResponse;
import com.example.studsoap.schemas.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;

@Endpoint
public class StudEndpoint {

    @Autowired
    ObjectFactory objectFactory;

    private static final String TARGET_NAMESPACE = "http://proxy.std.msr.com/schemas";

    @PayloadRoot(namespace = TARGET_NAMESPACE, localPart = "findStudentMFCRequest")
    @ResponsePayload
    public JAXBElement<FindStudentMFCResponse> getStudentMFCRequest(@RequestPayload FindStudentMFCRequest request) {
        System.out.println(request);

        FindStudentMFCResponse response = new FindStudentMFCResponse();
        response.setContact(new ContactMos());

        return objectFactory.createFindStudentMFCResponse(response);
    }

}
