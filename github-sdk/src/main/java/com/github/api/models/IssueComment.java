/*
 * GitHubAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.github.api.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.github.api.DateTimeHelper;
import io.apimatic.core.types.BaseModel;
import java.time.LocalDateTime;

/**
 * This is a model class for IssueComment type.
 */
public class IssueComment {
    private int id;
    private String nodeId;
    private String url;
    private String body;
    private String bodyText;
    private String bodyHtml;
    private String htmlUrl;
    private Object user;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String issueUrl;
    private AuthorAssociationEnum authorAssociation;
    private Object performedViaGithubApp;
    private ReactionRollup reactions;

    /**
     * Default constructor.
     */
    public IssueComment() {
    }

    /**
     * Initialization constructor.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  user  Object value for user.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  updatedAt  LocalDateTime value for updatedAt.
     * @param  issueUrl  String value for issueUrl.
     * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
     * @param  body  String value for body.
     * @param  bodyText  String value for bodyText.
     * @param  bodyHtml  String value for bodyHtml.
     * @param  performedViaGithubApp  Object value for performedViaGithubApp.
     * @param  reactions  ReactionRollup value for reactions.
     */
    public IssueComment(
            int id,
            String nodeId,
            String url,
            String htmlUrl,
            Object user,
            LocalDateTime createdAt,
            LocalDateTime updatedAt,
            String issueUrl,
            AuthorAssociationEnum authorAssociation,
            String body,
            String bodyText,
            String bodyHtml,
            Object performedViaGithubApp,
            ReactionRollup reactions) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.body = body;
        this.bodyText = bodyText;
        this.bodyHtml = bodyHtml;
        this.htmlUrl = htmlUrl;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueUrl = issueUrl;
        this.authorAssociation = authorAssociation;
        this.performedViaGithubApp = performedViaGithubApp;
        this.reactions = reactions;
    }

    /**
     * Getter for Id.
     * Unique identifier of the issue comment
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier of the issue comment
     * @param id Value for int
     */
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter for NodeId.
     * @return Returns the String
     */
    @JsonGetter("node_id")
    public String getNodeId() {
        return nodeId;
    }

    /**
     * Setter for NodeId.
     * @param nodeId Value for String
     */
    @JsonSetter("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Getter for Url.
     * URL for the issue comment
     * @return Returns the String
     */
    @JsonGetter("url")
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * URL for the issue comment
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Body.
     * Contents of the issue comment
     * @return Returns the String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBody() {
        return body;
    }

    /**
     * Setter for Body.
     * Contents of the issue comment
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Getter for BodyText.
     * @return Returns the String
     */
    @JsonGetter("body_text")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBodyText() {
        return bodyText;
    }

    /**
     * Setter for BodyText.
     * @param bodyText Value for String
     */
    @JsonSetter("body_text")
    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    /**
     * Getter for BodyHtml.
     * @return Returns the String
     */
    @JsonGetter("body_html")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBodyHtml() {
        return bodyHtml;
    }

    /**
     * Setter for BodyHtml.
     * @param bodyHtml Value for String
     */
    @JsonSetter("body_html")
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    /**
     * Getter for HtmlUrl.
     * @return Returns the String
     */
    @JsonGetter("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    /**
     * Setter for HtmlUrl.
     * @param htmlUrl Value for String
     */
    @JsonSetter("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    /**
     * Getter for User.
     * @return Returns the Object
     */
    @JsonGetter("user")
    public Object getUser() {
        return user;
    }

    /**
     * Setter for User.
     * @param user Value for Object
     */
    @JsonSetter("user")
    public void setUser(Object user) {
        this.user = user;
    }

    /**
     * Getter for CreatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Setter for CreatedAt.
     * @param createdAt Value for LocalDateTime
     */
    @JsonSetter("created_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Setter for UpdatedAt.
     * @param updatedAt Value for LocalDateTime
     */
    @JsonSetter("updated_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * Getter for IssueUrl.
     * @return Returns the String
     */
    @JsonGetter("issue_url")
    public String getIssueUrl() {
        return issueUrl;
    }

    /**
     * Setter for IssueUrl.
     * @param issueUrl Value for String
     */
    @JsonSetter("issue_url")
    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
    }

    /**
     * Getter for AuthorAssociation.
     * @return Returns the AuthorAssociationEnum
     */
    @JsonGetter("author_association")
    public AuthorAssociationEnum getAuthorAssociation() {
        return authorAssociation;
    }

    /**
     * Setter for AuthorAssociation.
     * @param authorAssociation Value for AuthorAssociationEnum
     */
    @JsonSetter("author_association")
    public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    /**
     * Getter for PerformedViaGithubApp.
     * @return Returns the Object
     */
    @JsonGetter("performed_via_github_app")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    /**
     * Setter for PerformedViaGithubApp.
     * @param performedViaGithubApp Value for Object
     */
    @JsonSetter("performed_via_github_app")
    public void setPerformedViaGithubApp(Object performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    /**
     * Getter for Reactions.
     * @return Returns the ReactionRollup
     */
    @JsonGetter("reactions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReactionRollup getReactions() {
        return reactions;
    }

    /**
     * Setter for Reactions.
     * @param reactions Value for ReactionRollup
     */
    @JsonSetter("reactions")
    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
    }

    /**
     * Converts this IssueComment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IssueComment [" + "id=" + id + ", nodeId=" + nodeId + ", url=" + url + ", htmlUrl="
                + htmlUrl + ", user=" + user + ", createdAt=" + createdAt + ", updatedAt="
                + updatedAt + ", issueUrl=" + issueUrl + ", authorAssociation=" + authorAssociation
                + ", body=" + body + ", bodyText=" + bodyText + ", bodyHtml=" + bodyHtml
                + ", performedViaGithubApp=" + performedViaGithubApp + ", reactions=" + reactions
                + "]";
    }

    /**
     * Builds a new {@link IssueComment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IssueComment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(id, nodeId, url, htmlUrl, user, createdAt, updatedAt,
                issueUrl, authorAssociation)
                .body(getBody())
                .bodyText(getBodyText())
                .bodyHtml(getBodyHtml())
                .performedViaGithubApp(getPerformedViaGithubApp())
                .reactions(getReactions());
        return builder;
    }

    /**
     * Class to build instances of {@link IssueComment}.
     */
    public static class Builder {
        private int id;
        private String nodeId;
        private String url;
        private String htmlUrl;
        private Object user;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private String issueUrl;
        private AuthorAssociationEnum authorAssociation;
        private String body;
        private String bodyText;
        private String bodyHtml;
        private Object performedViaGithubApp;
        private ReactionRollup reactions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  user  Object value for user.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @param  issueUrl  String value for issueUrl.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         */
        public Builder(int id, String nodeId, String url, String htmlUrl, Object user,
                LocalDateTime createdAt, LocalDateTime updatedAt, String issueUrl,
                AuthorAssociationEnum authorAssociation) {
            this.id = id;
            this.nodeId = nodeId;
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.user = user;
            this.createdAt = createdAt;
            this.updatedAt = updatedAt;
            this.issueUrl = issueUrl;
            this.authorAssociation = authorAssociation;
        }

        /**
         * Setter for id.
         * @param  id  int value for id.
         * @return Builder
         */
        public Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for nodeId.
         * @param  nodeId  String value for nodeId.
         * @return Builder
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
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
         * Setter for htmlUrl.
         * @param  htmlUrl  String value for htmlUrl.
         * @return Builder
         */
        public Builder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        /**
         * Setter for user.
         * @param  user  Object value for user.
         * @return Builder
         */
        public Builder user(Object user) {
            this.user = user;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @return Builder
         */
        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  LocalDateTime value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for issueUrl.
         * @param  issueUrl  String value for issueUrl.
         * @return Builder
         */
        public Builder issueUrl(String issueUrl) {
            this.issueUrl = issueUrl;
            return this;
        }

        /**
         * Setter for authorAssociation.
         * @param  authorAssociation  AuthorAssociationEnum value for authorAssociation.
         * @return Builder
         */
        public Builder authorAssociation(AuthorAssociationEnum authorAssociation) {
            this.authorAssociation = authorAssociation;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }

        /**
         * Setter for bodyText.
         * @param  bodyText  String value for bodyText.
         * @return Builder
         */
        public Builder bodyText(String bodyText) {
            this.bodyText = bodyText;
            return this;
        }

        /**
         * Setter for bodyHtml.
         * @param  bodyHtml  String value for bodyHtml.
         * @return Builder
         */
        public Builder bodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        /**
         * Setter for performedViaGithubApp.
         * @param  performedViaGithubApp  Object value for performedViaGithubApp.
         * @return Builder
         */
        public Builder performedViaGithubApp(Object performedViaGithubApp) {
            this.performedViaGithubApp = performedViaGithubApp;
            return this;
        }

        /**
         * Setter for reactions.
         * @param  reactions  ReactionRollup value for reactions.
         * @return Builder
         */
        public Builder reactions(ReactionRollup reactions) {
            this.reactions = reactions;
            return this;
        }

        /**
         * Builds a new {@link IssueComment} object using the set fields.
         * @return {@link IssueComment}
         */
        public IssueComment build() {
            return new IssueComment(id, nodeId, url, htmlUrl, user, createdAt, updatedAt, issueUrl,
                    authorAssociation, body, bodyText, bodyHtml, performedViaGithubApp, reactions);
        }
    }
}
