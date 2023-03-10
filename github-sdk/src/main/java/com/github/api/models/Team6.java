/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Team6 type.
 */
public class Team6 {
    private Boolean deleted;
    private String description;
    private String htmlUrl;
    private int id;
    private String membersUrl;
    private String name;
    private String nodeId;
    private Object parent;
    private String permission;
    private Privacy1Enum privacy;
    private String repositoriesUrl;
    private String slug;
    private String url;

    /**
     * Default constructor.
     */
    public Team6() {
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  membersUrl  String value for membersUrl.
     * @param  name  String value for name.
     * @param  nodeId  String value for nodeId.
     * @param  permission  String value for permission.
     * @param  privacy  Privacy1Enum value for privacy.
     * @param  repositoriesUrl  String value for repositoriesUrl.
     * @param  slug  String value for slug.
     * @param  url  String value for url.
     * @param  deleted  Boolean value for deleted.
     * @param  parent  Object value for parent.
     */
    public Team6(
            String description,
            String htmlUrl,
            int id,
            String membersUrl,
            String name,
            String nodeId,
            String permission,
            Privacy1Enum privacy,
            String repositoriesUrl,
            String slug,
            String url,
            Boolean deleted,
            Object parent) {
        this.deleted = deleted;
        this.description = description;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.membersUrl = membersUrl;
        this.name = name;
        this.nodeId = nodeId;
        this.parent = parent;
        this.permission = permission;
        this.privacy = privacy;
        this.repositoriesUrl = repositoriesUrl;
        this.slug = slug;
        this.url = url;
    }

    /**
     * Initialization constructor.
     * @param  description  String value for description.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  membersUrl  String value for membersUrl.
     * @param  name  String value for name.
     * @param  nodeId  String value for nodeId.
     * @param  permission  String value for permission.
     * @param  privacy  Privacy1Enum value for privacy.
     * @param  repositoriesUrl  String value for repositoriesUrl.
     * @param  slug  String value for slug.
     * @param  url  String value for url.
     */
    @JsonCreator
    private Team6(
            @JsonProperty("description") String description,
            @JsonProperty("html_url") String htmlUrl,
            @JsonProperty("id") int id,
            @JsonProperty("members_url") String membersUrl,
            @JsonProperty("name") String name,
            @JsonProperty("node_id") String nodeId,
            @JsonProperty("permission") String permission,
            @JsonProperty("privacy") Privacy1Enum privacy,
            @JsonProperty("repositories_url") String repositoriesUrl,
            @JsonProperty("slug") String slug,
            @JsonProperty("url") String url) {
        this.description = description;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.membersUrl = membersUrl;
        this.name = name;
        this.nodeId = nodeId;
        this.permission = permission;
        this.privacy = privacy;
        this.repositoriesUrl = repositoriesUrl;
        this.slug = slug;
        this.url = url;
    }

    /**
     * Getter for Deleted.
     * @return Returns the Boolean
     */
    @JsonGetter("deleted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Setter for Deleted.
     * @param deleted Value for Boolean
     */
    @JsonSetter("deleted")
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for Description.
     * Description of the team
     * @return Returns the String
     */
    @JsonGetter("description")
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * Description of the team
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
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
     * Getter for Id.
     * Unique identifier of the team
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of the team
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for MembersUrl.
     * @return Returns the String
     */
    @JsonGetter("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    /**
     * Setter for MembersUrl.
     * @param membersUrl Value for String
     */
    @JsonSetter("members_url")
    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    /**
     * Getter for Name.
     * Name of the team
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Name of the team
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for Parent.
     * @return Returns the Object
     */
    @JsonGetter("parent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getParent() {
        return parent;
    }

    /**
     * Setter for Parent.
     * @param parent Value for Object
     */
    @JsonSetter("parent")
    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * Getter for Permission.
     * Permission that the team will have for its repositories
     * @return Returns the String
     */
    @JsonGetter("permission")
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * Permission that the team will have for its repositories
     * @param permission Value for String
     */
    @JsonSetter("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Getter for Privacy.
     * @return Returns the Privacy1Enum
     */
    @JsonGetter("privacy")
    public Privacy1Enum getPrivacy() {
        return privacy;
    }

    /**
     * Setter for Privacy.
     * @param privacy Value for Privacy1Enum
     */
    @JsonSetter("privacy")
    public void setPrivacy(Privacy1Enum privacy) {
        this.privacy = privacy;
    }

    /**
     * Getter for RepositoriesUrl.
     * @return Returns the String
     */
    @JsonGetter("repositories_url")
    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    /**
     * Setter for RepositoriesUrl.
     * @param repositoriesUrl Value for String
     */
    @JsonSetter("repositories_url")
    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    /**
     * Getter for Slug.
     * @return Returns the String
     */
    @JsonGetter("slug")
    public String getSlug() {
        return slug;
    }

    /**
     * Setter for Slug.
     * @param slug Value for String
     */
    @JsonSetter("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Getter for Url.
     * URL for the team
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * URL for the team
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Converts this Team6 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Team6 [" + "description=" + description + ", htmlUrl=" + htmlUrl + ", id=" + id
                + ", membersUrl=" + membersUrl + ", name=" + name + ", nodeId=" + nodeId
                + ", permission=" + permission + ", privacy=" + privacy + ", repositoriesUrl="
                + repositoriesUrl + ", slug=" + slug + ", url=" + url + ", deleted=" + deleted
                + ", parent=" + parent + "]";
    }

    /**
     * Builds a new {@link Team6.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Team6.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(description, htmlUrl, id, membersUrl, name, nodeId,
                permission, privacy, repositoriesUrl, slug, url)
                .deleted(getDeleted())
                .parent(getParent());
        return builder;
    }

    /**
     * Class to build instances of {@link Team6}.
     */
    public static class Builder {
        private String description;
        private String htmlUrl;
        private int id;
        private String membersUrl;
        private String name;
        private String nodeId;
        private String permission;
        private Privacy1Enum privacy;
        private String repositoriesUrl;
        private String slug;
        private String url;
        private Boolean deleted;
        private Object parent;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  description  String value for description.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  membersUrl  String value for membersUrl.
         * @param  name  String value for name.
         * @param  nodeId  String value for nodeId.
         * @param  permission  String value for permission.
         * @param  privacy  Privacy1Enum value for privacy.
         * @param  repositoriesUrl  String value for repositoriesUrl.
         * @param  slug  String value for slug.
         * @param  url  String value for url.
         */
        public Builder(String description, String htmlUrl, int id, String membersUrl, String name,
                String nodeId, String permission, Privacy1Enum privacy, String repositoriesUrl,
                String slug, String url) {
            this.description = description;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.membersUrl = membersUrl;
            this.name = name;
            this.nodeId = nodeId;
            this.permission = permission;
            this.privacy = privacy;
            this.repositoriesUrl = repositoriesUrl;
            this.slug = slug;
            this.url = url;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
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
         * Setter for membersUrl.
         * @param  membersUrl  String value for membersUrl.
         * @return Builder
         */
        public Builder membersUrl(String membersUrl) {
            this.membersUrl = membersUrl;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for permission.
         * @param  permission  String value for permission.
         * @return Builder
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * Setter for privacy.
         * @param  privacy  Privacy1Enum value for privacy.
         * @return Builder
         */
        public Builder privacy(Privacy1Enum privacy) {
            this.privacy = privacy;
            return this;
        }

        /**
         * Setter for repositoriesUrl.
         * @param  repositoriesUrl  String value for repositoriesUrl.
         * @return Builder
         */
        public Builder repositoriesUrl(String repositoriesUrl) {
            this.repositoriesUrl = repositoriesUrl;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Setter for deleted.
         * @param  deleted  Boolean value for deleted.
         * @return Builder
         */
        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        /**
         * Setter for parent.
         * @param  parent  Object value for parent.
         * @return Builder
         */
        public Builder parent(Object parent) {
            this.parent = parent;
            return this;
        }

        /**
         * Builds a new {@link Team6} object using the set fields.
         * @return {@link Team6}
         */
        public Team6 build() {
            return new Team6(description, htmlUrl, id, membersUrl, name, nodeId, permission,
                    privacy, repositoriesUrl, slug, url, deleted, parent);
        }
    }
}
