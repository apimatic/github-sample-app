
# Repositories Environments Secrets Secret Name Request

## Structure

`RepositoriesEnvironmentsSecretsSecretNameRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EncryptedValue` | `String` | Required | Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an environment public key](https://docs.github.com/rest/reference/actions#get-an-environment-public-key) endpoint.<br>**Constraints**: *Pattern*: `^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==\|[A-Za-z0-9+/]{3}=\|[A-Za-z0-9+/]{4})$` | String getEncryptedValue() | setEncryptedValue(String encryptedValue) |
| `KeyId` | `String` | Required | ID of the key you used to encrypt the secret. | String getKeyId() | setKeyId(String keyId) |

## Example (as JSON)

```json
{
  "encrypted_value": "encrypted_value4",
  "key_id": "key_id4"
}
```

