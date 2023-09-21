package com.mitre.attack.data.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KillChainPhases {

    @JsonProperty("kill_chain_name")
    private String killChainName;

    @JsonProperty("phase_name")
    private String phaseName;

}
