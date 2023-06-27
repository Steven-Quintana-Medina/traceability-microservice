package com.pragma.poweup.traceabilitymicroservice.config.converters;

import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;

public interface IJsonConverter {
    Traceability toTraceabilityReqDto(String traceabilityJson);

}
