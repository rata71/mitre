package com.mitre.attack.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Definition {

    @JsonProperty("statement")
    private String statement;

}
