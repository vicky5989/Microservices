package com.microserv.camel;

import com.microserv.camel.model.Request;


/**
 * Defines a contract that decouples client from the Apache Camel framework.
 */
public interface RequestCollectorGateway {

    void collectRequest(Request request);

}
