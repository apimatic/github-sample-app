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
import java.util.List;

/**
 * This is a model class for MetaResponse type.
 */
public class MetaResponse {
    private boolean verifiablePasswordAuthentication;
    private SshKeyFingerprints sshKeyFingerprints;
    private List<String> sshKeys;
    private List<String> hooks;
    private List<String> web;
    private List<String> api;
    private List<String> git;
    private List<String> packages;
    private List<String> pages;
    private List<String> importer;
    private List<String> actions;
    private List<String> dependabot;

    /**
     * Default constructor.
     */
    public MetaResponse() {
    }

    /**
     * Initialization constructor.
     * @param  verifiablePasswordAuthentication  boolean value for verifiablePasswordAuthentication.
     * @param  sshKeyFingerprints  SshKeyFingerprints value for sshKeyFingerprints.
     * @param  sshKeys  List of String value for sshKeys.
     * @param  hooks  List of String value for hooks.
     * @param  web  List of String value for web.
     * @param  api  List of String value for api.
     * @param  git  List of String value for git.
     * @param  packages  List of String value for packages.
     * @param  pages  List of String value for pages.
     * @param  importer  List of String value for importer.
     * @param  actions  List of String value for actions.
     * @param  dependabot  List of String value for dependabot.
     */
    public MetaResponse(
            boolean verifiablePasswordAuthentication,
            SshKeyFingerprints sshKeyFingerprints,
            List<String> sshKeys,
            List<String> hooks,
            List<String> web,
            List<String> api,
            List<String> git,
            List<String> packages,
            List<String> pages,
            List<String> importer,
            List<String> actions,
            List<String> dependabot) {
        this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
        this.sshKeyFingerprints = sshKeyFingerprints;
        this.sshKeys = sshKeys;
        this.hooks = hooks;
        this.web = web;
        this.api = api;
        this.git = git;
        this.packages = packages;
        this.pages = pages;
        this.importer = importer;
        this.actions = actions;
        this.dependabot = dependabot;
    }

    /**
     * Getter for VerifiablePasswordAuthentication.
     * @return Returns the boolean
     */
    @JsonGetter("verifiable_password_authentication")
    public boolean getVerifiablePasswordAuthentication() {
        return verifiablePasswordAuthentication;
    }

    /**
     * Setter for VerifiablePasswordAuthentication.
     * @param verifiablePasswordAuthentication Value for boolean
     */
    @JsonSetter("verifiable_password_authentication")
    public void setVerifiablePasswordAuthentication(boolean verifiablePasswordAuthentication) {
        this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
    }

    /**
     * Getter for SshKeyFingerprints.
     * @return Returns the SshKeyFingerprints
     */
    @JsonGetter("ssh_key_fingerprints")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SshKeyFingerprints getSshKeyFingerprints() {
        return sshKeyFingerprints;
    }

    /**
     * Setter for SshKeyFingerprints.
     * @param sshKeyFingerprints Value for SshKeyFingerprints
     */
    @JsonSetter("ssh_key_fingerprints")
    public void setSshKeyFingerprints(SshKeyFingerprints sshKeyFingerprints) {
        this.sshKeyFingerprints = sshKeyFingerprints;
    }

    /**
     * Getter for SshKeys.
     * @return Returns the List of String
     */
    @JsonGetter("ssh_keys")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getSshKeys() {
        return sshKeys;
    }

    /**
     * Setter for SshKeys.
     * @param sshKeys Value for List of String
     */
    @JsonSetter("ssh_keys")
    public void setSshKeys(List<String> sshKeys) {
        this.sshKeys = sshKeys;
    }

    /**
     * Getter for Hooks.
     * @return Returns the List of String
     */
    @JsonGetter("hooks")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getHooks() {
        return hooks;
    }

    /**
     * Setter for Hooks.
     * @param hooks Value for List of String
     */
    @JsonSetter("hooks")
    public void setHooks(List<String> hooks) {
        this.hooks = hooks;
    }

    /**
     * Getter for Web.
     * @return Returns the List of String
     */
    @JsonGetter("web")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getWeb() {
        return web;
    }

    /**
     * Setter for Web.
     * @param web Value for List of String
     */
    @JsonSetter("web")
    public void setWeb(List<String> web) {
        this.web = web;
    }

    /**
     * Getter for Api.
     * @return Returns the List of String
     */
    @JsonGetter("api")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getApi() {
        return api;
    }

    /**
     * Setter for Api.
     * @param api Value for List of String
     */
    @JsonSetter("api")
    public void setApi(List<String> api) {
        this.api = api;
    }

    /**
     * Getter for Git.
     * @return Returns the List of String
     */
    @JsonGetter("git")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getGit() {
        return git;
    }

    /**
     * Setter for Git.
     * @param git Value for List of String
     */
    @JsonSetter("git")
    public void setGit(List<String> git) {
        this.git = git;
    }

    /**
     * Getter for Packages.
     * @return Returns the List of String
     */
    @JsonGetter("packages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPackages() {
        return packages;
    }

    /**
     * Setter for Packages.
     * @param packages Value for List of String
     */
    @JsonSetter("packages")
    public void setPackages(List<String> packages) {
        this.packages = packages;
    }

    /**
     * Getter for Pages.
     * @return Returns the List of String
     */
    @JsonGetter("pages")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getPages() {
        return pages;
    }

    /**
     * Setter for Pages.
     * @param pages Value for List of String
     */
    @JsonSetter("pages")
    public void setPages(List<String> pages) {
        this.pages = pages;
    }

    /**
     * Getter for Importer.
     * @return Returns the List of String
     */
    @JsonGetter("importer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getImporter() {
        return importer;
    }

