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
 * This is a model class for SecurityAndAnalysis1 type.
 */
public class SecurityAndAnalysis1 {
    private AdvancedSecurity2 advancedSecurity;
    private SecretScanning2 secretScanning;
    private SecretScanningPushProtection2 secretScanningPushProtection;

    /**
     * Default constructor.
     */
    public SecurityAndAnalysis1() {
    }

    /**
     * Initialization constructor.
     * @param  advancedSecurity  AdvancedSecurity2 value for advancedSecurity.
     * @param  secretScanning  SecretScanning2 value for secretScanning.
     * @param  secretScanningPushProtection  SecretScanningPushProtection2 value for
     *         secretScanningPushProtection.
     */
    public SecurityAndAnalysis1(
            AdvancedSecurity2 advancedSecurity,
            SecretScanning2 secretScanning,
            SecretScanningPushProtection2 secretScanningPushProtection) {
        this.advancedSecurity = advancedSecurity;
        this.secretScanning = secretScanning;
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    /**
     * Getter for AdvancedSecurity.
     * @return Returns the AdvancedSecurity2
     */
    @JsonGetter("advanced_security")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AdvancedSecurity2 getAdvancedSecurity() {
        return advancedSecurity;
    }

    /**
     * Setter for AdvancedSecurity.
     * @param advancedSecurity Value for AdvancedSecurity2
     */
    @JsonSetter("advanced_security")
    public void setAdvancedSecurity(AdvancedSecurity2 advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    /**
     * Getter for SecretScanning.
     * @return Returns the SecretScanning2
     */
    @JsonGetter("secret_scanning")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SecretScanning2 getSecretScanning() {
        return secretScanning;
    }

    /**
     * Setter for SecretScanning.
     * @param secretScanning Value for SecretScanning2
     */
    @JsonSetter("secret_scanning")
    public void setSecretScanning(SecretScanning2 secretScanning) {
        this.secretScanning = secretScanning;
    }

    /**
     * Getter for SecretScanningPushProtection.
     * @return Returns the SecretScanningPushProtection2
     */
    @JsonGetter("secret_scanning_push_protection")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SecretScanningPushProtection2 getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    /**
     * Setter for SecretScanningPushProtection.
     * @param secretScanningPushProtection Value for SecretScanningPushProtection2
     */
    @JsonSetter("secret_scanning_push_protection")
    public void setSecretScanningPushProtection(SecretScanningPushProtection2 secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    /**
     * Converts this SecurityAndAnalysis1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SecurityAndAnalysis1 [" + "advancedSecurity=" + advancedSecurity
                + ", secretScanning=" + secretScanning + ", secretScanningPushProtection="
                + secretScanningPushProtection + "]";
    }

    /**
     * Builds a new {@link SecurityAndAnalysis1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SecurityAndAnalysis1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .advancedSecurity(getAdvancedSecurity())
                .secretScanning(getSecretScanning())
                .secretScanningPushProtection(getSecretScanningPushProtection());
        return builder;
    }

    /**
     * Class to build instances of {@link SecurityAndAnalysis1}.
     */
    public static class Builder {
        private AdvancedSecurity2 advancedSecurity;
        private SecretScanning2 secretScanning;
        private SecretScanningPushProtection2 secretScanningPushProtection;



        /**
         * Setter for advancedSecurity.
         * @param  advancedSecurity  AdvancedSecurity2 value for advancedSecurity.
         * @return Builder
         */
        public Builder advancedSecurity(AdvancedSecurity2 advancedSecurity) {
            this.advancedSecurity = advancedSecurity;
            return this;
        }

        /**
         * Setter for secretScanning.
         * @param  secretScanning  SecretScanning2 value for secretScanning.
         * @return Builder
         */
        public Builder secretScanning(SecretScanning2 secretScanning) {
            this.secretScanning = secretScanning;
            return this;
        }

        /**
         * Setter for secretScanningPushProtection.
         * @param  secretScanningPushProtection  SecretScanningPushProtection2 value for
         *         secretScanningPushProtection.
         * @return Builder
         */
        public Builder secretScanningPushProtection(
                SecretScanningPushProtection2 secretScanningPushProtection) {
            this.secretScanningPushProtection = secretScanningPushProtection;
            return this;
        }

        /**
         * Builds a new {@link SecurityAndAnalysis1} object using the set fields.
         * @return {@link SecurityAndAnalysis1}
         */
        public SecurityAndAnalysis1 build() {
            return new SecurityAndAnalysis1(advancedSecurity, secretScanning,
                    secretScanningPushProtection);
        }
    }
}
