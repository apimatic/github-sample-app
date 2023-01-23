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
 * This is a model class for Config3 type.
 */
public class Config3 {
    private String contentType;
    private Object insecureSsl;
    private String secret;
    private String url;

    /**
     * Default constructor.
     */
    public Config3() {
    }

    /**
     * Initialization constructor.
     * @param  contentType  String value for contentType.
     * @param  insecureSsl  Object value for insecureSsl.
     * @param  secret  String value for secret.
     * @param  url  String value for url.
     */
    public Config3(
            String contentType,
            Object insecureSsl,
            String secret,
            String url) {
        this.contentType = contentType;
        this.insecureSsl = insecureSsl;
        this.secret = secret;
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
     * Getter for Url.
     * The URL to which the payloads will be delivered.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Converts this Config3 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Config3 [" + "contentType=" + contentType + ", insecureSsl=" + insecureSsl
                + ", secret=" + secret + ", url=" + url + "]";
    }

    /**
     * Builds a new {@link Config3.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Config3.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .contentType(getContentType())
                .insecureSsl(getInsecureSsl())
                .secret(getSecret())
                .url(getUrl());
        return builder;
    }

    /**
     * Class to build instances of {@link Config3}.
     */
    public static class Builder {
        private String contentType;
        private Object insecureSsl;
        private String secret;
        private String url;



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
         * Setter for insecureSsl.
         * @param  insecureSsl  Object value for insecureSsl.
         * @return Builder
         */
        public Builder insecureSsl(Object insecureSsl) {
            this.insecureSsl = insecureSsl;
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
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        /**
         * Builds a new {@link Config3} object using the set fields.
         * @return {@link Config3}
         */
        public Config3 build() {
            return new Config3(contentType, insecureSsl, secret, url);
        }
    }
}
