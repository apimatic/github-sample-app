
# Runner Application

Runner Application

## Structure

`RunnerApplication`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Os` | `String` | Required | - | String getOs() | setOs(String os) |
| `Architecture` | `String` | Required | - | String getArchitecture() | setArchitecture(String architecture) |
| `DownloadUrl` | `String` | Required | - | String getDownloadUrl() | setDownloadUrl(String downloadUrl) |
| `Filename` | `String` | Required | - | String getFilename() | setFilename(String filename) |
| `TempDownloadToken` | `String` | Optional | A short lived bearer token used to download the runner, if needed. | String getTempDownloadToken() | setTempDownloadToken(String tempDownloadToken) |
| `Sha256Checksum` | `String` | Optional | - | String getSha256Checksum() | setSha256Checksum(String sha256Checksum) |

## Example (as JSON)

```json
{
  "os": "os8",
  "architecture": "architecture2",
  "download_url": "download_url0",
  "filename": "filename2",
  "temp_download_token": null,
  "sha256_checksum": null
}
```

