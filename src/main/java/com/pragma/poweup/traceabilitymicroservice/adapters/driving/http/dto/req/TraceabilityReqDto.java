package com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.req;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TraceabilityReqDto {
    @Schema(title = "idOrder", description = "client order id", example = "1")
    private Long idOrder;
    @Schema(title = "idClient", description = "client id", example = "4")
    private Long idClient;
    @Schema(title = "mainClient", description = "client email", example = "steven@gmail.com")
    private String mailClient;
    @Schema(title = "currentState", description = "current order status", example = "EN_PREPARACION")
    private String currentState;
    @Schema(title = "previousState", description = "previous order status", example = "PENDIENTE")
    private String previousState;
    @Schema(title = "idEmployee", description = "employee id", example = "3")
    private Long idEmployee;
    @Schema(title = "mailEmployee", description = "employee email", example = "steven2@gmail.com")
    private String mailEmployee;
}
