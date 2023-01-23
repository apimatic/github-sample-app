
# Release 8

## Structure

`Release8`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Assets` | [`List<ReleaseAsset1>`](../../doc/models/release-asset-1.md) | Required | - | List<ReleaseAsset1> getAssets() | setAssets(List<ReleaseAsset1> assets) |
| `AssetsUrl` | `String` | Required | - | String getAssetsUrl() | setAssetsUrl(String assetsUrl) |
| `Author` | `Object` | Required | - | Object getAuthor() | setAuthor(Object author) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `DiscussionUrl` | `String` | Optional | - | String getDiscussionUrl() | setDiscussionUrl(String discussionUrl) |
| `Draft` | `boolean` | Required | Whether the release is a draft or published | boolean getDraft() | setDraft(boolean draft) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `NodeId` | `String` | Required | - | String getNodeId() | setNodeId(String nodeId) |
| `Prerelease` | `String` | Required, Constant | Whether the release is identified as a prerelease or a full release.<br>**Default**: `"True"` | String getPrerelease() | setPrerelease(String prerelease) |
| `PublishedAt` | `LocalDateTime` | Required | - | LocalDateTime getPublishedAt() | setPublishedAt(LocalDateTime publishedAt) |
| `Reactions` | [`ReactionRollup`](../../doc/models/reaction-rollup.md) | Optional | - | ReactionRollup getReactions() | setReactions(ReactionRollup reactions) |
| `TagName` | `String` | Required | The name of the tag. | String getTagName() | setTagName(String tagName) |
| `TarballUrl` | `String` | Required | - | String getTarballUrl() | setTarballUrl(String tarballUrl) |
| `TargetCommitish` | `String` | Required | Specifies the commitish value that determines where the Git tag is created from. | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `UploadUrl` | `String` | Required | - | String getUploadUrl() | setUploadUrl(String uploadUrl) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `ZipballUrl` | `String` | Required | - | String getZipballUrl() | setZipballUrl(String zipballUrl) |

## Example (as JSON)

```json
{
  "assets": {
    "browser_download_url": null,
    "content_type": null,
    "created_at": null,
    "download_count": null,
    "id": null,
    "label": null,
    "name": null,
    "node_id": null,
    "size": null,
    "state": "uploaded",
    "updated_at": null,
    "url": null
  },
  "assets_url": null,
  "author": null,
  "body": null,
  "created_at": null,
  "draft": null,
  "html_url": null,
  "id": null,
  "name": null,
  "node_id": null,
  "prerelease": "True",
  "published_at": null,
  "tag_name": null,
  "tarball_url": null,
  "target_commitish": null,
  "upload_url": null,
  "url": null,
  "zipball_url": null
}
```

