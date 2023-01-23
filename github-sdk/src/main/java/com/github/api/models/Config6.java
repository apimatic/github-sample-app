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
 * This is a model class for Config6 type.
 */
public class Config6 {
    private String url;
    private String contentType;
    private String secret;
    private Object insecureSsl;
    private String token;
    private String digest;

    /**
     * Default constructor.
     */
    public Config6() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  contentType  String value for contentType.
     * @param  secret  String value for secret.
     * @param  insecureSsl  Object value for insecureSsl.
     * @param  token  String value for token.
     * @param  digest  String value for digest.
     */
    public Config6(
            String url,
            String contentType,
            String secret,
            Object insecureSsl,
            String token,
            String digest) {
        this.url = url;
        this.contentType = contentType;
        this.secret = secret;
        this.insecureSsl = insecureSsl;
        this.token = token;
        this.digest = digest;
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
     * Getter for Token.
     * @return Returns the String
     */
    @JsonGetter("token")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getToken() {
        return token;
    }

    /**
     * Setter for Token.
     * @param token Value for String
     */
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * Getter for Digest.
     * @return Returns the String
     */
    @JsonGetter("digest")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDigest() {
        return digest;
    }

    /**
     * Setter for Digest.
     * @param digest Value for String
     */
    @JsonSetter("digest")
    public void setDigest(String digest) {
        this.digest = digest;
    }

    /**
     * Converts this Config6 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Config6 [" + "url=" + url + ", contentType=" + contentType + ", secret=" + secret
                + ", insecureSsl=" + insecureSsl + ", token=" + token + ", digest=" + digest + "]";
    }

    /**
     * Builds a new {@link Config6.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Config6.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .url(getUrl())
                .contentType(getContentType())
                .secret(getSecret())
                .insecureSsl(getInsecureSsl())
                .token(getToken())
                .digest(getDigest());
        return builder;
    }

    /**
     * Class to build instances of {@link Config6}.
     */
    public static class Builder {
        private String url;
        private String contentType;
        private String secret;
        private Object insecureSsl;
        private String token;
        private String digest;



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
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Setter for digest.
         * @param  digest  String value for digest.
         * @return Builder
         */
        public Builder digest(String digest) {
            this.digest = digest;
            return this;
        }

        /**
         * Builds a new {@link Config6} object using the set fields.
         * @return {@link Config6}
         */
        public Config6 build() {
            return new Config6(url, contentType, secret, insecureSsl, token, digest);
        }
    }
}
