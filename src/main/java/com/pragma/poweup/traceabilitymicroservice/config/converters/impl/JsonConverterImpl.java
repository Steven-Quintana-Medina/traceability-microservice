package com.pragma.poweup.traceabilitymicroservice.config.converters.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pragma.poweup.traceabilitymicroservice.config.converters.IJsonConverter;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JsonConverterImpl implements IJsonConverter {
    private final static Logger logger = LoggerFactory.getLogger(JsonConverterImpl.class);
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Traceability toTraceabilityReqDto(String traceabilityJson) {
        try {
            return objectMapper.readValue(traceabilityJson, Traceability.class);
        }
        catch (JsonProcessingException e){
            logger.error("Error al serializar el objeto JSON: " + e.getMessage());
        }
        return null;
    }
}
