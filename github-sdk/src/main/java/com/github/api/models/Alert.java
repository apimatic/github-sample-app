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

/**
 * This is a model class for Alert type.
 */
public class Alert {
    private LocalDateTime createdAt;
    private LocalDateTime dismissedAt;
    private Object dismissedBy;
    private Object dismissedReason;
    private String htmlUrl;
    private Object mostRecentInstance;
    private int number;
    private Rule rule;
    private State16Enum state;
    private Tool tool;
    private String url;

    /**
     * Default constructor.
     */
    public Alert() {
    }

    /**
     * Initialization constructor.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  dismissedAt  LocalDateTime value for dismissedAt.
     * @param  dismissedBy  Object value for dismissedBy.
     * @param  dismissedReason  Object value for dismissedReason.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  number  int value for number.
     * @param  rule  Rule value for rule.
     * @param  state  State16Enum value for state.
     * @param  tool  Tool value for tool.
     * @param  url  String value for url.
     * @param  mostRecentInstance  Object value for mostRecentInstance.
     */
    public Alert(
            LocalDateTime createdAt,
            LocalDateTime dismissedAt,
            Object dismissedBy,
            Object dismissedReason,
            String htmlUrl,
            int number,
            Rule rule,
            State16Enum state,
            Tool tool,
            String url,
            Object mostRecentInstance) {
        this.createdAt = createdAt;
        this.dismissedAt = dismissedAt;
        this.dismissedBy = dismissedBy;
        this.dismissedReason = dismissedReason;
        this.htmlUrl = htmlUrl;
        this.mostRecentInstance = mostRecentInstance;
        this.number = number;
        this.rule = rule;
        this.state = state;
        this.tool = tool;
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
     * @return Returns the Rule
     */
    @JsonGetter("rule")
    public Rule getRule() {
        return rule;
    }

    /**
     * Setter for Rule.
     * @param rule Value for Rule
     */
    @JsonSetter("rule")
    public void setRule(Rule rule) {
        this.rule = rule;
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
     * Getter for Tool.
     * @return Returns the Tool
     */
    @JsonGetter("tool")
    public Tool getTool() {
        return tool;
    }

    /**
     * Setter for Tool.
     * @param tool Value for Tool
     */
    @JsonSetter("tool")
    public void setTool(Tool tool) {
        this.tool = tool;
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
     * Converts this Alert into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Alert [" + "createdAt=" + createdAt + ", dismissedAt=" + dismissedAt
                + ", dismissedBy=" + dismissedBy + ", dismissedReason=" + dismissedReason
                + ", htmlUrl=" + htmlUrl + ", number=" + number + ", rule=" + rule + ", state="
                + state + ", tool=" + tool + ", url=" + url + ", mostRecentInstance="
                + mostRecentInstance + "]";
    }

    /**
     * Builds a new {@link Alert.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Alert.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(createdAt, dismissedAt, dismissedBy, dismissedReason, htmlUrl,
                number, rule, state, tool, url)
                .mostRecentInstance(getMostRecentInstance());
        return builder;
    }

    /**
     * Class to build instances of {@link Alert}.
     */
    public static class Builder {
        private LocalDateTime createdAt;
        private LocalDateTime dismissedAt;
        private Object dismissedBy;
        private Object dismissedReason;
        private String htmlUrl;
        private int number;
        private Rule rule;
        private State16Enum state;
        private Tool tool;
        private String url;
        private Object mostRecentInstance;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  dismissedAt  LocalDateTime value for dismissedAt.
         * @param  dismissedBy  Object value for dismissedBy.
         * @param  dismissedReason  Object value for dismissedReason.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  number  int value for number.
         * @param  rule  Rule value for rule.
         * @param  state  State16Enum value for state.
         * @param  tool  Tool value for tool.
         * @param  url  String value for url.
         */
        public Builder(LocalDateTime createdAt, LocalDateTime dismissedAt, Object dismissedBy,
                Object dismissedReason, String htmlUrl, int number, Rule rule, State16Enum state,
                Tool tool, String url) {
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
         * @param  rule  Rule value for rule.
         * @return Builder
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
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
         * Setter for tool.
         * @param  tool  Tool value for tool.
         * @return Builder
         */
        public Builder tool(Tool tool) {
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
         * Setter for mostRecentInstance.
         * @param  mostRecentInstance  Object value for mostRecentInstance.
         * @return Builder
         */
        public Builder mostRecentInstance(Object mostRecentInstance) {
            this.mostRecentInstance = mostRecentInstance;
            return this;
        }

        /**
         * Builds a new {@link Alert} object using the set fields.
         * @return {@link Alert}
         */
        public Alert build() {
            return new Alert(createdAt, dismissedAt, dismissedBy, dismissedReason, htmlUrl, number,
                    rule, state, tool, url, mostRecentInstance);
        }
    }
}