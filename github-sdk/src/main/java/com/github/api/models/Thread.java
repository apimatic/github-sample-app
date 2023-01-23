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
 * This is a model class for Thread type.
 */
public class Thread {
    private String id;
    private Repository7 repository;
    private Subject subject;
    private String reason;
    private boolean unread;
    private String updatedAt;
    private String lastReadAt;
    private String url;
    private String subscriptionUrl;

    /**
     * Default constructor.
     */
    public Thread() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  repository  Repository7 value for repository.
     * @param  subject  Subject value for subject.
     * @param  reason  String value for reason.
     * @param  unread  boolean value for unread.
     * @param  updatedAt  String value for updatedAt.
     * @param  lastReadAt  String value for lastReadAt.
     * @param  url  String value for url.
     * @param  subscriptionUrl  String value for subscriptionUrl.
     */
    public Thread(
            String id,
            Repository7 repository,
            Subject subject,
            String reason,
            boolean unread,
            String updatedAt,
            String lastReadAt,
            String url,
            String subscriptionUrl) {
        this.id = id;
        this.repository = repository;
        this.subject = subject;
        this.reason = reason;
        this.unread = unread;
        this.updatedAt = updatedAt;
        this.lastReadAt = lastReadAt;
        this.url = url;
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Repository.
     * @return Returns the Repository7
     */
    @JsonGetter("repository")
    public Repository7 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository7
     */
    @JsonSetter("repository")
    public void setRepository(Repository7 repository) {
        this.repository = repository;
    }

    /**
     * Getter for Subject.
     * @return Returns the Subject
     */
    @JsonGetter("subject")
    public Subject getSubject() {
        return subject;
    }

    /**
     * Setter for Subject.
     * @param subject Value for Subject
     */
    @JsonSetter("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    /**
     * Getter for Reason.
     * @return Returns the String
     */
    @JsonGetter("reason")
    public String getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * @param reason Value for String
     */
    @JsonSetter("reason")
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * Getter for Unread.
     * @return Returns the boolean
     */
    @JsonGetter("unread")
    public boolean getUnread() {
        return unread;
    }

    /**
     * Setter for Unread.
     * @param unread Value for boolean
     */
    @JsonSetter("unread")
    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for String
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for LastReadAt.
     * @return Returns the String
     */
    @JsonGetter("last_read_at")
    public String getLastReadAt() {
        return lastReadAt;
    }

    /**
     * Setter for LastReadAt.
     * @param lastReadAt Value for String
     */
    @JsonSetter("last_read_at")
    public void setLastReadAt(String lastReadAt) {
        this.lastReadAt = lastReadAt;
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
     * Getter for SubscriptionUrl.
     * @return Returns the String
     */
    @JsonGetter("subscription_url")
    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    /**
     * Setter for SubscriptionUrl.
     * @param subscriptionUrl Value for String
     */
    @JsonSetter("subscription_url")
    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    /**
     * Converts this Thread into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Thread [" + "id=" + id + ", repository=" + repository + ", subject=" + subject
                + ", reason=" + reason + ", unread=" + unread + ", updatedAt=" + updatedAt
                + ", lastReadAt=" + lastReadAt + ", url=" + url + ", subscriptionUrl="
                + subscriptionUrl + "]";
    }

    /**
     * Builds a new {@link Thread.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Thread.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, repository, subject, reason, unread, updatedAt,
                lastReadAt, url, subscriptionUrl);
        return builder;
    }

    /**
     * Class to build instances of {@link Thread}.
     */
    public static class Builder {
        private String id;
        private Repository7 repository;
        private Subject subject;
        private String reason;
        private boolean unread;
        private String updatedAt;
        private String lastReadAt;
        private String url;
        private String subscriptionUrl;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  String value for id.
         * @param  repository  Repository7 value for repository.
         * @param  subject  Subject value for subject.
         * @param  reason  String value for reason.
         * @param  unread  boolean value for unread.
         * @param  updatedAt  String value for updatedAt.
         * @param  lastReadAt  String value for lastReadAt.
         * @param  url  String value for url.
         * @param  subscriptionUrl  String value for subscriptionUrl.
         */
        public Builder(String id, Repository7 repository, Subject subject, String reason,
                boolean unread, String updatedAt, String lastReadAt, String url,
                String subscriptionUrl) {
            this.id = id;
            this.repository = repository;
            this.subject = subject;
            this.reason = reason;
            this.unread = unread;
            this.updatedAt = updatedAt;
            this.lastReadAt = lastReadAt;
            this.url = url;
            this.subscriptionUrl = subscriptionUrl;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for repository.
         * @param  repository  Repository7 value for repository.
         * @return Builder
         */
        public Builder repository(Repository7 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Setter for subject.
         * @param  subject  Subject value for subject.
         * @return Builder
         */
        public Builder subject(Subject subject) {
            this.subject = subject;
            return this;
        }

        /**
         * Setter for reason.
         * @param  reason  String value for reason.
         * @return Builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Setter for unread.
         * @param  unread  boolean value for unread.
         * @return Builder
         */
        public Builder unread(boolean unread) {
            this.unread = unread;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for lastReadAt.
         * @param  lastReadAt  String value for lastReadAt.
         * @return Builder
         */
        public Builder lastReadAt(String lastReadAt) {
            this.lastReadAt = lastReadAt;
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
         * Setter for subscriptionUrl.
         * @param  subscriptionUrl  String value for subscriptionUrl.
         * @return Builder
         */
        public Builder subscriptionUrl(String subscriptionUrl) {
            this.subscriptionUrl = subscriptionUrl;
            return this;
        }

        /**
         * Builds a new {@link Thread} object using the set fields.
         * @return {@link Thread}
         */
        public Thread build() {
            return new Thread(id, repository, subject, reason, unread, updatedAt, lastReadAt, url,
                    subscriptionUrl);
        }
    }
}
