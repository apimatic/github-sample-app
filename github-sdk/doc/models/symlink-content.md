
# Symlink Content

An object describing a symlink

## Structure

`SymlinkContent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required, Constant | **Default**: `"symlink"` | String getType() | setType(String type) |
| `Target` | `String` | Required | - | String getTarget() | setTarget(String target) |
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
  "type": "symlink",
  "target": null,
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

