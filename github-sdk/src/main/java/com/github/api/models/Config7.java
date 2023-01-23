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
 * This is a model class for Config7 type.
 */
public class Config7 {
    private String url;
    private String contentType;
    private String secret;
    private Object insecureSsl;
    private String address;
    private String room;

    /**
     * Default constructor.
     */
    public Config7() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  contentType  String value for contentType.
     * @param  secret  String value for secret.
     * @param  insecureSsl  Object value for insecureSsl.
     * @param  address  String value for address.
     * @param  room  String value for room.
     */
    public Config7(
            String url,
            String contentType,
            String secret,
            Object insecureSsl,
            String address,
            String room) {
        this.url = url;
        this.contentType = contentType;
        this.secret = secret;
        this.insecureSsl = insecureSsl;
        this.address = address;
        this.room = room;
    }

    /**
     * Getter for Url.
     * The URL to which the payloads will be delivered.
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The URL to which the payloads will be delivered.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for ContentType.
     * The media type used to serialize the payloads. Supported values include `json` and `form`.
     * The default is `form`.
     * @return Returns the String
     */
    @JsonGetter("content_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * The media type used to serialize the payloads. Supported values include `json` and `form`.
     * The default is `form`.
     * @param contentType Value for String
     */
    @JsonSetter("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Secret.
     * If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for
     * [delivery signature
     * headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
     * @return Returns the String
     */
    @JsonGetter("secret")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecret() {
        return secret;
    }

    /**
     * Setter for Secret.
     * If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for
     * [delivery signature
     * headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers).
     * @param secret Value for String
     */
    @JsonSetter("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * Getter for InsecureSsl.
     * @return Returns the Object
     */
    @JsonGetter("insecure_ssl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getInsecureSsl() {
        return insecureSsl;
    }

    /**
     * Setter for InsecureSsl.
     * @param insecureSsl Value for Object
     */
    @JsonSetter("insecure_ssl")
    public void setInsecureSsl(Object insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    /**
     * Getter for Address.
     * @return Returns the String
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for String
     */
    @JsonSetter("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for Room.
     * @return Returns the String
     */
    @JsonGetter("room")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRoom() {
        return room;
    }

    /**
     * Setter for Room.
     * @param room Value for String
     */
    @JsonSetter("room")
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * Converts this Config7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Config7 [" + "url=" + url + ", contentType=" + contentType + ", secret=" + secret
                + ", insecureSsl=" + insecureSsl + ", address=" + address + ", room=" + room + "]";
    }

    /**
     * Builds a new {@link Config7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Config7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url)
                .contentType(getContentType())
                .secret(getSecret())
                .insecureSsl(getInsecureSsl())
                .address(getAddress())
                .room(getRoom());
        return builder;
    }

    /**
     * Class to build instances of {@link Config7}.
     */
    public static class Builder {
        private String url;
        private String contentType;
        private String secret;
        private Object insecureSsl;
        private String address;
        private String room;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         */
        public Builder(String url) {
            this.url = url;
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
         * Setter for contentType.
         * @param  contentType  String value for contentType.
         * @return Builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * Setter for secret.
         * @param  secret  String value for secret.
         * @return Builder
         */
        public Builder secret(String secret) {
            this.secret = secret;
            return this;
        }

        /**
         * Setter for insecureSsl.
         * @param  insecureSsl  Object value for insecureSsl.
         * @return Builder
         */
        public Builder insecureSsl(Object insecureSsl) {
            this.insecureSsl = insecureSsl;
            return this;
        }

        /**
         * Setter for address.
         * @param  address  String value for address.
         * @return Builder
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * Setter for room.
         * @param  room  String value for room.
         * @return Builder
         */
        public Builder room(String room) {
            this.room = room;
            return this;
        }

        /**
         * Builds a new {@link Config7} object using the set fields.
         * @return {@link Config7}
         */
        public Config7 build() {
            return new Config7(url, contentType, secret, insecureSsl, address, room);
        }
    }
}
