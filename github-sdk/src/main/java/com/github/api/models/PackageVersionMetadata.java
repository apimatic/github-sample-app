/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for PackageVersionMetadata type.
 */
public class PackageVersionMetadata {
    private PackageType2Enum packageType;
    private ContainerMetadata container;
    private DockerMetadata docker;

    /**
     * Default constructor.
     */
    public PackageVersionMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  packageType  PackageType2Enum value for packageType.
     * @param  container  ContainerMetadata value for container.
     * @param  docker  DockerMetadata value for docker.
     */
    public PackageVersionMetadata(
            PackageType2Enum packageType,
            ContainerMetadata container,
            DockerMetadata docker) {
        this.packageType = packageType;
        this.container = container;
        this.docker = docker;
    }

    /**
     * Getter for PackageType.
     * @return Returns the PackageType2Enum
     */
    @JsonGetter("package_type")
    public PackageType2Enum getPackageType() {
        return packageType;
    }

    /**
     * Setter for PackageType.
     * @param packageType Value for PackageType2Enum
     */
    @JsonSetter("package_type")
    public void setPackageType(PackageType2Enum packageType) {
        this.packageType = packageType;
    }

    /**
     * Getter for Container.
     * @return Returns the ContainerMetadata
     */
    @JsonGetter("container")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ContainerMetadata getContainer() {
        return container;
    }

    /**
     * Setter for Container.
     * @param container Value for ContainerMetadata
     */
    @JsonSetter("container")
    public void setContainer(ContainerMetadata container) {
        this.container = container;
    }

    /**
     * Getter for Docker.
     * @return Returns the DockerMetadata
     */
    @JsonGetter("docker")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DockerMetadata getDocker() {
        return docker;
    }

    /**
     * Setter for Docker.
     * @param docker Value for DockerMetadata
     */
    @JsonSetter("docker")
    public void setDocker(DockerMetadata docker) {
        this.docker = docker;
    }

    /**
     * Converts this PackageVersionMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PackageVersionMetadata [" + "packageType=" + packageType + ", container="
                + container + ", docker=" + docker + "]";
    }

    /**
     * Builds a new {@link PackageVersionMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PackageVersionMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(packageType)
                .container(getContainer())
                .docker(getDocker());
        return builder;
    }

    /**
     * Class to build instances of {@link PackageVersionMetadata}.
     */
    public static class Builder {
        private PackageType2Enum packageType;
        private ContainerMetadata container;
        private DockerMetadata docker;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  packageType  PackageType2Enum value for packageType.
         */
        public Builder(PackageType2Enum packageType) {
            this.packageType = packageType;
        }

        /**
         * Setter for packageType.
         * @param  packageType  PackageType2Enum value for packageType.
         * @return Builder
         */
        public Builder packageType(PackageType2Enum packageType) {
            this.packageType = packageType;
            return this;
        }

        /**
         * Setter for container.
         * @param  container  ContainerMetadata value for container.
         * @return Builder
         */
        public Builder container(ContainerMetadata container) {
            this.container = container;
            return this;
        }

        /**
         * Setter for docker.
         * @param  docker  DockerMetadata value for docker.
         * @return Builder
         */
        public Builder docker(DockerMetadata docker) {
            this.docker = docker;
            return this;
        }

        /**
         * Builds a new {@link PackageVersionMetadata} object using the set fields.
         * @return {@link PackageVersionMetadata}
         */
        public PackageVersionMetadata build() {
            return new PackageVersionMetadata(packageType, container, docker);
        }
    }
}
