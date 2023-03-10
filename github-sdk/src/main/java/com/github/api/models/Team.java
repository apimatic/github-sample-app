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
 * This is a model class for Team type.
 */
public class Team {
    private int id;
    private String nodeId;
    private String name;
    private String slug;
    private String description;
    private String privacy;
    private String permission;
    private Permissions5 permissions;
    private String url;
    private String htmlUrl;
    private String membersUrl;
    private String repositoriesUrl;
    private Object parent;

    /**
     * Default constructor.
     */
    public Team() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  name  String value for name.
     * @param  slug  String value for slug.
     * @param  description  String value for description.
     * @param  permission  String value for permission.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  membersUrl  String value for membersUrl.
     * @param  repositoriesUrl  String value for repositoriesUrl.
     * @param  parent  Object value for parent.
     * @param  privacy  String value for privacy.
     * @param  permissions  Permissions5 value for permissions.
     */
    public Team(
            int id,
            String nodeId,
            String name,
            String slug,
            String description,
            String permission,
            String url,
            String htmlUrl,
            String membersUrl,
            String repositoriesUrl,
            Object parent,
            String privacy,
            Permissions5 permissions) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.privacy = privacy;
        this.permission = permission;
        this.permissions = permissions;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.parent = parent;
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  name  String value for name.
     * @param  slug  String value for slug.
     * @param  description  String value for description.
     * @param  permission  String value for permission.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  membersUrl  String value for membersUrl.
     * @param  repositoriesUrl  String value for repositoriesUrl.
     * @param  parent  Object value for parent.
     */
    @JsonCreator
    private Team(
            @JsonProperty("id") int id,
            @JsonProperty("node_id") String nodeId,
            @JsonProperty("name") String name,
            @JsonProperty("slug") String slug,
            @JsonProperty("description") String description,
            @JsonProperty("permission") String permission,
            @JsonProperty("url") String url,
            @JsonProperty("html_url") String htmlUrl,
            @JsonProperty("members_url") String membersUrl,
            @JsonProperty("repositories_url") String repositoriesUrl,
            @JsonProperty("parent") Object parent) {
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.permission = permission;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.parent = parent;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
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
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for Privacy.
     * @return Returns the String
     */
    @JsonGetter("privacy")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPrivacy() {
        return privacy;
    }

    /**
     * Setter for Privacy.
     * @param privacy Value for String
     */
    @JsonSetter("privacy")
    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    /**
     * Getter for Permission.
     * @return Returns the String
     */
    @JsonGetter("permission")
    public String getPermission() {
        return permission;
    }

    /**
     * Setter for Permission.
     * @param permission Value for String
     */
    @JsonSetter("permission")
    public void setPermission(String permission) {
        this.permission = permission;
    }

    /**
     * Getter for Permissions.
     * @return Returns the Permissions5
     */
    @JsonGetter("permissions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Permissions5 getPermissions() {
        return permissions;
    }

    /**
     * Setter for Permissions.
     * @param permissions Value for Permissions5
     */
    @JsonSetter("permissions")
    public void setPermissions(Permissions5 permissions) {
        this.permissions = permissions;
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
     * Getter for Parent.
     * @return Returns the Object
     */
    @JsonGetter("parent")
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
     * Converts this Team into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Team [" + "id=" + id + ", nodeId=" + nodeId + ", name=" + name + ", slug=" + slug
                + ", description=" + description + ", permission=" + permission + ", url=" + url
                + ", htmlUrl=" + htmlUrl + ", membersUrl=" + membersUrl + ", repositoriesUrl="
                + repositoriesUrl + ", parent=" + parent + ", privacy=" + privacy + ", permissions="
                + permissions + "]";
    }

    /**
     * Builds a new {@link Team.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Team.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, name, slug, description, permission, url, htmlUrl,
                membersUrl, repositoriesUrl, parent)
                .privacy(getPrivacy())
                .permissions(getPermissions());
        return builder;
    }

    /**
     * Class to build instances of {@link Team}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private String name;
        private String slug;
        private String description;
        private String permission;
        private String url;
        private String htmlUrl;
        private String membersUrl;
        private String repositoriesUrl;
        private Object parent;
        private String privacy;
        private Permissions5 permissions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  name  String value for name.
         * @param  slug  String value for slug.
         * @param  description  String value for description.
         * @param  permission  String value for permission.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  membersUrl  String value for membersUrl.
         * @param  repositoriesUrl  String value for repositoriesUrl.
         * @param  parent  Object value for parent.
         */
        public Builder(int id, String nodeId, String name, String slug, String description,
                String permission, String url, String htmlUrl, String membersUrl,
                String repositoriesUrl, Object parent) {
            this.id = id;
            this.nodeId = nodeId;
            this.name = name;
            this.slug = slug;
            this.description = description;
            this.permission = permission;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.membersUrl = membersUrl;
            this.repositoriesUrl = repositoriesUrl;
            this.parent = parent;
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
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
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
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
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
         * Setter for membersUrl.
         * @param  membersUrl  String value for membersUrl.
         * @return Builder
         */
        public Builder membersUrl(String membersUrl) {
            this.membersUrl = membersUrl;
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
         * Setter for parent.
         * @param  parent  Object value for parent.
         * @return Builder
         */
        public Builder parent(Object parent) {
            this.parent = parent;
            return this;
        }

        /**
         * Setter for privacy.
         * @param  privacy  String value for privacy.
         * @return Builder
         */
        public Builder privacy(String privacy) {
            this.privacy = privacy;
            return this;
        }

        /**
         * Setter for permissions.
         * @param  permissions  Permissions5 value for permissions.
         * @return Builder
         */
        public Builder permissions(Permissions5 permissions) {
            this.permissions = permissions;
            return this;
        }

        /**
         * Builds a new {@link Team} object using the set fields.
         * @return {@link Team}
         */
        public Team build() {
            return new Team(id, nodeId, name, slug, description, permission, url, htmlUrl,
                    membersUrl, repositoriesUrl, parent, privacy, permissions);
        }
    }
}
