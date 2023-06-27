package com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.mapper.res;

import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.res.TraceabilityResDto;
import com.pragma.poweup.traceabilitymicroservice.domain.model.Traceability;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
unmappedTargetPolicy = ReportingPolicy.IGNORE,
unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ITraceabilityResMapper {
    List<TraceabilityResDto> toTraceabilityResDto(List<Traceability> traceabilityReqDto);
}
