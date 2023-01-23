
# Config 2

## Structure

`Config2`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ContentType` | [`ContentTypeEnum`](../../doc/models/content-type-enum.md) | Required | - | ContentTypeEnum getContentType() | setContentType(ContentTypeEnum contentType) |
| `InsecureSsl` | `String` | Required | - | String getInsecureSsl() | setInsecureSsl(String insecureSsl) |
| `Secret` | `String` | Optional | - | String getSecret() | setSecret(String secret) |
| `Url` | `String` | Required | - | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "content_type": "json",
  "insecure_ssl": "insecure_ssl4",
  "secret": null,
  "url": "url4"
}
```

