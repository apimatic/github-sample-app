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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;

/**
 * This is a model class for Alert2 type.
 */
public class Alert2 {
    private LocalDateTime createdAt;
    private Object dismissedAt;
    private Object dismissedBy;
    private OptionalNullable<String> dismissedComment;
    private Object dismissedReason;
    private OptionalNullable<Object> fixedAt;
    private String htmlUrl;
    private String instancesUrl;
    private Object mostRecentInstance;
    private int number;
    private Rule1 rule;
    private State21Enum state;
    private Object tool;
    private OptionalNullable<String> updatedAt;
    private String url;

    /**
     * Default constructor.
     */
    public Alert2() {
    }

    /**
     * Initialization constructor.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  dismissedAt  Object value for dismissedAt.
     * @param  dismissedBy  Object value for dismissedBy.
     * @param  dismissedReason  Object value for dismissedReason.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  number  int value for number.
     * @param  rule  Rule1 value for rule.
     * @param  state  State21Enum value for state.
     * @param  tool  Object value for tool.
     * @param  url  String value for url.
     * @param  dismissedComment  String value for dismissedComment.
     * @param  fixedAt  Object value for fixedAt.
     * @param  instancesUrl  String value for instancesUrl.
     * @param  mostRecentInstance  Object value for mostRecentInstance.
     * @param  updatedAt  String value for updatedAt.
     */
    public Alert2(
            LocalDateTime createdAt,
            Object dismissedAt,
            Object dismissedBy,
            Object dismissedReason,
            String htmlUrl,
            int number,
            Rule1 rule,
            State21Enum state,
            Object tool,
            String url,
            String dismissedComment,
            Object fixedAt,
            String instancesUrl,
            Object mostRecentInstance,
            String updatedAt) {
        this.createdAt = createdAt;
        this.dismissedAt = dismissedAt;
        this.dismissedBy = dismissedBy;
        this.dismissedComment = OptionalNullable.of(dismissedComment);
        this.dismissedReason = dismissedReason;
        this.fixedAt = OptionalNullable.of(fixedAt);
        this.htmlUrl = htmlUrl;
        this.instancesUrl = instancesUrl;
        this.mostRecentInstance = mostRecentInstance;
        this.number = number;
        this.rule = rule;
        this.state = state;
        this.tool = tool;
        this.updatedAt = OptionalNullable.of(updatedAt);
        this.url = url;
    }

