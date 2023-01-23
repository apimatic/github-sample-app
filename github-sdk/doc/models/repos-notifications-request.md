
# Repos Notifications Request

## Structure

`ReposNotificationsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LastReadAt` | `LocalDateTime` | Optional | Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp. | LocalDateTime getLastReadAt() | setLastReadAt(LocalDateTime lastReadAt) |

## Example (as JSON)

```json
{
  "last_read_at": null
}
```

