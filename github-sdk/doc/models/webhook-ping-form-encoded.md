
# Webhook Ping Form Encoded

The webhooks ping payload encoded with URL encoding.

## Structure

`WebhookPingFormEncoded`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Payload` | `String` | Required | A URL-encoded string of the ping JSON payload. The decoded payload is a JSON object. | String getPayload() | setPayload(String payload) |

## Example (as JSON)

```json
{
  "payload": "payload6"
}
```

