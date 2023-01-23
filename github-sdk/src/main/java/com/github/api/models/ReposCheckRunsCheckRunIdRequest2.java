/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for ReposCheckRunsCheckRunIdRequest2 type.
 */
public class ReposCheckRunsCheckRunIdRequest2 {
    private String name;
    private String detailsUrl;
    private String externalId;
    private LocalDateTime startedAt;
    private Status34Enum status;
    private Conclusion20Enum conclusion;
    private LocalDateTime completedAt;
    private Output4 output;
    private List<Actions28> actions;

    /**
     * Default constructor.
     */
    public ReposCheckRunsCheckRunIdRequest2() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  detailsUrl  String value for detailsUrl.
     * @param  externalId  String value for externalId.
     * @param  startedAt  LocalDateTime value for startedAt.
     * @param  status  Status34Enum value for status.
     * @param  conclusion  Conclusion20Enum value for conclusion.
     * @param  completedAt  LocalDateTime value for completedAt.
     * @param  output  Output4 value for output.
     * @param  actions  List of Actions28 value for actions.
     */
    public ReposCheckRunsCheckRunIdRequest2(
            String name,
            String detailsUrl,
            String externalId,
            LocalDateTime startedAt,
            Status34Enum status,
            Conclusion20Enum conclusion,
            LocalDateTime completedAt,
            Output4 output,
            List<Actions28> actions) {
        this.name = name;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.startedAt = startedAt;
        this.status = status;
        this.conclusion = conclusion;
        this.completedAt = completedAt;
        this.output = output;
        this.actions = actions;
    }

    /**
     * Getter for Name.
     * The name of the check. For example, "code-coverage".
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the check. For example, "code-coverage".
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for DetailsUrl.
     * The URL of the integrator's site that has the full details of the check.
     * @return Returns the String
     */
    @JsonGetter("details_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetailsUrl() {
        return detailsUrl;
    }

    /**
     * Setter for DetailsUrl.
     * The URL of the integrator's site that has the full details of the check.
     * @param detailsUrl Value for String
     */
    @JsonSetter("details_url")
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    /**
     * Getter for ExternalId.
     * A reference for the run on the integrator's system.
     * @return Returns the String
     */
    @JsonGetter("external_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getExternalId() {
        return externalId;
    }

