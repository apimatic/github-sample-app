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
 * This is a model class for Webhook type.
 */
public class Webhook {
    private String type;
    private int id;
    private String name;
    private boolean active;
    private List<String> events;
    private Config1 config;
    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;
    private String url;
    private String testUrl;
    private String pingUrl;
    private String deliveriesUrl;
    private HookResponse lastResponse;

    /**
     * Default constructor.
     */
    public Webhook() {
    }

    /**
     * Initialization constructor.
     * @param  type  String value for type.
     * @param  id  int value for id.
     * @param  name  String value for name.
     * @param  active  boolean value for active.
     * @param  events  List of String value for events.
     * @param  config  Config1 value for config.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  url  String value for url.
     * @param  testUrl  String value for testUrl.
     * @param  pingUrl  String value for pingUrl.
     * @param  lastResponse  HookResponse value for lastResponse.
     * @param  deliveriesUrl  String value for deliveriesUrl.
     */
    public Webhook(
            String type,
            int id,
            String name,
            boolean active,
            List<String> events,
            Config1 config,
            LocalDateTime updatedAt,
            LocalDateTime createdAt,
            String url,
            String testUrl,
            String pingUrl,
            HookResponse lastResponse,
            String deliveriesUrl) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.active = active;
        this.events = events;
        this.config = config;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.url = url;
        this.testUrl = testUrl;
        this.pingUrl = pingUrl;
        this.deliveriesUrl = deliveriesUrl;
        this.lastResponse = lastResponse;
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
     * Getter for Name.
     * The name of a valid service, use 'web' for a webhook.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of a valid service, use 'web' for a webhook.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Active.
     * Determines whether the hook is actually triggered on pushes.
     * @return Returns the boolean
     */
    @JsonGetter("active")
    public boolean getActive() {
        return active;
    }

    /**
     * Setter for Active.
     * Determines whether the hook is actually triggered on pushes.
     * @param active Value for boolean
     */
    @JsonSetter("active")
    public void setActive(boolean active) {
        this.active = active;
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
     * Getter for Config.
     * @return Returns the Config1
     */
    @JsonGetter("config")
    public Config1 getConfig() {
        return config;
    }

    /**
     * Setter for Config.
     * @param config Value for Config1
     */
    @JsonSetter("config")
    public void setConfig(Config1 config) {
        this.config = config;
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
     * Getter for TestUrl.
     * @return Returns the String
     */
    @JsonGetter("test_url")
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
     * Getter for PingUrl.
     * @return Returns the String
     */
    @JsonGetter("ping_url")
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
     * Getter for LastResponse.
     * @return Returns the HookResponse
     */
    @JsonGetter("last_response")
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
     * Converts this Webhook into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Webhook [" + "type=" + type + ", id=" + id + ", name=" + name + ", active=" + active
                + ", events=" + events + ", config=" + config + ", updatedAt=" + updatedAt
                + ", createdAt=" + createdAt + ", url=" + url + ", testUrl=" + testUrl
                + ", pingUrl=" + pingUrl + ", lastResponse=" + lastResponse + ", deliveriesUrl="
                + deliveriesUrl + "]";
    }

    /**
     * Builds a new {@link Webhook.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Webhook.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(type, id, name, active, events, config, updatedAt, createdAt,
                url, testUrl, pingUrl, lastResponse)
                .deliveriesUrl(getDeliveriesUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Webhook}.
     */
    public static class Builder {
        private String type;
        private int id;
        private String name;
        private boolean active;
        private List<String> events;
        private Config1 config;
        private LocalDateTime updatedAt;
        private LocalDateTime createdAt;
        private String url;
        private String testUrl;
        private String pingUrl;
        private HookResponse lastResponse;
        private String deliveriesUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  type  String value for type.
         * @param  id  int value for id.
         * @param  name  String value for name.
         * @param  active  boolean value for active.
         * @param  events  List of String value for events.
         * @param  config  Config1 value for config.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  url  String value for url.
         * @param  testUrl  String value for testUrl.
         * @param  pingUrl  String value for pingUrl.
         * @param  lastResponse  HookResponse value for lastResponse.
         */
        public Builder(String type, int id, String name, boolean active, List<String> events,
                Config1 config, LocalDateTime updatedAt, LocalDateTime createdAt, String url,
                String testUrl, String pingUrl, HookResponse lastResponse) {
            this.type = type;
            this.id = id;
            this.name = name;
            this.active = active;
            this.events = events;
            this.config = config;
            this.updatedAt = updatedAt;
            this.createdAt = createdAt;
            this.url = url;
            this.testUrl = testUrl;
            this.pingUrl = pingUrl;
            this.lastResponse = lastResponse;
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
         * Setter for active.
         * @param  active  boolean value for active.
         * @return Builder
         */
        public Builder active(boolean active) {
            this.active = active;
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
         * Setter for config.
         * @param  config  Config1 value for config.
         * @return Builder
         */
        public Builder config(Config1 config) {
            this.config = config;
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
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
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
         * Setter for testUrl.
         * @param  testUrl  String value for testUrl.
         * @return Builder
         */
        public Builder testUrl(String testUrl) {
            this.testUrl = testUrl;
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
         * Setter for lastResponse.
         * @param  lastResponse  HookResponse value for lastResponse.
         * @return Builder
         */
        public Builder lastResponse(HookResponse lastResponse) {
            this.lastResponse = lastResponse;
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
         * Builds a new {@link Webhook} object using the set fields.
         * @return {@link Webhook}
         */
        public Webhook build() {
            return new Webhook(type, id, name, active, events, config, updatedAt, createdAt, url,
                    testUrl, pingUrl, lastResponse, deliveriesUrl);
        }
    }
}