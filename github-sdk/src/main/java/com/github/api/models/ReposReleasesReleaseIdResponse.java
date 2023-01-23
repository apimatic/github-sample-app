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
import io.apimatic.core.types.OptionalNullable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * This is a model class for ReposReleasesReleaseIdResponse type.
 */
public class ReposReleasesReleaseIdResponse {
    private String url;
    private String htmlUrl;
    private String assetsUrl;
    private String uploadUrl;
    private String tarballUrl;
    private String zipballUrl;
    private int id;
    private String nodeId;
    private String tagName;
    private String targetCommitish;
    private String name;
    private OptionalNullable<String> body;
    private boolean draft;
    private boolean prerelease;
    private LocalDateTime createdAt;
    private LocalDateTime publishedAt;
    private Author4 author;
    private List<ReleaseAsset> assets;
    private String bodyHtml;
    private String bodyText;
    private Integer mentionsCount;
    private String discussionUrl;
    private ReactionRollup reactions;

    /**
     * Default constructor.
     */
    public ReposReleasesReleaseIdResponse() {
    }

    /**
     * Initialization constructor.
     * @param  url  String value for url.
     * @param  htmlUrl  String value for htmlUrl.
     * @param  assetsUrl  String value for assetsUrl.
     * @param  uploadUrl  String value for uploadUrl.
     * @param  tarballUrl  String value for tarballUrl.
     * @param  zipballUrl  String value for zipballUrl.
     * @param  id  int value for id.
     * @param  nodeId  String value for nodeId.
     * @param  tagName  String value for tagName.
     * @param  targetCommitish  String value for targetCommitish.
     * @param  name  String value for name.
     * @param  draft  boolean value for draft.
     * @param  prerelease  boolean value for prerelease.
     * @param  createdAt  LocalDateTime value for createdAt.
     * @param  publishedAt  LocalDateTime value for publishedAt.
     * @param  author  Author4 value for author.
     * @param  assets  List of ReleaseAsset value for assets.
     * @param  body  String value for body.
     * @param  bodyHtml  String value for bodyHtml.
     * @param  bodyText  String value for bodyText.
     * @param  mentionsCount  Integer value for mentionsCount.
     * @param  discussionUrl  String value for discussionUrl.
     * @param  reactions  ReactionRollup value for reactions.
     */
    public ReposReleasesReleaseIdResponse(
            String url,
            String htmlUrl,
            String assetsUrl,
            String uploadUrl,
            String tarballUrl,
            String zipballUrl,
            int id,
            String nodeId,
            String tagName,
            String targetCommitish,
            String name,
            boolean draft,
            boolean prerelease,
            LocalDateTime createdAt,
            LocalDateTime publishedAt,
            Author4 author,
            List<ReleaseAsset> assets,
            String body,
            String bodyHtml,
            String bodyText,
            Integer mentionsCount,
            String discussionUrl,
            ReactionRollup reactions) {
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.assetsUrl = assetsUrl;
        this.uploadUrl = uploadUrl;
        this.tarballUrl = tarballUrl;
        this.zipballUrl = zipballUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.name = name;
        this.body = OptionalNullable.of(body);
        this.draft = draft;
        this.prerelease = prerelease;
        this.createdAt = createdAt;
        this.publishedAt = publishedAt;
        this.author = author;
        this.assets = assets;
        this.bodyHtml = bodyHtml;
        this.bodyText = bodyText;
        this.mentionsCount = mentionsCount;
        this.discussionUrl = discussionUrl;
        this.reactions = reactions;
    }

    /**
     * Internal initialization constructor.
     */
    protected ReposReleasesReleaseIdResponse(String url, String htmlUrl, String assetsUrl,
            String uploadUrl, String tarballUrl, String zipballUrl, int id, String nodeId,
            String tagName, String targetCommitish, String name, boolean draft, boolean prerelease,
            LocalDateTime createdAt, LocalDateTime publishedAt, Author4 author,
            List<ReleaseAsset> assets, OptionalNullable<String> body, String bodyHtml,
            String bodyText, Integer mentionsCount, String discussionUrl,
            ReactionRollup reactions) {
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.assetsUrl = assetsUrl;
        this.uploadUrl = uploadUrl;
        this.tarballUrl = tarballUrl;
        this.zipballUrl = zipballUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.tagName = tagName;
        this.targetCommitish = targetCommitish;
        this.name = name;
        this.body = body;
        this.draft = draft;
        this.prerelease = prerelease;
        this.createdAt = createdAt;
        this.publishedAt = publishedAt;
        this.author = author;
        this.assets = assets;
        this.bodyHtml = bodyHtml;
        this.bodyText = bodyText;
        this.mentionsCount = mentionsCount;
        this.discussionUrl = discussionUrl;
        this.reactions = reactions;
    }

