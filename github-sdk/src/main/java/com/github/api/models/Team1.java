/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.BaseModel;
import io.apimatic.core.types.OptionalNullable;

/**
 * This is a model class for Team1 type.
 */
public class Team1 {
    private Integer id;
    private String nodeId;
    private String url;
    private String htmlUrl;
    private String name;
    private String slug;
    private OptionalNullable<String> description;
    private String privacy;
    private String permission;
    private String membersUrl;
    private String repositoriesUrl;
    private OptionalNullable<String> parent;

    /**
     * Default constructor.
     */
    public Team1() {
    }

    /**
     * Initialization constructor.
     * @param  id  Integer value for id.
     * @param  nodeId  String value for nodeId.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  name  String value for name.
     * @param  slug  String value for slug.
     * @param  description  String value for description.
     * @param  privacy  String value for privacy.
     * @param  permission  String value for permission.
     * @param  membersUrl  String value for membersUrl.
     * @param  repositoriesUrl  String value for repositoriesUrl.
     * @param  parent  String value for parent.
     */
    public Team1(
            Integer id,
            String nodeId,
            String url,
            String htmlUrl,
            String name,
            String slug,
            String description,
            String privacy,
            String permission,
            String membersUrl,
            String repositoriesUrl,
            String parent) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.slug = slug;
        this.description = OptionalNullable.of(description);
        this.privacy = privacy;
        this.permission = permission;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.parent = OptionalNullable.of(parent);
    }

    /**
     * Internal initialization constructor.
     */
    protected Team1(Integer id, String nodeId, String url, String htmlUrl, String name, String slug,
            OptionalNullable<String> description, String privacy, String permission,
            String membersUrl, String repositoriesUrl, OptionalNullable<String> parent) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.privacy = privacy;
        this.permission = permission;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.parent = parent;
    }

    /**
     * Getter for Id.
     * @return Returns the Integer
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for Integer
     */
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Internal Getter for Description.
     * @return Returns the Internal String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDescription() {
        return this.description;
    }

    /**
     * Getter for Description.
     * @return Returns the String
     */
    public String getDescription() {
        return OptionalNullable.getFrom(description);
    }

    /**
     * Setter for Description.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = OptionalNullable.of(description);
    }

    /**
     * UnSetter for Description.
     */
    public void unsetDescription() {
        description = null;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for MembersUrl.
     * @return Returns the String
     */
    @JsonGetter("members_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Internal Getter for Parent.
     * @return Returns the Internal String
     */
    @JsonGetter("parent")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetParent() {
        return this.parent;
    }

    /**
     * Getter for Parent.
     * @return Returns the String
     */
    public String getParent() {
        return OptionalNullable.getFrom(parent);
    }

    /**
     * Setter for Parent.
     * @param parent Value for String
     */
    @JsonSetter("parent")
    public void setParent(String parent) {
        this.parent = OptionalNullable.of(parent);
    }

    /**
     * UnSetter for Parent.
     */
    public void unsetParent() {
        parent = null;
    }

    /**
     * Converts this Team1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Team1 [" + "id=" + id + ", nodeId=" + nodeId + ", url=" + url + ", htmlUrl="
                + htmlUrl + ", name=" + name + ", slug=" + slug + ", description=" + description
                + ", privacy=" + privacy + ", permission=" + permission + ", membersUrl="
                + membersUrl + ", repositoriesUrl=" + repositoriesUrl + ", parent=" + parent + "]";
    }

    /**
     * Builds a new {@link Team1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Team1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .nodeId(getNodeId())
                .url(getUrl())
                .htmlUrl(getHtmlUrl())
                .name(getName())
                .slug(getSlug())
                .privacy(getPrivacy())
                .permission(getPermission())
                .membersUrl(getMembersUrl())
                .repositoriesUrl(getRepositoriesUrl());
        builder.description = internalGetDescription();
        builder.parent = internalGetParent();
        return builder;
    }

    /**
     * Class to build instances of {@link Team1}.
     */
    public static class Builder {
        private Integer id;
        private String nodeId;
        private String url;
        private String htmlUrl;
        private String name;
        private String slug;
        private OptionalNullable<String> description;
        private String privacy;
        private String permission;
        private String membersUrl;
        private String repositoriesUrl;
        private OptionalNullable<String> parent;



        /**
         * Setter for id.
         * @param  id  Integer value for id.
         * @return Builder
         */
        public Builder id(Integer id) {
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
            this.description = OptionalNullable.of(description);
            return this;
        }

        /**
         * UnSetter for description.
         * @return Builder
         */
        public Builder unsetDescription() {
            description = null;
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
         * Setter for permission.
         * @param  permission  String value for permission.
         * @return Builder
         */
        public Builder permission(String permission) {
            this.permission = permission;
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
         * @param  parent  String value for parent.
         * @return Builder
         */
        public Builder parent(String parent) {
            this.parent = OptionalNullable.of(parent);
            return this;
        }

        /**
         * UnSetter for parent.
         * @return Builder
         */
        public Builder unsetParent() {
            parent = null;
            return this;
        }

        /**
         * Builds a new {@link Team1} object using the set fields.
         * @return {@link Team1}
         */
        public Team1 build() {
            return new Team1(id, nodeId, url, htmlUrl, name, slug, description, privacy, permission,
                    membersUrl, repositoriesUrl, parent);
        }
    }
}
