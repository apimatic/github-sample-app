/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for ReposDependabotAlertsAlertNumberResponse type.
 */
public class ReposDependabotAlertsAlertNumberResponse {
    private int number;
    private StateEnum state;
    private Dependency3 dependency;
    private SecurityAdvisory1 securityAdvisory;
    private SecurityVulnerability securityVulnerability;
    private String url;
    private String htmlUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime dismissedAt;
    private Object dismissedBy;
    private Object dismissedReason;
    private String dismissedComment;
    private LocalDateTime fixedAt;

    /**
     * Default constructor.
     */
    public ReposDependabotAlertsAlertNumberResponse() {
    }

    /**
     * Initialization constructor.
     * @param  number  int value for number.
     * @param  state  StateEnum value for state.
     * @param  dependency  Dependency3 value for dependency.
     * @param  securityAdvisory  SecurityAdvisory1 value for securityAdvisory.
     * @param  securityVulnerability  SecurityVulnerability value for securityVulnerability.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  dismissedAt  LocalDateTime value for dismissedAt.
     * @param  dismissedBy  Object value for dismissedBy.
     * @param  dismissedReason  Object value for dismissedReason.
     * @param  dismissedComment  String value for dismissedComment.
     * @param  fixedAt  LocalDateTime value for fixedAt.
     */
    public ReposDependabotAlertsAlertNumberResponse(
            int number,
            StateEnum state,
            Dependency3 dependency,
            SecurityAdvisory1 securityAdvisory,
            SecurityVulnerability securityVulnerability,
            String url,
            String htmlUrl,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            LocalDateTime dismissedAt,
            Object dismissedBy,
            Object dismissedReason,
            String dismissedComment,
            LocalDateTime fixedAt) {
        this.number = number;
        this.state = state;
        this.dependency = dependency;
        this.securityAdvisory = securityAdvisory;
        this.securityVulnerability = securityVulnerability;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.dismissedAt = dismissedAt;
        this.dismissedBy = dismissedBy;
        this.dismissedReason = dismissedReason;
        this.dismissedComment = dismissedComment;
        this.fixedAt = fixedAt;
    }

    /**
     * Getter for Number.
     * The security alert number.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The security alert number.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for State.
     * @return Returns the StateEnum
     */
    @JsonGetter("state")
    public StateEnum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for StateEnum
     */
    @JsonSetter("state")
    public void setState(StateEnum state) {
        this.state = state;
    }

    /**
     * Getter for Dependency.
     * @return Returns the Dependency3
     */
    @JsonGetter("dependency")
    public Dependency3 getDependency() {
        return dependency;
    }

    /**
     * Setter for Dependency.
     * @param dependency Value for Dependency3
     */
    @JsonSetter("dependency")
    public void setDependency(Dependency3 dependency) {
        this.dependency = dependency;
    }

    /**
     * Getter for SecurityAdvisory.
     * @return Returns the SecurityAdvisory1
     */
    @JsonGetter("security_advisory")
    public SecurityAdvisory1 getSecurityAdvisory() {
        return securityAdvisory;
    }

    /**
     * Setter for SecurityAdvisory.
     * @param securityAdvisory Value for SecurityAdvisory1
     */
    @JsonSetter("security_advisory")
    public void setSecurityAdvisory(SecurityAdvisory1 securityAdvisory) {
        this.securityAdvisory = securityAdvisory;
    }

    /**
     * Getter for SecurityVulnerability.
     * @return Returns the SecurityVulnerability
     */
    @JsonGetter("security_vulnerability")
    public SecurityVulnerability getSecurityVulnerability() {
        return securityVulnerability;
    }

    /**
     * Setter for SecurityVulnerability.
     * @param securityVulnerability Value for SecurityVulnerability
     */
    @JsonSetter("security_vulnerability")
    public void setSecurityVulnerability(SecurityVulnerability securityVulnerability) {
        this.securityVulnerability = securityVulnerability;
    }