    /**
     * Setter for Importer.
     * @param importer Value for List of String
     */
    @JsonSetter("importer")
    public void setImporter(List<String> importer) {
        this.importer = importer;
    }

    /**
     * Getter for Actions.
     * @return Returns the List of String
     */
    @JsonGetter("actions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getActions() {
        return actions;
    }

    /**
     * Setter for Actions.
     * @param actions Value for List of String
     */
    @JsonSetter("actions")
    public void setActions(List<String> actions) {
        this.actions = actions;
    }

    /**
     * Getter for Dependabot.
     * @return Returns the List of String
     */
    @JsonGetter("dependabot")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getDependabot() {
        return dependabot;
    }

    /**
     * Setter for Dependabot.
     * @param dependabot Value for List of String
     */
    @JsonSetter("dependabot")
    public void setDependabot(List<String> dependabot) {
        this.dependabot = dependabot;
    }

    /**
     * Converts this MetaResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MetaResponse [" + "verifiablePasswordAuthentication="
                + verifiablePasswordAuthentication + ", sshKeyFingerprints=" + sshKeyFingerprints
                + ", sshKeys=" + sshKeys + ", hooks=" + hooks + ", web=" + web + ", api=" + api
                + ", git=" + git + ", packages=" + packages + ", pages=" + pages + ", importer="
                + importer + ", actions=" + actions + ", dependabot=" + dependabot + "]";
    }

    /**
     * Builds a new {@link MetaResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MetaResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(verifiablePasswordAuthentication)
                .sshKeyFingerprints(getSshKeyFingerprints())
                .sshKeys(getSshKeys())
                .hooks(getHooks())
                .web(getWeb())
                .api(getApi())
                .git(getGit())
                .packages(getPackages())
                .pages(getPages())
                .importer(getImporter())
                .actions(getActions())
                .dependabot(getDependabot());
        return builder;
    }

    /**
     * Class to build instances of {@link MetaResponse}.
     */
    public static class Builder {
        private boolean verifiablePasswordAuthentication;
        private SshKeyFingerprints sshKeyFingerprints;
        private List<String> sshKeys;
        private List<String> hooks;
        private List<String> web;
        private List<String> api;
        private List<String> git;
        private List<String> packages;
        private List<String> pages;
        private List<String> importer;
        private List<String> actions;
        private List<String> dependabot;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  verifiablePasswordAuthentication  boolean value for
         *         verifiablePasswordAuthentication.
         */
        public Builder(boolean verifiablePasswordAuthentication) {
            this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
        }

        /**
         * Setter for verifiablePasswordAuthentication.
         * @param  verifiablePasswordAuthentication  boolean value for
         *         verifiablePasswordAuthentication.
         * @return Builder
         */
        public Builder verifiablePasswordAuthentication(
                boolean verifiablePasswordAuthentication) {
            this.verifiablePasswordAuthentication = verifiablePasswordAuthentication;
            return this;
        }

        /**
         * Setter for sshKeyFingerprints.
         * @param  sshKeyFingerprints  SshKeyFingerprints value for sshKeyFingerprints.
         * @return Builder
         */
        public Builder sshKeyFingerprints(SshKeyFingerprints sshKeyFingerprints) {
            this.sshKeyFingerprints = sshKeyFingerprints;
            return this;
        }

        /**
         * Setter for sshKeys.
         * @param  sshKeys  List of String value for sshKeys.
         * @return Builder
         */
        public Builder sshKeys(List<String> sshKeys) {
            this.sshKeys = sshKeys;
            return this;
        }

        /**
         * Setter for hooks.
         * @param  hooks  List of String value for hooks.
         * @return Builder
         */
        public Builder hooks(List<String> hooks) {
            this.hooks = hooks;
            return this;
        }

        /**
         * Setter for web.
         * @param  web  List of String value for web.
         * @return Builder
         */
        public Builder web(List<String> web) {
            this.web = web;
            return this;
        }

        /**
         * Setter for api.
         * @param  api  List of String value for api.
         * @return Builder
         */
        public Builder api(List<String> api) {
            this.api = api;
            return this;
        }

        /**
         * Setter for git.
         * @param  git  List of String value for git.
         * @return Builder
         */
        public Builder git(List<String> git) {
            this.git = git;
            return this;
        }

        /**
         * Setter for packages.
         * @param  packages  List of String value for packages.
         * @return Builder
         */
        public Builder packages(List<String> packages) {
            this.packages = packages;
            return this;
        }

        /**
         * Setter for pages.
         * @param  pages  List of String value for pages.
         * @return Builder
         */
        public Builder pages(List<String> pages) {
            this.pages = pages;
            return this;
        }

        /**
         * Setter for importer.
         * @param  importer  List of String value for importer.
         * @return Builder
         */
        public Builder importer(List<String> importer) {
            this.importer = importer;
            return this;
        }

        /**
         * Setter for actions.
         * @param  actions  List of String value for actions.
         * @return Builder
         */
        public Builder actions(List<String> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * Setter for dependabot.
         * @param  dependabot  List of String value for dependabot.
         * @return Builder
         */
        public Builder dependabot(List<String> dependabot) {
            this.dependabot = dependabot;
            return this;
        }

        /**
         * Builds a new {@link MetaResponse} object using the set fields.
         * @return {@link MetaResponse}
         */
        public MetaResponse build() {
            return new MetaResponse(verifiablePasswordAuthentication, sshKeyFingerprints, sshKeys,
                    hooks, web, api, git, packages, pages, importer, actions, dependabot);
        }
    }
}