
# Request

## Structure

`Request`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Headers` | `Object` | Required | The request headers sent with the webhook delivery. | Object getHeaders() | setHeaders(Object headers) |
| `Payload` | `Object` | Required | The webhook payload. | Object getPayload() | setPayload(Object payload) |

## Example (as JSON)

```json
{
  "headers": {
    "key1": "val1",
    "key2": "val2"
  },
  "payload": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

