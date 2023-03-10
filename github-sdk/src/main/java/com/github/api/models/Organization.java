/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for Organization type.
 */
public class Organization {
    private String avatarUrl;
    private String description;
    private String eventsUrl;
    private String hooksUrl;
    private String htmlUrl;
    private int id;
    private String issuesUrl;
    private String login;
    private String membersUrl;
    private String nodeId;
    private String publicMembersUrl;
    private String reposUrl;
    private String url;

    /**
     * Default constructor.
     */
    public Organization() {
    }

    /**
     * Initialization constructor.
     * @param  avatarUrl  String value for avatarUrl.
     * @param  description  String value for description.
     * @param  eventsUrl  String value for eventsUrl.
     * @param  hooksUrl  String value for hooksUrl.
     * @param  id  int value for id.
     * @param  issuesUrl  String value for issuesUrl.
     * @param  login  String value for login.
     * @param  membersUrl  String value for membersUrl.
     * @param  nodeId  String value for nodeId.
     * @param  publicMembersUrl  String value for publicMembersUrl.
     * @param  reposUrl  String value for reposUrl.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     */
    public Organization(
            String avatarUrl,
            String description,
            String eventsUrl,
            String hooksUrl,
            int id,
            String issuesUrl,
            String login,
            String membersUrl,
            String nodeId,
            String publicMembersUrl,
            String reposUrl,
            String url,
            String htmlUrl) {
        this.avatarUrl = avatarUrl;
        this.description = description;
        this.eventsUrl = eventsUrl;
        this.hooksUrl = hooksUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.issuesUrl = issuesUrl;
        this.login = login;
        this.membersUrl = membersUrl;
        this.nodeId = nodeId;
        this.publicMembersUrl = publicMembersUrl;
        this.reposUrl = reposUrl;
        this.url = url;
    }

    /**
     * Getter for AvatarUrl.
     * @return Returns the String
     */
    @JsonGetter("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * Setter for AvatarUrl.
     * @param avatarUrl Value for String
     */
    @JsonSetter("avatar_url")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
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
     * Getter for EventsUrl.
     * @return Returns the String
     */
    @JsonGetter("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     * Setter for EventsUrl.
     * @param eventsUrl Value for String
     */
    @JsonSetter("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    /**
     * Getter for HooksUrl.
     * @return Returns the String
     */
    @JsonGetter("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    /**
     * Setter for HooksUrl.
     * @param hooksUrl Value for String
     */
    @JsonSetter("hooks_url")
    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
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
     * Getter for IssuesUrl.
     * @return Returns the String
     */
    @JsonGetter("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    /**
     * Setter for IssuesUrl.
     * @param issuesUrl Value for String
     */
    @JsonSetter("issues_url")
    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    /**
     * Getter for Login.
     * @return Returns the String
     */
    @JsonGetter("login")
    public String getLogin() {
        return login;
    }

    /**
     * Setter for Login.
     * @param login Value for String
     */
    @JsonSetter("login")
    public void setLogin(String login) {
        this.login = login;
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
     * Getter for PublicMembersUrl.
     * @return Returns the String
     */
    @JsonGetter("public_members_url")
    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    /**
     * Setter for PublicMembersUrl.
     * @param publicMembersUrl Value for String
     */
    @JsonSetter("public_members_url")
    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    /**
     * Getter for ReposUrl.
     * @return Returns the String
     */
    @JsonGetter("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    /**
     * Setter for ReposUrl.
     * @param reposUrl Value for String
     */
    @JsonSetter("repos_url")
    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
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
     * Converts this Organization into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Organization [" + "avatarUrl=" + avatarUrl + ", description=" + description
                + ", eventsUrl=" + eventsUrl + ", hooksUrl=" + hooksUrl + ", id=" + id
                + ", issuesUrl=" + issuesUrl + ", login=" + login + ", membersUrl=" + membersUrl
                + ", nodeId=" + nodeId + ", publicMembersUrl=" + publicMembersUrl + ", reposUrl="
                + reposUrl + ", url=" + url + ", htmlUrl=" + htmlUrl + "]";
    }

    /**
     * Builds a new {@link Organization.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Organization.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(avatarUrl, description, eventsUrl, hooksUrl, id, issuesUrl,
                login, membersUrl, nodeId, publicMembersUrl, reposUrl, url)
                .htmlUrl(getHtmlUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Organization}.
     */
    public static class Builder {
        private String avatarUrl;
        private String description;
        private String eventsUrl;
        private String hooksUrl;
        private int id;
        private String issuesUrl;
        private String login;
        private String membersUrl;
        private String nodeId;
        private String publicMembersUrl;
        private String reposUrl;
        private String url;
        private String htmlUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  avatarUrl  String value for avatarUrl.
         * @param  description  String value for description.
         * @param  eventsUrl  String value for eventsUrl.
         * @param  hooksUrl  String value for hooksUrl.
         * @param  id  int value for id.
         * @param  issuesUrl  String value for issuesUrl.
         * @param  login  String value for login.
         * @param  membersUrl  String value for membersUrl.
         * @param  nodeId  String value for nodeId.
         * @param  publicMembersUrl  String value for publicMembersUrl.
         * @param  reposUrl  String value for reposUrl.
         * @param  url  String value for url.
         */
        public Builder(String avatarUrl, String description, String eventsUrl, String hooksUrl,
                int id, String issuesUrl, String login, String membersUrl, String nodeId,
                String publicMembersUrl, String reposUrl, String url) {
            this.avatarUrl = avatarUrl;
            this.description = description;
            this.eventsUrl = eventsUrl;
            this.hooksUrl = hooksUrl;
            this.id = id;
            this.issuesUrl = issuesUrl;
            this.login = login;
            this.membersUrl = membersUrl;
            this.nodeId = nodeId;
            this.publicMembersUrl = publicMembersUrl;
            this.reposUrl = reposUrl;
            this.url = url;
        }

        /**
         * Setter for avatarUrl.
         * @param  avatarUrl  String value for avatarUrl.
         * @return Builder
         */
        public Builder avatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
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
         * Setter for eventsUrl.
         * @param  eventsUrl  String value for eventsUrl.
         * @return Builder
         */
        public Builder eventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
            return this;
        }

        /**
         * Setter for hooksUrl.
         * @param  hooksUrl  String value for hooksUrl.
         * @return Builder
         */
        public Builder hooksUrl(String hooksUrl) {
            this.hooksUrl = hooksUrl;
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
         * Setter for issuesUrl.
         * @param  issuesUrl  String value for issuesUrl.
         * @return Builder
         */
        public Builder issuesUrl(String issuesUrl) {
            this.issuesUrl = issuesUrl;
            return this;
        }

        /**
         * Setter for login.
         * @param  login  String value for login.
         * @return Builder
         */
        public Builder login(String login) {
            this.login = login;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * Setter for publicMembersUrl.
         * @param  publicMembersUrl  String value for publicMembersUrl.
         * @return Builder
         */
        public Builder publicMembersUrl(String publicMembersUrl) {
            this.publicMembersUrl = publicMembersUrl;
            return this;
        }

        /**
         * Setter for reposUrl.
         * @param  reposUrl  String value for reposUrl.
         * @return Builder
         */
        public Builder reposUrl(String reposUrl) {
            this.reposUrl = reposUrl;
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
         * Builds a new {@link Organization} object using the set fields.
         * @return {@link Organization}
         */
        public Organization build() {
            return new Organization(avatarUrl, description, eventsUrl, hooksUrl, id, issuesUrl,
                    login, membersUrl, nodeId, publicMembersUrl, reposUrl, url, htmlUrl);
        }
    }
}
