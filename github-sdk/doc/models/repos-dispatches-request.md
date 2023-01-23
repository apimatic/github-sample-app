
# Repos Dispatches Request

## Structure

`ReposDispatchesRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EventType` | `String` | Required | A custom webhook event name. Must be 100 characters or fewer.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `100` | String getEventType() | setEventType(String eventType) |
| `ClientPayload` | `Object` | Optional | JSON payload with extra information about the webhook event that your action or workflow may use. The maximum number of top-level properties is 10. | Object getClientPayload() | setClientPayload(Object clientPayload) |

## Example (as JSON)

```json
{
  "event_type": "event_type0",
  "client_payload": null
}
```

