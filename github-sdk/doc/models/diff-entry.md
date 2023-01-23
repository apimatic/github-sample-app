
# Diff Entry

Diff Entry

## Structure

`DiffEntry`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Sha` | `String` | Required | - | String getSha() | setSha(String sha) |
| `Filename` | `String` | Required | - | String getFilename() | setFilename(String filename) |
| `Status` | [`Status5Enum`](../../doc/models/status-5-enum.md) | Required | - | Status5Enum getStatus() | setStatus(Status5Enum status) |
| `Additions` | `int` | Required | - | int getAdditions() | setAdditions(int additions) |
| `Deletions` | `int` | Required | - | int getDeletions() | setDeletions(int deletions) |
| `Changes` | `int` | Required | - | int getChanges() | setChanges(int changes) |
| `BlobUrl` | `String` | Required | - | String getBlobUrl() | setBlobUrl(String blobUrl) |
| `RawUrl` | `String` | Required | - | String getRawUrl() | setRawUrl(String rawUrl) |
| `ContentsUrl` | `String` | Required | - | String getContentsUrl() | setContentsUrl(String contentsUrl) |
| `Patch` | `String` | Optional | - | String getPatch() | setPatch(String patch) |
| `PreviousFilename` | `String` | Optional | - | String getPreviousFilename() | setPreviousFilename(String previousFilename) |

## Example (as JSON)

```json
{
  "sha": "bbcd538c8e72b8c175046e27cc8f907076331401",
  "filename": "file1.txt",
  "status": null,
  "additions": 103,
  "deletions": 21,
  "changes": 124,
  "blob_url": "https://github.com/octocat/Hello-World/blob/6dcb09b5b57875f334f61aebed695e2e4193db5e/file1.txt",
  "raw_url": "https://github.com/octocat/Hello-World/raw/6dcb09b5b57875f334f61aebed695e2e4193db5e/file1.txt",
  "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/file1.txt?ref=6dcb09b5b57875f334f61aebed695e2e4193db5e"
}
```

