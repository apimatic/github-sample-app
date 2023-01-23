
# Repos Pulls Pull Number Reviews Review Id Events Request

## Structure

`ReposPullsPullNumberReviewsReviewIdEventsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Body` | `String` | Optional | The body text of the pull request review | String getBody() | setBody(String body) |
| `Event` | [`Event31Enum`](../../doc/models/event-31-enum.md) | Required | - | Event31Enum getEvent() | setEvent(Event31Enum event) |

## Example (as JSON)

```json
{
  "body": null,
  "event": "APPROVE"
}
```

