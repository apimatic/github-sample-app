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
 * This is a model class for MarketplacePurchasepurchasedevent type.
 */
public class MarketplacePurchasepurchasedevent {
    private String action;
    private String effectiveDate;
    private Enterprise1 enterprise;
    private Installation1 installation;
    private MarketplacePurchase2 marketplacePurchase;
    private Organization2 organization;
    private MarketplacePurchase3 previousMarketplacePurchase;
    private Repository3 repository;
    private Sender sender;

    /**
     * Default constructor.
     */
    public MarketplacePurchasepurchasedevent() {
        action = "purchased";
    }

    /**
     * Initialization constructor.
     * @param  action  String value for action.
     * @param  effectiveDate  String value for effectiveDate.
     * @param  marketplacePurchase  MarketplacePurchase2 value for marketplacePurchase.
     * @param  sender  Sender value for sender.
     * @param  enterprise  Enterprise1 value for enterprise.
     * @param  installation  Installation1 value for installation.
     * @param  organization  Organization2 value for organization.
     * @param  previousMarketplacePurchase  MarketplacePurchase3 value for
     *         previousMarketplacePurchase.
     * @param  repository  Repository3 value for repository.
     */
    public MarketplacePurchasepurchasedevent(
            String action,
            String effectiveDate,
            MarketplacePurchase2 marketplacePurchase,
            Sender sender,
            Enterprise1 enterprise,
            Installation1 installation,
            Organization2 organization,
            MarketplacePurchase3 previousMarketplacePurchase,
            Repository3 repository) {
        this.action = action;
        this.effectiveDate = effectiveDate;
        this.enterprise = enterprise;
        this.installation = installation;
        this.marketplacePurchase = marketplacePurchase;
        this.organization = organization;
        this.previousMarketplacePurchase = previousMarketplacePurchase;
        this.repository = repository;
        this.sender = sender;
    }

    /**
     * Getter for Action.
     * @return Returns the String
     */
    @JsonGetter("action")
    public String getAction() {
        return action;
    }

    /**
     * Setter for Action.
     * @param action Value for String
     */
    @JsonSetter("action")
    private void setAction(String action) {
        this.action = action;
    }

    /**
     * Getter for EffectiveDate.
     * @return Returns the String
     */
    @JsonGetter("effective_date")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Setter for EffectiveDate.
     * @param effectiveDate Value for String
     */
    @JsonSetter("effective_date")
    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * Getter for Enterprise.
     * @return Returns the Enterprise1
     */
    @JsonGetter("enterprise")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Enterprise1 getEnterprise() {
        return enterprise;
    }

