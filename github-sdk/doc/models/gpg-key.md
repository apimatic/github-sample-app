
# GPG Key

A unique encryption key

## Structure

`GPGKey`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `int` | Required | - | int getId() | setId(int id) |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `PrimaryKeyId` | `Integer` | Required | - | Integer getPrimaryKeyId() | setPrimaryKeyId(Integer primaryKeyId) |
| `KeyId` | `String` | Required | - | String getKeyId() | setKeyId(String keyId) |
| `PublicKey` | `String` | Required | - | String getPublicKey() | setPublicKey(String publicKey) |
| `Emails` | [`List<Email1>`](../../doc/models/email-1.md) | Required | - | List<Email1> getEmails() | setEmails(List<Email1> emails) |
| `Subkeys` | [`List<Subkey>`](../../doc/models/subkey.md) | Required | - | List<Subkey> getSubkeys() | setSubkeys(List<Subkey> subkeys) |
| `CanSign` | `boolean` | Required | - | boolean getCanSign() | setCanSign(boolean canSign) |
| `CanEncryptComms` | `boolean` | Required | - | boolean getCanEncryptComms() | setCanEncryptComms(boolean canEncryptComms) |
| `CanEncryptStorage` | `boolean` | Required | - | boolean getCanEncryptStorage() | setCanEncryptStorage(boolean canEncryptStorage) |
| `CanCertify` | `boolean` | Required | - | boolean getCanCertify() | setCanCertify(boolean canCertify) |
| `CreatedAt` | `LocalDateTime` | Required | - | LocalDateTime getCreatedAt() | setCreatedAt(LocalDateTime createdAt) |
| `ExpiresAt` | `LocalDateTime` | Required | - | LocalDateTime getExpiresAt() | setExpiresAt(LocalDateTime expiresAt) |
| `Revoked` | `boolean` | Required | - | boolean getRevoked() | setRevoked(boolean revoked) |
| `RawKey` | `String` | Required | - | String getRawKey() | setRawKey(String rawKey) |

## Example (as JSON)

```json
{
  "id": 3,
  "primary_key_id": null,
  "key_id": "3262EFF25BA0D270",
  "public_key": "xsBNBFayYZ...",
  "emails": [
    {
      "email": "octocat@users.noreply.github.com",
      "verified": true
    }
  ],
  "subkeys": [
    {
      "id": 4,
      "primary_key_id": 3,
      "key_id": "4A595D4C72EE49C7",
      "public_key": "zsBNBFayYZ...",
      "emails": [],
      "subkeys": [],
      "can_sign": false,
      "can_encrypt_comms": true,
      "can_encrypt_storage": true,
      "can_certify": false,
      "created_at": "2016-03-24T11:31:04-06:00",
      "expires_at": null,
      "revoked": false
    }
  ],
  "can_sign": true,
  "can_encrypt_comms": null,
  "can_encrypt_storage": null,
  "can_certify": true,
  "created_at": "03/24/2016 22:31:04",
  "expires_at": null,
  "revoked": true,
  "raw_key": null
}
```