    /**
     * Getter for Url.
     * The REST API URL of the alert resource.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The REST API URL of the alert resource.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for HtmlUrl.
     * The GitHub URL of the alert resource.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * The GitHub URL of the alert resource.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for CreatedAt.
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for DismissedAt.
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("dismissed_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getDismissedAt() {
        return dismissedAt;
    }

    /**
     * Setter for DismissedAt.
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @param dismissedAt Value for LocalDateTime
     */
    @JsonSetter("dismissed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDismissedAt(LocalDateTime dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

    /**
     * Getter for DismissedBy.
     * @return Returns the Object
     */
    @JsonGetter("dismissed_by")
    public Object getDismissedBy() {
        return dismissedBy;
    }

    /**
     * Setter for DismissedBy.
     * @param dismissedBy Value for Object
     */
    @JsonSetter("dismissed_by")
    public void setDismissedBy(Object dismissedBy) {
        this.dismissedBy = dismissedBy;
    }

    /**
     * Getter for DismissedReason.
     * @return Returns the Object
     */
    @JsonGetter("dismissed_reason")
    public Object getDismissedReason() {
        return dismissedReason;
    }

    /**
     * Setter for DismissedReason.
     * @param dismissedReason Value for Object
     */
    @JsonSetter("dismissed_reason")
    public void setDismissedReason(Object dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    /**
     * Getter for DismissedComment.
     * An optional comment associated with the alert's dismissal.
     * @return Returns the String
     */
    @JsonGetter("dismissed_comment")
    public String getDismissedComment() {
        return dismissedComment;
    }

    /**
     * Setter for DismissedComment.
     * An optional comment associated with the alert's dismissal.
     * @param dismissedComment Value for String
     */
    @JsonSetter("dismissed_comment")
    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    /**
     * Getter for FixedAt.
     * The time that the alert was no longer detected and was considered fixed in ISO 8601 format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("fixed_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getFixedAt() {
        return fixedAt;
    }

    /**
     * Setter for FixedAt.
     * The time that the alert was no longer detected and was considered fixed in ISO 8601 format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     * @param fixedAt Value for LocalDateTime
     */
    @JsonSetter("fixed_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setFixedAt(LocalDateTime fixedAt) {
        this.fixedAt = fixedAt;
    }

    /**
     * Converts this ReposDependabotAlertsAlertNumberResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposDependabotAlertsAlertNumberResponse [" + "number=" + number + ", state="
                + state + ", dependency=" + dependency + ", securityAdvisory=" + securityAdvisory
                + ", securityVulnerability=" + securityVulnerability + ", url=" + url + ", htmlUrl="
                + htmlUrl + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
                + ", dismissedAt=" + dismissedAt + ", dismissedBy=" + dismissedBy
                + ", dismissedReason=" + dismissedReason + ", dismissedComment=" + dismissedComment
                + ", fixedAt=" + fixedAt + "]";
    }

    /**
     * Builds a new {@link ReposDependabotAlertsAlertNumberResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposDependabotAlertsAlertNumberResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(number, state, dependency, securityAdvisory,
                securityVulnerability, url, htmlUrl, createdAt, updatedAt, dismissedAt, dismissedBy,
                dismissedReason, dismissedComment, fixedAt);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposDependabotAlertsAlertNumberResponse}.
     */
    public static class Builder {
        private int number;
        private StateEnum state;
        private Dependency3 dependency;
        private SecurityAdvisory1 securityAdvisory;
        private SecurityVulnerability securityVulnerability;
        private String url;
        private String htmlUrl;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private LocalDateTime dismissedAt;
        private Object dismissedBy;
        private Object dismissedReason;
        private String dismissedComment;
        private LocalDateTime fixedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  number  int value for number.
         * @param  state  StateEnum value for state.
         * @param  dependency  Dependency3 value for dependency.
         * @param  securityAdvisory  SecurityAdvisory1 value for securityAdvisory.
         * @param  securityVulnerability  SecurityVulnerability value for securityVulnerability.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  dismissedAt  LocalDateTime value for dismissedAt.
         * @param  dismissedBy  Object value for dismissedBy.
         * @param  dismissedReason  Object value for dismissedReason.
         * @param  dismissedComment  String value for dismissedComment.
         * @param  fixedAt  LocalDateTime value for fixedAt.
         */
        public Builder(int number, StateEnum state, Dependency3 dependency,
                SecurityAdvisory1 securityAdvisory, SecurityVulnerability securityVulnerability,
                String url, String htmlUrl, LocalDateTime createdAt, LocalDateTime updatedAt,
                LocalDateTime dismissedAt, Object dismissedBy, Object dismissedReason,
                String dismissedComment, LocalDateTime fixedAt) {
            this.number = number;
            this.state = state;
            this.dependency = dependency;
            this.securityAdvisory = securityAdvisory;
            this.securityVulnerability = securityVulnerability;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.dismissedAt = dismissedAt;
            this.dismissedBy = dismissedBy;
            this.dismissedReason = dismissedReason;
            this.dismissedComment = dismissedComment;
            this.fixedAt = fixedAt;
        }

        /**
         * Setter for number.
         * @param  number  int value for number.
         * @return Builder
         */
        public Builder number(int number) {
            this.number = number;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  StateEnum value for state.
         * @return Builder
         */
        public Builder state(StateEnum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for dependency.
         * @param  dependency  Dependency3 value for dependency.
         * @return Builder
         */
        public Builder dependency(Dependency3 dependency) {
            this.dependency = dependency;
            return this;
        }

        /**
         * Setter for securityAdvisory.
         * @param  securityAdvisory  SecurityAdvisory1 value for securityAdvisory.
         * @return Builder
         */
        public Builder securityAdvisory(SecurityAdvisory1 securityAdvisory) {
            this.securityAdvisory = securityAdvisory;
            return this;
        }

        /**
         * Setter for securityVulnerability.
         * @param  securityVulnerability  SecurityVulnerability value for securityVulnerability.
         * @return Builder
         */
        public Builder securityVulnerability(SecurityVulnerability securityVulnerability) {
            this.securityVulnerability = securityVulnerability;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for dismissedAt.
         * @param  dismissedAt  LocalDateTime value for dismissedAt.
         * @return Builder
         */
        public Builder dismissedAt(LocalDateTime dismissedAt) {
            this.dismissedAt = dismissedAt;
            return this;
        }

        /**
         * Setter for dismissedBy.
         * @param  dismissedBy  Object value for dismissedBy.
         * @return Builder
         */
        public Builder dismissedBy(Object dismissedBy) {
            this.dismissedBy = dismissedBy;
            return this;
        }

        /**
         * Setter for dismissedReason.
         * @param  dismissedReason  Object value for dismissedReason.
         * @return Builder
         */
        public Builder dismissedReason(Object dismissedReason) {
            this.dismissedReason = dismissedReason;
            return this;
        }

        /**
         * Setter for dismissedComment.
         * @param  dismissedComment  String value for dismissedComment.
         * @return Builder
         */
        public Builder dismissedComment(String dismissedComment) {
            this.dismissedComment = dismissedComment;
            return this;
        }

        /**
         * Setter for fixedAt.
         * @param  fixedAt  LocalDateTime value for fixedAt.
         * @return Builder
         */
        public Builder fixedAt(LocalDateTime fixedAt) {
            this.fixedAt = fixedAt;
            return this;
        }

        /**
         * Builds a new {@link ReposDependabotAlertsAlertNumberResponse} object using the set
         * fields.
         * @return {@link ReposDependabotAlertsAlertNumberResponse}
         */
        public ReposDependabotAlertsAlertNumberResponse build() {
            return new ReposDependabotAlertsAlertNumberResponse(number, state, dependency,
                    securityAdvisory, securityVulnerability, url, htmlUrl, createdAt, updatedAt,
                    dismissedAt, dismissedBy, dismissedReason, dismissedComment, fixedAt);
        }
    }
}
