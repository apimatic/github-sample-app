
# Package Version 4

## Structure

`PackageVersion4`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Author` | [`Author6`](../../doc/models/author-6.md) | Required | - | Author6 getAuthor() | setAuthor(Author6 author) |
| `Body` | `String` | Required | - | String getBody() | setBody(String body) |
| `BodyHtml` | `String` | Required | - | String getBodyHtml() | setBodyHtml(String bodyHtml) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `DockerMetadata` | `List<Object>` | Optional | - | List<Object> getDockerMetadata() | setDockerMetadata(List<Object> dockerMetadata) |
| `Draft` | `Boolean` | Optional | - | Boolean getDraft() | setDraft(Boolean draft) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `InstallationCommand` | `String` | Required | - | String getInstallationCommand() | setInstallationCommand(String installationCommand) |
| `Manifest` | `String` | Optional | - | String getManifest() | setManifest(String manifest) |
| `Metadata` | `List<Object>` | Required | - | List<Object> getMetadata() | setMetadata(List<Object> metadata) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `PackageFiles` | [`List<PackageFile3>`](../../doc/models/package-file-3.md) | Required | - | List<PackageFile3> getPackageFiles() | setPackageFiles(List<PackageFile3> packageFiles) |
| `PackageUrl` | `String` | Required | - | String getPackageUrl() | setPackageUrl(String packageUrl) |
| `Prerelease` | `Boolean` | Optional | - | Boolean getPrerelease() | setPrerelease(Boolean prerelease) |
| `Release` | [`Release4`](../../doc/models/release-4.md) | Optional | - | Release4 getRelease() | setRelease(Release4 release) |
| `RubygemsMetadata` | `List<Object>` | Optional | - | List<Object> getRubygemsMetadata() | setRubygemsMetadata(List<Object> rubygemsMetadata) |
| `Summary` | `String` | Required | - | String getSummary() | setSummary(String summary) |
| `TagName` | `String` | Optional | - | String getTagName() | setTagName(String tagName) |
| `TargetCommitish` | `String` | Required | - | String getTargetCommitish() | setTargetCommitish(String targetCommitish) |
| `TargetOid` | `String` | Required | - | String getTargetOid() | setTargetOid(String targetOid) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Version` | `String` | Required | - | String getVersion() | setVersion(String version) |

## Example (as JSON)

```json
{
  "author": {
    "avatar_url": "avatar_url6",
    "events_url": "events_url2",
    "followers_url": "followers_url8",
    "following_url": "following_url2",
    "gists_url": "gists_url2",
    "gravatar_id": "gravatar_id8",
    "html_url": "html_url0",
    "id": 108,
    "login": "login0",
    "node_id": "node_id2",
    "organizations_url": "organizations_url4",
    "received_events_url": "received_events_url2",
    "repos_url": "repos_url8",
    "site_admin": false,
    "starred_url": "starred_url8",
    "subscriptions_url": "subscriptions_url6",
    "type": "type0",
    "url": "url4"
  },
  "body": "body6",
  "body_html": "body_html2",
  "created_at": "created_at2",
  "description": "description0",
  "docker_metadata": null,
  "draft": null,
  "html_url": "html_url0",
  "id": 112,
  "installation_command": "installation_command0",
  "manifest": null,
  "metadata": [
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    },
    {
      "key1": "val1",
      "key2": "val2"
    }
  ],
  "name": "name0",
  "package_files": [
    {
      "content_type": null,
      "created_at": null,
      "download_url": null,
      "id": null,
      "md5": null,
      "name": null,
      "sha1": null,
      "sha256": null,
      "size": null,
      "state": null,
      "updated_at": null
    }
  ],
  "package_url": "package_url2",
  "prerelease": null,
  "release": null,
  "rubygems_metadata": null,
  "summary": "summary2",
  "tag_name": null,
  "target_commitish": "target_commitish8",
  "target_oid": "target_oid6",
  "updated_at": "updated_at4",
  "version": "version4"
}
```

