
# Repos Pulls Pull Number Reviews Review Id Dismissals Request

## Structure

`ReposPullsPullNumberReviewsReviewIdDismissalsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Message` | `String` | Required | The message for the pull request review dismissal | String getMessage() | setMessage(String message) |
| `Event` | [`Event30Enum`](../../doc/models/event-30-enum.md) | Optional | - | Event30Enum getEvent() | setEvent(Event30Enum event) |

## Example (as JSON)

```json
{
  "message": "message0",
  "event": null
}
```

