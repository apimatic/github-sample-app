
# Content Tree

Content Tree

## Structure

`ContentTree`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `GitUrl` | `String` | Required | - | String getGitUrl() | setGitUrl(String gitUrl) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `DownloadUrl` | `String` | Required | - | String getDownloadUrl() | setDownloadUrl(String downloadUrl) |
| `Entries` | [`List<Entry>`](../../doc/models/entry.md) | Optional | - | List<Entry> getEntries() | setEntries(List<Entry> entries) |
| `Links` | [`Links3`](../../doc/models/links-3.md) | Required | - | Links3 getLinks() | setLinks(Links3 links) |

## Example (as JSON)

```json
{
  "type": "type0",
  "size": 18,
  "name": "name0",
  "path": "path6",
  "sha": "sha6",
  "url": "url4",
  "git_url": "git_url0",
  "html_url": "html_url0",
  "download_url": "download_url0",
  "entries": null,
  "_links": {
    "git": "git6",
    "html": "html6",
    "self": "self4"
  }
}
```

