package com.microserv.camel;

import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;

import com.microserv.camel.model.Request;

public class RequestCreator implements RequestCollectorGateway{
	
	@Produce(uri = "seda:newRequestChannel")
    ProducerTemplate producerTemplate;

	@Override
	public void collectRequest(Request request) {
		producerTemplate.sendBody(request);
	}

}
