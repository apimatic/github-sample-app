
# Secret Scanning Location

## Structure

`SecretScanningLocation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`Type3Enum`](../../doc/models/type-3-enum.md) | Required | - | Type3Enum getType() | setType(Type3Enum type) |
| `Details` | [`SecretScanningLocationDetails`]($m/SecretScanningLocationDetails) | Required | - | SecretScanningLocationDetails getDetails() | setDetails(SecretScanningLocationDetails details) |

## Example (as JSON)

```json
{
  "type": "issue_body",
  "details": {
    "path": "path4",
    "start_line": 80.4,
    "end_line": 208.68,
    "start_column": 104.36,
    "end_column": 180.9,
    "blob_sha": "blob_sha4",
    "blob_url": "blob_url6",
    "commit_sha": "commit_sha4",
    "commit_url": "commit_url8"
  }
}
```

