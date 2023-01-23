/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.github.api.models.containers.CodeScanningAlertInstanceClassifications;
import io.apimatic.core.types.BaseModel;
import java.util.List;

/**
 * This is a model class for CodeScanningAlertInstance type.
 */
public class CodeScanningAlertInstance {
    private String ref;
    private String analysisKey;
    private String environment;
    private String category;
    private CodeScanningAlertStateEnum state;
    private String commitSha;
    private Message message;
    private Location2 location;
    private String htmlUrl;
    private List<CodeScanningAlertInstanceClassifications> classifications;

    /**
     * Default constructor.
     */
    public CodeScanningAlertInstance() {
    }

    /**
     * Initialization constructor.
     * @param  ref  String value for ref.
     * @param  analysisKey  String value for analysisKey.
     * @param  environment  String value for environment.
     * @param  category  String value for category.
     * @param  state  CodeScanningAlertStateEnum value for state.
     * @param  commitSha  String value for commitSha.
     * @param  message  Message value for message.
     * @param  location  Location2 value for location.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  classifications  List of CodeScanningAlertInstanceClassifications value for
     *         classifications.
     */
    public CodeScanningAlertInstance(
            String ref,
            String analysisKey,
            String environment,
            String category,
            CodeScanningAlertStateEnum state,
            String commitSha,
            Message message,
            Location2 location,
            String htmlUrl,
            List<CodeScanningAlertInstanceClassifications> classifications) {
        this.ref = ref;
        this.analysisKey = analysisKey;
        this.environment = environment;
        this.category = category;
        this.state = state;
        this.commitSha = commitSha;
        this.message = message;
        this.location = location;
        this.htmlUrl = htmlUrl;
        this.classifications = classifications;
    }

    /**
     * Getter for Ref.
     * The full Git reference, formatted as `refs/heads/&lt;branch name&gt;`, `refs/pull/&lt;number&gt;/merge`,
     * or `refs/pull/&lt;number&gt;/head`.
     * @return Returns the String
     */
    @JsonGetter("ref")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * The full Git reference, formatted as `refs/heads/&lt;branch name&gt;`, `refs/pull/&lt;number&gt;/merge`,
     * or `refs/pull/&lt;number&gt;/head`.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for AnalysisKey.
     * Identifies the configuration under which the analysis was executed. For example, in GitHub
     * Actions this includes the workflow filename and job name.
     * @return Returns the String
     */
    @JsonGetter("analysis_key")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAnalysisKey() {
        return analysisKey;
    }

    /**
     * Setter for AnalysisKey.
     * Identifies the configuration under which the analysis was executed. For example, in GitHub
     * Actions this includes the workflow filename and job name.
     * @param analysisKey Value for String
     */
    @JsonSetter("analysis_key")
    public void setAnalysisKey(String analysisKey) {
        this.analysisKey = analysisKey;
    }

    /**
     * Getter for Environment.
     * Identifies the variable values associated with the environment in which the analysis that
     * generated this alert instance was performed, such as the language that was analyzed.
     * @return Returns the String
     */
    @JsonGetter("environment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEnvironment() {
        return environment;
    }

    /**
     * Setter for Environment.
     * Identifies the variable values associated with the environment in which the analysis that
     * generated this alert instance was performed, such as the language that was analyzed.
     * @param environment Value for String
     */
    @JsonSetter("environment")
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * Getter for Category.
     * Identifies the configuration under which the analysis was executed. Used to distinguish
     * between multiple analyses for the same tool and commit, but performed on different languages
     * or different parts of the code.
     * @return Returns the String
     */
    @JsonGetter("category")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCategory() {
        return category;
    }

    /**
     * Setter for Category.
     * Identifies the configuration under which the analysis was executed. Used to distinguish
     * between multiple analyses for the same tool and commit, but performed on different languages
     * or different parts of the code.
     * @param category Value for String
     */
    @JsonSetter("category")
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Getter for State.
     * @return Returns the CodeScanningAlertStateEnum
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CodeScanningAlertStateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for CodeScanningAlertStateEnum
     */
    @JsonSetter("state")
    public void setState(CodeScanningAlertStateEnum state) {
        this.state = state;
    }

    /**
     * Getter for CommitSha.
     * @return Returns the String
     */
    @JsonGetter("commit_sha")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCommitSha() {
        return commitSha;
    }

