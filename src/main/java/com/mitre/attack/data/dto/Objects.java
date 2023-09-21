package com.mitre.attack.data.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
// @JsonPropertyOrder({ "status","msg" })
public class Objects {
  @JsonProperty("tactic_refs")
  private List<String> tacticsRefs;

  @JsonProperty("object_marking_refs")
  private List<String> objectMarkingRefs;

  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("created")
  private String created;

  @JsonProperty("created_by_ref")
  private String createdByRef;

  @JsonProperty("external_references")
  private List<ExternalReference> externalReferences;

  @JsonProperty("modified")
  private String modified;

  @JsonProperty("name")
  private String name;

  @JsonProperty("description")
  private String description;

  @JsonProperty("x_mitre_version")
  private String xMitreVersion;

  @JsonProperty("x_mitre_attack_spec_version")
  private String xMitreAttackSpecVersion;

  @JsonProperty("x_mitre_modified_by_ref")
  private String xMitreModifiedByRef;

  @JsonProperty("x_mitre_deprecated")
  private Boolean xMitreDeprecated;

  @JsonProperty("revoked")
  private Boolean revoked;

  @JsonProperty("x_mitre_domains")
  private List<String> xMitreDomains;

  @JsonProperty("x_mitre_platforms")
  private List<String> xMitrePlatforms;

  @JsonProperty("x_mitre_aliases")
  private List<String> xMitreAliases;

  @JsonProperty("labels")
  private List<String> labels;

  @JsonProperty("x_mitre_contributors")
  private List<String> xMitreContributors;

  @JsonProperty("x_mitre_shortname")
  private String xMitreShortname;

  @JsonProperty("kill_chain_phases")
  private List<KillChainPhases> killChainPhases;

  @JsonProperty("x_mitre_detection")
  private String xMitreDetection;

  @JsonProperty("x_mitre_is_subtechnique")
  private Boolean xMitreIsSubtechnique;

  @JsonProperty("x_mitre_data_sources")
  private List<String> xMitreDataSources;

  @JsonProperty("x_mitre_defense_bypassed")
  private List<String> xMitreDefenseBypassed;

  @JsonProperty("x_mitre_permissions_required")
  private List<String> xMitrePermissionsRequired;

  @JsonProperty("x_mitre_remote_support")
  private Boolean xMitreRemoteSupport;

  @JsonProperty("x_mitre_system_requirements")
  private List<String> xMitreSystemRequirements;

  @JsonProperty("x_mitre_impact_type")
  private List<String> xMitreImpactType;

  @JsonProperty("x_mitre_effective_permissions")
  private List<String> xMitreEffectivePermissions;

  @JsonProperty("x_mitre_network_requirements")
  private Boolean xMmitreNetworkRequirements;

  @JsonProperty("relationship_type")
  private String relationshipType;

  @JsonProperty("source_ref")
  private String sourceRef;

  @JsonProperty("target_ref")
  private String targetRef;

  @JsonProperty("aliases")
  private List<String> aliases;

  @JsonProperty("first_seen")
  private String firstSeen;

  @JsonProperty("last_seen")
  private String lastSeen;

  @JsonProperty("x_mitre_first_seen_citation")
  private String xMitreFirstSeenCitation;

  @JsonProperty("x_mitre_last_seen_citation")
  private String xMitreLastSeenCitation;

  @JsonProperty("x_mitre_data_source_ref")
  private String xMitreDataSourceRef;

  @JsonProperty("x_mitre_collection_layers")
  private List<String> xMitreCollectionLayers;

  @JsonProperty("identity_class")
  private String identityClass;

  @JsonProperty("definition")
  private Definition definition;

  @JsonProperty("definition_type")
  private String definitionType;
}
