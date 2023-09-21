package com.mitre.attack.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "item_external_references")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExternalReference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "source_name", columnDefinition = "VARCHAR(100)")
    private String sourceName;

    @Column(name = "url", columnDefinition = "TEXT")
    private String url;

    @Column(name = "external_id", columnDefinition = "VARCHAR(100)")
    private String externalId;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
}
