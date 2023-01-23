/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for ReposPagesBuildsLatestResponse type.
 */
public class ReposPagesBuildsLatestResponse {
    private String url;
    private String status;
    private Error2 error;
    private Object pusher;
    private String commit;
    private int duration;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Default constructor.
     */
    public ReposPagesBuildsLatestResponse() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  status  String value for status.
     * @param  error  Error2 value for error.
     * @param  pusher  Object value for pusher.
     * @param  commit  String value for commit.
     * @param  duration  int value for duration.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     */
    public ReposPagesBuildsLatestResponse(
            String url,
            String status,
            Error2 error,
            Object pusher,
            String commit,
            int duration,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.url = url;
        this.status = status;
        this.error = error;
        this.pusher = pusher;
        this.commit = commit;
        this.duration = duration;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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
     * Getter for Status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Error.
     * @return Returns the Error2
     */
    @JsonGetter("error")
    public Error2 getError() {
        return error;
    }

    /**
     * Setter for Error.
     * @param error Value for Error2
     */
    @JsonSetter("error")
    public void setError(Error2 error) {
        this.error = error;
    }

    /**
     * Getter for Pusher.
     * @return Returns the Object
     */
    @JsonGetter("pusher")
    public Object getPusher() {
        return pusher;
    }

    /**
     * Setter for Pusher.
     * @param pusher Value for Object
     */
    @JsonSetter("pusher")
    public void setPusher(Object pusher) {
        this.pusher = pusher;
    }

    /**
     * Getter for Commit.
     * @return Returns the String
     */
    @JsonGetter("commit")
    public String getCommit() {
        return commit;
    }

    /**
     * Setter for Commit.
     * @param commit Value for String
     */
    @JsonSetter("commit")
    public void setCommit(String commit) {
        this.commit = commit;
    }

    /**
     * Getter for Duration.
     * @return Returns the int
     */
    @JsonGetter("duration")
    public int getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * @param duration Value for int
     */
    @JsonSetter("duration")
    public void setDuration(int duration) {
        this.duration = duration;
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
     * Converts this ReposPagesBuildsLatestResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposPagesBuildsLatestResponse [" + "url=" + url + ", status=" + status + ", error="
                + error + ", pusher=" + pusher + ", commit=" + commit + ", duration=" + duration
                + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
    }

    /**
     * Builds a new {@link ReposPagesBuildsLatestResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposPagesBuildsLatestResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, status, error, pusher, commit, duration, createdAt,
                updatedAt);
        return builder;
    }

    /**
     * Class to build instances of {@link ReposPagesBuildsLatestResponse}.
     */
    public static class Builder {
        private String url;
        private String status;
        private Error2 error;
        private Object pusher;
        private String commit;
        private int duration;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  status  String value for status.
         * @param  error  Error2 value for error.
         * @param  pusher  Object value for pusher.
         * @param  commit  String value for commit.
         * @param  duration  int value for duration.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         */
        public Builder(String url, String status, Error2 error, Object pusher, String commit,
                int duration, LocalDateTime createdAt, LocalDateTime updatedAt) {
            this.url = url;
            this.status = status;
            this.error = error;
            this.pusher = pusher;
            this.commit = commit;
            this.duration = duration;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  Error2 value for error.
         * @return Builder
         */
        public Builder error(Error2 error) {
            this.error = error;
            return this;
        }

        /**
         * Setter for pusher.
         * @param  pusher  Object value for pusher.
         * @return Builder
         */
        public Builder pusher(Object pusher) {
            this.pusher = pusher;
            return this;
        }

        /**
         * Setter for commit.
         * @param  commit  String value for commit.
         * @return Builder
         */
        public Builder commit(String commit) {
            this.commit = commit;
            return this;
        }

        /**
         * Setter for duration.
         * @param  duration  int value for duration.
         * @return Builder
         */
        public Builder duration(int duration) {
            this.duration = duration;
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
         * Builds a new {@link ReposPagesBuildsLatestResponse} object using the set fields.
         * @return {@link ReposPagesBuildsLatestResponse}
         */
        public ReposPagesBuildsLatestResponse build() {
            return new ReposPagesBuildsLatestResponse(url, status, error, pusher, commit, duration,
                    createdAt, updatedAt);
        }
    }
}
