/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for RegistryPackage1 type.
 */
public class RegistryPackage1 {
    private String createdAt;
    private Object description;
    private String ecosystem;
    private String htmlUrl;
    private int id;
    private String name;
    private String namespace;
    private Author6 owner;
    private String packageType;
    private PackageVersion4 packageVersion;
    private Object registry;
    private String updatedAt;

    /**
     * Default constructor.
     */
    public RegistryPackage1() {
    }

    /**
     * Initialization constructor.
     * @param  createdAt  String value for createdAt.
     * @param  description  Object value for description.
     * @param  ecosystem  String value for ecosystem.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  namespace  String value for namespace.
     * @param  owner  Author6 value for owner.
     * @param  packageType  String value for packageType.
     * @param  packageVersion  PackageVersion4 value for packageVersion.
     * @param  registry  Object value for registry.
     * @param  updatedAt  String value for updatedAt.
     */
    public RegistryPackage1(
            String createdAt,
            Object description,
            String ecosystem,
            String htmlUrl,
            int id,
            String name,
            String namespace,
            Author6 owner,
            String packageType,
            PackageVersion4 packageVersion,
            Object registry,
            String updatedAt) {
        this.createdAt = createdAt;
        this.description = description;
        this.ecosystem = ecosystem;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.namespace = namespace;
        this.owner = owner;
        this.packageType = packageType;
        this.packageVersion = packageVersion;
        this.registry = registry;
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for String
     */
    @JsonSetter("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for Description.
     * @return Returns the Object
     */
    @JsonGetter("description")
    public Object getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for Object
     */
    @JsonSetter("description")
    public void setDescription(Object description) {
        this.description = description;
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
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
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
     * Getter for Namespace.
     * @return Returns the String
     */
    @JsonGetter("namespace")
    public String getNamespace() {
        return namespace;
    }

    /**
     * Setter for Namespace.
     * @param namespace Value for String
     */
    @JsonSetter("namespace")
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * Getter for Owner.
     * @return Returns the Author6
     */
    @JsonGetter("owner")
    public Author6 getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for Author6
     */
    @JsonSetter("owner")
    public void setOwner(Author6 owner) {
        this.owner = owner;
    }

    /**
     * Getter for PackageType.
     * @return Returns the String
     */
    @JsonGetter("package_type")
    public String getPackageType() {
        return packageType;
    }

    /**
     * Setter for PackageType.
     * @param packageType Value for String
     */
    @JsonSetter("package_type")
    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    /**
     * Getter for PackageVersion.
     * @return Returns the PackageVersion4
     */
    @JsonGetter("package_version")
    public PackageVersion4 getPackageVersion() {
        return packageVersion;
    }

    /**
     * Setter for PackageVersion.
     * @param packageVersion Value for PackageVersion4
     */
    @JsonSetter("package_version")
    public void setPackageVersion(PackageVersion4 packageVersion) {
        this.packageVersion = packageVersion;
    }

    /**
     * Getter for Registry.
     * @return Returns the Object
     */
    @JsonGetter("registry")
    public Object getRegistry() {
        return registry;
    }

    /**
     * Setter for Registry.
     * @param registry Value for Object
     */
    @JsonSetter("registry")
    public void setRegistry(Object registry) {
        this.registry = registry;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Converts this RegistryPackage1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RegistryPackage1 [" + "createdAt=" + createdAt + ", description=" + description
                + ", ecosystem=" + ecosystem + ", htmlUrl=" + htmlUrl + ", id=" + id + ", name="
                + name + ", namespace=" + namespace + ", owner=" + owner + ", packageType="
                + packageType + ", packageVersion=" + packageVersion + ", registry=" + registry
                + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link RegistryPackage1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RegistryPackage1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdAt, description, ecosystem, htmlUrl, id, name,
                namespace, owner, packageType, packageVersion, registry, updatedAt);
        return builder;
    }

    /**
     * Class to build instances of {@link RegistryPackage1}.
     */
    public static class Builder {
        private String createdAt;
        private Object description;
        private String ecosystem;
        private String htmlUrl;
        private int id;
        private String name;
        private String namespace;
        private Author6 owner;
        private String packageType;
        private PackageVersion4 packageVersion;
        private Object registry;
        private String updatedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdAt  String value for createdAt.
         * @param  description  Object value for description.
         * @param  ecosystem  String value for ecosystem.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  namespace  String value for namespace.
         * @param  owner  Author6 value for owner.
         * @param  packageType  String value for packageType.
         * @param  packageVersion  PackageVersion4 value for packageVersion.
         * @param  registry  Object value for registry.
         * @param  updatedAt  String value for updatedAt.
         */
        public Builder(String createdAt, Object description, String ecosystem, String htmlUrl,
                int id, String name, String namespace, Author6 owner, String packageType,
                PackageVersion4 packageVersion, Object registry, String updatedAt) {
            this.createdAt = createdAt;
            this.description = description;
            this.ecosystem = ecosystem;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.name = name;
            this.namespace = namespace;
            this.owner = owner;
            this.packageType = packageType;
            this.packageVersion = packageVersion;
            this.registry = registry;
            this.updatedAt = updatedAt;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  Object value for description.
         * @return Builder
         */
        public Builder description(Object description) {
            this.description = description;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
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
         * Setter for namespace.
         * @param  namespace  String value for namespace.
         * @return Builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  Author6 value for owner.
         * @return Builder
         */
        public Builder owner(Author6 owner) {
            this.owner = owner;
            return this;
        }

        /**
         * Setter for packageType.
         * @param  packageType  String value for packageType.
         * @return Builder
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * Setter for packageVersion.
         * @param  packageVersion  PackageVersion4 value for packageVersion.
         * @return Builder
         */
        public Builder packageVersion(PackageVersion4 packageVersion) {
            this.packageVersion = packageVersion;
            return this;
        }

        /**
         * Setter for registry.
         * @param  registry  Object value for registry.
         * @return Builder
         */
        public Builder registry(Object registry) {
            this.registry = registry;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Builds a new {@link RegistryPackage1} object using the set fields.
         * @return {@link RegistryPackage1}
         */
        public RegistryPackage1 build() {
            return new RegistryPackage1(createdAt, description, ecosystem, htmlUrl, id, name,
                    namespace, owner, packageType, packageVersion, registry, updatedAt);
        }
    }
}