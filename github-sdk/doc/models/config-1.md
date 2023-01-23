
# Config 1

## Structure

`Config1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Email` | `String` | Optional | - | String getEmail() | setEmail(String email) |
| `Password` | `String` | Optional | - | String getPassword() | setPassword(String password) |
| `Room` | `String` | Optional | - | String getRoom() | setRoom(String room) |
| `Subdomain` | `String` | Optional | - | String getSubdomain() | setSubdomain(String subdomain) |
| `Url` | `String` | Optional | The URL to which the payloads will be delivered. | String getUrl() | setUrl(String url) |
| `InsecureSsl` | `Object` | Optional | - | Object getInsecureSsl() | setInsecureSsl(Object insecureSsl) |
| `ContentType` | `String` | Optional | The media type used to serialize the payloads. Supported values include `json` and `form`. The default is `form`. | String getContentType() | setContentType(String contentType) |
| `Digest` | `String` | Optional | - | String getDigest() | setDigest(String digest) |
| `Secret` | `String` | Optional | If provided, the `secret` will be used as the `key` to generate the HMAC hex digest value for [delivery signature headers](https://docs.github.com/webhooks/event-payloads/#delivery-headers). | String getSecret() | setSecret(String secret) |
| `Token` | `String` | Optional | - | String getToken() | setToken(String token) |

## Example (as JSON)

```json
{
  "email": null,
  "password": null,
  "room": null,
  "subdomain": null,
  "url": null,
  "insecure_ssl": null,
  "content_type": null,
  "digest": null,
  "secret": null,
  "token": null
}
```

