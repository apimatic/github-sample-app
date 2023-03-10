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
 * This is a model class for ReposPagesRequest2 type.
 */
public class ReposPagesRequest2 {
    private BuildType1Enum buildType;
    private Source4 source;

    /**
     * Default constructor.
     */
    public ReposPagesRequest2() {
    }

    /**
     * Initialization constructor.
     * @param  buildType  BuildType1Enum value for buildType.
     * @param  source  Source4 value for source.
     */
    public ReposPagesRequest2(
            BuildType1Enum buildType,
            Source4 source) {
        this.buildType = buildType;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this ReposPagesRequest2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPagesRequest2 [" + "buildType=" + buildType + ", source=" + source + "]";
    }

    /**
     * Builds a new {@link ReposPagesRequest2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPagesRequest2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .buildType(getBuildType())
                .source(getSource());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPagesRequest2}.
     */
    public static class Builder {
        private BuildType1Enum buildType;
        private Source4 source;



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
         * Setter for source.
         * @param  source  Source4 value for source.
         * @return Builder
         */
        public Builder source(Source4 source) {
            this.source = source;
            return this;
        }

        /**
         * Builds a new {@link ReposPagesRequest2} object using the set fields.
         * @return {@link ReposPagesRequest2}
         */
        public ReposPagesRequest2 build() {
            return new ReposPagesRequest2(buildType, source);
        }
    }
}
