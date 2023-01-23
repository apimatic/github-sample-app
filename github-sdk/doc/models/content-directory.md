
# Content Directory

## Structure

`ContentDirectory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type2Enum`](../../doc/models/type-2-enum.md) | Required | - | Type2Enum getType() | setType(Type2Enum type) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Content` | `String` | Optional | - | String getContent() | setContent(String content) |
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
  "size": 18,
  "name": "name0",
  "path": "path6",
  "content": null,
  "sha": "sha6",
  "url": "url4",
  "git_url": "git_url0",
  "html_url": "html_url0",
  "download_url": "download_url0",
  "_links": {
    "git": "git6",
    "html": "html6",
    "self": "self4"
  }
}
```

