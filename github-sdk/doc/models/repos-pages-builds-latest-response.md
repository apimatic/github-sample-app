
# Repos Pages Builds Latest Response

## Structure

`ReposPagesBuildsLatestResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `Error` | [`Error2`](../../doc/models/error-2.md) | Required | - | Error2 getError() | setError(Error2 error) |
| `Pusher` | `Object` | Required | - | Object getPusher() | setPusher(Object pusher) |
| `Commit` | `String` | Required | - | String getCommit() | setCommit(String commit) |
| `Duration` | `int` | Required | - | int getDuration() | setDuration(int duration) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `UpdatedAt` | `LocalDateTime` | Required | - | LocalDateTime getUpdatedAt() | setUpdatedAt(LocalDateTime updatedAt) |

## Example (as JSON)

```json
{
  "url": "url4",
  "status": "status8",
  "error": {
    "message": "message4"
  },
  "pusher": {
    "key1": "val1",
    "key2": "val2"
  },
  "commit": "commit8",
  "duration": 112,
  "created_at": "2016-03-13T12:52:32.123Z",
  "updated_at": "2016-03-13T12:52:32.123Z"
}
```

