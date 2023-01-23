
# Orgs Dependabot Secrets Request

## Structure

`OrgsDependabotSecretsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EncryptedValue` | `String` | Optional | Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/reference/dependabot#get-an-organization-public-key) endpoint.<br>**Constraints**: *Pattern*: `^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==\|[A-Za-z0-9+/]{3}=\|[A-Za-z0-9+/]{4})$` | String getEncryptedValue() | setEncryptedValue(String encryptedValue) |
| `KeyId` | `String` | Optional | ID of the key you used to encrypt the secret. | String getKeyId() | setKeyId(String keyId) |
| `Visibility` | [`Visibility81Enum`](../../doc/models/visibility-81-enum.md) | Required | - | Visibility81Enum getVisibility() | setVisibility(Visibility81Enum visibility) |
| `SelectedRepositoryIds` | `List<String>` | Optional | An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/reference/dependabot#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/reference/dependabot#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/reference/dependabot#remove-selected-repository-from-an-organization-secret) endpoints. | List<String> getSelectedRepositoryIds() | setSelectedRepositoryIds(List<String> selectedRepositoryIds) |

## Example (as JSON)

```json
{
  "encrypted_value": null,
  "key_id": null,
  "visibility": "selected",
  "selected_repository_ids": null
}
```

