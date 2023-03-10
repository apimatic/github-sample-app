/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for ReposPagesRequest type.
 */
public class ReposPagesRequest {
    private BuildType1Enum buildType;
    private Source4 source;

    /**
     * Default constructor.
     */
    public ReposPagesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  source  Source4 value for source.
     * @param  buildType  BuildType1Enum value for buildType.
     */
    public ReposPagesRequest(
            Source4 source,
            BuildType1Enum buildType) {
        this.buildType = buildType;
        this.source = source;
    }

    /**
     * Initialization constructor.
     * @param  source  Source4 value for source.
     */
    @JsonCreator
    private ReposPagesRequest(
            @JsonProperty("source") Source4 source) {
        this.source = source;
    }

    /**
     * Getter for BuildType.
     * @return Returns the BuildType1Enum
     */
    @JsonGetter("build_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BuildType1Enum getBuildType() {
        return buildType;
    }

    /**
     * Setter for BuildType.
     * @param buildType Value for BuildType1Enum
     */
    @JsonSetter("build_type")
    public void setBuildType(BuildType1Enum buildType) {
        this.buildType = buildType;
    }

    /**
     * Getter for Source.
     * @return Returns the Source4
     */
    @JsonGetter("source")
    public Source4 getSource() {
        return source;
    }

    /**
     * Setter for Source.
     * @param source Value for Source4
     */
    @JsonSetter("source")
    public void setSource(Source4 source) {
        this.source = source;
    }

    /**
     * Converts this ReposPagesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPagesRequest [" + "source=" + source + ", buildType=" + buildType + "]";
    }

    /**
     * Builds a new {@link ReposPagesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPagesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(source)
                .buildType(getBuildType());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPagesRequest}.
     */
    public static class Builder {
        private Source4 source;
        private BuildType1Enum buildType;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  source  Source4 value for source.
         */
        public Builder(Source4 source) {
            this.source = source;
        }

        /**
         * Setter for source.
         * @param  source  Source4 value for source.
         * @return Builder
         */
        public Builder source(Source4 source) {
            this.source = source;
            return this;
        }

        /**
         * Setter for buildType.
         * @param  buildType  BuildType1Enum value for buildType.
         * @return Builder
         */
        public Builder buildType(BuildType1Enum buildType) {
            this.buildType = buildType;
            return this;
        }

        /**
         * Builds a new {@link ReposPagesRequest} object using the set fields.
         * @return {@link ReposPagesRequest}
         */
        public ReposPagesRequest build() {
            return new ReposPagesRequest(source, buildType);
        }
    }
}
