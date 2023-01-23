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
 * This is a model class for ReposGitTagsTagShaResponse type.
 */
public class ReposGitTagsTagShaResponse {
    private String nodeId;
    private String tag;
    private String sha;
    private String url;
    private String message;
    private Tagger tagger;
    private Object1 object;
    private Verification verification;

    /**
     * Default constructor.
     */
    public ReposGitTagsTagShaResponse() {
    }

    /**
     * Initialization constructor.
     * @param  nodeId  String value for nodeId.
     * @param  tag  String value for tag.
     * @param  sha  String value for sha.
     * @param  url  String value for url.
     * @param  message  String value for message.
     * @param  tagger  Tagger value for tagger.
     * @param  object  Object1 value for object.
     * @param  verification  Verification value for verification.
     */
    public ReposGitTagsTagShaResponse(
            String nodeId,
            String tag,
            String sha,
            String url,
            String message,
            Tagger tagger,
            Object1 object,
            Verification verification) {
        this.nodeId = nodeId;
        this.tag = tag;
        this.sha = sha;
        this.url = url;
        this.message = message;
        this.tagger = tagger;
        this.object = object;
        this.verification = verification;
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
     * Getter for Tag.
     * Name of the tag
     * @return Returns the String
     */
    @JsonGetter("tag")
    public String getTag() {
        return tag;
    }

    /**
     * Setter for Tag.
     * Name of the tag
     * @param tag Value for String
     */
    @JsonSetter("tag")
    public void setTag(String tag) {
        this.tag = tag;
    }

    /**
     * Getter for Sha.
     * @return Returns the String
     */
    @JsonGetter("sha")
    public String getSha() {
        return sha;
    }

    /**
     * Setter for Sha.
     * @param sha Value for String
     */
    @JsonSetter("sha")
    public void setSha(String sha) {
        this.sha = sha;
    }

    /**
     * Getter for Url.
     * URL for the tag
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * URL for the tag
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Message.
     * Message describing the purpose of the tag
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * Message describing the purpose of the tag
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Tagger.
     * @return Returns the Tagger
     */
    @JsonGetter("tagger")
    public Tagger getTagger() {
        return tagger;
    }

    /**
     * Setter for Tagger.
     * @param tagger Value for Tagger
     */
    @JsonSetter("tagger")
    public void setTagger(Tagger tagger) {
        this.tagger = tagger;
    }

    /**
     * Getter for Object.
     * @return Returns the Object1
     */
    @JsonGetter("object")
    public Object1 getObject() {
        return object;
    }

    /**
     * Setter for Object.
     * @param object Value for Object1
     */
    @JsonSetter("object")
    public void setObject(Object1 object) {
        this.object = object;
    }

    /**
     * Getter for Verification.
     * @return Returns the Verification
     */
    @JsonGetter("verification")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Verification getVerification() {
        return verification;
    }

    /**
     * Setter for Verification.
     * @param verification Value for Verification
     */
    @JsonSetter("verification")
    public void setVerification(Verification verification) {
        this.verification = verification;
    }

    /**
     * Converts this ReposGitTagsTagShaResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposGitTagsTagShaResponse [" + "nodeId=" + nodeId + ", tag=" + tag + ", sha=" + sha
                + ", url=" + url + ", message=" + message + ", tagger=" + tagger + ", object="
                + object + ", verification=" + verification + "]";
    }

    /**
     * Builds a new {@link ReposGitTagsTagShaResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposGitTagsTagShaResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(nodeId, tag, sha, url, message, tagger, object)
                .verification(getVerification());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposGitTagsTagShaResponse}.
     */
    public static class Builder {
        private String nodeId;
        private String tag;
        private String sha;
        private String url;
        private String message;
        private Tagger tagger;
        private Object1 object;
        private Verification verification;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  nodeId  String value for nodeId.
         * @param  tag  String value for tag.
         * @param  sha  String value for sha.
         * @param  url  String value for url.
         * @param  message  String value for message.
         * @param  tagger  Tagger value for tagger.
         * @param  object  Object1 value for object.
         */
        public Builder(String nodeId, String tag, String sha, String url, String message,
                Tagger tagger, Object1 object) {
            this.nodeId = nodeId;
            this.tag = tag;
            this.sha = sha;
            this.url = url;
            this.message = message;
            this.tagger = tagger;
            this.object = object;
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
         * Setter for tag.
         * @param  tag  String value for tag.
         * @return Builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Setter for sha.
         * @param  sha  String value for sha.
         * @return Builder
         */
        public Builder sha(String sha) {
            this.sha = sha;
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
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for tagger.
         * @param  tagger  Tagger value for tagger.
         * @return Builder
         */
        public Builder tagger(Tagger tagger) {
            this.tagger = tagger;
            return this;
        }

        /**
         * Setter for object.
         * @param  object  Object1 value for object.
         * @return Builder
         */
        public Builder object(Object1 object) {
            this.object = object;
            return this;
        }

        /**
         * Setter for verification.
         * @param  verification  Verification value for verification.
         * @return Builder
         */
        public Builder verification(Verification verification) {
            this.verification = verification;
            return this;
        }

        /**
         * Builds a new {@link ReposGitTagsTagShaResponse} object using the set fields.
         * @return {@link ReposGitTagsTagShaResponse}
         */
        public ReposGitTagsTagShaResponse build() {
            return new ReposGitTagsTagShaResponse(nodeId, tag, sha, url, message, tagger, object,
                    verification);
        }
    }
}
