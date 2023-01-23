
# Webhook Configuration

Configuration object of the webhook

## Structure

`WebhookConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | The URL to which the payloads will be delivered. | String getUrl() | setUrl(String url) |
| `ContentType` | `String` | Optional | The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`. | String getContentType() | setContentType(String contentType) |
| `Secret` | `String` | Optional | If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). | String getSecret() | setSecret(String secret) |
| `InsecureSsl` | `Object` | Optional | - | Object getInsecureSsl() | setInsecureSsl(Object insecureSsl) |

## Example (as JSON)

```json
{
  "url": null,
  "content_type": null,
  "secret": null,
  "insecure_ssl": null
}
```

