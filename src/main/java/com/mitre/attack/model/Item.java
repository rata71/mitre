package com.mitre.attack.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "item")
@Setter
@Getter
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "type")
  private String type;

  @Column(name = "created")
  private LocalDateTime created;

  @Column(name = "created_by_ref")
  private String createdByRef;

  @Column(name = "modified")
  private LocalDateTime modified;

  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @Column(name = "x_mitre_deprecated")
  private Boolean xMitreDeprecated;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "id")
  private List<ItemObject> xMitreVersion = new ArrayList<>();


  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "id")
  private List<ItemObject> xMitreModifiedByRef = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "id")
  private List<ItemObject> xMitreDomains = new ArrayList<>();


  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "id")
  private List<ItemObject> objectMarkingRefs = new ArrayList<>();


  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "id")
  private List<ExternalReference> externalReferences = new ArrayList<>();
}
