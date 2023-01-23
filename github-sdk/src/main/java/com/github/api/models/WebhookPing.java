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
 * This is a model class for WebhookPing type.
 */
public class WebhookPing {
    private Hook1 hook;
    private Integer hookId;
    private Organization2 organization;
    private Repository3 repository;
    private Sender sender;
    private String zen;

    /**
     * Default constructor.
     */
    public WebhookPing() {
    }

    /**
     * Initialization constructor.
     * @param  hook  Hook1 value for hook.
     * @param  hookId  Integer value for hookId.
     * @param  organization  Organization2 value for organization.
     * @param  repository  Repository3 value for repository.
     * @param  sender  Sender value for sender.
     * @param  zen  String value for zen.
     */
    public WebhookPing(
            Hook1 hook,
            Integer hookId,
            Organization2 organization,
            Repository3 repository,
            Sender sender,
            String zen) {
        this.hook = hook;
        this.hookId = hookId;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.zen = zen;
    }

    /**
     * Getter for Hook.
     * @return Returns the Hook1
     */
    @JsonGetter("hook")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Hook1 getHook() {
        return hook;
    }

    /**
     * Setter for Hook.
     * @param hook Value for Hook1
     */
    @JsonSetter("hook")
    public void setHook(Hook1 hook) {
        this.hook = hook;
    }

    /**
     * Getter for HookId.
     * The ID of the webhook that triggered the ping.
     * @return Returns the Integer
     */
    @JsonGetter("hook_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getHookId() {
        return hookId;
    }

    /**
     * Setter for HookId.
     * The ID of the webhook that triggered the ping.
     * @param hookId Value for Integer
     */
    @JsonSetter("hook_id")
    public void setHookId(Integer hookId) {
        this.hookId = hookId;
    }

    /**
     * Getter for Organization.
     * @return Returns the Organization2
     */
    @JsonGetter("organization")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Organization2 getOrganization() {
        return organization;
    }

    /**
     * Setter for Organization.
     * @param organization Value for Organization2
     */
    @JsonSetter("organization")
    public void setOrganization(Organization2 organization) {
        this.organization = organization;
    }

    /**
     * Getter for Repository.
     * @return Returns the Repository3
     */
    @JsonGetter("repository")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Repository3 getRepository() {
        return repository;
    }

    /**
     * Setter for Repository.
     * @param repository Value for Repository3
     */
    @JsonSetter("repository")
    public void setRepository(Repository3 repository) {
        this.repository = repository;
    }

    /**
     * Getter for Sender.
     * @return Returns the Sender
     */
    @JsonGetter("sender")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Sender getSender() {
        return sender;
    }

    /**
     * Setter for Sender.
     * @param sender Value for Sender
     */
    @JsonSetter("sender")
    public void setSender(Sender sender) {
        this.sender = sender;
    }

    /**
     * Getter for Zen.
     * Random string of GitHub zen.
     * @return Returns the String
     */
    @JsonGetter("zen")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZen() {
        return zen;
    }

    /**
     * Setter for Zen.
     * Random string of GitHub zen.
     * @param zen Value for String
     */
    @JsonSetter("zen")
    public void setZen(String zen) {
        this.zen = zen;
    }

    /**
     * Converts this WebhookPing into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "WebhookPing [" + "hook=" + hook + ", hookId=" + hookId + ", organization="
                + organization + ", repository=" + repository + ", sender=" + sender + ", zen="
                + zen + "]";
    }

    /**
     * Builds a new {@link WebhookPing.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link WebhookPing.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .hook(getHook())
                .hookId(getHookId())
                .organization(getOrganization())
                .repository(getRepository())
                .sender(getSender())
                .zen(getZen());
        return builder;
    }

    /**
     * Class to build instances of {@link WebhookPing}.
     */
    public static class Builder {
        private Hook1 hook;
        private Integer hookId;
        private Organization2 organization;
        private Repository3 repository;
        private Sender sender;
        private String zen;



        /**
         * Setter for hook.
         * @param  hook  Hook1 value for hook.
         * @return Builder
         */
        public Builder hook(Hook1 hook) {
            this.hook = hook;
            return this;
        }

        /**
         * Setter for hookId.
         * @param  hookId  Integer value for hookId.
         * @return Builder
         */
        public Builder hookId(Integer hookId) {
            this.hookId = hookId;
            return this;
        }

        /**
         * Setter for organization.
         * @param  organization  Organization2 value for organization.
         * @return Builder
         */
        public Builder organization(Organization2 organization) {
            this.organization = organization;
            return this;
        }

        /**
         * Setter for repository.
         * @param  repository  Repository3 value for repository.
         * @return Builder
         */
        public Builder repository(Repository3 repository) {
            this.repository = repository;
            return this;
        }

        /**
         * Setter for sender.
         * @param  sender  Sender value for sender.
         * @return Builder
         */
        public Builder sender(Sender sender) {
            this.sender = sender;
            return this;
        }

        /**
         * Setter for zen.
         * @param  zen  String value for zen.
         * @return Builder
         */
        public Builder zen(String zen) {
            this.zen = zen;
            return this;
        }

        /**
         * Builds a new {@link WebhookPing} object using the set fields.
         * @return {@link WebhookPing}
         */
        public WebhookPing build() {
            return new WebhookPing(hook, hookId, organization, repository, sender, zen);
        }
    }
}
