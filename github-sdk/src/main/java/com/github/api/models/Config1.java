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
 * This is a model class for Config1 type.
 */
public class Config1 {
    private String email;
    private String password;
    private String room;
    private String subdomain;
    private String url;
    private Object insecureSsl;
    private String contentType;
    private String digest;
    private String secret;
    private String token;

    /**
     * Default constructor.
     */
    public Config1() {
    }

    /**
     * Initialization constructor.
     * @param  email  String value for email.
     * @param  password  String value for password.
     * @param  room  String value for room.
     * @param  subdomain  String value for subdomain.
     * @param  url  String value for url.
     * @param  insecureSsl  Object value for insecureSsl.
     * @param  contentType  String value for contentType.
     * @param  digest  String value for digest.
     * @param  secret  String value for secret.
     * @param  token  String value for token.
     */
    public Config1(
            String email,
            String password,
            String room,
            String subdomain,
            String url,
            Object insecureSsl,
            String contentType,
            String digest,
            String secret,
            String token) {
        this.email = email;
        this.password = password;
        this.room = room;
        this.subdomain = subdomain;
        this.url = url;
        this.insecureSsl = insecureSsl;
        this.contentType = contentType;
        this.digest = digest;
        this.secret = secret;
        this.token = token;
    }

    /**
     * Getter for Email.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for Password.
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
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
     * Getter for Subdomain.
     * @return Returns the String
     */
    @JsonGetter("subdomain")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSubdomain() {
        return subdomain;
    }

    /**
     * Setter for Subdomain.
     * @param subdomain Value for String
     */
    @JsonSetter("subdomain")
    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
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
     * Converts this Config1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Config1 [" + "email=" + email + ", password=" + password + ", room=" + room
                + ", subdomain=" + subdomain + ", url=" + url + ", insecureSsl=" + insecureSsl
                + ", contentType=" + contentType + ", digest=" + digest + ", secret=" + secret
                + ", token=" + token + "]";
    }

    /**
     * Builds a new {@link Config1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Config1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .email(getEmail())
                .password(getPassword())
                .room(getRoom())
                .subdomain(getSubdomain())
                .url(getUrl())
                .insecureSsl(getInsecureSsl())
                .contentType(getContentType())
                .digest(getDigest())
                .secret(getSecret())
                .token(getToken());
        return builder;
    }

    /**
     * Class to build instances of {@link Config1}.
     */
    public static class Builder {
        private String email;
        private String password;
        private String room;
        private String subdomain;
        private String url;
        private Object insecureSsl;
        private String contentType;
        private String digest;
        private String secret;
        private String token;



        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
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
         * Setter for subdomain.
         * @param  subdomain  String value for subdomain.
         * @return Builder
         */
        public Builder subdomain(String subdomain) {
            this.subdomain = subdomain;
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
         * Setter for insecureSsl.
         * @param  insecureSsl  Object value for insecureSsl.
         * @return Builder
         */
        public Builder insecureSsl(Object insecureSsl) {
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
         * Setter for digest.
         * @param  digest  String value for digest.
         * @return Builder
         */
        public Builder digest(String digest) {
            this.digest = digest;
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
         * Setter for token.
         * @param  token  String value for token.
         * @return Builder
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }

        /**
         * Builds a new {@link Config1} object using the set fields.
         * @return {@link Config1}
         */
        public Config1 build() {
            return new Config1(email, password, room, subdomain, url, insecureSsl, contentType,
                    digest, secret, token);
        }
    }
}
