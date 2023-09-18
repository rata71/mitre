package com.mitre.attack.model;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "item_external_references")
@Getter
@Setter
public class ExternalReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "source_name")
    private String sourceName;

    @Column(name = "url")
    private String url;

    @Column(name = "external_id")
    private String externalId;

}