    /**
     * Getter for Url.
     * @return Returns the String
     */
    @JsonGetter("url")
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
     * Getter for AssetsUrl.
     * @return Returns the String
     */
    @JsonGetter("assets_url")
    public String getAssetsUrl() {
        return assetsUrl;
    }

    /**
     * Setter for AssetsUrl.
     * @param assetsUrl Value for String
     */
    @JsonSetter("assets_url")
    public void setAssetsUrl(String assetsUrl) {
        this.assetsUrl = assetsUrl;
    }

    /**
     * Getter for UploadUrl.
     * @return Returns the String
     */
    @JsonGetter("upload_url")
    public String getUploadUrl() {
        return uploadUrl;
    }

    /**
     * Setter for UploadUrl.
     * @param uploadUrl Value for String
     */
    @JsonSetter("upload_url")
    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    /**
     * Getter for TarballUrl.
     * @return Returns the String
     */
    @JsonGetter("tarball_url")
    public String getTarballUrl() {
        return tarballUrl;
    }

    /**
     * Setter for TarballUrl.
     * @param tarballUrl Value for String
     */
    @JsonSetter("tarball_url")
    public void setTarballUrl(String tarballUrl) {
        this.tarballUrl = tarballUrl;
    }

    /**
     * Getter for ZipballUrl.
     * @return Returns the String
     */
    @JsonGetter("zipball_url")
    public String getZipballUrl() {
        return zipballUrl;
    }

    /**
     * Setter for ZipballUrl.
     * @param zipballUrl Value for String
     */
    @JsonSetter("zipball_url")
    public void setZipballUrl(String zipballUrl) {
        this.zipballUrl = zipballUrl;
    }

    /**
     * Getter for Id.
     * @return Returns the int
     */
    @JsonGetter("id")
    public int getId() {
        return id;
    }

    /**
     * Setter for Id.
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
     * Getter for TagName.
     * The name of the tag.
     * @return Returns the String
     */
    @JsonGetter("tag_name")
    public String getTagName() {
        return tagName;
    }

    /**
     * Setter for TagName.
     * The name of the tag.
     * @param tagName Value for String
     */
    @JsonSetter("tag_name")
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * Getter for TargetCommitish.
     * Specifies the commitish value that determines where the Git tag is created from.
     * @return Returns the String
     */
    @JsonGetter("target_commitish")
    public String getTargetCommitish() {
        return targetCommitish;
    }

    /**
     * Setter for TargetCommitish.
     * Specifies the commitish value that determines where the Git tag is created from.
     * @param targetCommitish Value for String
     */
    @JsonSetter("target_commitish")
    public void setTargetCommitish(String targetCommitish) {
        this.targetCommitish = targetCommitish;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Internal Getter for Body.
     * @return Returns the Internal String
     */
    @JsonGetter("body")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetBody() {
        return this.body;
    }

    /**
     * Getter for Body.
     * @return Returns the String
     */
    public String getBody() {
        return OptionalNullable.getFrom(body);
    }

    /**
     * Setter for Body.
     * @param body Value for String
     */
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = OptionalNullable.of(body);
    }

    /**
     * UnSetter for Body.
     */
    public void unsetBody() {
        body = null;
    }

    /**
     * Getter for Draft.
     * true to create a draft (unpublished) release, false to create a published one.
     * @return Returns the boolean
     */
    @JsonGetter("draft")
    public boolean getDraft() {
        return draft;
    }

    /**
     * Setter for Draft.
     * true to create a draft (unpublished) release, false to create a published one.
     * @param draft Value for boolean
     */
    @JsonSetter("draft")
    public void setDraft(boolean draft) {
        this.draft = draft;
    }

    /**
     * Getter for Prerelease.
     * Whether to identify the release as a prerelease or a full release.
     * @return Returns the boolean
     */
    @JsonGetter("prerelease")
    public boolean getPrerelease() {
        return prerelease;
    }

