package com.mitre.attack.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_tactic_reference")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TacticRef {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "tactic_reference", columnDefinition = "VARCHAR(80)")
    private String tacticReference;

    public TacticRef(String reference) {
        this.tacticReference = reference;
    }
}
