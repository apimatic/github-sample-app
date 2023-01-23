
# Build 2

## Structure

`Build2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Commit` | `String` | Required | - | String getCommit() | setCommit(String commit) |
| `CreatedAt` | `String` | Required | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `Duration` | `int` | Required | - | int getDuration() | setDuration(int duration) |
| `Error` | [`Error2`](../../doc/models/error-2.md) | Required | - | Error2 getError() | setError(Error2 error) |
| `Pusher` | `Object` | Required | - | Object getPusher() | setPusher(Object pusher) |
| `Status` | `String` | Required | - | String getStatus() | setStatus(String status) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "commit": "commit8",
  "created_at": "created_at2",
  "duration": 112,
  "error": {
    "message": "message4"
  },
  "pusher": {
    "key1": "val1",
    "key2": "val2"
  },
  "status": "status8",
  "updated_at": "updated_at4",
  "url": "url4"
}
```

