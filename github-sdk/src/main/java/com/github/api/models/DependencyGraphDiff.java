/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for DependencyGraphDiff type.
 */
public class DependencyGraphDiff {
    private ChangeTypeEnum changeType;
    private String manifest;
    private String ecosystem;
    private String name;
    private String version;
    private String packageUrl;
    private String license;
    private String sourceRepositoryUrl;
    private List<Vulnerability> vulnerabilities;
    private Scope3Enum scope;

    /**
     * Default constructor.
     */
    public DependencyGraphDiff() {
    }

    /**
     * Initialization constructor.
     * @param  changeType  ChangeTypeEnum value for changeType.
     * @param  manifest  String value for manifest.
     * @param  ecosystem  String value for ecosystem.
     * @param  name  String value for name.
     * @param  version  String value for version.
     * @param  packageUrl  String value for packageUrl.
     * @param  license  String value for license.
     * @param  sourceRepositoryUrl  String value for sourceRepositoryUrl.
     * @param  vulnerabilities  List of Vulnerability value for vulnerabilities.
     * @param  scope  Scope3Enum value for scope.
     */
    public DependencyGraphDiff(
            ChangeTypeEnum changeType,
            String manifest,
            String ecosystem,
            String name,
            String version,
            String packageUrl,
            String license,
            String sourceRepositoryUrl,
            List<Vulnerability> vulnerabilities,
            Scope3Enum scope) {
        this.changeType = changeType;
        this.manifest = manifest;
        this.ecosystem = ecosystem;
        this.name = name;
        this.version = version;
        this.packageUrl = packageUrl;
        this.license = license;
        this.sourceRepositoryUrl = sourceRepositoryUrl;
        this.vulnerabilities = vulnerabilities;
        this.scope = scope;
    }

    /**
     * Getter for ChangeType.
     * @return Returns the ChangeTypeEnum
     */
    @JsonGetter("change_type")
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    /**
     * Setter for ChangeType.
     * @param changeType Value for ChangeTypeEnum
     */
    @JsonSetter("change_type")
    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    /**
     * Getter for Manifest.
     * @return Returns the String
     */
    @JsonGetter("manifest")
    public String getManifest() {
        return manifest;
    }

    /**
     * Setter for Manifest.
     * @param manifest Value for String
     */
    @JsonSetter("manifest")
    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    /**
     * Getter for Ecosystem.
     * @return Returns the String
     */
    @JsonGetter("ecosystem")
    public String getEcosystem() {
        return ecosystem;
    }

    /**
     * Setter for Ecosystem.
     * @param ecosystem Value for String
     */
    @JsonSetter("ecosystem")
    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Version.
     * @return Returns the String
     */
    @JsonGetter("version")
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for PackageUrl.
     * @return Returns the String
     */
    @JsonGetter("package_url")
    public String getPackageUrl() {
        return packageUrl;
    }

    /**
     * Setter for PackageUrl.
     * @param packageUrl Value for String
     */
    @JsonSetter("package_url")
    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    /**
     * Getter for License.
     * @return Returns the String
     */
    @JsonGetter("license")
    public String getLicense() {
        return license;
    }

    /**
     * Setter for License.
     * @param license Value for String
     */
    @JsonSetter("license")
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * Getter for SourceRepositoryUrl.
     * @return Returns the String
     */
    @JsonGetter("source_repository_url")
    public String getSourceRepositoryUrl() {
        return sourceRepositoryUrl;
    }

    /**
     * Setter for SourceRepositoryUrl.
     * @param sourceRepositoryUrl Value for String
     */
    @JsonSetter("source_repository_url")
    public void setSourceRepositoryUrl(String sourceRepositoryUrl) {
        this.sourceRepositoryUrl = sourceRepositoryUrl;
    }