    /**
     * Setter for Enterprise.
     * @param enterprise Value for Enterprise1
     */
    @JsonSetter("enterprise")
    public void setEnterprise(Enterprise1 enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Getter for Installation.
     * @return Returns the Installation1
     */
    @JsonGetter("installation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Installation1 getInstallation() {
        return installation;
    }

    /**
     * Setter for Installation.
     * @param installation Value for Installation1
     */
    @JsonSetter("installation")
    public void setInstallation(Installation1 installation) {
        this.installation = installation;
    }

    /**
     * Getter for MarketplacePurchase.
     * @return Returns the MarketplacePurchase2
     */
    @JsonGetter("marketplace_purchase")
    public MarketplacePurchase2 getMarketplacePurchase() {
        return marketplacePurchase;
    }

    /**
     * Setter for MarketplacePurchase.
     * @param marketplacePurchase Value for MarketplacePurchase2
     */
    @JsonSetter("marketplace_purchase")
    public void setMarketplacePurchase(MarketplacePurchase2 marketplacePurchase) {
        this.marketplacePurchase = marketplacePurchase;
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
     * Getter for PreviousMarketplacePurchase.
     * @return Returns the MarketplacePurchase3
     */
    @JsonGetter("previous_marketplace_purchase")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MarketplacePurchase3 getPreviousMarketplacePurchase() {
        return previousMarketplacePurchase;
    }

    /**
     * Setter for PreviousMarketplacePurchase.
     * @param previousMarketplacePurchase Value for MarketplacePurchase3
     */
    @JsonSetter("previous_marketplace_purchase")
    public void setPreviousMarketplacePurchase(MarketplacePurchase3 previousMarketplacePurchase) {
        this.previousMarketplacePurchase = previousMarketplacePurchase;
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
     * Converts this MarketplacePurchasepurchasedevent into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MarketplacePurchasepurchasedevent [" + "action=" + action + ", effectiveDate="
                + effectiveDate + ", marketplacePurchase=" + marketplacePurchase + ", sender="
                + sender + ", enterprise=" + enterprise + ", installation=" + installation
                + ", organization=" + organization + ", previousMarketplacePurchase="
                + previousMarketplacePurchase + ", repository=" + repository + "]";
    }

    /**
     * Builds a new {@link MarketplacePurchasepurchasedevent.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MarketplacePurchasepurchasedevent.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(action, effectiveDate, marketplacePurchase, sender)
                .enterprise(getEnterprise())
                .installation(getInstallation())
                .organization(getOrganization())
                .previousMarketplacePurchase(getPreviousMarketplacePurchase())
                .repository(getRepository());
        return builder;
    }

    /**
     * Class to build instances of {@link MarketplacePurchasepurchasedevent}.
     */
    public static class Builder {
        private String action = "purchased";
        private String effectiveDate;
        private MarketplacePurchase2 marketplacePurchase;
        private Sender sender;
        private Enterprise1 enterprise;
        private Installation1 installation;
        private Organization2 organization;
        private MarketplacePurchase3 previousMarketplacePurchase;
        private Repository3 repository;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  action  String value for action.
         * @param  effectiveDate  String value for effectiveDate.
         * @param  marketplacePurchase  MarketplacePurchase2 value for marketplacePurchase.
         * @param  sender  Sender value for sender.
         */
        public Builder(String action, String effectiveDate,
                MarketplacePurchase2 marketplacePurchase, Sender sender) {
            this.action = action;
            this.effectiveDate = effectiveDate;
            this.marketplacePurchase = marketplacePurchase;
            this.sender = sender;
        }

        /**
         * Setter for action.
         * @param  action  String value for action.
         * @return Builder
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Setter for effectiveDate.
         * @param  effectiveDate  String value for effectiveDate.
         * @return Builder
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }

        /**
         * Setter for marketplacePurchase.
         * @param  marketplacePurchase  MarketplacePurchase2 value for marketplacePurchase.
         * @return Builder
         */
        public Builder marketplacePurchase(MarketplacePurchase2 marketplacePurchase) {
            this.marketplacePurchase = marketplacePurchase;
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
         * Setter for enterprise.
         * @param  enterprise  Enterprise1 value for enterprise.
         * @return Builder
         */
        public Builder enterprise(Enterprise1 enterprise) {
            this.enterprise = enterprise;
            return this;
        }

        /**
         * Setter for installation.
         * @param  installation  Installation1 value for installation.
         * @return Builder
         */
        public Builder installation(Installation1 installation) {
            this.installation = installation;
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
         * Setter for previousMarketplacePurchase.
         * @param  previousMarketplacePurchase  MarketplacePurchase3 value for
         *         previousMarketplacePurchase.
         * @return Builder
         */
        public Builder previousMarketplacePurchase(
                MarketplacePurchase3 previousMarketplacePurchase) {
            this.previousMarketplacePurchase = previousMarketplacePurchase;
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
         * Builds a new {@link MarketplacePurchasepurchasedevent} object using the set fields.
         * @return {@link MarketplacePurchasepurchasedevent}
         */
        public MarketplacePurchasepurchasedevent build() {
            return new MarketplacePurchasepurchasedevent(action, effectiveDate, marketplacePurchase,
                    sender, enterprise, installation, organization, previousMarketplacePurchase,
                    repository);
        }
    }
}