    /**
     * Setter for ExternalId.
     * A reference for the run on the integrator's system.
     * @param externalId Value for String
     */
    @JsonSetter("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Getter for StartedAt.
     * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("started_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getStartedAt() {
        return startedAt;
    }

    /**
     * Setter for StartedAt.
     * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     * @param startedAt Value for LocalDateTime
     */
    @JsonSetter("started_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setStartedAt(LocalDateTime startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * Getter for Status.
     * @return Returns the Status34Enum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status34Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status34Enum
     */
    @JsonSetter("status")
    public void setStatus(Status34Enum status) {
        this.status = status;
    }

    /**
     * Getter for Conclusion.
     * @return Returns the Conclusion20Enum
     */
    @JsonGetter("conclusion")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Conclusion20Enum getConclusion() {
        return conclusion;
    }

    /**
     * Setter for Conclusion.
     * @param conclusion Value for Conclusion20Enum
     */
    @JsonSetter("conclusion")
    public void setConclusion(Conclusion20Enum conclusion) {
        this.conclusion = conclusion;
    }

    /**
     * Getter for CompletedAt.
     * The time the check completed. This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("completed_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCompletedAt() {
        return completedAt;
    }

    /**
     * Setter for CompletedAt.
     * The time the check completed. This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @param completedAt Value for LocalDateTime
     */
    @JsonSetter("completed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCompletedAt(LocalDateTime completedAt) {
        this.completedAt = completedAt;
    }

    /**
     * Getter for Output.
     * @return Returns the Output4
     */
    @JsonGetter("output")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Output4 getOutput() {
        return output;
    }

    /**
     * Setter for Output.
     * @param output Value for Output4
     */
    @JsonSetter("output")
    public void setOutput(Output4 output) {
        this.output = output;
    }

    /**
     * Getter for Actions.
     * Possible further actions the integrator can perform, which a user may trigger. Each action
     * includes a `label`, `identifier` and `description`. A maximum of three actions are accepted.
     * See the [`actions` object](https://docs.github.com/rest/reference/checks#actions-object)
     * description. To learn more about check runs and requested actions, see "[Check runs and
     * requested
     * actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions)."
     * @return Returns the List of Actions28
     */
    @JsonGetter("actions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Actions28> getActions() {
        return actions;
    }

    /**
     * Setter for Actions.
     * Possible further actions the integrator can perform, which a user may trigger. Each action
     * includes a `label`, `identifier` and `description`. A maximum of three actions are accepted.
     * See the [`actions` object](https://docs.github.com/rest/reference/checks#actions-object)
     * description. To learn more about check runs and requested actions, see "[Check runs and
     * requested
     * actions](https://docs.github.com/rest/reference/checks#check-runs-and-requested-actions)."
     * @param actions Value for List of Actions28
     */
    @JsonSetter("actions")
    public void setActions(List<Actions28> actions) {
        this.actions = actions;
    }

    /**
     * Converts this ReposCheckRunsCheckRunIdRequest2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposCheckRunsCheckRunIdRequest2 [" + "name=" + name + ", detailsUrl=" + detailsUrl
                + ", externalId=" + externalId + ", startedAt=" + startedAt + ", status=" + status
                + ", conclusion=" + conclusion + ", completedAt=" + completedAt + ", output="
                + output + ", actions=" + actions + "]";
    }

    /**
     * Builds a new {@link ReposCheckRunsCheckRunIdRequest2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposCheckRunsCheckRunIdRequest2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .detailsUrl(getDetailsUrl())
                .externalId(getExternalId())
                .startedAt(getStartedAt())
                .status(getStatus())
                .conclusion(getConclusion())
                .completedAt(getCompletedAt())
                .output(getOutput())
                .actions(getActions());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposCheckRunsCheckRunIdRequest2}.
     */
    public static class Builder {
        private String name;
        private String detailsUrl;
        private String externalId;
        private LocalDateTime startedAt;
        private Status34Enum status;
        private Conclusion20Enum conclusion;
        private LocalDateTime completedAt;
        private Output4 output;
        private List<Actions28> actions;



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
         * Setter for detailsUrl.
         * @param  detailsUrl  String value for detailsUrl.
         * @return Builder
         */
        public Builder detailsUrl(String detailsUrl) {
            this.detailsUrl = detailsUrl;
            return this;
        }

        /**
         * Setter for externalId.
         * @param  externalId  String value for externalId.
         * @return Builder
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }

        /**
         * Setter for startedAt.
         * @param  startedAt  LocalDateTime value for startedAt.
         * @return Builder
         */
        public Builder startedAt(LocalDateTime startedAt) {
            this.startedAt = startedAt;
            return this;
        }

        /**
         * Setter for status.
         * @param  status  Status34Enum value for status.
         * @return Builder
         */
        public Builder status(Status34Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for conclusion.
         * @param  conclusion  Conclusion20Enum value for conclusion.
         * @return Builder
         */
        public Builder conclusion(Conclusion20Enum conclusion) {
            this.conclusion = conclusion;
            return this;
        }

        /**
         * Setter for completedAt.
         * @param  completedAt  LocalDateTime value for completedAt.
         * @return Builder
         */
        public Builder completedAt(LocalDateTime completedAt) {
            this.completedAt = completedAt;
            return this;
        }

        /**
         * Setter for output.
         * @param  output  Output4 value for output.
         * @return Builder
         */
        public Builder output(Output4 output) {
            this.output = output;
            return this;
        }

        /**
         * Setter for actions.
         * @param  actions  List of Actions28 value for actions.
         * @return Builder
         */
        public Builder actions(List<Actions28> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * Builds a new {@link ReposCheckRunsCheckRunIdRequest2} object using the set fields.
         * @return {@link ReposCheckRunsCheckRunIdRequest2}
         */
        public ReposCheckRunsCheckRunIdRequest2 build() {
            return new ReposCheckRunsCheckRunIdRequest2(name, detailsUrl, externalId, startedAt,
                    status, conclusion, completedAt, output, actions);
        }
    }
}