    /**
     * Setter for Prerelease.
     * Whether to identify the release as a prerelease or a full release.
     * @param prerelease Value for boolean
     */
    @JsonSetter("prerelease")
    public void setPrerelease(boolean prerelease) {
        this.prerelease = prerelease;
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
     * Getter for PublishedAt.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("published_at")
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    /**
     * Setter for PublishedAt.
     * @param publishedAt Value for LocalDateTime
     */
    @JsonSetter("published_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    /**
     * Getter for Author.
     * @return Returns the Author4
     */
    @JsonGetter("author")
    public Author4 getAuthor() {
        return author;
    }

    /**
     * Setter for Author.
     * @param author Value for Author4
     */
    @JsonSetter("author")
    public void setAuthor(Author4 author) {
        this.author = author;
    }

    /**
     * Getter for Assets.
     * @return Returns the List of ReleaseAsset
     */
    @JsonGetter("assets")
    public List<ReleaseAsset> getAssets() {
        return assets;
    }

    /**
     * Setter for Assets.
     * @param assets Value for List of ReleaseAsset
     */
    @JsonSetter("assets")
    public void setAssets(List<ReleaseAsset> assets) {
        this.assets = assets;
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
     * Getter for MentionsCount.
     * @return Returns the Integer
     */
    @JsonGetter("mentions_count")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getMentionsCount() {
        return mentionsCount;
    }

    /**
     * Setter for MentionsCount.
     * @param mentionsCount Value for Integer
     */
    @JsonSetter("mentions_count")
    public void setMentionsCount(Integer mentionsCount) {
        this.mentionsCount = mentionsCount;
    }

    /**
     * Getter for DiscussionUrl.
     * The URL of the release discussion.
     * @return Returns the String
     */
    @JsonGetter("discussion_url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDiscussionUrl() {
        return discussionUrl;
    }

    /**
     * Setter for DiscussionUrl.
     * The URL of the release discussion.
     * @param discussionUrl Value for String
     */
    @JsonSetter("discussion_url")
    public void setDiscussionUrl(String discussionUrl) {
        this.discussionUrl = discussionUrl;
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
     * Converts this ReposReleasesReleaseIdResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ReposReleasesReleaseIdResponse [" + "url=" + url + ", htmlUrl=" + htmlUrl
                + ", assetsUrl=" + assetsUrl + ", uploadUrl=" + uploadUrl + ", tarballUrl="
                + tarballUrl + ", zipballUrl=" + zipballUrl + ", id=" + id + ", nodeId=" + nodeId
                + ", tagName=" + tagName + ", targetCommitish=" + targetCommitish + ", name=" + name
                + ", draft=" + draft + ", prerelease=" + prerelease + ", createdAt=" + createdAt
                + ", publishedAt=" + publishedAt + ", author=" + author + ", assets=" + assets
                + ", body=" + body + ", bodyHtml=" + bodyHtml + ", bodyText=" + bodyText
                + ", mentionsCount=" + mentionsCount + ", discussionUrl=" + discussionUrl
                + ", reactions=" + reactions + "]";
    }

    /**
     * Builds a new {@link ReposReleasesReleaseIdResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ReposReleasesReleaseIdResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(url, htmlUrl, assetsUrl, uploadUrl, tarballUrl, zipballUrl,
                id, nodeId, tagName, targetCommitish, name, draft, prerelease, createdAt,
                publishedAt, author, assets)
                .bodyHtml(getBodyHtml())
                .bodyText(getBodyText())
                .mentionsCount(getMentionsCount())
                .discussionUrl(getDiscussionUrl())
                .reactions(getReactions());
        builder.body = internalGetBody();
        return builder;
    }

    /**
     * Class to build instances of {@link ReposReleasesReleaseIdResponse}.
     */
    public static class Builder {
        private String url;
        private String htmlUrl;
        private String assetsUrl;
        private String uploadUrl;
        private String tarballUrl;
        private String zipballUrl;
        private int id;
        private String nodeId;
        private String tagName;
        private String targetCommitish;
        private String name;
        private boolean draft;
        private boolean prerelease;
        private LocalDateTime createdAt;
        private LocalDateTime publishedAt;
        private Author4 author;
        private List<ReleaseAsset> assets;
        private OptionalNullable<String> body;
        private String bodyHtml;
        private String bodyText;
        private Integer mentionsCount;
        private String discussionUrl;
        private ReactionRollup reactions;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  url  String value for url.
         * @param  htmlUrl  String value for htmlUrl.
         * @param  assetsUrl  String value for assetsUrl.
         * @param  uploadUrl  String value for uploadUrl.
         * @param  tarballUrl  String value for tarballUrl.
         * @param  zipballUrl  String value for zipballUrl.
         * @param  id  int value for id.
         * @param  nodeId  String value for nodeId.
         * @param  tagName  String value for tagName.
         * @param  targetCommitish  String value for targetCommitish.
         * @param  name  String value for name.
         * @param  draft  boolean value for draft.
         * @param  prerelease  boolean value for prerelease.
         * @param  createdAt  LocalDateTime value for createdAt.
         * @param  publishedAt  LocalDateTime value for publishedAt.
         * @param  author  Author4 value for author.
         * @param  assets  List of ReleaseAsset value for assets.
         */
        public Builder(String url, String htmlUrl, String assetsUrl, String uploadUrl,
                String tarballUrl, String zipballUrl, int id, String nodeId, String tagName,
                String targetCommitish, String name, boolean draft, boolean prerelease,
                LocalDateTime createdAt, LocalDateTime publishedAt, Author4 author,
                List<ReleaseAsset> assets) {
            this.url = url;
            this.htmlUrl = htmlUrl;
            this.assetsUrl = assetsUrl;
            this.uploadUrl = uploadUrl;
            this.tarballUrl = tarballUrl;
            this.zipballUrl = zipballUrl;
            this.id = id;
            this.nodeId = nodeId;
            this.tagName = tagName;
            this.targetCommitish = targetCommitish;
            this.name = name;
            this.draft = draft;
            this.prerelease = prerelease;
            this.createdAt = createdAt;
            this.publishedAt = publishedAt;
            this.author = author;
            this.assets = assets;
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
         * Setter for assetsUrl.
         * @param  assetsUrl  String value for assetsUrl.
         * @return Builder
         */
        public Builder assetsUrl(String assetsUrl) {
            this.assetsUrl = assetsUrl;
            return this;
        }

        /**
         * Setter for uploadUrl.
         * @param  uploadUrl  String value for uploadUrl.
         * @return Builder
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        /**
         * Setter for tarballUrl.
         * @param  tarballUrl  String value for tarballUrl.
         * @return Builder
         */
        public Builder tarballUrl(String tarballUrl) {
            this.tarballUrl = tarballUrl;
            return this;
        }

        /**
         * Setter for zipballUrl.
         * @param  zipballUrl  String value for zipballUrl.
         * @return Builder
         */
        public Builder zipballUrl(String zipballUrl) {
            this.zipballUrl = zipballUrl;
            return this;
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
         * Setter for tagName.
         * @param  tagName  String value for tagName.
         * @return Builder
         */
        public Builder tagName(String tagName) {
            this.tagName = tagName;
            return this;
        }

        /**
         * Setter for targetCommitish.
         * @param  targetCommitish  String value for targetCommitish.
         * @return Builder
         */
        public Builder targetCommitish(String targetCommitish) {
            this.targetCommitish = targetCommitish;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for draft.
         * @param  draft  boolean value for draft.
         * @return Builder
         */
        public Builder draft(boolean draft) {
            this.draft = draft;
            return this;
        }

        /**
         * Setter for prerelease.
         * @param  prerelease  boolean value for prerelease.
         * @return Builder
         */
        public Builder prerelease(boolean prerelease) {
            this.prerelease = prerelease;
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
         * Setter for publishedAt.
         * @param  publishedAt  LocalDateTime value for publishedAt.
         * @return Builder
         */
        public Builder publishedAt(LocalDateTime publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        /**
         * Setter for author.
         * @param  author  Author4 value for author.
         * @return Builder
         */
        public Builder author(Author4 author) {
            this.author = author;
            return this;
        }

        /**
         * Setter for assets.
         * @param  assets  List of ReleaseAsset value for assets.
         * @return Builder
         */
        public Builder assets(List<ReleaseAsset> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * Setter for body.
         * @param  body  String value for body.
         * @return Builder
         */
        public Builder body(String body) {
            this.body = OptionalNullable.of(body);
            return this;
        }

        /**
         * UnSetter for body.
         * @return Builder
         */
        public Builder unsetBody() {
            body = null;
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
         * Setter for bodyText.
         * @param  bodyText  String value for bodyText.
         * @return Builder
         */
        public Builder bodyText(String bodyText) {
            this.bodyText = bodyText;
            return this;
        }

        /**
         * Setter for mentionsCount.
         * @param  mentionsCount  Integer value for mentionsCount.
         * @return Builder
         */
        public Builder mentionsCount(Integer mentionsCount) {
            this.mentionsCount = mentionsCount;
            return this;
        }

        /**
         * Setter for discussionUrl.
         * @param  discussionUrl  String value for discussionUrl.
         * @return Builder
         */
        public Builder discussionUrl(String discussionUrl) {
            this.discussionUrl = discussionUrl;
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
         * Builds a new {@link ReposReleasesReleaseIdResponse} object using the set fields.
         * @return {@link ReposReleasesReleaseIdResponse}
         */
        public ReposReleasesReleaseIdResponse build() {
            return new ReposReleasesReleaseIdResponse(url, htmlUrl, assetsUrl, uploadUrl,
                    tarballUrl, zipballUrl, id, nodeId, tagName, targetCommitish, name, draft,
                    prerelease, createdAt, publishedAt, author, assets, body, bodyHtml, bodyText,
                    mentionsCount, discussionUrl, reactions);
        }
    }
}