    /**
     * Internal initialization constructor.
     */
    protected Alert2(LocalDateTime createdAt, Object dismissedAt, Object dismissedBy,
            Object dismissedReason, String htmlUrl, int number, Rule1 rule, State21Enum state,
            Object tool, String url, OptionalNullable<String> dismissedComment,
            OptionalNullable<Object> fixedAt, String instancesUrl, Object mostRecentInstance,
            OptionalNullable<String> updatedAt) {
        this.createdAt = createdAt;
        this.dismissedAt = dismissedAt;
        this.dismissedBy = dismissedBy;
        this.dismissedComment = dismissedComment;
        this.dismissedReason = dismissedReason;
        this.fixedAt = fixedAt;
        this.htmlUrl = htmlUrl;
        this.instancesUrl = instancesUrl;
        this.mostRecentInstance = mostRecentInstance;
        this.number = number;
        this.rule = rule;
        this.state = state;
        this.tool = tool;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    /**
     * Getter for CreatedAt.
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for DismissedAt.
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return Returns the Object
     */
    @JsonGetter("dismissed_at")
    public Object getDismissedAt() {
        return dismissedAt;
    }

    /**
     * Setter for DismissedAt.
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @param dismissedAt Value for Object
     */
    @JsonSetter("dismissed_at")
    public void setDismissedAt(Object dismissedAt) {
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
     * Internal Getter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     * @return Returns the Internal String
     */
    @JsonGetter("dismissed_comment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDismissedComment() {
        return this.dismissedComment;
    }

    /**
     * Getter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     * @return Returns the String
     */
    public String getDismissedComment() {
        return OptionalNullable.getFrom(dismissedComment);
    }

    /**
     * Setter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     * @param dismissedComment Value for String
     */
    @JsonSetter("dismissed_comment")
    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = OptionalNullable.of(dismissedComment);
    }

    /**
     * UnSetter for DismissedComment.
     * The dismissal comment associated with the dismissal of the alert.
     */
    public void unsetDismissedComment() {
        dismissedComment = null;
    }

    /**
     * Getter for DismissedReason.
     * The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`,
     * and `used in tests`.
     * @return Returns the Object
     */
    @JsonGetter("dismissed_reason")
    public Object getDismissedReason() {
        return dismissedReason;
    }

    /**
     * Setter for DismissedReason.
     * The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`,
     * and `used in tests`.
     * @param dismissedReason Value for Object
     */
    @JsonSetter("dismissed_reason")
    public void setDismissedReason(Object dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    /**
     * Internal Getter for FixedAt.
     * @return Returns the Internal Object
     */
    @JsonGetter("fixed_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Object> internalGetFixedAt() {
        return this.fixedAt;
    }

    /**
     * Getter for FixedAt.
     * @return Returns the Object
     */
    public Object getFixedAt() {
        return OptionalNullable.getFrom(fixedAt);
    }

    /**
     * Setter for FixedAt.
     * @param fixedAt Value for Object
     */
    @JsonSetter("fixed_at")
    public void setFixedAt(Object fixedAt) {
        this.fixedAt = OptionalNullable.of(fixedAt);
    }

    /**
     * UnSetter for FixedAt.
     */
    public void unsetFixedAt() {
        fixedAt = null;
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
     * Getter for InstancesUrl.
     * @return Returns the String
     */
    @JsonGetter("instances_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInstancesUrl() {
        return instancesUrl;
    }

    /**
     * Setter for InstancesUrl.
     * @param instancesUrl Value for String
     */
    @JsonSetter("instances_url")
    public void setInstancesUrl(String instancesUrl) {
        this.instancesUrl = instancesUrl;
    }

    /**
     * Getter for MostRecentInstance.
     * @return Returns the Object
     */
    @JsonGetter("most_recent_instance")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getMostRecentInstance() {
        return mostRecentInstance;
    }

    /**
     * Setter for MostRecentInstance.
     * @param mostRecentInstance Value for Object
     */
    @JsonSetter("most_recent_instance")
    public void setMostRecentInstance(Object mostRecentInstance) {
        this.mostRecentInstance = mostRecentInstance;
    }

    /**
     * Getter for Number.
     * The code scanning alert number.
     * @return Returns the int
     */
    @JsonGetter("number")
    public int getNumber() {
        return number;
    }

    /**
     * Setter for Number.
     * The code scanning alert number.
     * @param number Value for int
     */
    @JsonSetter("number")
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Getter for Rule.
     * @return Returns the Rule1
     */
    @JsonGetter("rule")
    public Rule1 getRule() {
        return rule;
    }

    /**
     * Setter for Rule.
     * @param rule Value for Rule1
     */
    @JsonSetter("rule")
    public void setRule(Rule1 rule) {
        this.rule = rule;
    }

    /**
     * Getter for State.
     * @return Returns the State21Enum
     */
    @JsonGetter("state")
    public State21Enum getState() {
        return state;
    }

    /**
     * Setter for State.
     * @param state Value for State21Enum
     */
    @JsonSetter("state")
    public void setState(State21Enum state) {
        this.state = state;
    }

    /**
     * Getter for Tool.
     * @return Returns the Object
     */
    @JsonGetter("tool")
    public Object getTool() {
        return tool;
    }

    /**
     * Setter for Tool.
     * @param tool Value for Object
     */
    @JsonSetter("tool")
    public void setTool(Object tool) {
        this.tool = tool;
    }

    /**
     * Internal Getter for UpdatedAt.
     * @return Returns the Internal String
     */
    @JsonGetter("updated_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    public String getUpdatedAt() {
        return OptionalNullable.getFrom(updatedAt);
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = OptionalNullable.of(updatedAt);
    }

    /**
     * UnSetter for UpdatedAt.
     */
    public void unsetUpdatedAt() {
        updatedAt = null;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this Alert2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Alert2 [" + "createdAt=" + createdAt + ", dismissedAt=" + dismissedAt
                + ", dismissedBy=" + dismissedBy + ", dismissedReason=" + dismissedReason
                + ", htmlUrl=" + htmlUrl + ", number=" + number + ", rule=" + rule + ", state="
                + state + ", tool=" + tool + ", url=" + url + ", dismissedComment="
                + dismissedComment + ", fixedAt=" + fixedAt + ", instancesUrl=" + instancesUrl
                + ", mostRecentInstance=" + mostRecentInstance + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link Alert2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Alert2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdAt, dismissedAt, dismissedBy, dismissedReason, htmlUrl,
                number, rule, state, tool, url)
                .instancesUrl(getInstancesUrl())
                .mostRecentInstance(getMostRecentInstance());
        builder.dismissedComment = internalGetDismissedComment();
        builder.fixedAt = internalGetFixedAt();
        builder.updatedAt = internalGetUpdatedAt();
        return builder;
    }

    /**
     * Class to build instances of {@link Alert2}.
     */
    public static class Builder {
        private LocalDateTime createdAt;
        private Object dismissedAt;
        private Object dismissedBy;
        private Object dismissedReason;
        private String htmlUrl;
        private int number;
        private Rule1 rule;
        private State21Enum state;
        private Object tool;
        private String url;
        private OptionalNullable<String> dismissedComment;
        private OptionalNullable<Object> fixedAt;
        private String instancesUrl;
        private Object mostRecentInstance;
        private OptionalNullable<String> updatedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  dismissedAt  Object value for dismissedAt.
         * @param  dismissedBy  Object value for dismissedBy.
         * @param  dismissedReason  Object value for dismissedReason.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  number  int value for number.
         * @param  rule  Rule1 value for rule.
         * @param  state  State21Enum value for state.
         * @param  tool  Object value for tool.
         * @param  url  String value for url.
         */
        public Builder(LocalDateTime createdAt, Object dismissedAt, Object dismissedBy,
                Object dismissedReason, String htmlUrl, int number, Rule1 rule, State21Enum state,
                Object tool, String url) {
            this.createdAt = createdAt;
            this.dismissedAt = dismissedAt;
            this.dismissedBy = dismissedBy;
            this.dismissedReason = dismissedReason;
            this.htmlUrl = htmlUrl;
            this.number = number;
            this.rule = rule;
            this.state = state;
            this.tool = tool;
            this.url = url;
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
         * Setter for dismissedAt.
         * @param  dismissedAt  Object value for dismissedAt.
         * @return Builder
         */
        public Builder dismissedAt(Object dismissedAt) {
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
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
         * Setter for rule.
         * @param  rule  Rule1 value for rule.
         * @return Builder
         */
        public Builder rule(Rule1 rule) {
            this.rule = rule;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  State21Enum value for state.
         * @return Builder
         */
        public Builder state(State21Enum state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for tool.
         * @param  tool  Object value for tool.
         * @return Builder
         */
        public Builder tool(Object tool) {
            this.tool = tool;
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
         * Setter for dismissedComment.
         * @param  dismissedComment  String value for dismissedComment.
         * @return Builder
         */
        public Builder dismissedComment(String dismissedComment) {
            this.dismissedComment = OptionalNullable.of(dismissedComment);
            return this;
        }

        /**
         * UnSetter for dismissedComment.
         * @return Builder
         */
        public Builder unsetDismissedComment() {
            dismissedComment = null;
            return this;
        }

        /**
         * Setter for fixedAt.
         * @param  fixedAt  Object value for fixedAt.
         * @return Builder
         */
        public Builder fixedAt(Object fixedAt) {
            this.fixedAt = OptionalNullable.of(fixedAt);
            return this;
        }

        /**
         * UnSetter for fixedAt.
         * @return Builder
         */
        public Builder unsetFixedAt() {
            fixedAt = null;
            return this;
        }

        /**
         * Setter for instancesUrl.
         * @param  instancesUrl  String value for instancesUrl.
         * @return Builder
         */
        public Builder instancesUrl(String instancesUrl) {
            this.instancesUrl = instancesUrl;
            return this;
        }

        /**
         * Setter for mostRecentInstance.
         * @param  mostRecentInstance  Object value for mostRecentInstance.
         * @return Builder
         */
        public Builder mostRecentInstance(Object mostRecentInstance) {
            this.mostRecentInstance = mostRecentInstance;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = OptionalNullable.of(updatedAt);
            return this;
        }

        /**
         * UnSetter for updatedAt.
         * @return Builder
         */
        public Builder unsetUpdatedAt() {
            updatedAt = null;
            return this;
        }

        /**
         * Builds a new {@link Alert2} object using the set fields.
         * @return {@link Alert2}
         */
        public Alert2 build() {
            return new Alert2(createdAt, dismissedAt, dismissedBy, dismissedReason, htmlUrl, number,
                    rule, state, tool, url, dismissedComment, fixedAt, instancesUrl,
                    mostRecentInstance, updatedAt);
        }
    }
}
