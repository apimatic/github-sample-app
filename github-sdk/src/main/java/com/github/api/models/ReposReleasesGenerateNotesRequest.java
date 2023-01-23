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
 * This is a model class for ReposReleasesGenerateNotesRequest type.
 */
public class ReposReleasesGenerateNotesRequest {
    private String tagName;
    private String targetCommitish;
    private String previousTagName;
    private String configurationFilePath;

    /**
     * Default constructor.
     */
    public ReposReleasesGenerateNotesRequest() {
    }

    /**
     * Initialization constructor.
     * @param  tagName  String value for tagName.
     * @param  targetCommitish  String value for targetCommitish.
     * @param  previousTagName  String value for previousTagName.
     * @param  configurationFilePath  String value for configurationFilePath.
     */
    public ReposReleasesGenerateNotesRequest(
            String tagName,
            String targetCommitish,
            String previousTagName,
            String configurationFilePath) {
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.previousTagName = previousTagName;
        this.configurationFilePath = configurationFilePath;
    }

    /**
     * Getter for TagName.
     * The tag name for the release. This can be an existing tag or a new one.
     * @return Returns the String
     */
    @JsonGetter("tag_name")
    public String getTagName() {
        return tagName;
    }

    /**
     * Setter for TagName.
     * The tag name for the release. This can be an existing tag or a new one.
     * @param tagName Value for String
     */
    @JsonSetter("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Getter for TargetCommitish.
     * Specifies the commitish value that will be the target for the release's tag. Required if the
     * supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists.
     * @return Returns the String
     */
    @JsonGetter("target_commitish")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTargetCommitish() {
        return targetCommitish;
    }

    /**
     * Setter for TargetCommitish.
     * Specifies the commitish value that will be the target for the release's tag. Required if the
     * supplied tag_name does not reference an existing tag. Ignored if the tag_name already exists.
     * @param targetCommitish Value for String
     */
    @JsonSetter("target_commitish")
    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    /**
     * Getter for PreviousTagName.
     * The name of the previous tag to use as the starting point for the release notes. Use to
     * manually specify the range for the set of changes considered as part this release.
     * @return Returns the String
     */
    @JsonGetter("previous_tag_name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPreviousTagName() {
        return previousTagName;
    }

    /**
     * Setter for PreviousTagName.
     * The name of the previous tag to use as the starting point for the release notes. Use to
     * manually specify the range for the set of changes considered as part this release.
     * @param previousTagName Value for String
     */
    @JsonSetter("previous_tag_name")
    public void setPreviousTagName(String previousTagName) {
        this.previousTagName = previousTagName;
    }

    /**
     * Getter for ConfigurationFilePath.
     * Specifies a path to a file in the repository containing configuration settings used for
     * generating the release notes. If unspecified, the configuration file located in the
     * repository at '.github/release.yml' or '.github/release.yaml' will be used. If that is not
     * present, the default configuration will be used.
     * @return Returns the String
     */
    @JsonGetter("configuration_file_path")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConfigurationFilePath() {
        return configurationFilePath;
    }

    /**
     * Setter for ConfigurationFilePath.
     * Specifies a path to a file in the repository containing configuration settings used for
     * generating the release notes. If unspecified, the configuration file located in the
     * repository at '.github/release.yml' or '.github/release.yaml' will be used. If that is not
     * present, the default configuration will be used.
     * @param configurationFilePath Value for String
     */
    @JsonSetter("configuration_file_path")
    public void setConfigurationFilePath(String configurationFilePath) {
        this.configurationFilePath = configurationFilePath;
    }

    /**
     * Converts this ReposReleasesGenerateNotesRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposReleasesGenerateNotesRequest [" + "tagName=" + tagName + ", targetCommitish="
                + targetCommitish + ", previousTagName=" + previousTagName
                + ", configurationFilePath=" + configurationFilePath + "]";
    }

    /**
     * Builds a new {@link ReposReleasesGenerateNotesRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposReleasesGenerateNotesRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tagName)
                .targetCommitish(getTargetCommitish())
                .previousTagName(getPreviousTagName())
                .configurationFilePath(getConfigurationFilePath());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposReleasesGenerateNotesRequest}.
     */
    public static class Builder {
        private String tagName;
        private String targetCommitish;
        private String previousTagName;
        private String configurationFilePath;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tagName  String value for tagName.
         */
        public Builder(String tagName) {
            this.tagName = tagName;
        }

        /**
         * Setter for tagName.
         * @param  tagName  String value for tagName.
         * @return Builder
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        /**
         * Setter for targetCommitish.
         * @param  targetCommitish  String value for targetCommitish.
         * @return Builder
         */
        public Builder targetCommitish(String targetCommitish) {
            this.targetCommitish = targetCommitish;
            return this;
        }

        /**
         * Setter for previousTagName.
         * @param  previousTagName  String value for previousTagName.
         * @return Builder
         */
        public Builder previousTagName(String previousTagName) {
            this.previousTagName = previousTagName;
            return this;
        }

        /**
         * Setter for configurationFilePath.
         * @param  configurationFilePath  String value for configurationFilePath.
         * @return Builder
         */
        public Builder configurationFilePath(String configurationFilePath) {
            this.configurationFilePath = configurationFilePath;
            return this;
        }

        /**
         * Builds a new {@link ReposReleasesGenerateNotesRequest} object using the set fields.
         * @return {@link ReposReleasesGenerateNotesRequest}
         */
        public ReposReleasesGenerateNotesRequest build() {
            return new ReposReleasesGenerateNotesRequest(tagName, targetCommitish, previousTagName,
                    configurationFilePath);
        }
    }
}