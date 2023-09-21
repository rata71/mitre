package com.mitre.attack.model;

import com.mitre.attack.data.dto.KillChainPhases;
import com.mitre.attack.data.dto.Objects;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item")
@Setter
@Getter
@NoArgsConstructor
public class Item {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "item_id")
  private Long itemId;

  @Column(name = "object_id", columnDefinition = "VARCHAR(100)")
  private String objectId;

  @Column(name = "type", columnDefinition = "VARCHAR(100)")
  private String type;

  @Column(name = "created", columnDefinition = "VARCHAR(24)")
  private String created;

  @Column(name = "created_by_ref", columnDefinition = "VARCHAR(100)")
  private String createdByRef;

  @Column(name = "modified", columnDefinition = "VARCHAR(24)")
  private String modified;

  @Column(name = "name", columnDefinition = "VARCHAR(100)")
  private String name;

  @Column(name = "description", columnDefinition = "TEXT")
  private String description;

  @Column(name = "x_mitre_deprecated", columnDefinition = "TINYINT")
  private Boolean xMitreDeprecated;

  @Column(name = "x_mitre_version", columnDefinition = "VARCHAR(5)")
  private String xMitreVersion;

  @Column(name = "x_mitre_modified_by_ref", columnDefinition = "VARCHAR(100)")
  private String xMitreModifiedByRef;

  @Column(name = "revoked", columnDefinition = "TINYINT")
  private Boolean revoked;

  @Column(name = "x_mitre_shortname", columnDefinition = "VARCHAR(100)")
  private String xMitreShortname;

  @Column(name = "x_mitre_detection", columnDefinition = "TEXT")
  private String xMitreDetection;

  @Column(name = "x_mitre_is_subtechnique", columnDefinition = "TINYINT")
  private Boolean xMitreIsSubtechnique;

  @Column(name = "x_mitre_remote_support", columnDefinition = "TINYINT")
  private Boolean xMitreRemoteSupport;

  @Column(name = "x_mitre_network_requirements")
  private Boolean xMmitreNetworkRequirements;

  @Column(name = "relationship_type")
  private String relationshipType;

  @Column(name = "source_ref")
  private String sourceRef;

  @Column(name = "target_ref")
  private String targetRef;

  @Column(name = "first_seen")
  private String firstSeen;

  @Column(name = "last_seen")
  private String lastSeen;

  @Column(name = "x_mitre_first_seen_citation")
  private String xMitreFirstSeenCitation;

  @Column(name = "x_mitre_last_seen_citation")
  private String xMitreLastSeenCitation;

  @Column(name = "x_mitre_data_source_ref")
  private String xMitreDataSourceRef;

  @Column(name = "identity_class")
  private String identityClass;

  @Column(name = "definition_type")
  private String definitionType;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreSystemRequirements;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreImpactType;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreEffectivePermissions;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> aliases;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreCollectionLayers;

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<TacticRef> tacticRefs = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreDomains = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> objectMarkingRefs = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ExternalReference> externalReferences = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitrePlatforms = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreAliases = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> labels = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreContributors = new ArrayList<>();

  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<KillChainPhase> killChainPhases = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreDataSources = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitreDefenseBypassed = new ArrayList<>();

  @JoinTable
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "item_id")
  private List<ItemObject> xMitrePermissionsRequired = new ArrayList<>();

  public Item(Objects objects) {
    this.objectId = objects.getId();
    this.type = objects.getType();
    this.created = objects.getCreated();
    this.createdByRef = objects.getCreatedByRef();
    this.modified = objects.getModified();
    this.name = objects.getName();
    this.description = objects.getDescription();
    this.xMitreDeprecated = objects.getXMitreDeprecated();
    this.xMitreVersion = objects.getXMitreVersion();
    this.xMitreModifiedByRef = objects.getXMitreModifiedByRef();
    this.xMitreShortname = objects.getXMitreShortname();
    this.xMitreDetection = objects.getXMitreDetection();
    this.xMitreIsSubtechnique = objects.getXMitreIsSubtechnique();
    this.xMitreRemoteSupport = objects.getXMitreRemoteSupport();

    this.xMmitreNetworkRequirements = objects.getXMmitreNetworkRequirements();
    this.relationshipType = objects.getRelationshipType();
    this.sourceRef = objects.getSourceRef();
    this.targetRef = objects.getTargetRef();
    this.firstSeen = objects.getFirstSeen();
    this.lastSeen = objects.getLastSeen();
    this.xMitreFirstSeenCitation = objects.getXMitreFirstSeenCitation();
    this.xMitreLastSeenCitation = objects.getXMitreLastSeenCitation();
    this.xMitreDataSourceRef = objects.getXMitreDataSourceRef();
    this.identityClass = objects.getIdentityClass();
    this.definitionType = objects.getDefinitionType();

    buildTacticRefsFromJSon(objects.getTacticsRefs());

    buildXMitreDomainsFromJSon(objects.getXMitreDomains());

    buildObjectMarkingRefsFromJSon(objects.getObjectMarkingRefs());

    buildExternalReferencesFromJSon(objects.getExternalReferences());

    buildXMitrePlatformsFromJSon(objects.getXMitrePlatforms());

    buildXMitreAliasesFromJSon(objects.getXMitreAliases());

    buildLabelsFromJSon(objects.getLabels());

    buildXMitreContributorsFromJSon(objects.getXMitreContributors());

    buildKillChainPhasesFromJSon(objects.getKillChainPhases());

    buildXMitreDataSourcesFromJSon(objects.getXMitreDataSources());

    buildXMitreDefenseBypassedFromJSon(objects.getXMitreDefenseBypassed());

    buildXMitrePermissionsRequiredFromJSon(objects.getXMitrePermissionsRequired());

    buildXMitreSystemRequirementsFromJSon(objects.getXMitreSystemRequirements());
    buildXMitreImpactTypeFromJSon(objects.getXMitreImpactType());
    buildXMitreEffectivePermissionsFromJSon(objects.getXMitreEffectivePermissions());
    buildAliasesFromJSon(objects.getAliases());
    buildXMitreCollectionLayersFromJSon(objects.getXMitreCollectionLayers());
  }

  private void buildXMitreCollectionLayersFromJSon(List<String> xMitreCollectionLayers) {
    this.xMitreCollectionLayers = new ArrayList<>();
    if (xMitreCollectionLayers == null) return;
    xMitreCollectionLayers.forEach(mds -> this.xMitreCollectionLayers.add(new ItemObject(mds)));
  }

  private void buildAliasesFromJSon(List<String> aliases) {
    this.aliases = new ArrayList<>();
    if (aliases == null) return;
    aliases.forEach(mds -> this.aliases.add(new ItemObject(mds)));
  }

  private void buildXMitreEffectivePermissionsFromJSon(List<String> xMitreEffectivePermissions) {
    this.xMitreEffectivePermissions = new ArrayList<>();
    if (xMitreEffectivePermissions == null) return;
    xMitreEffectivePermissions.forEach(
        mds -> this.xMitreEffectivePermissions.add(new ItemObject(mds)));
  }

  private void buildXMitreImpactTypeFromJSon(List<String> xMitreImpactType) {
    this.xMitreImpactType = new ArrayList<>();
    if (xMitreImpactType == null) return;
    xMitreImpactType.forEach(mds -> this.xMitreImpactType.add(new ItemObject(mds)));
  }

  private void buildXMitreSystemRequirementsFromJSon(List<String> xMitreSystemRequirements) {
    this.xMitreSystemRequirements = new ArrayList<>();
    if (xMitreSystemRequirements == null) return;
    xMitreSystemRequirements.forEach(mds -> this.xMitreSystemRequirements.add(new ItemObject(mds)));
  }

  private void buildXMitrePermissionsRequiredFromJSon(List<String> xMitrePermissionsRequired) {
    this.xMitrePermissionsRequired = new ArrayList<>();
    if (xMitrePermissionsRequired == null) return;
    xMitrePermissionsRequired.forEach(
        mds -> this.xMitrePermissionsRequired.add(new ItemObject(mds)));
  }

  private void buildXMitreDefenseBypassedFromJSon(List<String> xMitreDefenseBypassed) {
    this.xMitreDefenseBypassed = new ArrayList<>();
    if (xMitreDefenseBypassed == null) return;
    xMitreDefenseBypassed.forEach(mds -> this.xMitreDefenseBypassed.add(new ItemObject(mds)));
  }

  private void buildXMitreDataSourcesFromJSon(List<String> xMitreDataSources) {
    this.xMitreDataSources = new ArrayList<>();
    if (xMitreDataSources == null) return;
    xMitreDataSources.forEach(mds -> this.xMitreDataSources.add(new ItemObject(mds)));
  }

  private void buildKillChainPhasesFromJSon(List<KillChainPhases> killChainPhases) {
    this.killChainPhases = new ArrayList<>();
    if (killChainPhases == null) return;
    killChainPhases.forEach(
        er ->
            this.killChainPhases.add(
                KillChainPhase.builder()
                    .killChainName(er.getKillChainName())
                    .phaseName(er.getPhaseName())
                    .build()));
  }

  private void buildXMitreContributorsFromJSon(List<String> xMitreContributors) {
    this.xMitreContributors = new ArrayList<>();
    if (xMitreContributors == null) return;
    xMitreContributors.forEach(mc -> this.xMitreContributors.add(new ItemObject(mc)));
  }

  private void buildXMitreAliasesFromJSon(List<String> xMitreAliases) {
    this.xMitreAliases = new ArrayList<>();
    if (xMitreAliases == null) return;
    xMitreAliases.forEach(ma -> this.xMitreAliases.add(new ItemObject(ma)));
  }

  private void buildLabelsFromJSon(List<String> labels) {
    this.labels = new ArrayList<>();
    if (labels == null) return;
    labels.forEach(label -> this.labels.add(new ItemObject(label)));
  }

  private void buildTacticRefsFromJSon(List<String> tacticsRefs) {
    this.tacticRefs = new ArrayList<>();
    if (tacticsRefs == null) return;
    tacticsRefs.forEach(tr -> this.tacticRefs.add(new TacticRef(tr)));
  }

  private void buildXMitreDomainsFromJSon(List<String> domains) {
    this.xMitreDomains = new ArrayList<>();
    if (domains == null) return;
    domains.forEach(domain -> this.xMitreDomains.add(new ItemObject(domain)));
  }

  private void buildObjectMarkingRefsFromJSon(List<String> objectMarkingRefs) {
    this.objectMarkingRefs = new ArrayList<>();
    if (objectMarkingRefs == null) return;
    objectMarkingRefs.forEach(omr -> this.objectMarkingRefs.add(new ItemObject(omr)));
  }

  private void buildExternalReferencesFromJSon(
      List<com.mitre.attack.data.dto.ExternalReference> externalReferences) {
    this.externalReferences = new ArrayList<>();
    if (externalReferences == null) return;
    externalReferences.forEach(
        er ->
            this.externalReferences.add(
                ExternalReference.builder()
                    .externalId(er.getExternalId())
                    .url(er.getUrl())
                    .sourceName(er.getSourceName())
                    .description(er.getDescription())
                    .build()));
  }

  private void buildXMitrePlatformsFromJSon(List<String> xMitrePlatforms) {
    this.xMitrePlatforms = new ArrayList<>();
    if (xMitrePlatforms == null) return;
    xMitrePlatforms.forEach(mp -> this.xMitrePlatforms.add(new ItemObject(mp)));
  }
}
