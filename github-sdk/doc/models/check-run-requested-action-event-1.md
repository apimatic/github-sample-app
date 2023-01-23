
# Check Run Requested Action Event 1

The check_run.requested_action webhook encoded with URL encoding

## Structure

`CheckRunRequestedActionEvent1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payload` | `String` | Required | A URL-encoded string of the check_run.requested_action JSON payload. The decoded payload is a JSON object. | String getPayload() | setPayload(String payload) |

## Example (as JSON)

```json
{
  "payload": "payload6"
}
```

