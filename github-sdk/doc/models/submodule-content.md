
# Submodule Content

An object describing a submodule

## Structure

`SubmoduleContent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | **Default**: `"submodule"` | String getType() | setType(String type) |
| `SubmoduleGitUrl` | `String` | Required | - | String getSubmoduleGitUrl() | setSubmoduleGitUrl(String submoduleGitUrl) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `GitUrl` | `String` | Required | - | String getGitUrl() | setGitUrl(String gitUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `DownloadUrl` | `String` | Required | - | String getDownloadUrl() | setDownloadUrl(String downloadUrl) |
| `Links` | [`Links3`](../../doc/models/links-3.md) | Required | - | Links3 getLinks() | setLinks(Links3 links) |

## Example (as JSON)

```json
{
  "type": "submodule",
  "submodule_git_url": null,
  "size": null,
  "name": null,
  "path": null,
  "sha": null,
  "url": null,
  "git_url": null,
  "html_url": null,
  "download_url": null,
  "_links": null
}
```

