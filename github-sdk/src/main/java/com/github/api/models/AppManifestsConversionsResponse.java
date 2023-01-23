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
 * This is a model class for AppManifestsConversionsResponse type.
 */
public class AppManifestsConversionsResponse {
    private int id;
    private String slug;
    private String nodeId;
    private Object owner;
    private String name;
    private String description;
    private String externalUrl;
    private String htmlUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Permissions30 permissions;
    private List<String> events;
    private Integer installationsCount;
    private String clientId;
    private String clientSecret;
    private String webhookSecret;
    private String pem;

    /**
     * Default constructor.
     */
    public AppManifestsConversionsResponse() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  owner  Object value for owner.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  externalUrl  String value for externalUrl.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  permissions  Permissions30 value for permissions.
     * @param  events  List of String value for events.
     * @param  clientId  String value for clientId.
     * @param  clientSecret  String value for clientSecret.
     * @param  webhookSecret  String value for webhookSecret.
     * @param  pem  String value for pem.
     * @param  slug  String value for slug.
     * @param  installationsCount  Integer value for installationsCount.
     */
    public AppManifestsConversionsResponse(
            int id,
            String nodeId,
            Object owner,
            String name,
            String description,
            String externalUrl,
            String htmlUrl,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            Permissions30 permissions,
            List<String> events,
            String clientId,
            String clientSecret,
            String webhookSecret,
            String pem,
            String slug,
            Integer installationsCount) {
        this.id = id;
        this.slug = slug;
        this.nodeId = nodeId;
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.permissions = permissions;
        this.events = events;
        this.installationsCount = installationsCount;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.webhookSecret = webhookSecret;
        this.pem = pem;
    }

    /**
     * Getter for Id.
     * Unique identifier of the GitHub app
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of the GitHub app
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for Slug.
     * The slug name of the GitHub app
     * @return Returns the String
     */
    @JsonGetter("slug")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSlug() {
        return slug;
    }

    /**
     * Setter for Slug.
     * The slug name of the GitHub app
     * @param slug Value for String
     */
    @JsonSetter("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for Owner.
     * @return Returns the Object
     */
    @JsonGetter("owner")
    public Object getOwner() {
        return owner;
    }

    /**
     * Setter for Owner.
     * @param owner Value for Object
     */
    @JsonSetter("owner")
    public void setOwner(Object owner) {
        this.owner = owner;
    }

    /**
     * Getter for Name.
     * The name of the GitHub app
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the GitHub app
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for ExternalUrl.
     * @return Returns the String
     */
    @JsonGetter("external_url")
    public String getExternalUrl() {
        return externalUrl;
    }

    /**
     * Setter for ExternalUrl.
     * @param externalUrl Value for String
     */
    @JsonSetter("external_url")
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
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
     * Getter for Permissions.
     * @return Returns the Permissions30
     */
    @JsonGetter("permissions")
    public Permissions30 getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions30
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions30 permissions) {
        this.permissions = permissions;
    }

    /**
     * Getter for Events.
     * The list of events for the GitHub app
     * @return Returns the List of String
     */
    @JsonGetter("events")
    public List<String> getEvents() {
        return events;
    }

    /**
     * Setter for Events.
     * The list of events for the GitHub app
     * @param events Value for List of String
     */
    @JsonSetter("events")
    public void setEvents(List<String> events) {
        this.events = events;
    }

    /**
     * Getter for InstallationsCount.
     * The number of installations associated with the GitHub app
     * @return Returns the Integer
     */
    @JsonGetter("installations_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getInstallationsCount() {
        return installationsCount;
    }

    /**
     * Setter for InstallationsCount.
     * The number of installations associated with the GitHub app
     * @param installationsCount Value for Integer
     */
    @JsonSetter("installations_count")
    public void setInstallationsCount(Integer installationsCount) {
        this.installationsCount = installationsCount;
    }

    /**
     * Getter for ClientId.
     * @return Returns the String
     */
    @JsonGetter("client_id")
    public String getClientId() {
        return clientId;
    }

