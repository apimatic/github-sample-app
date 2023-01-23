/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.containers.DependencyMetadata;
import io.apimatic.core.types.BaseModel;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for Dependency type.
 */
public class Dependency {
    private String packageUrl;
    private Map<String, DependencyMetadata> metadata;
    private RelationshipEnum relationship;
    private Scope4Enum scope;
    private List<String> dependencies;

    /**
     * Default constructor.
     */
    public Dependency() {
    }

    /**
     * Initialization constructor.
     * @param  packageUrl  String value for packageUrl.
     * @param  metadata  Map of String, value for metadata.
     * @param  relationship  RelationshipEnum value for relationship.
     * @param  scope  Scope4Enum value for scope.
     * @param  dependencies  List of String value for dependencies.
     */
    public Dependency(
            String packageUrl,
            Map<String, DependencyMetadata> metadata,
            RelationshipEnum relationship,
            Scope4Enum scope,
            List<String> dependencies) {
        this.packageUrl = packageUrl;
        this.metadata = metadata;
        this.relationship = relationship;
        this.scope = scope;
        this.dependencies = dependencies;
    }

    /**
     * Getter for PackageUrl.
     * Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more
     * details.
     * @return Returns the String
     */
    @JsonGetter("package_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPackageUrl() {
        return packageUrl;
    }

    /**
     * Setter for PackageUrl.
     * Package-url (PURL) of dependency. See https://github.com/package-url/purl-spec for more
     * details.
     * @param packageUrl Value for String
     */
    @JsonSetter("package_url")
    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    /**
     * Getter for Metadata.
     * User-defined metadata to store domain-specific information limited to 8 keys with scalar
     * values.
     * @return Returns the Map of String, DependencyMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Map<String, DependencyMetadata> getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * User-defined metadata to store domain-specific information limited to 8 keys with scalar
     * values.
     * @param metadata Value for Map of String, DependencyMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(Map<String, DependencyMetadata> metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for Relationship.
     * @return Returns the RelationshipEnum
     */
    @JsonGetter("relationship")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RelationshipEnum getRelationship() {
        return relationship;
    }

    /**
     * Setter for Relationship.
     * @param relationship Value for RelationshipEnum
     */
    @JsonSetter("relationship")
    public void setRelationship(RelationshipEnum relationship) {
        this.relationship = relationship;
    }

    /**
     * Getter for Scope.
     * @return Returns the Scope4Enum
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Scope4Enum getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * @param scope Value for Scope4Enum
     */
    @JsonSetter("scope")
    public void setScope(Scope4Enum scope) {
        this.scope = scope;
    }

    /**
     * Getter for Dependencies.
     * Array of package-url (PURLs) of direct child dependencies.
     * @return Returns the List of String
     */
    @JsonGetter("dependencies")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDependencies() {
        return dependencies;
    }

    /**
     * Setter for Dependencies.
     * Array of package-url (PURLs) of direct child dependencies.
     * @param dependencies Value for List of String
     */
    @JsonSetter("dependencies")
    public void setDependencies(List<String> dependencies) {
        this.dependencies = dependencies;
    }

    /**
     * Converts this Dependency into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Dependency [" + "packageUrl=" + packageUrl + ", metadata=" + metadata
                + ", relationship=" + relationship + ", scope=" + scope + ", dependencies="
                + dependencies + "]";
    }

    /**
     * Builds a new {@link Dependency.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Dependency.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .packageUrl(getPackageUrl())
                .metadata(getMetadata())
                .relationship(getRelationship())
                .scope(getScope())
                .dependencies(getDependencies());
        return builder;
    }

    /**
     * Class to build instances of {@link Dependency}.
     */
    public static class Builder {
        private String packageUrl;
        private Map<String, DependencyMetadata> metadata;
        private RelationshipEnum relationship;
        private Scope4Enum scope;
        private List<String> dependencies;



        /**
         * Setter for packageUrl.
         * @param  packageUrl  String value for packageUrl.
         * @return Builder
         */
        public Builder packageUrl(String packageUrl) {
            this.packageUrl = packageUrl;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, DependencyMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for relationship.
         * @param  relationship  RelationshipEnum value for relationship.
         * @return Builder
         */
        public Builder relationship(RelationshipEnum relationship) {
            this.relationship = relationship;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  Scope4Enum value for scope.
         * @return Builder
         */
        public Builder scope(Scope4Enum scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Setter for dependencies.
         * @param  dependencies  List of String value for dependencies.
         * @return Builder
         */
        public Builder dependencies(List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        /**
         * Builds a new {@link Dependency} object using the set fields.
         * @return {@link Dependency}
         */
        public Dependency build() {
            return new Dependency(packageUrl, metadata, relationship, scope, dependencies);
        }
    }
}
