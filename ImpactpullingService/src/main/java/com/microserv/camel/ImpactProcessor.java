package com.microserv.camel;

import org.springframework.stereotype.Component;

import com.microserv.camel.model.Request;

/**
 * Endpoint that picks Payments from the system and dispatches them to the
 * service provided by bank.
 */
@Component
public class ImpactProcessor {


    public void processImpactsForRequest(Request request) {
        System.out.println("request>>>>>>");
    }

}