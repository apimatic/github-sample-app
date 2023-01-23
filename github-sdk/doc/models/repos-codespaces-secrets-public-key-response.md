
# Repos Codespaces Secrets Public Key Response

## Structure

`ReposCodespacesSecretsPublicKeyResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `KeyId` | `String` | Required | The identifier for the key. | String getKeyId() | setKeyId(String keyId) |
| `Key` | `String` | Required | The Base64 encoded public key. | String getKey() | setKey(String key) |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `Url` | `String` | Optional | - | String getUrl() | setUrl(String url) |
| `Title` | `String` | Optional | - | String getTitle() | setTitle(String title) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |

## Example (as JSON)

```json
{
  "key_id": "1234567",
  "key": "hBT5WZEj8ZoOv6TYJsfWq7MxTEQopZO5/IT3ZCVQPzs="
}
```

