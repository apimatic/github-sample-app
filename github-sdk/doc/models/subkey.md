
# Subkey

## Structure

`Subkey`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `Integer` | Optional | - | Integer getId() | setId(Integer id) |
| `PrimaryKeyId` | `Integer` | Optional | - | Integer getPrimaryKeyId() | setPrimaryKeyId(Integer primaryKeyId) |
| `KeyId` | `String` | Optional | - | String getKeyId() | setKeyId(String keyId) |
| `PublicKey` | `String` | Optional | - | String getPublicKey() | setPublicKey(String publicKey) |
| `Emails` | `List<Object>` | Optional | - | List<Object> getEmails() | setEmails(List<Object> emails) |
| `Subkeys` | `List<Object>` | Optional | - | List<Object> getSubkeys() | setSubkeys(List<Object> subkeys) |
| `CanSign` | `Boolean` | Optional | - | Boolean getCanSign() | setCanSign(Boolean canSign) |
| `CanEncryptComms` | `Boolean` | Optional | - | Boolean getCanEncryptComms() | setCanEncryptComms(Boolean canEncryptComms) |
| `CanEncryptStorage` | `Boolean` | Optional | - | Boolean getCanEncryptStorage() | setCanEncryptStorage(Boolean canEncryptStorage) |
| `CanCertify` | `Boolean` | Optional | - | Boolean getCanCertify() | setCanCertify(Boolean canCertify) |
| `CreatedAt` | `String` | Optional | - | String getCreatedAt() | setCreatedAt(String createdAt) |
| `ExpiresAt` | `String` | Optional | - | String getExpiresAt() | setExpiresAt(String expiresAt) |
| `RawKey` | `String` | Optional | - | String getRawKey() | setRawKey(String rawKey) |
| `Revoked` | `Boolean` | Optional | - | Boolean getRevoked() | setRevoked(Boolean revoked) |

## Example (as JSON)

```json
{
  "id": null,
  "primary_key_id": null,
  "key_id": null,
  "public_key": null,
  "emails": null,
  "subkeys": null,
  "can_sign": null,
  "can_encrypt_comms": null,
  "can_encrypt_storage": null,
  "can_certify": null,
  "created_at": null,
  "expires_at": null,
  "raw_key": null,
  "revoked": null
}
```

