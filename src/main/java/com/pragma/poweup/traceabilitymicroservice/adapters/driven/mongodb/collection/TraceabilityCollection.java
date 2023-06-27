package com.pragma.poweup.traceabilitymicroservice.adapters.driven.mongodb.collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

@Document("traceability")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TraceabilityCollection {
    @MongoId
    private String _id;
    private Long idOrder;
    private Long idClient;
    private String mailClient;
    private LocalDateTime date;
    private String currentState;
    private String previousState;
    private Long idEmployee;
    private String mailEmployee;
}
