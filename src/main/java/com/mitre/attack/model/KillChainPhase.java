package com.mitre.attack.model;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "item_kill_chain_phases")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KillChainPhase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "kill_chain_name")
    private String killChainName;

    @Column(name = "phase_name")
    private String phaseName;

}
