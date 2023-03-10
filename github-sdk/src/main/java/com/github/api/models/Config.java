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
 * This is a model class for Config type.
 */
public class Config {
    private String url;
    private String insecureSsl;
    private String contentType;
    private String secret;

    /**
     * Default constructor.
     */
    public Config() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  insecureSsl  String value for insecureSsl.
     * @param  contentType  String value for contentType.
     * @param  secret  String value for secret.
     */
    public Config(
            String url,
            String insecureSsl,
            String contentType,
            String secret) {
        this.url = url;
        this.insecureSsl = insecureSsl;
        this.contentType = contentType;
        this.secret = secret;
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
     * Getter for InsecureSsl.
     * @return Returns the String
     */
    @JsonGetter("insecure_ssl")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInsecureSsl() {
        return insecureSsl;
    }

    /**
     * Setter for InsecureSsl.
     * @param insecureSsl Value for String
     */
    @JsonSetter("insecure_ssl")
    public void setInsecureSsl(String insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    /**
     * Getter for ContentType.
     * @return Returns the String
     */
    @JsonGetter("content_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getContentType() {
        return contentType;
    }

    /**
     * Setter for ContentType.
     * @param contentType Value for String
     */
    @JsonSetter("content_type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    /**
     * Getter for Secret.
     * @return Returns the String
     */
    @JsonGetter("secret")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSecret() {
        return secret;
    }

    /**
     * Setter for Secret.
     * @param secret Value for String
     */
    @JsonSetter("secret")
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * Converts this Config into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Config [" + "url=" + url + ", insecureSsl=" + insecureSsl + ", contentType="
                + contentType + ", secret=" + secret + "]";
    }

    /**
     * Builds a new {@link Config.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Config.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl())
                .insecureSsl(getInsecureSsl())
                .contentType(getContentType())
                .secret(getSecret());
        return builder;
    }

    /**
     * Class to build instances of {@link Config}.
     */
    public static class Builder {
        private String url;
        private String insecureSsl;
        private String contentType;
        private String secret;



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
         * Setter for insecureSsl.
         * @param  insecureSsl  String value for insecureSsl.
         * @return Builder
         */
        public Builder insecureSsl(String insecureSsl) {
            this.insecureSsl = insecureSsl;
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
         * Builds a new {@link Config} object using the set fields.
         * @return {@link Config}
         */
        public Config build() {
            return new Config(url, insecureSsl, contentType, secret);
        }
    }
}
