
# Config 7

Key/value pairs to provide settings for this webhook. [These are defined below](https://docs.github.com/rest/reference/repos#create-hook-config-params).

## Structure

`Config7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Required | The URL to which the payloads will be delivered. | String getUrl() | setUrl(String url) |
| `ContentType` | `String` | Optional | The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`. | String getContentType() | setContentType(String contentType) |
| `Secret` | `String` | Optional | If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). | String getSecret() | setSecret(String secret) |
| `InsecureSsl` | `Object` | Optional | - | Object getInsecureSsl() | setInsecureSsl(Object insecureSsl) |
| `Address` | `String` | Optional | - | String getAddress() | setAddress(String address) |
| `Room` | `String` | Optional | - | String getRoom() | setRoom(String room) |

## Example (as JSON)

```json
{
  "url": "https://example.com/webhook"
}
```

