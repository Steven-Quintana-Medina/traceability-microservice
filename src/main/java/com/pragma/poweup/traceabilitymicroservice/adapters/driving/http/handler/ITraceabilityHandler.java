package com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.handler;

import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.req.TraceabilityReqDto;
import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.res.TraceabilityResDto;

import java.util.List;

public interface ITraceabilityHandler {
    void saveTraceability(TraceabilityReqDto traceabilityReqDto);
    void saveTraceability(String traceabilityJson);
    List<TraceabilityResDto> getTraceabilityToOrder(Long idClient, Long idOrder);
}
