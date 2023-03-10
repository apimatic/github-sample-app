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
 * This is a model class for RepositoriesEnvironmentsSecretsSecretNameRequest type.
 */
public class RepositoriesEnvironmentsSecretsSecretNameRequest {
    private String encryptedValue;
    private String keyId;

    /**
     * Default constructor.
     */
    public RepositoriesEnvironmentsSecretsSecretNameRequest() {
    }

    /**
     * Initialization constructor.
     * @param  encryptedValue  String value for encryptedValue.
     * @param  keyId  String value for keyId.
     */
    public RepositoriesEnvironmentsSecretsSecretNameRequest(
            String encryptedValue,
            String keyId) {
        this.encryptedValue = encryptedValue;
        this.keyId = keyId;
    }

    /**
     * Getter for EncryptedValue.
     * Value for your secret, encrypted with
     * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public
     * key retrieved from the [Get an environment public
     * key](https://docs.github.com/rest/reference/actions#get-an-environment-public-key) endpoint.
     * @return Returns the String
     */
    @JsonGetter("encrypted_value")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    /**
     * Setter for EncryptedValue.
     * Value for your secret, encrypted with
     * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public
     * key retrieved from the [Get an environment public
     * key](https://docs.github.com/rest/reference/actions#get-an-environment-public-key) endpoint.
     * @param encryptedValue Value for String
     */
    @JsonSetter("encrypted_value")
    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    /**
     * Getter for KeyId.
     * ID of the key you used to encrypt the secret.
     * @return Returns the String
     */
    @JsonGetter("key_id")
    public String getKeyId() {
        return keyId;
    }

    /**
     * Setter for KeyId.
     * ID of the key you used to encrypt the secret.
     * @param keyId Value for String
     */
    @JsonSetter("key_id")
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * Converts this RepositoriesEnvironmentsSecretsSecretNameRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RepositoriesEnvironmentsSecretsSecretNameRequest [" + "encryptedValue="
                + encryptedValue + ", keyId=" + keyId + "]";
    }

    /**
     * Builds a new {@link RepositoriesEnvironmentsSecretsSecretNameRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RepositoriesEnvironmentsSecretsSecretNameRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(encryptedValue, keyId);
        return builder;
    }

    /**
     * Class to build instances of {@link RepositoriesEnvironmentsSecretsSecretNameRequest}.
     */
    public static class Builder {
        private String encryptedValue;
        private String keyId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  encryptedValue  String value for encryptedValue.
         * @param  keyId  String value for keyId.
         */
        public Builder(String encryptedValue, String keyId) {
            this.encryptedValue = encryptedValue;
            this.keyId = keyId;
        }

        /**
         * Setter for encryptedValue.
         * @param  encryptedValue  String value for encryptedValue.
         * @return Builder
         */
        public Builder encryptedValue(String encryptedValue) {
            this.encryptedValue = encryptedValue;
            return this;
        }

        /**
         * Setter for keyId.
         * @param  keyId  String value for keyId.
         * @return Builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * Builds a new {@link RepositoriesEnvironmentsSecretsSecretNameRequest} object using the
         * set fields.
         * @return {@link RepositoriesEnvironmentsSecretsSecretNameRequest}
         */
        public RepositoriesEnvironmentsSecretsSecretNameRequest build() {
            return new RepositoriesEnvironmentsSecretsSecretNameRequest(encryptedValue, keyId);
        }
    }
}
