
# Repos Releases Latest Response

## Structure

`ReposReleasesLatestResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `AssetsUrl` | `String` | Required | - | String getAssetsUrl() | setAssetsUrl(String assetsUrl) |
| `UploadUrl` | `String` | Required | - | String getUploadUrl() | setUploadUrl(String uploadUrl) |
| `TarballUrl` | `String` | Required | - | String getTarballUrl() | setTarballUrl(String tarballUrl) |
| `ZipballUrl` | `String` | Required | - | String getZipballUrl() | setZipballUrl(String zipballUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `TagName` | `String` | Required | The name of the tag. | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Required | Specifies the commitish value that determines where the Git tag is created from. | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Body` | `String` | Optional | - | String getBody() | setBody(String body) |
| `Draft` | `boolean` | Required | true to create a draft (unpublished) release, false to create a published one. | boolean getDraft() | setDraft(boolean draft) |
| `Prerelease` | `boolean` | Required | Whether to identify the release as a prerelease or a full release. | boolean getPrerelease() | setPrerelease(boolean prerelease) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `PublishedAt` | `LocalDateTime` | Required | - | LocalDateTime getPublishedAt() | setPublishedAt(LocalDateTime publishedAt) |
| `Author` | [`Author4`](../../doc/models/author-4.md) | Required | - | Author4 getAuthor() | setAuthor(Author4 author) |
| `Assets` | [`List<ReleaseAsset>`](../../doc/models/release-asset.md) | Required | - | List<ReleaseAsset> getAssets() | setAssets(List<ReleaseAsset> assets) |
| `BodyHtml` | `String` | Optional | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `BodyText` | `String` | Optional | - | String getBodyText() | setBodyText(String bodyText) |
| `MentionsCount` | `Integer` | Optional | - | Integer getMentionsCount() | setMentionsCount(Integer mentionsCount) |
| `DiscussionUrl` | `String` | Optional | The URL of the release discussion. | String getDiscussionUrl() | setDiscussionUrl(String discussionUrl) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |

## Example (as JSON)

```json
{
  "url": null,
  "html_url": null,
  "assets_url": null,
  "upload_url": null,
  "tarball_url": null,
  "zipball_url": null,
  "id": null,
  "node_id": null,
  "tag_name": "v1.0.0",
  "target_commitish": "master",
  "name": null,
  "draft": false,
  "prerelease": false,
  "created_at": null,
  "published_at": null,
  "author": {
    "login": "octocat",
    "id": 1,
    "node_id": "MDQ6VXNlcjE=",
    "avatar_url": "https://github.com/images/error/octocat_happy.gif",
    "gravatar_id": "41d064eb2195891e12d0413f63227ea7",
    "url": "https://api.github.com/users/octocat",
    "html_url": "https://github.com/octocat",
    "followers_url": "https://api.github.com/users/octocat/followers",
    "following_url": "https://api.github.com/users/octocat/following{/other_user}",
    "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
    "organizations_url": "https://api.github.com/users/octocat/orgs",
    "repos_url": "https://api.github.com/users/octocat/repos",
    "events_url": "https://api.github.com/users/octocat/events{/privacy}",
    "received_events_url": "https://api.github.com/users/octocat/received_events",
    "type": "User",
    "site_admin": null
  },
  "assets": {
    "url": null,
    "browser_download_url": null,
    "id": null,
    "node_id": null,
    "name": "Team Environment",
    "label": null,
    "state": null,
    "content_type": null,
    "size": null,
    "download_count": null,
    "created_at": null,
    "updated_at": null,
    "uploader": null
  }
}
```

