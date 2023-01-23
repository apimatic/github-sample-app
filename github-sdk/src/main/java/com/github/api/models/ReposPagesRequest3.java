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
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.models.containers.ReposPagesRequest3Source;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for ReposPagesRequest3 type.
 */
public class ReposPagesRequest3 {
    private OptionalNullable<String> cname;
    private Boolean httpsEnforced;
    private BuildType2Enum buildType;
    private Source22 source;

    /**
     * Default constructor.
     */
    public ReposPagesRequest3() {
    }

    /**
     * Initialization constructor.
     * @param  buildType  BuildType2Enum value for buildType.
     * @param  cname  String value for cname.
     * @param  httpsEnforced  Boolean value for httpsEnforced.
     * @param  source  Source22 value for source.
     */
    public ReposPagesRequest3(
            BuildType2Enum buildType,
            String cname,
            Boolean httpsEnforced,
            Source22 source) {
        this.cname = OptionalNullable.of(cname);
        this.httpsEnforced = httpsEnforced;
        this.buildType = buildType;
        this.source = source;
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposPagesRequest3(BuildType2Enum buildType, OptionalNullable<String> cname,
            Boolean httpsEnforced, Source22 source) {
        this.cname = cname;
        this.httpsEnforced = httpsEnforced;
        this.buildType = buildType;
        this.source = source;
    }

    /**
     * Initialization constructor.
     * @param  buildType  BuildType2Enum value for buildType.
     */
    @JsonCreator
    private ReposPagesRequest3(
            @JsonProperty("build_type") BuildType2Enum buildType) {
        this.buildType = buildType;
    }

    /**
     * Internal Getter for Cname.
     * Specify a custom domain for the repository. Sending a `null` value will remove the custom
     * domain. For more about custom domains, see "[Using a custom domain with GitHub
     * Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)."
     * @return Returns the Internal String
     */
    @JsonGetter("cname")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCname() {
        return this.cname;
    }

    /**
     * Getter for Cname.
     * Specify a custom domain for the repository. Sending a `null` value will remove the custom
     * domain. For more about custom domains, see "[Using a custom domain with GitHub
     * Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)."
     * @return Returns the String
     */
    public String getCname() {
        return OptionalNullable.getFrom(cname);
    }

    /**
     * Setter for Cname.
     * Specify a custom domain for the repository. Sending a `null` value will remove the custom
     * domain. For more about custom domains, see "[Using a custom domain with GitHub
     * Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)."
     * @param cname Value for String
     */
    @JsonSetter("cname")
    public void setCname(String cname) {
        this.cname = OptionalNullable.of(cname);
    }

    /**
     * UnSetter for Cname.
     * Specify a custom domain for the repository. Sending a `null` value will remove the custom
     * domain. For more about custom domains, see "[Using a custom domain with GitHub
     * Pages](https://docs.github.com/articles/using-a-custom-domain-with-github-pages/)."
     */
    public void unsetCname() {
        cname = null;
    }

    /**
     * Getter for HttpsEnforced.
     * Specify whether HTTPS should be enforced for the repository.
     * @return Returns the Boolean
     */
    @JsonGetter("https_enforced")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getHttpsEnforced() {
        return httpsEnforced;
    }

    /**
     * Setter for HttpsEnforced.
     * Specify whether HTTPS should be enforced for the repository.
     * @param httpsEnforced Value for Boolean
     */
    @JsonSetter("https_enforced")
    public void setHttpsEnforced(Boolean httpsEnforced) {
        this.httpsEnforced = httpsEnforced;
    }

    /**
     * Getter for BuildType.
     * @return Returns the BuildType2Enum
     */
    @JsonGetter("build_type")
    public BuildType2Enum getBuildType() {
        return buildType;
    }

    /**
     * Setter for BuildType.
     * @param buildType Value for BuildType2Enum
     */
    @JsonSetter("build_type")
    public void setBuildType(BuildType2Enum buildType) {
        this.buildType = buildType;
    }

    /**
     * Getter for Source.
     * @return Returns the Source22
     */
    @JsonGetter("source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Source22 getSource() {
        return source;
    }

    /**
     * Setter for Source.
     * @param source Value for Source22
     */
    @JsonSetter("source")
    public void setSource(Source22 source) {
        this.source = source;
    }

    /**
     * Converts this ReposPagesRequest3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPagesRequest3 [" + "buildType=" + buildType + ", cname=" + cname
                + ", httpsEnforced=" + httpsEnforced + ", source=" + source + "]";
    }

    /**
     * Builds a new {@link ReposPagesRequest3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPagesRequest3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(buildType)
                .httpsEnforced(getHttpsEnforced())
                .source(getSource());
        builder.cname = internalGetCname();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPagesRequest3}.
     */
    public static class Builder {
        private BuildType2Enum buildType;
        private OptionalNullable<String> cname;
        private Boolean httpsEnforced;
        private Source22 source;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  buildType  BuildType2Enum value for buildType.
         */
        public Builder(BuildType2Enum buildType) {
            this.buildType = buildType;
        }

        /**
         * Setter for buildType.
         * @param  buildType  BuildType2Enum value for buildType.
         * @return Builder
         */
        public Builder buildType(BuildType2Enum buildType) {
            this.buildType = buildType;
            return this;
        }

        /**
         * Setter for cname.
         * @param  cname  String value for cname.
         * @return Builder
         */
        public Builder cname(String cname) {
            this.cname = OptionalNullable.of(cname);
            return this;
        }

        /**
         * UnSetter for cname.
         * @return Builder
         */
        public Builder unsetCname() {
            cname = null;
            return this;
        }

        /**
         * Setter for httpsEnforced.
         * @param  httpsEnforced  Boolean value for httpsEnforced.
         * @return Builder
         */
        public Builder httpsEnforced(Boolean httpsEnforced) {
            this.httpsEnforced = httpsEnforced;
            return this;
        }

        /**
         * Setter for source.
         * @param  source  Source22 value for source.
         * @return Builder
         */
        public Builder source(Source22 source) {
            this.source = source;
            return this;
        }

        /**
         * Builds a new {@link ReposPagesRequest3} object using the set fields.
         * @return {@link ReposPagesRequest3}
         */
        public ReposPagesRequest3 build() {
            return new ReposPagesRequest3(buildType, cname, httpsEnforced, source);
        }
    }
}
