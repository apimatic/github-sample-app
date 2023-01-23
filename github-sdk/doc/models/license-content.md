
# License Content

License Content

## Structure

`LicenseContent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | - | String getName() | setName(String name) |
| `Path` | `String` | Required | - | String getPath() | setPath(String path) |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Size` | `int` | Required | - | int getSize() | setSize(int size) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `HtmlUrl` | `String` | Required | - | String getHtmlUrl() | setHtmlUrl(String htmlUrl) |
| `GitUrl` | `String` | Required | - | String getGitUrl() | setGitUrl(String gitUrl) |
| `DownloadUrl` | `String` | Required | - | String getDownloadUrl() | setDownloadUrl(String downloadUrl) |
| `Type` | `String` | Required | - | String getType() | setType(String type) |
| `Content` | `String` | Required | - | String getContent() | setContent(String content) |
| `Encoding` | `String` | Required | - | String getEncoding() | setEncoding(String encoding) |
| `Links` | [`Links3`](../../doc/models/links-3.md) | Required | - | Links3 getLinks() | setLinks(Links3 links) |
| `License` | `Object` | Required | - | Object getLicense() | setLicense(Object license) |

## Example (as JSON)

```json
{
  "name": "name0",
  "path": "path6",
  "sha": "sha6",
  "size": 18,
  "url": "url4",
  "html_url": "html_url0",
  "git_url": "git_url0",
  "download_url": "download_url0",
  "type": "type0",
  "content": "content4",
  "encoding": "encoding8",
  "_links": {
    "git": "git6",
    "html": "html6",
    "self": "self4"
  },
  "license": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

