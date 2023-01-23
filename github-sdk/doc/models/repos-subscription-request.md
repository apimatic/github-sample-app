
# Repos Subscription Request

## Structure

`ReposSubscriptionRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Subscribed` | `Boolean` | Optional | Determines if notifications should be received from this repository. | Boolean getSubscribed() | setSubscribed(Boolean subscribed) |
| `Ignored` | `Boolean` | Optional | Determines if all notifications should be blocked from this repository. | Boolean getIgnored() | setIgnored(Boolean ignored) |

## Example (as JSON)

```json
{
  "subscribed": null,
  "ignored": null
}
```

