# Codespaces

Endpoints to manage Codespaces using the REST API.

```java
CodespacesController codespacesController = client.getCodespacesController();
```

## Class Name

`CodespacesController`

## Methods

* [Codespaces List-in-Organization](../../doc/controllers/codespaces.md#codespaces-list-in-organization)
* [Codespaces Set-Codespaces-Billing](../../doc/controllers/codespaces.md#codespaces-set-codespaces-billing)
* [Codespaces List-Org-Secrets](../../doc/controllers/codespaces.md#codespaces-list-org-secrets)
* [Codespaces Get-Org-Public-Key](../../doc/controllers/codespaces.md#codespaces-get-org-public-key)
* [Codespaces Get-Org-Secret](../../doc/controllers/codespaces.md#codespaces-get-org-secret)
* [Codespaces Create-or-Update-Org-Secret](../../doc/controllers/codespaces.md#codespaces-create-or-update-org-secret)
* [Codespaces Delete-Org-Secret](../../doc/controllers/codespaces.md#codespaces-delete-org-secret)
* [Codespaces List-Selected-Repos-for-Org-Secret](../../doc/controllers/codespaces.md#codespaces-list-selected-repos-for-org-secret)
* [Codespaces Set-Selected-Repos-for-Org-Secret](../../doc/controllers/codespaces.md#codespaces-set-selected-repos-for-org-secret)
* [Codespaces Add-Selected-Repo-to-Org-Secret](../../doc/controllers/codespaces.md#codespaces-add-selected-repo-to-org-secret)
* [Codespaces Remove-Selected-Repo-From-Org-Secret](../../doc/controllers/codespaces.md#codespaces-remove-selected-repo-from-org-secret)
* [Codespaces Get-Codespaces-for-User-in-Org](../../doc/controllers/codespaces.md#codespaces-get-codespaces-for-user-in-org)
* [Codespaces Delete-From-Organization](../../doc/controllers/codespaces.md#codespaces-delete-from-organization)
* [Codespaces Stop-in-Organization](../../doc/controllers/codespaces.md#codespaces-stop-in-organization)
* [Codespaces List-in-Repository-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-list-in-repository-for-authenticated-user)
* [Codespaces Create-With-Repo-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-create-with-repo-for-authenticated-user)
* [Codespaces List-Devcontainers-in-Repository-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-list-devcontainers-in-repository-for-authenticated-user)
* [Codespaces Repo-Machines-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-repo-machines-for-authenticated-user)
* [Codespaces Pre-Flight-With-Repo-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-pre-flight-with-repo-for-authenticated-user)
* [Codespaces List-Repo-Secrets](../../doc/controllers/codespaces.md#codespaces-list-repo-secrets)
* [Codespaces Get-Repo-Public-Key](../../doc/controllers/codespaces.md#codespaces-get-repo-public-key)
* [Codespaces Get-Repo-Secret](../../doc/controllers/codespaces.md#codespaces-get-repo-secret)
* [Codespaces Create-or-Update-Repo-Secret](../../doc/controllers/codespaces.md#codespaces-create-or-update-repo-secret)
* [Codespaces Delete-Repo-Secret](../../doc/controllers/codespaces.md#codespaces-delete-repo-secret)
* [Codespaces Create-With-Pr-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-create-with-pr-for-authenticated-user)
* [Codespaces List-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-list-for-authenticated-user)
* [Codespaces Create-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-create-for-authenticated-user)
* [Codespaces List-Secrets-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-list-secrets-for-authenticated-user)
* [Codespaces Get-Public-Key-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-get-public-key-for-authenticated-user)
* [Codespaces Get-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-get-secret-for-authenticated-user)
* [Codespaces Create-or-Update-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-create-or-update-secret-for-authenticated-user)
* [Codespaces Delete-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-delete-secret-for-authenticated-user)
* [Codespaces List-Repositories-for-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-list-repositories-for-secret-for-authenticated-user)
* [Codespaces Set-Repositories-for-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-set-repositories-for-secret-for-authenticated-user)
* [Codespaces Add-Repository-for-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-add-repository-for-secret-for-authenticated-user)
* [Codespaces Remove-Repository-for-Secret-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-remove-repository-for-secret-for-authenticated-user)
* [Codespaces Get-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-get-for-authenticated-user)
* [Codespaces Update-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-update-for-authenticated-user)
* [Codespaces Delete-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-delete-for-authenticated-user)
* [Codespaces Export-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-export-for-authenticated-user)
* [Codespaces Get-Export-Details-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-get-export-details-for-authenticated-user)
* [Codespaces Codespace-Machines-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-codespace-machines-for-authenticated-user)
* [Codespaces Publish-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-publish-for-authenticated-user)
* [Codespaces Start-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-start-for-authenticated-user)
* [Codespaces Stop-for-Authenticated-User](../../doc/controllers/codespaces.md#codespaces-stop-for-authenticated-user)


# Codespaces List-in-Organization

Lists the codespaces associated to a specified organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-in-organization](https://docs.github.com/rest/reference/codespaces#list-in-organization)

```java
CompletableFuture<OrgsCodespacesResponse> codespacesListInOrganizationAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsCodespacesResponse`](../../doc/models/orgs-codespaces-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListInOrganizationAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsCodespaces401ErrorException`](../../doc/models/orgs-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`OrgsCodespaces403ErrorException`](../../doc/models/orgs-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`OrgsCodespaces404ErrorException`](../../doc/models/orgs-codespaces-404-error-exception.md) |
| 500 | Internal Error | [`OrgsCodespaces500ErrorException`](../../doc/models/orgs-codespaces-500-error-exception.md) |


# Codespaces Set-Codespaces-Billing

Sets which users can access codespaces in an organization. This is synonymous with granting or revoking codespaces billing permissions for users according to the visibility.
You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#set-codespaces-billing](https://docs.github.com/rest/reference/codespaces#set-codespaces-billing)

```java
CompletableFuture<Void> codespacesSetCodespacesBillingAsync(
    final String org,
    final OrgsCodespacesBillingRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsCodespacesBillingRequest`](../../doc/models/orgs-codespaces-billing-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
OrgsCodespacesBillingRequest body = new OrgsCodespacesBillingRequest();
body.setVisibility(Visibility84Enum.SELECTED_MEMBERS);
List<String> selectedUsernames = new LinkedList<>();
selectedUsernames.add("johnDoe");
selectedUsernames.add("atomIO");

body.setSelectedUsernames(selectedUsernames);

codespacesController.codespacesSetCodespacesBillingAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Users are neither members nor collaborators of this organization. | `ApiException` |
| 404 | Resource not found | [`OrgsCodespacesBilling404ErrorException`](../../doc/models/orgs-codespaces-billing-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsCodespacesBilling422ErrorException`](../../doc/models/orgs-codespaces-billing-422-error-exception.md) |
| 500 | Internal Error | [`OrgsCodespacesBilling500ErrorException`](../../doc/models/orgs-codespaces-billing-500-error-exception.md) |


# Codespaces List-Org-Secrets

Lists all Codespaces secrets available at the organization-level without revealing their encrypted values.
You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-organization-secrets](https://docs.github.com/rest/reference/codespaces#list-organization-secrets)

```java
CompletableFuture<OrgsCodespacesSecretsResponse> codespacesListOrgSecretsAsync(
    final String org,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsCodespacesSecretsResponse`](../../doc/models/orgs-codespaces-secrets-response.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListOrgSecretsAsync(org, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "secrets": [
    {
      "name": "GH_TOKEN",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "all"
    },
    {
      "name": "GIST_ID",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z",
      "visibility": "all"
    }
  ]
}
```


# Codespaces Get-Org-Public-Key

Gets a public key for an organization, which is required in order to encrypt secrets. You need to encrypt the value of a secret before you can create or update secrets. You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-an-organization-public-key](https://docs.github.com/rest/reference/codespaces#get-an-organization-public-key)

```java
CompletableFuture<OrgsCodespacesSecretsPublicKeyResponse> codespacesGetOrgPublicKeyAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsCodespacesSecretsPublicKeyResponse`](../../doc/models/orgs-codespaces-secrets-public-key-response.md)

## Example Usage

```java
String org = "org6";

codespacesController.codespacesGetOrgPublicKeyAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Codespaces Get-Org-Secret

Gets an organization secret without revealing its encrypted value.
You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-an-organization-secret](https://docs.github.com/rest/reference/codespaces#get-an-organization-secret)

```java
CompletableFuture<OrgsCodespacesSecretsResponse2> codespacesGetOrgSecretAsync(
    final String org,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`OrgsCodespacesSecretsResponse2`](../../doc/models/orgs-codespaces-secrets-response-2.md)

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";

codespacesController.codespacesGetOrgSecretAsync(org, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "GH_TOKEN",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z",
  "visibility": "all"
}
```


# Codespaces Create-or-Update-Org-Secret

Creates or updates an organization secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `admin:org` scope to use this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret)

```java
CompletableFuture<Object> codespacesCreateOrUpdateOrgSecretAsync(
    final String org,
    final String secretName,
    final OrgsCodespacesSecretsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`OrgsCodespacesSecretsRequest`](../../doc/models/orgs-codespaces-secrets-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
OrgsCodespacesSecretsRequest body = new OrgsCodespacesSecretsRequest();
body.setVisibility(Visibility81Enum.SELECTED);
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(1296269);
selectedRepositoryIds.add(1296280);

body.setSelectedRepositoryIds(selectedRepositoryIds);

codespacesController.codespacesCreateOrUpdateOrgSecretAsync(org, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodespacesSecrets404ErrorException`](../../doc/models/orgs-codespaces-secrets-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsCodespacesSecrets422ErrorException`](../../doc/models/orgs-codespaces-secrets-422-error-exception.md) |


# Codespaces Delete-Org-Secret

Deletes an organization secret using the secret name. You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#delete-an-organization-secret](https://docs.github.com/rest/reference/codespaces#delete-an-organization-secret)

```java
CompletableFuture<Void> codespacesDeleteOrgSecretAsync(
    final String org,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";

codespacesController.codespacesDeleteOrgSecretAsync(org, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodespacesSecrets404ErrorException`](../../doc/models/orgs-codespaces-secrets-404-error-exception.md) |


# Codespaces List-Selected-Repos-for-Org-Secret

Lists all repositories that have been selected when the `visibility` for repository access to a secret is set to `selected`. You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-an-organization-secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-an-organization-secret)

```java
CompletableFuture<OrgsActionsSecretsRepositoriesResponse> codespacesListSelectedReposForOrgSecretAsync(
    final String org,
    final String secretName,
    final Integer page,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`OrgsActionsSecretsRepositoriesResponse`](../../doc/models/orgs-actions-secrets-repositories-response.md)

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
Integer page = 1;
Integer perPage = 30;

codespacesController.codespacesListSelectedReposForOrgSecretAsync(org, secretName, page, perPage).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "hooks_url": "http://api.github.com/repos/octocat/Hello-World/hooks"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodespacesSecretsRepositories404ErrorException`](../../doc/models/orgs-codespaces-secrets-repositories-404-error-exception.md) |


# Codespaces Set-Selected-Repos-for-Org-Secret

Replaces all repositories for an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-an-organization-secret](https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-an-organization-secret)

```java
CompletableFuture<Void> codespacesSetSelectedReposForOrgSecretAsync(
    final String org,
    final String secretName,
    final OrgsCodespacesSecretsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`OrgsCodespacesSecretsRepositoriesRequest`](../../doc/models/orgs-codespaces-secrets-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
OrgsCodespacesSecretsRepositoriesRequest body = new OrgsCodespacesSecretsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(64780797);

body.setSelectedRepositoryIds(selectedRepositoryIds);

codespacesController.codespacesSetSelectedReposForOrgSecretAsync(org, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodespacesSecretsRepositories404ErrorException`](../../doc/models/orgs-codespaces-secrets-repositories-404-error-exception.md) |
| 409 | Conflict when visibility type not set to selected | `ApiException` |


# Codespaces Add-Selected-Repo-to-Org-Secret

Adds a repository to an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#add-selected-repository-to-an-organization-secret](https://docs.github.com/rest/reference/codespaces#add-selected-repository-to-an-organization-secret)

```java
CompletableFuture<Void> codespacesAddSelectedRepoToOrgSecretAsync(
    final String org,
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
int repositoryId = 254;

codespacesController.codespacesAddSelectedRepoToOrgSecretAsync(org, secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodespacesSecretsRepositoriesRepositoryId404ErrorException`](../../doc/models/orgs-codespaces-secrets-repositories-repository-id-404-error-exception.md) |
| 409 | Conflict when visibility type is not set to selected | `ApiException` |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsCodespacesSecretsRepositoriesRepositoryId422ErrorException`](../../doc/models/orgs-codespaces-secrets-repositories-repository-id-422-error-exception.md) |


# Codespaces Remove-Selected-Repo-From-Org-Secret

Removes a repository from an organization secret when the `visibility` for repository access is set to `selected`. The visibility is set when you [Create or update an organization secret](https://docs.github.com/rest/reference/codespaces#create-or-update-an-organization-secret). You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#remove-selected-repository-from-an-organization-secret](https://docs.github.com/rest/reference/codespaces#remove-selected-repository-from-an-organization-secret)

```java
CompletableFuture<Void> codespacesRemoveSelectedRepoFromOrgSecretAsync(
    final String org,
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
String secretName = "secret_name2";
int repositoryId = 254;

codespacesController.codespacesRemoveSelectedRepoFromOrgSecretAsync(org, secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsCodespacesSecretsRepositoriesRepositoryId404ErrorException`](../../doc/models/orgs-codespaces-secrets-repositories-repository-id-404-error-exception.md) |
| 409 | Conflict when visibility type not set to selected | `ApiException` |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsCodespacesSecretsRepositoriesRepositoryId422ErrorException`](../../doc/models/orgs-codespaces-secrets-repositories-repository-id-422-error-exception.md) |


# Codespaces Get-Codespaces-for-User-in-Org

Lists the codespaces that a member of an organization has for repositories in that organization.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-codespaces-for-user-in-org](https://docs.github.com/rest/reference/codespaces#get-codespaces-for-user-in-org)

```java
CompletableFuture<OrgsMembersCodespacesResponse> codespacesGetCodespacesForUserInOrgAsync(
    final String org,
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`OrgsMembersCodespacesResponse`](../../doc/models/orgs-members-codespaces-response.md)

## Example Usage

```java
String org = "org6";
String username = "username0";
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesGetCodespacesForUserInOrgAsync(org, username, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsMembersCodespaces401ErrorException`](../../doc/models/orgs-members-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`OrgsMembersCodespaces403ErrorException`](../../doc/models/orgs-members-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`OrgsMembersCodespaces404ErrorException`](../../doc/models/orgs-members-codespaces-404-error-exception.md) |
| 500 | Internal Error | [`OrgsMembersCodespaces500ErrorException`](../../doc/models/orgs-members-codespaces-500-error-exception.md) |


# Codespaces Delete-From-Organization

Deletes a user's codespace.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces](https://docs.github.com/rest/reference/codespaces)

```java
CompletableFuture<Object> codespacesDeleteFromOrganizationAsync(
    final String org,
    final String username,
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

`Object`

## Example Usage

```java
String org = "org6";
String username = "username0";
String codespaceName = "codespace_name2";

codespacesController.codespacesDeleteFromOrganizationAsync(org, username, codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsMembersCodespacesCodespaceName401ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-401-error-exception.md) |
| 403 | Forbidden | [`OrgsMembersCodespacesCodespaceName403ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-403-error-exception.md) |
| 404 | Resource not found | [`OrgsMembersCodespacesCodespaceName404ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-404-error-exception.md) |
| 500 | Internal Error | [`OrgsMembersCodespacesCodespaceName500ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-500-error-exception.md) |


# Codespaces Stop-in-Organization

Stops a user's codespace.

You must authenticate using an access token with the `admin:org` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces](https://docs.github.com/rest/reference/codespaces)

```java
CompletableFuture<OrgsMembersCodespacesCodespaceNameStopResponse> codespacesStopInOrganizationAsync(
    final String org,
    final String username,
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

[`OrgsMembersCodespacesCodespaceNameStopResponse`](../../doc/models/orgs-members-codespaces-codespace-name-stop-response.md)

## Example Usage

```java
String org = "org6";
String username = "username0";
String codespaceName = "codespace_name2";

codespacesController.codespacesStopInOrganizationAsync(org, username, codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsMembersCodespacesCodespaceNameStop401ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-stop-401-error-exception.md) |
| 403 | Forbidden | [`OrgsMembersCodespacesCodespaceNameStop403ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-stop-403-error-exception.md) |
| 404 | Resource not found | [`OrgsMembersCodespacesCodespaceNameStop404ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-stop-404-error-exception.md) |
| 500 | Internal Error | [`OrgsMembersCodespacesCodespaceNameStop500ErrorException`](../../doc/models/orgs-members-codespaces-codespace-name-stop-500-error-exception.md) |


# Codespaces List-in-Repository-for-Authenticated-User

Lists the codespaces associated to a specified repository and the authenticated user.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-codespaces-in-a-repository-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#list-codespaces-in-a-repository-for-the-authenticated-user)

```java
CompletableFuture<ReposCodespacesResponse> codespacesListInRepositoryForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposCodespacesResponse`](../../doc/models/repos-codespaces-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListInRepositoryForAuthenticatedUserAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ReposCodespaces401ErrorException`](../../doc/models/repos-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`ReposCodespaces403ErrorException`](../../doc/models/repos-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodespaces404ErrorException`](../../doc/models/repos-codespaces-404-error-exception.md) |
| 500 | Internal Error | [`ReposCodespaces500ErrorException`](../../doc/models/repos-codespaces-500-error-exception.md) |


# Codespaces Create-With-Repo-for-Authenticated-User

Creates a codespace owned by the authenticated user in the specified repository.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#create-a-codespace-in-a-repository](https://docs.github.com/rest/reference/codespaces#create-a-codespace-in-a-repository)

```java
CompletableFuture<ReposCodespacesResponse1> codespacesCreateWithRepoForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | `Object` | Body, Required | - |

## Response Type

[`ReposCodespacesResponse1`](../../doc/models/repos-codespaces-response-1.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Object body = com.github.api.ApiHelper.deserialize("{\"ref\":\"main\",\"machine\":\"standardLinux32gb\"}");

codespacesController.codespacesCreateWithRepoForAuthenticatedUserAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposCodespaces400ErrorException`](../../doc/models/repos-codespaces-400-error-exception.md) |
| 401 | Requires authentication | [`ReposCodespaces401ErrorException`](../../doc/models/repos-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`ReposCodespaces403ErrorException`](../../doc/models/repos-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodespaces404ErrorException`](../../doc/models/repos-codespaces-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Codespaces List-Devcontainers-in-Repository-for-Authenticated-User

Lists the devcontainer.json files associated with a specified repository and the authenticated user. These files
specify launchpoint configurations for codespaces created within the repository.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-devcontainers-in-a-repository-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#list-devcontainers-in-a-repository-for-the-authenticated-user)

```java
CompletableFuture<ReposCodespacesDevcontainersResponse> codespacesListDevcontainersInRepositoryForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposCodespacesDevcontainersResponse`](../../doc/models/repos-codespaces-devcontainers-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListDevcontainersInRepositoryForAuthenticatedUserAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "devcontainers": [
    {
      "path": ".devcontainer/foobar/devcontainer.json",
      "name": "foobar"
    },
    {
      "path": ".devcontainer/devcontainer.json",
      "name": "kitchensink"
    },
    {
      "path": ".devcontainer.json"
    }
  ],
  "total_count": 3
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`ReposCodespacesDevcontainers400ErrorException`](../../doc/models/repos-codespaces-devcontainers-400-error-exception.md) |
| 401 | Requires authentication | [`ReposCodespacesDevcontainers401ErrorException`](../../doc/models/repos-codespaces-devcontainers-401-error-exception.md) |
| 403 | Forbidden | [`ReposCodespacesDevcontainers403ErrorException`](../../doc/models/repos-codespaces-devcontainers-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodespacesDevcontainers404ErrorException`](../../doc/models/repos-codespaces-devcontainers-404-error-exception.md) |
| 500 | Internal Error | [`ReposCodespacesDevcontainers500ErrorException`](../../doc/models/repos-codespaces-devcontainers-500-error-exception.md) |


# Codespaces Repo-Machines-for-Authenticated-User

List the machine types available for a given repository based on its configuration.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces_metadata` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-available-machine-types-for-a-repository](https://docs.github.com/rest/reference/codespaces#list-available-machine-types-for-a-repository)

```java
CompletableFuture<ReposCodespacesMachinesResponse> codespacesRepoMachinesForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final String location,
    final String clientIp)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `location` | `String` | Query, Optional | The location to check for available machines. Assigned by IP if not provided. |
| `clientIp` | `String` | Query, Optional | IP for location auto-detection when proxying a request |

## Response Type

[`ReposCodespacesMachinesResponse`](../../doc/models/repos-codespaces-machines-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String location = "WestUs2";

codespacesController.codespacesRepoMachinesForAuthenticatedUserAsync(owner, repo, location, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ReposCodespacesMachines401ErrorException`](../../doc/models/repos-codespaces-machines-401-error-exception.md) |
| 403 | Forbidden | [`ReposCodespacesMachines403ErrorException`](../../doc/models/repos-codespaces-machines-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodespacesMachines404ErrorException`](../../doc/models/repos-codespaces-machines-404-error-exception.md) |
| 500 | Internal Error | [`ReposCodespacesMachines500ErrorException`](../../doc/models/repos-codespaces-machines-500-error-exception.md) |


# Codespaces Pre-Flight-With-Repo-for-Authenticated-User

Gets the default attributes for codespaces created by the user with the repository.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#preview-attributes-for-a-new-codespace](https://docs.github.com/rest/reference/codespaces#preview-attributes-for-a-new-codespace)

```java
CompletableFuture<ReposCodespacesNewResponse> codespacesPreFlightWithRepoForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final String ref,
    final String clientIp)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Query, Optional | The branch or commit to check for a default devcontainer path. If not specified, the default branch will be checked. |
| `clientIp` | `String` | Query, Optional | An alternative IP for default location auto-detection, such as when proxying a request. |

## Response Type

[`ReposCodespacesNewResponse`](../../doc/models/repos-codespaces-new-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "main";
String clientIp = "1.2.3.4";

codespacesController.codespacesPreFlightWithRepoForAuthenticatedUserAsync(owner, repo, ref, clientIp).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "devcontainers": [
    {
      "path": ".devcontainer/foobar/devcontainer.json",
      "name": "foobar"
    },
    {
      "path": ".devcontainer/devcontainer.json",
      "name": "kitchensink"
    },
    {
      "path": ".devcontainer.json"
    }
  ],
  "total_count": 3
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ReposCodespacesNew401ErrorException`](../../doc/models/repos-codespaces-new-401-error-exception.md) |
| 403 | Forbidden | [`ReposCodespacesNew403ErrorException`](../../doc/models/repos-codespaces-new-403-error-exception.md) |
| 404 | Resource not found | [`ReposCodespacesNew404ErrorException`](../../doc/models/repos-codespaces-new-404-error-exception.md) |


# Codespaces List-Repo-Secrets

Lists all secrets available in a repository without revealing their encrypted values. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-repository-secrets](https://docs.github.com/rest/reference/codespaces#list-repository-secrets)

```java
CompletableFuture<ReposCodespacesSecretsResponse> codespacesListRepoSecretsAsync(
    final String owner,
    final String repo,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`ReposCodespacesSecretsResponse`](../../doc/models/repos-codespaces-secrets-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListRepoSecretsAsync(owner, repo, perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 2,
  "secrets": [
    {
      "name": "GH_TOKEN",
      "created_at": "2019-08-10T14:59:22Z",
      "updated_at": "2020-01-10T14:59:22Z",
      "visibility": "all"
    },
    {
      "name": "GIST_ID",
      "created_at": "2020-01-10T10:59:22Z",
      "updated_at": "2020-01-11T11:59:22Z",
      "visibility": "all"
    }
  ]
}
```


# Codespaces Get-Repo-Public-Key

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets. Anyone with read access to the repository can use this endpoint. If the repository is private you must use an access token with the `repo` scope. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-a-repository-public-key](https://docs.github.com/rest/reference/codespaces#get-a-repository-public-key)

```java
CompletableFuture<ReposCodespacesSecretsPublicKeyResponse> codespacesGetRepoPublicKeyAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposCodespacesSecretsPublicKeyResponse`](../../doc/models/repos-codespaces-secrets-public-key-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

codespacesController.codespacesGetRepoPublicKeyAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Codespaces Get-Repo-Secret

Gets a single repository secret without revealing its encrypted value. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-a-repository-secret](https://docs.github.com/rest/reference/codespaces#get-a-repository-secret)

```java
CompletableFuture<ReposCodespacesSecretsSecretNameResponse> codespacesGetRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`ReposCodespacesSecretsSecretNameResponse`](../../doc/models/repos-codespaces-secrets-secret-name-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";

codespacesController.codespacesGetRepoSecretAsync(owner, repo, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "GH_TOKEN",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z",
  "visibility": "all"
}
```


# Codespaces Create-or-Update-Repo-Secret

Creates or updates a repository secret with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages). You must authenticate using an access
token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets`
repository permission to use this endpoint.

#### Example of encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example of encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example of encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example of encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/codespaces#create-or-update-a-repository-secret](https://docs.github.com/rest/reference/codespaces#create-or-update-a-repository-secret)

```java
CompletableFuture<Object> codespacesCreateOrUpdateRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName,
    final ReposCodespacesSecretsSecretNameRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`ReposCodespacesSecretsSecretNameRequest`](../../doc/models/repos-codespaces-secrets-secret-name-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";
ReposCodespacesSecretsSecretNameRequest body = new ReposCodespacesSecretsSecretNameRequest();
body.setEncryptedValue("c2VjcmV0");
body.setKeyId("012345678912345678");

codespacesController.codespacesCreateOrUpdateRepoSecretAsync(owner, repo, secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Codespaces Delete-Repo-Secret

Deletes a secret in a repository using the secret name. You must authenticate using an access token with the `repo` scope to use this endpoint. GitHub Apps must have write access to the `codespaces_secrets` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#delete-a-repository-secret](https://docs.github.com/rest/reference/codespaces#delete-a-repository-secret)

```java
CompletableFuture<Void> codespacesDeleteRepoSecretAsync(
    final String owner,
    final String repo,
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String secretName = "secret_name2";

codespacesController.codespacesDeleteRepoSecretAsync(owner, repo, secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Codespaces Create-With-Pr-for-Authenticated-User

Creates a codespace owned by the authenticated user for the specified pull request.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#create-a-codespace-from-a-pull-request](https://docs.github.com/rest/reference/codespaces#create-a-codespace-from-a-pull-request)

```java
CompletableFuture<ReposPullsPullNumberCodespacesResponse> codespacesCreateWithPrForAuthenticatedUserAsync(
    final String owner,
    final String repo,
    final int pullNumber,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `pullNumber` | `int` | Template, Required | The number that identifies the pull request. |
| `body` | `Object` | Body, Required | - |

## Response Type

[`ReposPullsPullNumberCodespacesResponse`](../../doc/models/repos-pulls-pull-number-codespaces-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int pullNumber = 112;
Object body = com.github.api.ApiHelper.deserialize("{\"repository_id\":1,\"ref\":\"main\"}");

codespacesController.codespacesCreateWithPrForAuthenticatedUserAsync(owner, repo, pullNumber, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`ReposPullsPullNumberCodespaces401ErrorException`](../../doc/models/repos-pulls-pull-number-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`ReposPullsPullNumberCodespaces403ErrorException`](../../doc/models/repos-pulls-pull-number-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`ReposPullsPullNumberCodespaces404ErrorException`](../../doc/models/repos-pulls-pull-number-codespaces-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Codespaces List-for-Authenticated-User

Lists the authenticated user's codespaces.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-codespaces-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#list-codespaces-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesResponse> codespacesListForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page,
    final Integer repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `repositoryId` | `Integer` | Query, Optional | ID of the Repository to filter on |

## Response Type

[`UserCodespacesResponse`](../../doc/models/user-codespaces-response.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListForAuthenticatedUserAsync(perPage, page, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespaces401ErrorException`](../../doc/models/user-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespaces403ErrorException`](../../doc/models/user-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespaces404ErrorException`](../../doc/models/user-codespaces-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespaces500ErrorException`](../../doc/models/user-codespaces-500-error-exception.md) |


# Codespaces Create-for-Authenticated-User

Creates a new codespace, owned by the authenticated user.

This endpoint requires either a `repository_id` OR a `pull_request` but not both.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#create-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#create-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesResponse1> codespacesCreateForAuthenticatedUserAsync(
    final CodespacesCreateForAuthenticatedUserBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CodespacesCreateForAuthenticatedUserBody`]($m/CodespacesCreateForAuthenticatedUserBody) | Body, Required | - |

## Response Type

[`UserCodespacesResponse1`](../../doc/models/user-codespaces-response-1.md)

## Example Usage

```java
UserCodespacesRequest body = new UserCodespacesRequest();
body.setRepositoryId(1);
body.setRef("main");
body.setLocation("WestUs2");


CodespacesCreateForAuthenticatedUserBody bodyContainer = CodespacesCreateForAuthenticatedUserBody.fromUserCodespacesRequest(body);

codespacesController.codespacesCreateForAuthenticatedUserAsync(bodyContainer).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespaces401ErrorException`](../../doc/models/user-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespaces403ErrorException`](../../doc/models/user-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespaces404ErrorException`](../../doc/models/user-codespaces-404-error-exception.md) |
| 503 | Service unavailable | [`ServiceUnavailable1Exception`](../../doc/models/service-unavailable-1-exception.md) |


# Codespaces List-Secrets-for-Authenticated-User

Lists all secrets available for a user's Codespaces without revealing their
encrypted values.

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.

GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-secrets-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#list-secrets-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesSecretsResponse> codespacesListSecretsForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`UserCodespacesSecretsResponse`](../../doc/models/user-codespaces-secrets-response.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

codespacesController.codespacesListSecretsForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Codespaces Get-Public-Key-for-Authenticated-User

Gets your public key, which you need to encrypt secrets. You need to encrypt a secret before you can create or update secrets.

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.

GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-public-key-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#get-public-key-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesSecretsPublicKeyResponse> codespacesGetPublicKeyForAuthenticatedUserAsync()
```

## Response Type

[`UserCodespacesSecretsPublicKeyResponse`](../../doc/models/user-codespaces-secrets-public-key-response.md)

## Example Usage

```java
codespacesController.codespacesGetPublicKeyForAuthenticatedUserAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key_id": "012345678912345678",
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234"
}
```


# Codespaces Get-Secret-for-Authenticated-User

Gets a secret available to a user's codespaces without revealing its encrypted value.

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.

GitHub Apps must have read access to the `codespaces_user_secrets` user permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-a-secret-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#get-a-secret-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesSecretsResponse1> codespacesGetSecretForAuthenticatedUserAsync(
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`UserCodespacesSecretsResponse1`](../../doc/models/user-codespaces-secrets-response-1.md)

## Example Usage

```java
String secretName = "secret_name2";

codespacesController.codespacesGetSecretForAuthenticatedUserAsync(secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "name": "CODESPACE_GH_SECRET",
  "created_at": "2019-08-10T14:59:22Z",
  "updated_at": "2020-01-10T14:59:22Z",
  "visibility": "selected",
  "selected_repositories_url": "https://api.github.com/user/codespaces/secrets/CODESPACE_GH_SECRET/repositories"
}
```


# Codespaces Create-or-Update-Secret-for-Authenticated-User

Creates or updates a secret for a user's codespace with an encrypted value. Encrypt your secret using
[LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages).

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must also have Codespaces access to use this endpoint.

GitHub Apps must have write access to the `codespaces_user_secrets` user permission and `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.

#### Example encrypting a secret using Node.js

Encrypt your secret using the [libsodium-wrappers](https://www.npmjs.com/package/libsodium-wrappers) library.

```
const sodium = require('libsodium-wrappers')
const secret = 'plain-text-secret' // replace with the secret you want to encrypt
const key = 'base64-encoded-public-key' // replace with the Base64 encoded public key

//Check if libsodium is ready and then proceed.
sodium.ready.then(() => {
  // Convert Secret & Base64 key to Uint8Array.
  let binkey = sodium.from_base64(key, sodium.base64_variants.ORIGINAL)
  let binsec = sodium.from_string(secret)

  //Encrypt the secret using LibSodium
  let encBytes = sodium.crypto_box_seal(binsec, binkey)

  // Convert encrypted Uint8Array to Base64
  let output = sodium.to_base64(encBytes, sodium.base64_variants.ORIGINAL)

  console.log(output)
});
```

#### Example encrypting a secret using Python

Encrypt your secret using [pynacl](https://pynacl.readthedocs.io/en/latest/public/#nacl-public-sealedbox) with Python 3.

```
from base64 import b64encode
from nacl import encoding, public

def encrypt(public_key: str, secret_value: str) -> str:
  """Encrypt a Unicode string using the public key."""
  public_key = public.PublicKey(public_key.encode("utf-8"), encoding.Base64Encoder())
  sealed_box = public.SealedBox(public_key)
  encrypted = sealed_box.encrypt(secret_value.encode("utf-8"))
  return b64encode(encrypted).decode("utf-8")
```

#### Example encrypting a secret using C#

Encrypt your secret using the [Sodium.Core](https://www.nuget.org/packages/Sodium.Core/) package.

```
var secretValue = System.Text.Encoding.UTF8.GetBytes("mySecret");
var publicKey = Convert.FromBase64String("2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvvcCU=");

var sealedPublicKeyBox = Sodium.SealedPublicKeyBox.Create(secretValue, publicKey);

Console.WriteLine(Convert.ToBase64String(sealedPublicKeyBox));
```

#### Example encrypting a secret using Ruby

Encrypt your secret using the [rbnacl](https://github.com/RubyCrypto/rbnacl) gem.

```ruby
require "rbnacl"
require "base64"

key = Base64.decode64("+ZYvJDZMHUfBkJdyq5Zm9SKqeuBQ4sj+6sfjlH4CgG0=")
public_key = RbNaCl::PublicKey.new(key)

box = RbNaCl::Boxes::Sealed.from_public_key(public_key)
encrypted_secret = box.encrypt("my_secret")

# Print the base64 encoded secret
puts Base64.strict_encode64(encrypted_secret)
```

API method documentation: [https://docs.github.com/rest/reference/codespaces#create-or-update-a-secret-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#create-or-update-a-secret-for-the-authenticated-user)

```java
CompletableFuture<Object> codespacesCreateOrUpdateSecretForAuthenticatedUserAsync(
    final String secretName,
    final UserCodespacesSecretsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`UserCodespacesSecretsRequest`](../../doc/models/user-codespaces-secrets-request.md) | Body, Required | - |

## Response Type

`Object`

## Example Usage

```java
String secretName = "secret_name2";
UserCodespacesSecretsRequest body = new UserCodespacesSecretsRequest();
body.setKeyId("012345678912345678");
body.setEncryptedValue("c2VjcmV0");
List<String> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add("1234567");
selectedRepositoryIds.add("2345678");

body.setSelectedRepositoryIds(selectedRepositoryIds);

codespacesController.codespacesCreateOrUpdateSecretForAuthenticatedUserAsync(secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`UserCodespacesSecrets404ErrorException`](../../doc/models/user-codespaces-secrets-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserCodespacesSecrets422ErrorException`](../../doc/models/user-codespaces-secrets-422-error-exception.md) |


# Codespaces Delete-Secret-for-Authenticated-User

Deletes a secret from a user's codespaces using the secret name. Deleting the secret will remove access from all codespaces that were allowed to access the secret.

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.

GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#delete-a-secret-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#delete-a-secret-for-the-authenticated-user)

```java
CompletableFuture<Void> codespacesDeleteSecretForAuthenticatedUserAsync(
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

`void`

## Example Usage

```java
String secretName = "secret_name2";

codespacesController.codespacesDeleteSecretForAuthenticatedUserAsync(secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Codespaces List-Repositories-for-Secret-for-Authenticated-User

List the repositories that have been granted the ability to use a user's codespace secret.

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.

GitHub Apps must have read access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret](https://docs.github.com/rest/reference/codespaces#list-selected-repositories-for-a-user-secret)

```java
CompletableFuture<OrgsActionsSecretsRepositoriesResponse> codespacesListRepositoriesForSecretForAuthenticatedUserAsync(
    final String secretName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |

## Response Type

[`OrgsActionsSecretsRepositoriesResponse`](../../doc/models/orgs-actions-secrets-repositories-response.md)

## Example Usage

```java
String secretName = "secret_name2";

codespacesController.codespacesListRepositoriesForSecretForAuthenticatedUserAsync(secretName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 1,
  "repositories": [
    {
      "id": 1296269,
      "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
      "name": "Hello-World",
      "full_name": "octocat/Hello-World",
      "owner": {
        "login": "octocat",
        "id": 1,
        "node_id": "MDQ6VXNlcjE=",
        "avatar_url": "https://github.com/images/error/octocat_happy.gif",
        "gravatar_id": "",
        "url": "https://api.github.com/users/octocat",
        "html_url": "https://github.com/octocat",
        "followers_url": "https://api.github.com/users/octocat/followers",
        "following_url": "https://api.github.com/users/octocat/following{/other_user}",
        "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
        "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
        "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
        "organizations_url": "https://api.github.com/users/octocat/orgs",
        "repos_url": "https://api.github.com/users/octocat/repos",
        "events_url": "https://api.github.com/users/octocat/events{/privacy}",
        "received_events_url": "https://api.github.com/users/octocat/received_events",
        "type": "User",
        "site_admin": false
      },
      "private": false,
      "html_url": "https://github.com/octocat/Hello-World",
      "description": "This your first repo!",
      "fork": false,
      "url": "https://api.github.com/repos/octocat/Hello-World",
      "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
      "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
      "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
      "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
      "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
      "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
      "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
      "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
      "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
      "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
      "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
      "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
      "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
      "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
      "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
      "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
      "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
      "git_url": "git:github.com/octocat/Hello-World.git",
      "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
      "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
      "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
      "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
      "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
      "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
      "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
      "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
      "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
      "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
      "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
      "ssh_url": "git@github.com:octocat/Hello-World.git",
      "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
      "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
      "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
      "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
      "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
      "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
      "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
      "clone_url": "https://github.com/octocat/Hello-World.git",
      "mirror_url": "git:git.example.com/octocat/Hello-World",
      "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
      "svn_url": "https://svn.github.com/octocat/Hello-World",
      "homepage": "https://github.com",
      "language": null,
      "forks_count": 9,
      "stargazers_count": 80,
      "watchers_count": 80,
      "size": 108,
      "default_branch": "master",
      "open_issues_count": 0,
      "is_template": true,
      "topics": [
        "octocat",
        "atom",
        "electron",
        "api"
      ],
      "has_issues": true,
      "has_projects": true,
      "has_wiki": true,
      "has_pages": false,
      "has_downloads": true,
      "archived": false,
      "disabled": false,
      "visibility": "public",
      "pushed_at": "2011-01-26T19:06:43Z",
      "created_at": "2011-01-26T19:01:12Z",
      "updated_at": "2011-01-26T19:14:43Z",
      "permissions": {
        "admin": false,
        "push": false,
        "pull": true
      },
      "template_repository": {
        "id": 1296269,
        "node_id": "MDEwOlJlcG9zaXRvcnkxMjk2MjY5",
        "name": "Hello-World",
        "full_name": "octocat/Hello-World",
        "owner": {
          "login": "octocat",
          "id": 1,
          "node_id": "MDQ6VXNlcjE=",
          "avatar_url": "https://github.com/images/error/octocat_happy.gif",
          "gravatar_id": "",
          "url": "https://api.github.com/users/octocat",
          "html_url": "https://github.com/octocat",
          "followers_url": "https://api.github.com/users/octocat/followers",
          "following_url": "https://api.github.com/users/octocat/following{/other_user}",
          "gists_url": "https://api.github.com/users/octocat/gists{/gist_id}",
          "starred_url": "https://api.github.com/users/octocat/starred{/owner}{/repo}",
          "subscriptions_url": "https://api.github.com/users/octocat/subscriptions",
          "organizations_url": "https://api.github.com/users/octocat/orgs",
          "repos_url": "https://api.github.com/users/octocat/repos",
          "events_url": "https://api.github.com/users/octocat/events{/privacy}",
          "received_events_url": "https://api.github.com/users/octocat/received_events",
          "type": "User",
          "site_admin": false
        },
        "private": false,
        "html_url": "https://github.com/octocat/Hello-World",
        "description": "This your first repo!",
        "fork": false,
        "url": "https://api.github.com/repos/octocat/Hello-World",
        "archive_url": "https://api.github.com/repos/octocat/Hello-World/{archive_format}{/ref}",
        "assignees_url": "https://api.github.com/repos/octocat/Hello-World/assignees{/user}",
        "blobs_url": "https://api.github.com/repos/octocat/Hello-World/git/blobs{/sha}",
        "branches_url": "https://api.github.com/repos/octocat/Hello-World/branches{/branch}",
        "collaborators_url": "https://api.github.com/repos/octocat/Hello-World/collaborators{/collaborator}",
        "comments_url": "https://api.github.com/repos/octocat/Hello-World/comments{/number}",
        "commits_url": "https://api.github.com/repos/octocat/Hello-World/commits{/sha}",
        "compare_url": "https://api.github.com/repos/octocat/Hello-World/compare/{base}...{head}",
        "contents_url": "https://api.github.com/repos/octocat/Hello-World/contents/{+path}",
        "contributors_url": "https://api.github.com/repos/octocat/Hello-World/contributors",
        "deployments_url": "https://api.github.com/repos/octocat/Hello-World/deployments",
        "downloads_url": "https://api.github.com/repos/octocat/Hello-World/downloads",
        "events_url": "https://api.github.com/repos/octocat/Hello-World/events",
        "forks_url": "https://api.github.com/repos/octocat/Hello-World/forks",
        "git_commits_url": "https://api.github.com/repos/octocat/Hello-World/git/commits{/sha}",
        "git_refs_url": "https://api.github.com/repos/octocat/Hello-World/git/refs{/sha}",
        "git_tags_url": "https://api.github.com/repos/octocat/Hello-World/git/tags{/sha}",
        "git_url": "git:github.com/octocat/Hello-World.git",
        "issue_comment_url": "https://api.github.com/repos/octocat/Hello-World/issues/comments{/number}",
        "issue_events_url": "https://api.github.com/repos/octocat/Hello-World/issues/events{/number}",
        "issues_url": "https://api.github.com/repos/octocat/Hello-World/issues{/number}",
        "keys_url": "https://api.github.com/repos/octocat/Hello-World/keys{/key_id}",
        "labels_url": "https://api.github.com/repos/octocat/Hello-World/labels{/name}",
        "languages_url": "https://api.github.com/repos/octocat/Hello-World/languages",
        "merges_url": "https://api.github.com/repos/octocat/Hello-World/merges",
        "milestones_url": "https://api.github.com/repos/octocat/Hello-World/milestones{/number}",
        "notifications_url": "https://api.github.com/repos/octocat/Hello-World/notifications{?since,all,participating}",
        "pulls_url": "https://api.github.com/repos/octocat/Hello-World/pulls{/number}",
        "releases_url": "https://api.github.com/repos/octocat/Hello-World/releases{/id}",
        "ssh_url": "git@github.com:octocat/Hello-World.git",
        "stargazers_url": "https://api.github.com/repos/octocat/Hello-World/stargazers",
        "statuses_url": "https://api.github.com/repos/octocat/Hello-World/statuses/{sha}",
        "subscribers_url": "https://api.github.com/repos/octocat/Hello-World/subscribers",
        "subscription_url": "https://api.github.com/repos/octocat/Hello-World/subscription",
        "tags_url": "https://api.github.com/repos/octocat/Hello-World/tags",
        "teams_url": "https://api.github.com/repos/octocat/Hello-World/teams",
        "trees_url": "https://api.github.com/repos/octocat/Hello-World/git/trees{/sha}",
        "clone_url": "https://github.com/octocat/Hello-World.git",
        "mirror_url": "git:git.example.com/octocat/Hello-World",
        "hooks_url": "https://api.github.com/repos/octocat/Hello-World/hooks",
        "svn_url": "https://svn.github.com/octocat/Hello-World",
        "homepage": "https://github.com",
        "organization": null,
        "language": null,
        "forks": 9,
        "forks_count": 9,
        "stargazers_count": 80,
        "watchers_count": 80,
        "watchers": 80,
        "size": 108,
        "default_branch": "master",
        "open_issues": 0,
        "open_issues_count": 0,
        "is_template": true,
        "license": {
          "key": "mit",
          "name": "MIT License",
          "url": "https://api.github.com/licenses/mit",
          "spdx_id": "MIT",
          "node_id": "MDc6TGljZW5zZW1pdA==",
          "html_url": "https://api.github.com/licenses/mit"
        },
        "topics": [
          "octocat",
          "atom",
          "electron",
          "api"
        ],
        "has_issues": true,
        "has_projects": true,
        "has_wiki": true,
        "has_pages": false,
        "has_downloads": true,
        "archived": false,
        "disabled": false,
        "visibility": "public",
        "pushed_at": "2011-01-26T19:06:43Z",
        "created_at": "2011-01-26T19:01:12Z",
        "updated_at": "2011-01-26T19:14:43Z",
        "permissions": {
          "admin": false,
          "push": false,
          "pull": true
        },
        "allow_rebase_merge": true,
        "template_repository": null,
        "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
        "allow_squash_merge": true,
        "allow_auto_merge": false,
        "delete_branch_on_merge": true,
        "allow_merge_commit": true,
        "subscribers_count": 42,
        "network_count": 0
      },
      "temp_clone_token": "ABTLWHOULUVAXGTRYU7OC2876QJ2O",
      "delete_branch_on_merge": true,
      "subscribers_count": 42,
      "network_count": 0,
      "license": {
        "key": "mit",
        "name": "MIT License",
        "url": "https://api.github.com/licenses/mit",
        "spdx_id": "MIT",
        "node_id": "MDc6TGljZW5zZW1pdA=="
      },
      "forks": 1,
      "open_issues": 1,
      "watchers": 1
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesSecretsRepositories401ErrorException`](../../doc/models/user-codespaces-secrets-repositories-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesSecretsRepositories403ErrorException`](../../doc/models/user-codespaces-secrets-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesSecretsRepositories404ErrorException`](../../doc/models/user-codespaces-secrets-repositories-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesSecretsRepositories500ErrorException`](../../doc/models/user-codespaces-secrets-repositories-500-error-exception.md) |


# Codespaces Set-Repositories-for-Secret-for-Authenticated-User

Select the repositories that will use a user's codespace secret.

You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.

GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on all referenced repositories to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-a-user-secret](https://docs.github.com/rest/reference/codespaces#set-selected-repositories-for-a-user-secret)

```java
CompletableFuture<Void> codespacesSetRepositoriesForSecretForAuthenticatedUserAsync(
    final String secretName,
    final UserCodespacesSecretsRepositoriesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `body` | [`UserCodespacesSecretsRepositoriesRequest`](../../doc/models/user-codespaces-secrets-repositories-request.md) | Body, Required | - |

## Response Type

`void`

## Example Usage

```java
String secretName = "secret_name2";
UserCodespacesSecretsRepositoriesRequest body = new UserCodespacesSecretsRepositoriesRequest();
List<Integer> selectedRepositoryIds = new LinkedList<>();
selectedRepositoryIds.add(75);

body.setSelectedRepositoryIds(selectedRepositoryIds);

codespacesController.codespacesSetRepositoriesForSecretForAuthenticatedUserAsync(secretName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesSecretsRepositories401ErrorException`](../../doc/models/user-codespaces-secrets-repositories-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesSecretsRepositories403ErrorException`](../../doc/models/user-codespaces-secrets-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesSecretsRepositories404ErrorException`](../../doc/models/user-codespaces-secrets-repositories-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesSecretsRepositories500ErrorException`](../../doc/models/user-codespaces-secrets-repositories-500-error-exception.md) |


# Codespaces Add-Repository-for-Secret-for-Authenticated-User

Adds a repository to the selected repositories for a user's codespace secret.
You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
GitHub Apps must have write access to the `codespaces_user_secrets` user permission and write access to the `codespaces_secrets` repository permission on the referenced repository to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#add-a-selected-repository-to-a-user-secret](https://docs.github.com/rest/reference/codespaces#add-a-selected-repository-to-a-user-secret)

```java
CompletableFuture<Void> codespacesAddRepositoryForSecretForAuthenticatedUserAsync(
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String secretName = "secret_name2";
int repositoryId = 254;

codespacesController.codespacesAddRepositoryForSecretForAuthenticatedUserAsync(secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesSecretsRepositories401ErrorException`](../../doc/models/user-codespaces-secrets-repositories-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesSecretsRepositories403ErrorException`](../../doc/models/user-codespaces-secrets-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesSecretsRepositories404ErrorException`](../../doc/models/user-codespaces-secrets-repositories-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesSecretsRepositories500ErrorException`](../../doc/models/user-codespaces-secrets-repositories-500-error-exception.md) |


# Codespaces Remove-Repository-for-Secret-for-Authenticated-User

Removes a repository from the selected repositories for a user's codespace secret.
You must authenticate using an access token with the `codespace` or `codespace:secrets` scope to use this endpoint. User must have Codespaces access to use this endpoint.
GitHub Apps must have write access to the `codespaces_user_secrets` user permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret](https://docs.github.com/rest/reference/codespaces#remove-a-selected-repository-from-a-user-secret)

```java
CompletableFuture<Void> codespacesRemoveRepositoryForSecretForAuthenticatedUserAsync(
    final String secretName,
    final int repositoryId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `secretName` | `String` | Template, Required | The name of the secret. |
| `repositoryId` | `int` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String secretName = "secret_name2";
int repositoryId = 254;

codespacesController.codespacesRemoveRepositoryForSecretForAuthenticatedUserAsync(secretName, repositoryId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesSecretsRepositories401ErrorException`](../../doc/models/user-codespaces-secrets-repositories-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesSecretsRepositories403ErrorException`](../../doc/models/user-codespaces-secrets-repositories-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesSecretsRepositories404ErrorException`](../../doc/models/user-codespaces-secrets-repositories-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesSecretsRepositories500ErrorException`](../../doc/models/user-codespaces-secrets-repositories-500-error-exception.md) |


# Codespaces Get-for-Authenticated-User

Gets information about a user's codespace.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have read access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#get-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#get-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesResponse1> codespacesGetForAuthenticatedUserAsync(
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

[`UserCodespacesResponse1`](../../doc/models/user-codespaces-response-1.md)

## Example Usage

```java
String codespaceName = "codespace_name2";

codespacesController.codespacesGetForAuthenticatedUserAsync(codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespaces401ErrorException`](../../doc/models/user-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespaces403ErrorException`](../../doc/models/user-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespaces404ErrorException`](../../doc/models/user-codespaces-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespaces500ErrorException`](../../doc/models/user-codespaces-500-error-exception.md) |


# Codespaces Update-for-Authenticated-User

Updates a codespace owned by the authenticated user. Currently only the codespace's machine type and recent folders can be modified using this endpoint.

If you specify a new machine type it will be applied the next time your codespace is started.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#update-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#update-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesResponse1> codespacesUpdateForAuthenticatedUserAsync(
    final String codespaceName,
    final UserCodespacesRequest2 body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |
| `body` | [`UserCodespacesRequest2`](../../doc/models/user-codespaces-request-2.md) | Body, Optional | - |

## Response Type

[`UserCodespacesResponse1`](../../doc/models/user-codespaces-response-1.md)

## Example Usage

```java
String codespaceName = "codespace_name2";
UserCodespacesRequest2 body = new UserCodespacesRequest2();
body.setMachine("standardLinux");

codespacesController.codespacesUpdateForAuthenticatedUserAsync(codespaceName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespaces401ErrorException`](../../doc/models/user-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespaces403ErrorException`](../../doc/models/user-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespaces404ErrorException`](../../doc/models/user-codespaces-404-error-exception.md) |


# Codespaces Delete-for-Authenticated-User

Deletes a user's codespace.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#delete-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#delete-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<Object> codespacesDeleteForAuthenticatedUserAsync(
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

`Object`

## Example Usage

```java
String codespaceName = "codespace_name2";

codespacesController.codespacesDeleteForAuthenticatedUserAsync(codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespaces401ErrorException`](../../doc/models/user-codespaces-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespaces403ErrorException`](../../doc/models/user-codespaces-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespaces404ErrorException`](../../doc/models/user-codespaces-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespaces500ErrorException`](../../doc/models/user-codespaces-500-error-exception.md) |


# Codespaces Export-for-Authenticated-User

Triggers an export of the specified codespace and returns a URL and ID where the status of the export can be monitored.

If changes cannot be pushed to the codespace's repository, they will be pushed to a new or previously-existing fork instead.

You must authenticate using a personal access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/codespaces/codespaces#export-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/codespaces/codespaces#export-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesExportsResponse> codespacesExportForAuthenticatedUserAsync(
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

[`UserCodespacesExportsResponse`](../../doc/models/user-codespaces-exports-response.md)

## Example Usage

```java
String codespaceName = "codespace_name2";

codespacesController.codespacesExportForAuthenticatedUserAsync(codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "state": "succeeded",
  "completed_at": "2022-01-01T14:59:22Z",
  "branch": "codespace-monalisa-octocat-hello-world-g4wpq6h95q",
  "sha": "fd95a81ca01e48ede9f39c799ecbcef817b8a3b2",
  "id": "latest",
  "export_url": "https://api.github.com/user/codespaces/:name/exports/latest"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesExports401ErrorException`](../../doc/models/user-codespaces-exports-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesExports403ErrorException`](../../doc/models/user-codespaces-exports-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesExports404ErrorException`](../../doc/models/user-codespaces-exports-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserCodespacesExports422ErrorException`](../../doc/models/user-codespaces-exports-422-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesExports500ErrorException`](../../doc/models/user-codespaces-exports-500-error-exception.md) |


# Codespaces Get-Export-Details-for-Authenticated-User

Gets information about an export of a codespace.

You must authenticate using a personal access token with the `codespace` scope to use this endpoint.

GitHub Apps must have read access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/codespaces/codespaces#get-details-about-a-codespace-export](https://docs.github.com/rest/codespaces/codespaces#get-details-about-a-codespace-export)

```java
CompletableFuture<UserCodespacesExportsResponse> codespacesGetExportDetailsForAuthenticatedUserAsync(
    final String codespaceName,
    final String exportId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |
| `exportId` | `String` | Template, Required | The ID of the export operation, or `latest`. Currently only `latest` is currently supported. |

## Response Type

[`UserCodespacesExportsResponse`](../../doc/models/user-codespaces-exports-response.md)

## Example Usage

```java
String codespaceName = "codespace_name2";
String exportId = "export_id4";

codespacesController.codespacesGetExportDetailsForAuthenticatedUserAsync(codespaceName, exportId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "state": "succeeded",
  "completed_at": "2022-01-01T14:59:22Z",
  "branch": "codespace-monalisa-octocat-hello-world-g4wpq6h95q",
  "sha": "fd95a81ca01e48ede9f39c799ecbcef817b8a3b2",
  "id": "latest",
  "export_url": "https://api.github.com/user/codespaces/:name/exports/latest"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`UserCodespacesExports404ErrorException`](../../doc/models/user-codespaces-exports-404-error-exception.md) |


# Codespaces Codespace-Machines-for-Authenticated-User

List the machine types a codespace can transition to use.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have read access to the `codespaces_metadata` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#list-machine-types-for-a-codespace](https://docs.github.com/rest/reference/codespaces#list-machine-types-for-a-codespace)

```java
CompletableFuture<UserCodespacesMachinesResponse> codespacesCodespaceMachinesForAuthenticatedUserAsync(
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

[`UserCodespacesMachinesResponse`](../../doc/models/user-codespaces-machines-response.md)

## Example Usage

```java
String codespaceName = "codespace_name2";

codespacesController.codespacesCodespaceMachinesForAuthenticatedUserAsync(codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesMachines401ErrorException`](../../doc/models/user-codespaces-machines-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesMachines403ErrorException`](../../doc/models/user-codespaces-machines-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesMachines404ErrorException`](../../doc/models/user-codespaces-machines-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesMachines500ErrorException`](../../doc/models/user-codespaces-machines-500-error-exception.md) |


# Codespaces Publish-for-Authenticated-User

Publishes an unpublished codespace, creating a new repository and assigning it to the codespace.

The codespace's token is granted write permissions to the repository, allowing the user to push their changes.

This will fail for a codespace that is already published, meaning it has an associated repository.

You must authenticate using a personal access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces/codespaces#create-a-repository-from-an-unpublished-codespace](https://docs.github.com/rest/reference/codespaces/codespaces#create-a-repository-from-an-unpublished-codespace)

```java
CompletableFuture<UserCodespacesPublishResponse> codespacesPublishForAuthenticatedUserAsync(
    final String codespaceName,
    final UserCodespacesPublishRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |
| `body` | [`UserCodespacesPublishRequest`](../../doc/models/user-codespaces-publish-request.md) | Body, Required | - |

## Response Type

[`UserCodespacesPublishResponse`](../../doc/models/user-codespaces-publish-response.md)

## Example Usage

```java
String codespaceName = "codespace_name2";
UserCodespacesPublishRequest body = new UserCodespacesPublishRequest();
body.setPrivate(false);

codespacesController.codespacesPublishForAuthenticatedUserAsync(codespaceName, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesPublish401ErrorException`](../../doc/models/user-codespaces-publish-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesPublish403ErrorException`](../../doc/models/user-codespaces-publish-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesPublish404ErrorException`](../../doc/models/user-codespaces-publish-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserCodespacesPublish422ErrorException`](../../doc/models/user-codespaces-publish-422-error-exception.md) |


# Codespaces Start-for-Authenticated-User

Starts a user's codespace.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#start-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#start-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesStartResponse> codespacesStartForAuthenticatedUserAsync(
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

[`UserCodespacesStartResponse`](../../doc/models/user-codespaces-start-response.md)

## Example Usage

```java
String codespaceName = "codespace_name2";

codespacesController.codespacesStartForAuthenticatedUserAsync(codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request | [`UserCodespacesStart400ErrorException`](../../doc/models/user-codespaces-start-400-error-exception.md) |
| 401 | Requires authentication | [`UserCodespacesStart401ErrorException`](../../doc/models/user-codespaces-start-401-error-exception.md) |
| 402 | Payment required | [`UserCodespacesStart402ErrorException`](../../doc/models/user-codespaces-start-402-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesStart403ErrorException`](../../doc/models/user-codespaces-start-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesStart404ErrorException`](../../doc/models/user-codespaces-start-404-error-exception.md) |
| 409 | Conflict | [`UserCodespacesStart409ErrorException`](../../doc/models/user-codespaces-start-409-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesStart500ErrorException`](../../doc/models/user-codespaces-start-500-error-exception.md) |


# Codespaces Stop-for-Authenticated-User

Stops a user's codespace.

You must authenticate using an access token with the `codespace` scope to use this endpoint.

GitHub Apps must have write access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/codespaces#stop-a-codespace-for-the-authenticated-user](https://docs.github.com/rest/reference/codespaces#stop-a-codespace-for-the-authenticated-user)

```java
CompletableFuture<UserCodespacesStopResponse> codespacesStopForAuthenticatedUserAsync(
    final String codespaceName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `codespaceName` | `String` | Template, Required | The name of the codespace. |

## Response Type

[`UserCodespacesStopResponse`](../../doc/models/user-codespaces-stop-response.md)

## Example Usage

```java
String codespaceName = "codespace_name2";

codespacesController.codespacesStopForAuthenticatedUserAsync(codespaceName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserCodespacesStop401ErrorException`](../../doc/models/user-codespaces-stop-401-error-exception.md) |
| 403 | Forbidden | [`UserCodespacesStop403ErrorException`](../../doc/models/user-codespaces-stop-403-error-exception.md) |
| 404 | Resource not found | [`UserCodespacesStop404ErrorException`](../../doc/models/user-codespaces-stop-404-error-exception.md) |
| 500 | Internal Error | [`UserCodespacesStop500ErrorException`](../../doc/models/user-codespaces-stop-500-error-exception.md) |

