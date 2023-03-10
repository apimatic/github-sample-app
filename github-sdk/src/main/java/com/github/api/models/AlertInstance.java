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
import java.util.List;

/**
 * This is a model class for AlertInstance type.
 */
public class AlertInstance {
    private String analysisKey;
    private List<String> classifications;
    private String commitSha;
    private String environment;
    private Location2 location;
    private Message message;
    private String ref;
    private State16Enum state;

    /**
     * Default constructor.
     */
    public AlertInstance() {
    }

    /**
     * Initialization constructor.
     * @param  analysisKey  String value for analysisKey.
     * @param  environment  String value for environment.
     * @param  ref  String value for ref.
     * @param  state  State16Enum value for state.
     * @param  classifications  List of String value for classifications.
     * @param  commitSha  String value for commitSha.
     * @param  location  Location2 value for location.
     * @param  message  Message value for message.
     */
    public AlertInstance(
            String analysisKey,
            String environment,
            String ref,
            State16Enum state,
            List<String> classifications,
            String commitSha,
            Location2 location,
            Message message) {
        this.analysisKey = analysisKey;
        this.classifications = classifications;
        this.commitSha = commitSha;
        this.environment = environment;
        this.location = location;
        this.message = message;
        this.ref = ref;
        this.state = state;
    }

    /**
     * Getter for AnalysisKey.
     * Identifies the configuration under which the analysis was executed. For example, in GitHub
     * Actions this includes the workflow filename and job name.
     * @return Returns the String
     */
    @JsonGetter("analysis_key")
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
     * Getter for Classifications.
     * @return Returns the List of String
     */
    @JsonGetter("classifications")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getClassifications() {
        return classifications;
    }

    /**
     * Setter for Classifications.
     * @param classifications Value for List of String
     */
    @JsonSetter("classifications")
    public void setClassifications(List<String> classifications) {
        this.classifications = classifications;
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
     * Getter for Environment.
     * Identifies the variable values associated with the environment in which the analysis that
     * generated this alert instance was performed, such as the language that was analyzed.
     * @return Returns the String
     */
    @JsonGetter("environment")
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
     * Getter for Ref.
     * The full Git reference, formatted as `refs/heads/&lt;branch name&gt;`.
     * @return Returns the String
     */
    @JsonGetter("ref")
    public String getRef() {
        return ref;
    }

    /**
     * Setter for Ref.
     * The full Git reference, formatted as `refs/heads/&lt;branch name&gt;`.
     * @param ref Value for String
     */
    @JsonSetter("ref")
    public void setRef(String ref) {
        this.ref = ref;
    }

    /**
     * Getter for State.
     * @return Returns the State16Enum
     */
    @JsonGetter("state")
    public State16Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State16Enum
     */
    @JsonSetter("state")
    public void setState(State16Enum state) {
        this.state = state;
    }

    /**
     * Converts this AlertInstance into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AlertInstance [" + "analysisKey=" + analysisKey + ", environment=" + environment
                + ", ref=" + ref + ", state=" + state + ", classifications=" + classifications
                + ", commitSha=" + commitSha + ", location=" + location + ", message=" + message
                + "]";
    }

    /**
     * Builds a new {@link AlertInstance.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AlertInstance.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(analysisKey, environment, ref, state)
                .classifications(getClassifications())
                .commitSha(getCommitSha())
                .location(getLocation())
                .message(getMessage());
        return builder;
    }

    /**
     * Class to build instances of {@link AlertInstance}.
     */
    public static class Builder {
        private String analysisKey;
        private String environment;
        private String ref;
        private State16Enum state;
        private List<String> classifications;
        private String commitSha;
        private Location2 location;
        private Message message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  analysisKey  String value for analysisKey.
         * @param  environment  String value for environment.
         * @param  ref  String value for ref.
         * @param  state  State16Enum value for state.
         */
        public Builder(String analysisKey, String environment, String ref, State16Enum state) {
            this.analysisKey = analysisKey;
            this.environment = environment;
            this.ref = ref;
            this.state = state;
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
         * Setter for ref.
         * @param  ref  String value for ref.
         * @return Builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State16Enum value for state.
         * @return Builder
         */
        public Builder state(State16Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for classifications.
         * @param  classifications  List of String value for classifications.
         * @return Builder
         */
        public Builder classifications(List<String> classifications) {
            this.classifications = classifications;
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
         * Setter for location.
         * @param  location  Location2 value for location.
         * @return Builder
         */
        public Builder location(Location2 location) {
            this.location = location;
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
         * Builds a new {@link AlertInstance} object using the set fields.
         * @return {@link AlertInstance}
         */
        public AlertInstance build() {
            return new AlertInstance(analysisKey, environment, ref, state, classifications,
                    commitSha, location, message);
        }
    }
}
