
# User Codespaces Secrets Request

## Structure

`UserCodespacesSecretsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EncryptedValue` | `String` | Optional | Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get the public key for the authenticated user](https://docs.github.com/rest/reference/codespaces#get-the-public-key-for-the-authenticated-user) endpoint.<br>**Constraints**: *Pattern*: `^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==\|[A-Za-z0-9+/]{3}=\|[A-Za-z0-9+/]{4})$` | String getEncryptedValue() | setEncryptedValue(String encryptedValue) |
| `KeyId` | `String` | Required | ID of the key you used to encrypt the secret. | String getKeyId() | setKeyId(String keyId) |
| `SelectedRepositoryIds` | `List<String>` | Optional | An array of repository ids that can access the user secret. You can manage the list of selected repositories using the [List selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret), [Set selected repositories for a user secret](https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-a-user-secret), and [Remove a selected repository from a user secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret) endpoints. | List<String> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<String> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "encrypted_value": null,
  "key_id": "key_id4",
  "selected_repository_ids": null
}
```