    /**
     * Setter for ClientId.
     * @param clientId Value for String
     */
    @JsonSetter("client_id")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * Getter for ClientSecret.
     * @return Returns the String
     */
    @JsonGetter("client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Setter for ClientSecret.
     * @param clientSecret Value for String
     */
    @JsonSetter("client_secret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * Getter for WebhookSecret.
     * @return Returns the String
     */
    @JsonGetter("webhook_secret")
    public String getWebhookSecret() {
        return webhookSecret;
    }

    /**
     * Setter for WebhookSecret.
     * @param webhookSecret Value for String
     */
    @JsonSetter("webhook_secret")
    public void setWebhookSecret(String webhookSecret) {
        this.webhookSecret = webhookSecret;
    }

    /**
     * Getter for Pem.
     * @return Returns the String
     */
    @JsonGetter("pem")
    public String getPem() {
        return pem;
    }

    /**
     * Setter for Pem.
     * @param pem Value for String
     */
    @JsonSetter("pem")
    public void setPem(String pem) {
        this.pem = pem;
    }

    /**
     * Converts this AppManifestsConversionsResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AppManifestsConversionsResponse [" + "id=" + id + ", nodeId=" + nodeId + ", owner="
                + owner + ", name=" + name + ", description=" + description + ", externalUrl="
                + externalUrl + ", htmlUrl=" + htmlUrl + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", permissions=" + permissions + ", events=" + events + ", clientId="
                + clientId + ", clientSecret=" + clientSecret + ", webhookSecret=" + webhookSecret
                + ", pem=" + pem + ", slug=" + slug + ", installationsCount=" + installationsCount
                + "]";
    }

    /**
     * Builds a new {@link AppManifestsConversionsResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AppManifestsConversionsResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, owner, name, description, externalUrl, htmlUrl,
                createdAt, updatedAt, permissions, events, clientId, clientSecret, webhookSecret,
                pem)
                .slug(getSlug())
                .installationsCount(getInstallationsCount());
        return builder;
    }

    /**
     * Class to build instances of {@link AppManifestsConversionsResponse}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private Object owner;
        private String name;
        private String description;
        private String externalUrl;
        private String htmlUrl;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Permissions30 permissions;
        private List<String> events;
        private String clientId;
        private String clientSecret;
        private String webhookSecret;
        private String pem;
        private String slug;
        private Integer installationsCount;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  owner  Object value for owner.
         * @param  name  String value for name.
         * @param  description  String value for description.
         * @param  externalUrl  String value for externalUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  permissions  Permissions30 value for permissions.
         * @param  events  List of String value for events.
         * @param  clientId  String value for clientId.
         * @param  clientSecret  String value for clientSecret.
         * @param  webhookSecret  String value for webhookSecret.
         * @param  pem  String value for pem.
         */
        public Builder(int id, String nodeId, Object owner, String name, String description,
                String externalUrl, String htmlUrl, LocalDateTime createdAt,
                LocalDateTime updatedAt, Permissions30 permissions, List<String> events,
                String clientId, String clientSecret, String webhookSecret, String pem) {
            this.id = id;
            this.nodeId = nodeId;
            this.owner = owner;
            this.name = name;
            this.description = description;
            this.externalUrl = externalUrl;
            this.htmlUrl = htmlUrl;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.permissions = permissions;
            this.events = events;
            this.clientId = clientId;
            this.clientSecret = clientSecret;
            this.webhookSecret = webhookSecret;
            this.pem = pem;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for owner.
         * @param  owner  Object value for owner.
         * @return Builder
         */
        public Builder owner(Object owner) {
            this.owner = owner;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for externalUrl.
         * @param  externalUrl  String value for externalUrl.
         * @return Builder
         */
        public Builder externalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
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
         * Setter for permissions.
         * @param  permissions  Permissions30 value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions30 permissions) {
            this.permissions = permissions;
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
         * Setter for clientId.
         * @param  clientId  String value for clientId.
         * @return Builder
         */
        public Builder clientId(String clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * Setter for clientSecret.
         * @param  clientSecret  String value for clientSecret.
         * @return Builder
         */
        public Builder clientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        /**
         * Setter for webhookSecret.
         * @param  webhookSecret  String value for webhookSecret.
         * @return Builder
         */
        public Builder webhookSecret(String webhookSecret) {
            this.webhookSecret = webhookSecret;
            return this;
        }

        /**
         * Setter for pem.
         * @param  pem  String value for pem.
         * @return Builder
         */
        public Builder pem(String pem) {
            this.pem = pem;
            return this;
        }

        /**
         * Setter for slug.
         * @param  slug  String value for slug.
         * @return Builder
         */
        public Builder slug(String slug) {
            this.slug = slug;
            return this;
        }

        /**
         * Setter for installationsCount.
         * @param  installationsCount  Integer value for installationsCount.
         * @return Builder
         */
        public Builder installationsCount(Integer installationsCount) {
            this.installationsCount = installationsCount;
            return this;
        }

        /**
         * Builds a new {@link AppManifestsConversionsResponse} object using the set fields.
         * @return {@link AppManifestsConversionsResponse}
         */
        public AppManifestsConversionsResponse build() {
            return new AppManifestsConversionsResponse(id, nodeId, owner, name, description,
                    externalUrl, htmlUrl, createdAt, updatedAt, permissions, events, clientId,
                    clientSecret, webhookSecret, pem, slug, installationsCount);
        }
    }
}
