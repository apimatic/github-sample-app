
# Secret Scanning Location Commit

Represents a 'commit' secret scanning location type. This location type shows that a secret was detected inside a commit to a repository.

## Structure

`SecretScanningLocationCommit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Path` | `String` | Required | The file path in the repository | String getPath() | setPath(String path) |
| `StartLine` | `double` | Required | Line number at which the secret starts in the file | double getStartLine() | setStartLine(double startLine) |
| `EndLine` | `double` | Required | Line number at which the secret ends in the file | double getEndLine() | setEndLine(double endLine) |
| `StartColumn` | `double` | Required | The column at which the secret starts within the start line when the file is interpreted as 8BIT ASCII | double getStartColumn() | setStartColumn(double startColumn) |
| `EndColumn` | `double` | Required | The column at which the secret ends within the end line when the file is interpreted as 8BIT ASCII | double getEndColumn() | setEndColumn(double endColumn) |
| `BlobSha` | `String` | Required | SHA-1 hash ID of the associated blob | String getBlobSha() | setBlobSha(String blobSha) |
| `BlobUrl` | `String` | Required | The API URL to get the associated blob resource | String getBlobUrl() | setBlobUrl(String blobUrl) |
| `CommitSha` | `String` | Required | SHA-1 hash ID of the associated commit | String getCommitSha() | setCommitSha(String commitSha) |
| `CommitUrl` | `String` | Required | The API URL to get the associated commit resource | String getCommitUrl() | setCommitUrl(String commitUrl) |

## Example (as JSON)

```json
{
  "path": "/example/secrets.txt",
  "start_line": null,
  "end_line": null,
  "start_column": null,
  "end_column": null,
  "blob_sha": "af5626b4a114abcb82d63db7c8082c3c4756e51b",
  "blob_url": null,
  "commit_sha": "af5626b4a114abcb82d63db7c8082c3c4756e51b",
  "commit_url": null
}
```

