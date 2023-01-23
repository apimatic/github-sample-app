
# Config 3

## Structure

`Config3`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContentType` | `String` | Optional | The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`. | String getContentType() | setContentType(String contentType) |
| `InsecureSsl` | `Object` | Optional | - | Object getInsecureSsl() | setInsecureSsl(Object insecureSsl) |
| `Secret` | `String` | Optional | If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). | String getSecret() | setSecret(String secret) |
| `Url` | `String` | Optional | The URL to which the payloads will be delivered. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "content_type": null,
  "insecure_ssl": null,
  "secret": null,
  "url": null
}
```

