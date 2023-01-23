
# Content File

Content File

## Structure

`ContentFile`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | **Default**: `"file"` | String getType() | setType(String type) |
| `Encoding` | `String` | Required | - | String getEncoding() | setEncoding(String encoding) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Content` | `String` | Required | - | String getContent() | setContent(String content) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `GitUrl` | `String` | Required | - | String getGitUrl() | setGitUrl(String gitUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `DownloadUrl` | `String` | Required | - | String getDownloadUrl() | setDownloadUrl(String downloadUrl) |
| `Links` | [`Links3`](../../doc/models/links-3.md) | Required | - | Links3 getLinks() | setLinks(Links3 links) |
| `Target` | `String` | Optional | - | String getTarget() | setTarget(String target) |
| `SubmoduleGitUrl` | `String` | Optional | - | String getSubmoduleGitUrl() | setSubmoduleGitUrl(String submoduleGitUrl) |

## Example (as JSON)

```json
{
  "type": "file",
  "encoding": null,
  "size": null,
  "name": null,
  "path": null,
  "content": null,
  "sha": null,
  "url": null,
  "git_url": null,
  "html_url": null,
  "download_url": null,
  "_links": null
}
```

