
# Page Build Status

Page Build Status

## Structure

`PageBuildStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |

## Example (as JSON)

```json
{
  "url": "https://api.github.com/repos/github/hello-world/pages/builds/latest",
  "status": "queued"
}
```

