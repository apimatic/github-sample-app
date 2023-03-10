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
 * This is a model class for Webhook1 type.
 */
public class Webhook1 {
    private boolean active;
    private Integer appId;
    private AppHookConfigRequest config;
    private LocalDateTime createdAt;
    private String deliveriesUrl;
    private List<String> events;
    private int id;
    private HookResponse lastResponse;
    private String name;
    private String pingUrl;
    private String testUrl;
    private String type;
    private LocalDateTime updatedAt;
    private String url;

    /**
     * Default constructor.
     */
    public Webhook1() {
        name = "web";
    }

    /**
     * Initialization constructor.
     * @param  active  boolean value for active.
     * @param  config  AppHookConfigRequest value for config.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  events  List of String value for events.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  type  String value for type.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  appId  Integer value for appId.
     * @param  deliveriesUrl  String value for deliveriesUrl.
     * @param  lastResponse  HookResponse value for lastResponse.
     * @param  pingUrl  String value for pingUrl.
     * @param  testUrl  String value for testUrl.
     * @param  url  String value for url.
     */
    public Webhook1(
            boolean active,
            AppHookConfigRequest config,
            LocalDateTime createdAt,
            List<String> events,
            int id,
            String name,
            String type,
            LocalDateTime updatedAt,
            Integer appId,
            String deliveriesUrl,
            HookResponse lastResponse,
            String pingUrl,
            String testUrl,
            String url) {
        this.active = active;
        this.appId = appId;
        this.config = config;
        this.createdAt = createdAt;
        this.deliveriesUrl = deliveriesUrl;
        this.events = events;
        this.id = id;
        this.lastResponse = lastResponse;
        this.name = name;
        this.pingUrl = pingUrl;
        this.testUrl = testUrl;
        this.type = type;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    /**
     * Getter for Active.
     * Determines whether the hook is actually triggered for the events it subscribes to.
     * @return Returns the boolean
     */
    @JsonGetter("active")
    public boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Determines whether the hook is actually triggered for the events it subscribes to.
     * @param active Value for boolean
     */
    @JsonSetter("active")
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * Getter for AppId.
     * Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event
     * to the webhook URL you specified during registration. The GitHub App ID sent in this field is
     * required for authenticating an app.
     * @return Returns the Integer
     */
    @JsonGetter("app_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAppId() {
        return appId;
    }

    /**
     * Setter for AppId.
     * Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event
     * to the webhook URL you specified during registration. The GitHub App ID sent in this field is
     * required for authenticating an app.
     * @param appId Value for Integer
     */
    @JsonSetter("app_id")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    /**
     * Getter for Config.
     * @return Returns the AppHookConfigRequest
     */
    @JsonGetter("config")
    public AppHookConfigRequest getConfig() {
        return config;
    }

    /**
     * Setter for Config.
     * @param config Value for AppHookConfigRequest
     */
    @JsonSetter("config")
    public void setConfig(AppHookConfigRequest config) {
        this.config = config;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for DeliveriesUrl.
     * @return Returns the String
     */
    @JsonGetter("deliveries_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeliveriesUrl() {
        return deliveriesUrl;
    }

    /**
     * Setter for DeliveriesUrl.
     * @param deliveriesUrl Value for String
     */
    @JsonSetter("deliveries_url")
    public void setDeliveriesUrl(String deliveriesUrl) {
        this.deliveriesUrl = deliveriesUrl;
    }

    /**
     * Getter for Events.
     * Determines what events the hook is triggered for. Default: ['push'].
     * @return Returns the List of String
     */
    @JsonGetter("events")
    public List<String> getEvents() {
        return events;
    }

    /**
     * Setter for Events.
     * Determines what events the hook is triggered for. Default: ['push'].
     * @param events Value for List of String
     */
    @JsonSetter("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    /**
     * Getter for Id.
     * Unique identifier of the webhook.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of the webhook.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for LastResponse.
     * @return Returns the HookResponse
     */
    @JsonGetter("last_response")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public HookResponse getLastResponse() {
        return lastResponse;
    }

    /**
     * Setter for LastResponse.
     * @param lastResponse Value for HookResponse
     */
    @JsonSetter("last_response")
    public void setLastResponse(HookResponse lastResponse) {
        this.lastResponse = lastResponse;
    }

    /**
     * Getter for Name.
     * The type of webhook. The only valid value is 'web'.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The type of webhook. The only valid value is 'web'.
     * @param name Value for String
     */
    @JsonSetter("name")
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for PingUrl.
     * @return Returns the String
     */
    @JsonGetter("ping_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPingUrl() {
        return pingUrl;
    }

    /**
     * Setter for PingUrl.
     * @param pingUrl Value for String
     */
    @JsonSetter("ping_url")
    public void setPingUrl(String pingUrl) {
        this.pingUrl = pingUrl;
    }

    /**
     * Getter for TestUrl.
     * @return Returns the String
     */
    @JsonGetter("test_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTestUrl() {
        return testUrl;
    }

    /**
     * Setter for TestUrl.
     * @param testUrl Value for String
     */
    @JsonSetter("test_url")
    public void setTestUrl(String testUrl) {
        this.testUrl = testUrl;
    }

    /**
     * Getter for Type.
     * @return Returns the String
     */
    @JsonGetter("type")
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this Webhook1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Webhook1 [" + "active=" + active + ", config=" + config + ", createdAt=" + createdAt
                + ", events=" + events + ", id=" + id + ", name=" + name + ", type=" + type
                + ", updatedAt=" + updatedAt + ", appId=" + appId + ", deliveriesUrl="
                + deliveriesUrl + ", lastResponse=" + lastResponse + ", pingUrl=" + pingUrl
                + ", testUrl=" + testUrl + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Webhook1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Webhook1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(active, config, createdAt, events, id, name, type, updatedAt)
                .appId(getAppId())
                .deliveriesUrl(getDeliveriesUrl())
                .lastResponse(getLastResponse())
                .pingUrl(getPingUrl())
                .testUrl(getTestUrl())
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Webhook1}.
     */
    public static class Builder {
        private boolean active;
        private AppHookConfigRequest config;
        private LocalDateTime createdAt;
        private List<String> events;
        private int id;
        private String name = "web";
        private String type;
        private LocalDateTime updatedAt;
        private Integer appId;
        private String deliveriesUrl;
        private HookResponse lastResponse;
        private String pingUrl;
        private String testUrl;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  active  boolean value for active.
         * @param  config  AppHookConfigRequest value for config.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  events  List of String value for events.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  type  String value for type.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         */
        public Builder(boolean active, AppHookConfigRequest config, LocalDateTime createdAt,
                List<String> events, int id, String name, String type, LocalDateTime updatedAt) {
            this.active = active;
            this.config = config;
            this.createdAt = createdAt;
            this.events = events;
            this.id = id;
            this.name = name;
            this.type = type;
            this.updatedAt = updatedAt;
        }

        /**
         * Setter for active.
         * @param  active  boolean value for active.
         * @return Builder
         */
        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        /**
         * Setter for config.
         * @param  config  AppHookConfigRequest value for config.
         * @return Builder
         */
        public Builder config(AppHookConfigRequest config) {
            this.config = config;
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
         * Setter for events.
         * @param  events  List of String value for events.
         * @return Builder
         */
        public Builder events(List<String> events) {
            this.events = events;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

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
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
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
         * Setter for appId.
         * @param  appId  Integer value for appId.
         * @return Builder
         */
        public Builder appId(Integer appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Setter for deliveriesUrl.
         * @param  deliveriesUrl  String value for deliveriesUrl.
         * @return Builder
         */
        public Builder deliveriesUrl(String deliveriesUrl) {
            this.deliveriesUrl = deliveriesUrl;
            return this;
        }

        /**
         * Setter for lastResponse.
         * @param  lastResponse  HookResponse value for lastResponse.
         * @return Builder
         */
        public Builder lastResponse(HookResponse lastResponse) {
            this.lastResponse = lastResponse;
            return this;
        }

        /**
         * Setter for pingUrl.
         * @param  pingUrl  String value for pingUrl.
         * @return Builder
         */
        public Builder pingUrl(String pingUrl) {
            this.pingUrl = pingUrl;
            return this;
        }

        /**
         * Setter for testUrl.
         * @param  testUrl  String value for testUrl.
         * @return Builder
         */
        public Builder testUrl(String testUrl) {
            this.testUrl = testUrl;
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
         * Builds a new {@link Webhook1} object using the set fields.
         * @return {@link Webhook1}
         */
        public Webhook1 build() {
            return new Webhook1(active, config, createdAt, events, id, name, type, updatedAt, appId,
                    deliveriesUrl, lastResponse, pingUrl, testUrl, url);
        }
    }
}
