/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.BaseModel;

/**
 * This is a model class for User1 type.
 */
public class User1 {
    private String avatarUrl;
    private String eventsUrl;
    private String followersUrl;
    private String followingUrl;
    private String gistsUrl;
    private String gravatarId;
    private String htmlUrl;
    private int id;
    private String nodeId;
    private String login;
    private String organizationsUrl;
    private String receivedEventsUrl;
    private String reposUrl;
    private boolean siteAdmin;
    private String starredUrl;
    private String subscriptionsUrl;
    private String type;
    private String url;

    /**
     * Default constructor.
     */
    public User1() {
    }

    /**
     * Initialization constructor.
     * @param  avatarUrl  String value for avatarUrl.
     * @param  eventsUrl  String value for eventsUrl.
     * @param  followersUrl  String value for followersUrl.
     * @param  followingUrl  String value for followingUrl.
     * @param  gistsUrl  String value for gistsUrl.
     * @param  gravatarId  String value for gravatarId.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  login  String value for login.
     * @param  organizationsUrl  String value for organizationsUrl.
     * @param  receivedEventsUrl  String value for receivedEventsUrl.
     * @param  reposUrl  String value for reposUrl.
     * @param  siteAdmin  boolean value for siteAdmin.
     * @param  starredUrl  String value for starredUrl.
     * @param  subscriptionsUrl  String value for subscriptionsUrl.
     * @param  type  String value for type.
     * @param  url  String value for url.
     */
    public User1(
            String avatarUrl,
            String eventsUrl,
            String followersUrl,
            String followingUrl,
            String gistsUrl,
            String gravatarId,
            String htmlUrl,
            int id,
            String nodeId,
            String login,
            String organizationsUrl,
            String receivedEventsUrl,
            String reposUrl,
            boolean siteAdmin,
            String starredUrl,
            String subscriptionsUrl,
            String type,
            String url) {
        this.avatarUrl = avatarUrl;
        this.eventsUrl = eventsUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.gravatarId = gravatarId;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.login = login;
        this.organizationsUrl = organizationsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.reposUrl = reposUrl;
        this.siteAdmin = siteAdmin;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.type = type;
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
     * Getter for FollowersUrl.
     * @return Returns the String
     */
    @JsonGetter("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    /**
     * Setter for FollowersUrl.
     * @param followersUrl Value for String
     */
    @JsonSetter("followers_url")
    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    /**
     * Getter for FollowingUrl.
     * @return Returns the String
     */
    @JsonGetter("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    /**
     * Setter for FollowingUrl.
     * @param followingUrl Value for String
     */
    @JsonSetter("following_url")
    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    /**
     * Getter for GistsUrl.
     * @return Returns the String
     */
    @JsonGetter("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    /**
     * Setter for GistsUrl.
     * @param gistsUrl Value for String
     */
    @JsonSetter("gists_url")
    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    /**
     * Getter for GravatarId.
     * @return Returns the String
     */
    @JsonGetter("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    /**
     * Setter for GravatarId.
     * @param gravatarId Value for String
     */
    @JsonSetter("gravatar_id")
    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
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
     * Getter for OrganizationsUrl.
     * @return Returns the String
     */
    @JsonGetter("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    /**
     * Setter for OrganizationsUrl.
     * @param organizationsUrl Value for String
     */
    @JsonSetter("organizations_url")
    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    /**
     * Getter for ReceivedEventsUrl.
     * @return Returns the String
     */
    @JsonGetter("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    /**
     * Setter for ReceivedEventsUrl.
     * @param receivedEventsUrl Value for String
     */
    @JsonSetter("received_events_url")
    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
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
     * Getter for SiteAdmin.
     * @return Returns the boolean
     */
    @JsonGetter("site_admin")
    public boolean getSiteAdmin() {
        return siteAdmin;
    }

    /**
     * Setter for SiteAdmin.
     * @param siteAdmin Value for boolean
     */
    @JsonSetter("site_admin")
    public void setSiteAdmin(boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    /**
     * Getter for StarredUrl.
     * @return Returns the String
     */
    @JsonGetter("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    /**
     * Setter for StarredUrl.
     * @param starredUrl Value for String
     */
    @JsonSetter("starred_url")
    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    /**
     * Getter for SubscriptionsUrl.
     * @return Returns the String
     */
    @JsonGetter("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    /**
     * Setter for SubscriptionsUrl.
     * @param subscriptionsUrl Value for String
     */
    @JsonSetter("subscriptions_url")
    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
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
     * Converts this User1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "User1 [" + "avatarUrl=" + avatarUrl + ", eventsUrl=" + eventsUrl + ", followersUrl="
                + followersUrl + ", followingUrl=" + followingUrl + ", gistsUrl=" + gistsUrl
                + ", gravatarId=" + gravatarId + ", htmlUrl=" + htmlUrl + ", id=" + id + ", nodeId="
                + nodeId + ", login=" + login + ", organizationsUrl=" + organizationsUrl
                + ", receivedEventsUrl=" + receivedEventsUrl + ", reposUrl=" + reposUrl
                + ", siteAdmin=" + siteAdmin + ", starredUrl=" + starredUrl + ", subscriptionsUrl="
                + subscriptionsUrl + ", type=" + type + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link User1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link User1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(avatarUrl, eventsUrl, followersUrl, followingUrl, gistsUrl,
                gravatarId, htmlUrl, id, nodeId, login, organizationsUrl, receivedEventsUrl,
                reposUrl, siteAdmin, starredUrl, subscriptionsUrl, type, url);
        return builder;
    }

    /**
     * Class to build instances of {@link User1}.
     */
    public static class Builder {
        private String avatarUrl;
        private String eventsUrl;
        private String followersUrl;
        private String followingUrl;
        private String gistsUrl;
        private String gravatarId;
        private String htmlUrl;
        private int id;
        private String nodeId;
        private String login;
        private String organizationsUrl;
        private String receivedEventsUrl;
        private String reposUrl;
        private boolean siteAdmin;
        private String starredUrl;
        private String subscriptionsUrl;
        private String type;
        private String url;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  avatarUrl  String value for avatarUrl.
         * @param  eventsUrl  String value for eventsUrl.
         * @param  followersUrl  String value for followersUrl.
         * @param  followingUrl  String value for followingUrl.
         * @param  gistsUrl  String value for gistsUrl.
         * @param  gravatarId  String value for gravatarId.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  login  String value for login.
         * @param  organizationsUrl  String value for organizationsUrl.
         * @param  receivedEventsUrl  String value for receivedEventsUrl.
         * @param  reposUrl  String value for reposUrl.
         * @param  siteAdmin  boolean value for siteAdmin.
         * @param  starredUrl  String value for starredUrl.
         * @param  subscriptionsUrl  String value for subscriptionsUrl.
         * @param  type  String value for type.
         * @param  url  String value for url.
         */
        public Builder(String avatarUrl, String eventsUrl, String followersUrl, String followingUrl,
                String gistsUrl, String gravatarId, String htmlUrl, int id, String nodeId,
                String login, String organizationsUrl, String receivedEventsUrl, String reposUrl,
                boolean siteAdmin, String starredUrl, String subscriptionsUrl, String type,
                String url) {
            this.avatarUrl = avatarUrl;
            this.eventsUrl = eventsUrl;
            this.followersUrl = followersUrl;
            this.followingUrl = followingUrl;
            this.gistsUrl = gistsUrl;
            this.gravatarId = gravatarId;
            this.htmlUrl = htmlUrl;
            this.id = id;
            this.nodeId = nodeId;
            this.login = login;
            this.organizationsUrl = organizationsUrl;
            this.receivedEventsUrl = receivedEventsUrl;
            this.reposUrl = reposUrl;
            this.siteAdmin = siteAdmin;
            this.starredUrl = starredUrl;
            this.subscriptionsUrl = subscriptionsUrl;
            this.type = type;
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
         * Setter for eventsUrl.
         * @param  eventsUrl  String value for eventsUrl.
         * @return Builder
         */
        public Builder eventsUrl(String eventsUrl) {
            this.eventsUrl = eventsUrl;
            return this;
        }

        /**
         * Setter for followersUrl.
         * @param  followersUrl  String value for followersUrl.
         * @return Builder
         */
        public Builder followersUrl(String followersUrl) {
            this.followersUrl = followersUrl;
            return this;
        }

        /**
         * Setter for followingUrl.
         * @param  followingUrl  String value for followingUrl.
         * @return Builder
         */
        public Builder followingUrl(String followingUrl) {
            this.followingUrl = followingUrl;
            return this;
        }

        /**
         * Setter for gistsUrl.
         * @param  gistsUrl  String value for gistsUrl.
         * @return Builder
         */
        public Builder gistsUrl(String gistsUrl) {
            this.gistsUrl = gistsUrl;
            return this;
        }

        /**
         * Setter for gravatarId.
         * @param  gravatarId  String value for gravatarId.
         * @return Builder
         */
        public Builder gravatarId(String gravatarId) {
            this.gravatarId = gravatarId;
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
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
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
         * Setter for organizationsUrl.
         * @param  organizationsUrl  String value for organizationsUrl.
         * @return Builder
         */
        public Builder organizationsUrl(String organizationsUrl) {
            this.organizationsUrl = organizationsUrl;
            return this;
        }

        /**
         * Setter for receivedEventsUrl.
         * @param  receivedEventsUrl  String value for receivedEventsUrl.
         * @return Builder
         */
        public Builder receivedEventsUrl(String receivedEventsUrl) {
            this.receivedEventsUrl = receivedEventsUrl;
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
         * Setter for siteAdmin.
         * @param  siteAdmin  boolean value for siteAdmin.
         * @return Builder
         */
        public Builder siteAdmin(boolean siteAdmin) {
            this.siteAdmin = siteAdmin;
            return this;
        }

        /**
         * Setter for starredUrl.
         * @param  starredUrl  String value for starredUrl.
         * @return Builder
         */
        public Builder starredUrl(String starredUrl) {
            this.starredUrl = starredUrl;
            return this;
        }

        /**
         * Setter for subscriptionsUrl.
         * @param  subscriptionsUrl  String value for subscriptionsUrl.
         * @return Builder
         */
        public Builder subscriptionsUrl(String subscriptionsUrl) {
            this.subscriptionsUrl = subscriptionsUrl;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link User1} object using the set fields.
         * @return {@link User1}
         */
        public User1 build() {
            return new User1(avatarUrl, eventsUrl, followersUrl, followingUrl, gistsUrl, gravatarId,
                    htmlUrl, id, nodeId, login, organizationsUrl, receivedEventsUrl, reposUrl,
                    siteAdmin, starredUrl, subscriptionsUrl, type, url);
        }
    }
}
