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
 * This is a model class for ReposGitCommitsRequest type.
 */
public class ReposGitCommitsRequest {
    private String message;
    private String tree;
    private List<String> parents;
    private Author18 author;
    private Committer10 committer;
    private String signature;

    /**
     * Default constructor.
     */
    public ReposGitCommitsRequest() {
    }

    /**
     * Initialization constructor.
     * @param  message  String value for message.
     * @param  tree  String value for tree.
     * @param  parents  List of String value for parents.
     * @param  author  Author18 value for author.
     * @param  committer  Committer10 value for committer.
     * @param  signature  String value for signature.
     */
    public ReposGitCommitsRequest(
            String message,
            String tree,
            List<String> parents,
            Author18 author,
            Committer10 committer,
            String signature) {
        this.message = message;
        this.tree = tree;
        this.parents = parents;
        this.author = author;
        this.committer = committer;
        this.signature = signature;
    }

    /**
     * Getter for Message.
     * The commit message
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * The commit message
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Tree.
     * The SHA of the tree object this commit points to
     * @return Returns the String
     */
    @JsonGetter("tree")
    public String getTree() {
        return tree;
    }

    /**
     * Setter for Tree.
     * The SHA of the tree object this commit points to
     * @param tree Value for String
     */
    @JsonSetter("tree")
    public void setTree(String tree) {
        this.tree = tree;
    }

    /**
     * Getter for Parents.
     * The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit
     * will be written as a root commit. For a single parent, an array of one SHA should be
     * provided; for a merge commit, an array of more than one should be provided.
     * @return Returns the List of String
     */
    @JsonGetter("parents")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getParents() {
        return parents;
    }

    /**
     * Setter for Parents.
     * The SHAs of the commits that were the parents of this commit. If omitted or empty, the commit
     * will be written as a root commit. For a single parent, an array of one SHA should be
     * provided; for a merge commit, an array of more than one should be provided.
     * @param parents Value for List of String
     */
    @JsonSetter("parents")
    public void setParents(List<String> parents) {
        this.parents = parents;
    }

    /**
     * Getter for Author.
     * @return Returns the Author18
     */
    @JsonGetter("author")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Author18 getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for Author18
     */
    @JsonSetter("author")
    public void setAuthor(Author18 author) {
        this.author = author;
    }

    /**
     * Getter for Committer.
     * @return Returns the Committer10
     */
    @JsonGetter("committer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Committer10 getCommitter() {
        return committer;
    }

    /**
     * Setter for Committer.
     * @param committer Value for Committer10
     */
    @JsonSetter("committer")
    public void setCommitter(Committer10 committer) {
        this.committer = committer;
    }

    /**
     * Getter for Signature.
     * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub
     * adds the signature to the `gpgsig` header of the created commit. For a commit signature to be
     * verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the
     * string commit as it would be written to the object database. To pass a `signature` parameter,
     * you need to first manually create a valid PGP signature, which can be complicated. You may
     * find it easier to [use the command
     * line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
     * @return Returns the String
     */
    @JsonGetter("signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * The [PGP signature](https://en.wikipedia.org/wiki/Pretty_Good_Privacy) of the commit. GitHub
     * adds the signature to the `gpgsig` header of the created commit. For a commit signature to be
     * verifiable by Git or GitHub, it must be an ASCII-armored detached PGP signature over the
     * string commit as it would be written to the object database. To pass a `signature` parameter,
     * you need to first manually create a valid PGP signature, which can be complicated. You may
     * find it easier to [use the command
     * line](https://git-scm.com/book/id/v2/Git-Tools-Signing-Your-Work) to create signed commits.
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * Converts this ReposGitCommitsRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposGitCommitsRequest [" + "message=" + message + ", tree=" + tree + ", parents="
                + parents + ", author=" + author + ", committer=" + committer + ", signature="
                + signature + "]";
    }

    /**
     * Builds a new {@link ReposGitCommitsRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposGitCommitsRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(message, tree)
                .parents(getParents())
                .author(getAuthor())
                .committer(getCommitter())
                .signature(getSignature());
        return builder;
    }

    /**
     * Class to build instances of {@link ReposGitCommitsRequest}.
     */
    public static class Builder {
        private String message;
        private String tree;
        private List<String> parents;
        private Author18 author;
        private Committer10 committer;
        private String signature;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  message  String value for message.
         * @param  tree  String value for tree.
         */
        public Builder(String message, String tree) {
            this.message = message;
            this.tree = tree;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for tree.
         * @param  tree  String value for tree.
         * @return Builder
         */
        public Builder tree(String tree) {
            this.tree = tree;
            return this;
        }

        /**
         * Setter for parents.
         * @param  parents  List of String value for parents.
         * @return Builder
         */
        public Builder parents(List<String> parents) {
            this.parents = parents;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  Author18 value for author.
         * @return Builder
         */
        public Builder author(Author18 author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for committer.
         * @param  committer  Committer10 value for committer.
         * @return Builder
         */
        public Builder committer(Committer10 committer) {
            this.committer = committer;
            return this;
        }

        /**
         * Setter for signature.
         * @param  signature  String value for signature.
         * @return Builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Builds a new {@link ReposGitCommitsRequest} object using the set fields.
         * @return {@link ReposGitCommitsRequest}
         */
        public ReposGitCommitsRequest build() {
            return new ReposGitCommitsRequest(message, tree, parents, author, committer, signature);
        }
    }
}
