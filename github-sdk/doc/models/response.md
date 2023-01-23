
# Response

## Structure

`Response`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Headers` | `Object` | Required | The response headers received when the delivery was made. | Object getHeaders() | setHeaders(Object headers) |
| `Payload` | `String` | Required | The response payload received. | String getPayload() | setPayload(String payload) |

## Example (as JSON)

```json
{
  "headers": {
    "key1": "val1",
    "key2": "val2"
  },
  "payload": "payload6"
}
```