    /**
     * Getter for Vulnerabilities.
     * @return Returns the List of Vulnerability
     */
    @JsonGetter("vulnerabilities")
    public List<Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    /**
     * Setter for Vulnerabilities.
     * @param vulnerabilities Value for List of Vulnerability
     */
    @JsonSetter("vulnerabilities")
    public void setVulnerabilities(List<Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    /**
     * Getter for Scope.
     * @return Returns the Scope3Enum
     */
    @JsonGetter("scope")
    public Scope3Enum getScope() {
        return scope;
    }

    /**
     * Setter for Scope.
     * @param scope Value for Scope3Enum
     */
    @JsonSetter("scope")
    public void setScope(Scope3Enum scope) {
        this.scope = scope;
    }

    /**
     * Converts this DependencyGraphDiff into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DependencyGraphDiff [" + "changeType=" + changeType + ", manifest=" + manifest
                + ", ecosystem=" + ecosystem + ", name=" + name + ", version=" + version
                + ", packageUrl=" + packageUrl + ", license=" + license + ", sourceRepositoryUrl="
                + sourceRepositoryUrl + ", vulnerabilities=" + vulnerabilities + ", scope=" + scope
                + "]";
    }

    /**
     * Builds a new {@link DependencyGraphDiff.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DependencyGraphDiff.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(changeType, manifest, ecosystem, name, version, packageUrl,
                license, sourceRepositoryUrl, vulnerabilities, scope);
        return builder;
    }

    /**
     * Class to build instances of {@link DependencyGraphDiff}.
     */
    public static class Builder {
        private ChangeTypeEnum changeType;
        private String manifest;
        private String ecosystem;
        private String name;
        private String version;
        private String packageUrl;
        private String license;
        private String sourceRepositoryUrl;
        private List<Vulnerability> vulnerabilities;
        private Scope3Enum scope;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  changeType  ChangeTypeEnum value for changeType.
         * @param  manifest  String value for manifest.
         * @param  ecosystem  String value for ecosystem.
         * @param  name  String value for name.
         * @param  version  String value for version.
         * @param  packageUrl  String value for packageUrl.
         * @param  license  String value for license.
         * @param  sourceRepositoryUrl  String value for sourceRepositoryUrl.
         * @param  vulnerabilities  List of Vulnerability value for vulnerabilities.
         * @param  scope  Scope3Enum value for scope.
         */
        public Builder(ChangeTypeEnum changeType, String manifest, String ecosystem, String name,
                String version, String packageUrl, String license, String sourceRepositoryUrl,
                List<Vulnerability> vulnerabilities, Scope3Enum scope) {
            this.changeType = changeType;
            this.manifest = manifest;
            this.ecosystem = ecosystem;
            this.name = name;
            this.version = version;
            this.packageUrl = packageUrl;
            this.license = license;
            this.sourceRepositoryUrl = sourceRepositoryUrl;
            this.vulnerabilities = vulnerabilities;
            this.scope = scope;
        }

        /**
         * Setter for changeType.
         * @param  changeType  ChangeTypeEnum value for changeType.
         * @return Builder
         */
        public Builder changeType(ChangeTypeEnum changeType) {
            this.changeType = changeType;
            return this;
        }

        /**
         * Setter for manifest.
         * @param  manifest  String value for manifest.
         * @return Builder
         */
        public Builder manifest(String manifest) {
            this.manifest = manifest;
            return this;
        }

        /**
         * Setter for ecosystem.
         * @param  ecosystem  String value for ecosystem.
         * @return Builder
         */
        public Builder ecosystem(String ecosystem) {
            this.ecosystem = ecosystem;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

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
         * Setter for license.
         * @param  license  String value for license.
         * @return Builder
         */
        public Builder license(String license) {
            this.license = license;
            return this;
        }

        /**
         * Setter for sourceRepositoryUrl.
         * @param  sourceRepositoryUrl  String value for sourceRepositoryUrl.
         * @return Builder
         */
        public Builder sourceRepositoryUrl(String sourceRepositoryUrl) {
            this.sourceRepositoryUrl = sourceRepositoryUrl;
            return this;
        }

        /**
         * Setter for vulnerabilities.
         * @param  vulnerabilities  List of Vulnerability value for vulnerabilities.
         * @return Builder
         */
        public Builder vulnerabilities(List<Vulnerability> vulnerabilities) {
            this.vulnerabilities = vulnerabilities;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  Scope3Enum value for scope.
         * @return Builder
         */
        public Builder scope(Scope3Enum scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds a new {@link DependencyGraphDiff} object using the set fields.
         * @return {@link DependencyGraphDiff}
         */
        public DependencyGraphDiff build() {
            return new DependencyGraphDiff(changeType, manifest, ecosystem, name, version,
                    packageUrl, license, sourceRepositoryUrl, vulnerabilities, scope);
        }
    }
}