    /**
     * Setter for CommitSha.
     * @param commitSha Value for String
     */
    @JsonSetter("commit_sha")
    public void setCommitSha(String commitSha) {
        this.commitSha = commitSha;
    }

    /**
     * Getter for Message.
     * @return Returns the Message
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Message getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * @param message Value for Message
     */
    @JsonSetter("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    /**
     * Getter for Location.
     * @return Returns the Location2
     */
    @JsonGetter("location")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Location2 getLocation() {
        return location;
    }

    /**
     * Setter for Location.
     * @param location Value for Location2
     */
    @JsonSetter("location")
    public void setLocation(Location2 location) {
        this.location = location;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Classifications.
     * Classifications that have been applied to the file that triggered the alert. For example
     * identifying it as documentation, or a generated file.
     * @return Returns the List of CodeScanningAlertInstanceClassifications
     */
    @JsonGetter("classifications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CodeScanningAlertInstanceClassifications> getClassifications() {
        return classifications;
    }

    /**
     * Setter for Classifications.
     * Classifications that have been applied to the file that triggered the alert. For example
     * identifying it as documentation, or a generated file.
     * @param classifications Value for List of CodeScanningAlertInstanceClassifications
     */
    @JsonSetter("classifications")
    public void setClassifications(List<CodeScanningAlertInstanceClassifications> classifications) {
        this.classifications = classifications;
    }

    /**
     * Converts this CodeScanningAlertInstance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CodeScanningAlertInstance [" + "ref=" + ref + ", analysisKey=" + analysisKey
                + ", environment=" + environment + ", category=" + category + ", state=" + state
                + ", commitSha=" + commitSha + ", message=" + message + ", location=" + location
                + ", htmlUrl=" + htmlUrl + ", classifications=" + classifications + "]";
    }

    /**
     * Builds a new {@link CodeScanningAlertInstance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CodeScanningAlertInstance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .ref(getRef())
                .analysisKey(getAnalysisKey())
                .environment(getEnvironment())
                .category(getCategory())
                .state(getState())
                .commitSha(getCommitSha())
                .message(getMessage())
                .location(getLocation())
                .htmlUrl(getHtmlUrl())
                .classifications(getClassifications());
        return builder;
    }

    /**
     * Class to build instances of {@link CodeScanningAlertInstance}.
     */
    public static class Builder {
        private String ref;
        private String analysisKey;
        private String environment;
        private String category;
        private CodeScanningAlertStateEnum state;
        private String commitSha;
        private Message message;
        private Location2 location;
        private String htmlUrl;
        private List<CodeScanningAlertInstanceClassifications> classifications;



        /**
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Setter for analysisKey.
         * @param  analysisKey  String value for analysisKey.
         * @return Builder
         */
        public Builder analysisKey(String analysisKey) {
            this.analysisKey = analysisKey;
            return this;
        }

        /**
         * Setter for environment.
         * @param  environment  String value for environment.
         * @return Builder
         */
        public Builder environment(String environment) {
            this.environment = environment;
            return this;
        }

        /**
         * Setter for category.
         * @param  category  String value for category.
         * @return Builder
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  CodeScanningAlertStateEnum value for state.
         * @return Builder
         */
        public Builder state(CodeScanningAlertStateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for commitSha.
         * @param  commitSha  String value for commitSha.
         * @return Builder
         */
        public Builder commitSha(String commitSha) {
            this.commitSha = commitSha;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  Message value for message.
         * @return Builder
         */
        public Builder message(Message message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for location.
         * @param  location  Location2 value for location.
         * @return Builder
         */
        public Builder location(Location2 location) {
            this.location = location;
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
         * Setter for classifications.
         * @param  classifications  List of CodeScanningAlertInstanceClassifications value for
         *         classifications.
         * @return Builder
         */
        public Builder classifications(
                List<CodeScanningAlertInstanceClassifications> classifications) {
            this.classifications = classifications;
            return this;
        }

        /**
         * Builds a new {@link CodeScanningAlertInstance} object using the set fields.
         * @return {@link CodeScanningAlertInstance}
         */
        public CodeScanningAlertInstance build() {
            return new CodeScanningAlertInstance(ref, analysisKey, environment, category, state,
                    commitSha, message, location, htmlUrl, classifications);
        }
    }
}