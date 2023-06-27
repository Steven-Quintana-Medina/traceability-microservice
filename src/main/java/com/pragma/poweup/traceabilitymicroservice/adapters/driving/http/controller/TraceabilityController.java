package com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.controller;

import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.dto.res.TraceabilityResDto;
import com.pragma.poweup.traceabilitymicroservice.adapters.driving.http.handler.ITraceabilityHandler;
import com.pragma.poweup.traceabilitymicroservice.config.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/traceability/")
@RequiredArgsConstructor
@Tag(name = "Traceability", description = "endpoints related to traceability")
public class TraceabilityController {
    private final ITraceabilityHandler iTraceabilityHandler;
    @Operation(summary ="Create traceability of an order",
            responses = {
            @ApiResponse(responseCode = "201", description = Constants.TRACEABILITY_CREATED_MESSAGE,
                    content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),
            @ApiResponse(responseCode = "409", description = Constants.TRACEABILITY_ALREADY_EXITS_MESSAGE,
                    content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
    })
    @PostMapping()
    public ResponseEntity<Map<String,String>> saveTraceability(@RequestBody String traceabilityJson){
        iTraceabilityHandler.saveTraceability(traceabilityJson);
        return ResponseEntity.status(HttpStatus.CREATED).body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY,Constants.TRACEABILITY_CREATED_MESSAGE));
    }

    @Operation(summary ="Create traceability of an order",
            responses = {
                    @ApiResponse(responseCode = "201", description = Constants.TRACEABILITY_CREATED_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Message"))),
                    @ApiResponse(responseCode = "409", description = Constants.TRACEABILITY_ALREADY_EXITS_MESSAGE,
                            content = @Content(mediaType = "application/json", schema = @Schema(ref = "#/components/schemas/Error")))
            })
    @GetMapping()
    public ResponseEntity<List<TraceabilityResDto>> getTraceabilityOrder(@RequestParam Long idClient, @RequestParam Long idOrder){
        return ResponseEntity.ok(iTraceabilityHandler.getTraceabilityToOrder(idClient,idOrder));
    }
}
