# Packages

Manage packages for authenticated users and organizations.

```java
PackagesController packagesController = client.getPackagesController();
```

## Class Name

`PackagesController`

## Methods

* [Packages List-Packages-for-Organization](../../doc/controllers/packages.md#packages-list-packages-for-organization)
* [Packages Get-Package-for-Organization](../../doc/controllers/packages.md#packages-get-package-for-organization)
* [Packages Delete-Package-for-Org](../../doc/controllers/packages.md#packages-delete-package-for-org)
* [Packages Restore-Package-for-Org](../../doc/controllers/packages.md#packages-restore-package-for-org)
* [Packages Get-All-Package-Versions-for-Package-Owned-by-Org](../../doc/controllers/packages.md#packages-get-all-package-versions-for-package-owned-by-org)
* [Packages Get-Package-Version-for-Organization](../../doc/controllers/packages.md#packages-get-package-version-for-organization)
* [Packages Delete-Package-Version-for-Org](../../doc/controllers/packages.md#packages-delete-package-version-for-org)
* [Packages Restore-Package-Version-for-Org](../../doc/controllers/packages.md#packages-restore-package-version-for-org)
* [Packages List-Packages-for-Authenticated-User](../../doc/controllers/packages.md#packages-list-packages-for-authenticated-user)
* [Packages Get-Package-for-Authenticated-User](../../doc/controllers/packages.md#packages-get-package-for-authenticated-user)
* [Packages Delete-Package-for-Authenticated-User](../../doc/controllers/packages.md#packages-delete-package-for-authenticated-user)
* [Packages Restore-Package-for-Authenticated-User](../../doc/controllers/packages.md#packages-restore-package-for-authenticated-user)
* [Packages Get-All-Package-Versions-for-Package-Owned-by-Authenticated-User](../../doc/controllers/packages.md#packages-get-all-package-versions-for-package-owned-by-authenticated-user)
* [Packages Get-Package-Version-for-Authenticated-User](../../doc/controllers/packages.md#packages-get-package-version-for-authenticated-user)
* [Packages Delete-Package-Version-for-Authenticated-User](../../doc/controllers/packages.md#packages-delete-package-version-for-authenticated-user)
* [Packages Restore-Package-Version-for-Authenticated-User](../../doc/controllers/packages.md#packages-restore-package-version-for-authenticated-user)
* [Packages List-Packages-for-User](../../doc/controllers/packages.md#packages-list-packages-for-user)
* [Packages Get-Package-for-User](../../doc/controllers/packages.md#packages-get-package-for-user)
* [Packages Delete-Package-for-User](../../doc/controllers/packages.md#packages-delete-package-for-user)
* [Packages Restore-Package-for-User](../../doc/controllers/packages.md#packages-restore-package-for-user)
* [Packages Get-All-Package-Versions-for-Package-Owned-by-User](../../doc/controllers/packages.md#packages-get-all-package-versions-for-package-owned-by-user)
* [Packages Get-Package-Version-for-User](../../doc/controllers/packages.md#packages-get-package-version-for-user)
* [Packages Delete-Package-Version-for-User](../../doc/controllers/packages.md#packages-delete-package-version-for-user)
* [Packages Restore-Package-Version-for-User](../../doc/controllers/packages.md#packages-restore-package-version-for-user)


# Packages List-Packages-for-Organization

Lists all packages in an organization readable by the user.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#list-packages-for-an-organization](https://docs.github.com/rest/reference/packages#list-packages-for-an-organization)

```java
CompletableFuture<List<Package>> packagesListPackagesForOrganizationAsync(
    final PackageType21Enum packageType,
    final String org,
    final Visibility636Enum visibility)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Query, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `visibility` | [`Visibility636Enum`](../../doc/models/visibility-636-enum.md) | Query, Optional | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.<br><br>The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`.<br>For the list of GitHub Packages registries that support granular permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)." |

## Response Type

[`List<Package>`](../../doc/models/package.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String org = "org6";

packagesController.packagesListPackagesForOrganizationAsync(packageType, org, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 197,
    "name": "hello_docker",
    "package_type": "container",
    "owner": {
      "login": "github",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/github",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "version_count": 1,
    "visibility": "private",
    "url": "https://api.github.com/orgs/github/packages/container/hello_docker",
    "created_at": "2020-05-19T22:19:11Z",
    "updated_at": "2020-05-19T22:19:11Z",
    "html_url": "https://github.com/orgs/github/packages/container/package/hello_docker"
  },
  {
    "id": 198,
    "name": "goodbye_docker",
    "package_type": "container",
    "owner": {
      "login": "github",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/github",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "Organization",
      "site_admin": false
    },
    "version_count": 2,
    "visibility": "private",
    "url": "https://api.github.com/orgs/github/packages/container/goodbye_docker",
    "created_at": "2020-05-20T22:19:11Z",
    "updated_at": "2020-05-20T22:19:11Z",
    "html_url": "https://github.com/orgs/github/packages/container/package/goodbye_docker"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsPackages401ErrorException`](../../doc/models/orgs-packages-401-error-exception.md) |
| 403 | Forbidden | [`OrgsPackages403ErrorException`](../../doc/models/orgs-packages-403-error-exception.md) |


# Packages Get-Package-for-Organization

Gets a specific package in an organization.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#get-a-package-for-an-organization](https://docs.github.com/rest/reference/packages#get-a-package-for-an-organization)

```java
CompletableFuture<OrgsPackagesPackageNameResponse> packagesGetPackageForOrganizationAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`OrgsPackagesPackageNameResponse`](../../doc/models/orgs-packages-package-name-response.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";

packagesController.packagesGetPackageForOrganizationAsync(packageType, packageName, org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 197,
  "name": "hello_docker",
  "package_type": "container",
  "owner": {
    "login": "github",
    "id": 9919,
    "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
    "avatar_url": "https://avatars.githubusercontent.com/u/9919?v=4",
    "gravatar_id": "",
    "url": "https://api.github.com/users/github",
    "html_url": "https://github.com/github",
    "followers_url": "https://api.github.com/users/github/followers",
    "following_url": "https://api.github.com/users/github/following{/other_user}",
    "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
    "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
    "subscriptions_url": "https://api.github.com/users/github/subscriptions",
    "organizations_url": "https://api.github.com/users/github/orgs",
    "repos_url": "https://api.github.com/users/github/repos",
    "events_url": "https://api.github.com/users/github/events{/privacy}",
    "received_events_url": "https://api.github.com/users/github/received_events",
    "type": "Organization",
    "site_admin": false
  },
  "version_count": 1,
  "visibility": "private",
  "url": "https://api.github.com/orgs/github/packages/container/hello_docker",
  "created_at": "2020-05-19T22:19:11Z",
  "updated_at": "2020-05-19T22:19:11Z",
  "html_url": "https://github.com/orgs/github/packages/container/package/hello_docker"
}
```


# Packages Delete-Package-for-Org

Deletes an entire package in an organization. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.

To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#delete-a-package-for-an-organization](https://docs.github.com/rest/reference/packages#delete-a-package-for-an-organization)

```java
CompletableFuture<Void> packagesDeletePackageForOrgAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";

packagesController.packagesDeletePackageForOrgAsync(packageType, packageName, org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsPackagesPackageName401ErrorException`](../../doc/models/orgs-packages-package-name-401-error-exception.md) |
| 403 | Forbidden | [`OrgsPackagesPackageName403ErrorException`](../../doc/models/orgs-packages-package-name-403-error-exception.md) |
| 404 | Resource not found | [`OrgsPackagesPackageName404ErrorException`](../../doc/models/orgs-packages-package-name-404-error-exception.md) |


# Packages Restore-Package-for-Org

Restores an entire package in an organization.

You can restore a deleted package under the following conditions:

- The package was deleted within the last 30 days.
- The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.

To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#restore-a-package-for-an-organization](https://docs.github.com/rest/reference/packages#restore-a-package-for-an-organization)

```java
CompletableFuture<Void> packagesRestorePackageForOrgAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org,
    final String token)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `token` | `String` | Query, Optional | package token |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";

packagesController.packagesRestorePackageForOrgAsync(packageType, packageName, org, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsPackagesPackageNameRestore401ErrorException`](../../doc/models/orgs-packages-package-name-restore-401-error-exception.md) |
| 403 | Forbidden | [`OrgsPackagesPackageNameRestore403ErrorException`](../../doc/models/orgs-packages-package-name-restore-403-error-exception.md) |
| 404 | Resource not found | [`OrgsPackagesPackageNameRestore404ErrorException`](../../doc/models/orgs-packages-package-name-restore-404-error-exception.md) |


# Packages Get-All-Package-Versions-for-Package-Owned-by-Org

Lists package versions for a package owned by an organization.

If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/packages#get-all-package-versions-for-a-package-owned-by-an-organization](https://docs.github.com/rest/packages#get-all-package-versions-for-a-package-owned-by-an-organization)

```java
CompletableFuture<List<PackageVersion>> packagesGetAllPackageVersionsForPackageOwnedByOrgAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org,
    final Integer page,
    final Integer perPage,
    final State63Enum state)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `state` | [`State63Enum`](../../doc/models/state-63-enum.md) | Query, Optional | The state of the package, either active or deleted. |

## Response Type

[`List<PackageVersion>`](../../doc/models/package-version.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";
Integer page = 1;
Integer perPage = 30;

packagesController.packagesGetAllPackageVersionsForPackageOwnedByOrgAsync(packageType, packageName, org, page, perPage, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 245301,
    "name": "1.0.4",
    "url": "https://api.github.com/orgs/octo-org/packages/npm/hello-world-npm/versions/245301",
    "package_html_url": "https://github.com/octo-org/hello-world-npm/packages/43752",
    "created_at": "2019-11-05T22:49:04Z",
    "updated_at": "2019-11-05T22:49:04Z",
    "html_url": "https://github.com/octo-org/hello-world-npm/packages/43752?version=1.0.4",
    "metadata": {
      "package_type": "npm"
    }
  },
  {
    "id": 209672,
    "name": "1.0.3",
    "url": "https://api.github.com/orgs/octo-org/packages/npm/hello-world-npm/versions/209672",
    "package_html_url": "https://github.com/octo-org/hello-world-npm/packages/43752",
    "created_at": "2019-10-29T15:42:11Z",
    "updated_at": "2019-10-29T15:42:12Z",
    "html_url": "https://github.com/octo-org/hello-world-npm/packages/43752?version=1.0.3",
    "metadata": {
      "package_type": "npm"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsPackagesPackageNameVersions401ErrorException`](../../doc/models/orgs-packages-package-name-versions-401-error-exception.md) |
| 403 | Forbidden | [`OrgsPackagesPackageNameVersions403ErrorException`](../../doc/models/orgs-packages-package-name-versions-403-error-exception.md) |
| 404 | Resource not found | [`OrgsPackagesPackageNameVersions404ErrorException`](../../doc/models/orgs-packages-package-name-versions-404-error-exception.md) |


# Packages Get-Package-Version-for-Organization

Gets a specific package version in an organization.

You must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#get-a-package-version-for-an-organization](https://docs.github.com/rest/reference/packages#get-a-package-version-for-an-organization)

```java
CompletableFuture<OrgsPackagesPackageNameVersionsPackageVersionIdResponse> packagesGetPackageVersionForOrganizationAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

[`OrgsPackagesPackageNameVersionsPackageVersionIdResponse`](../../doc/models/orgs-packages-package-name-versions-package-version-id-response.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";
int packageVersionId = 132;

packagesController.packagesGetPackageVersionForOrganizationAsync(packageType, packageName, org, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 836,
  "name": "sha256:b3d3e366b55f9a54599220198b3db5da8f53592acbbb7dc7e4e9878762fc5344",
  "url": "https://api.github.com/orgs/github/packages/container/hello_docker/versions/836",
  "package_html_url": "https://github.com/orgs/github/packages/container/package/hello_docker",
  "created_at": "2020-05-19T22:19:11Z",
  "updated_at": "2020-05-19T22:19:11Z",
  "html_url": "https://github.com/orgs/github/packages/container/hello_docker/836",
  "metadata": {
    "package_type": "container",
    "container": {
      "tags": [
        "latest"
      ]
    }
  }
}
```


# Packages Delete-Package-Version-for-Org

Deletes a specific package version in an organization. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.

To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#delete-a-package-version-for-an-organization](https://docs.github.com/rest/reference/packages#delete-a-package-version-for-an-organization)

```java
CompletableFuture<Void> packagesDeletePackageVersionForOrgAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";
int packageVersionId = 132;

packagesController.packagesDeletePackageVersionForOrgAsync(packageType, packageName, org, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsPackagesPackageNameVersionsPackageVersionId401ErrorException`](../../doc/models/orgs-packages-package-name-versions-package-version-id-401-error-exception.md) |
| 403 | Forbidden | [`OrgsPackagesPackageNameVersionsPackageVersionId403ErrorException`](../../doc/models/orgs-packages-package-name-versions-package-version-id-403-error-exception.md) |
| 404 | Resource not found | [`OrgsPackagesPackageNameVersionsPackageVersionId404ErrorException`](../../doc/models/orgs-packages-package-name-versions-package-version-id-404-error-exception.md) |


# Packages Restore-Package-Version-for-Org

Restores a specific package version in an organization.

You can restore a deleted package under the following conditions:

- The package was deleted within the last 30 days.
- The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.

To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#restore-a-package-version-for-an-organization](https://docs.github.com/rest/reference/packages#restore-a-package-version-for-an-organization)

```java
CompletableFuture<Void> packagesRestorePackageVersionForOrgAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String org,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String org = "org6";
int packageVersionId = 132;

packagesController.packagesRestorePackageVersionForOrgAsync(packageType, packageName, org, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`OrgsPackagesPackageNameVersionsPackageVersionIdRestore401ErrorException`](../../doc/models/orgs-packages-package-name-versions-package-version-id-restore-401-error-exception.md) |
| 403 | Forbidden | [`OrgsPackagesPackageNameVersionsPackageVersionIdRestore403ErrorException`](../../doc/models/orgs-packages-package-name-versions-package-version-id-restore-403-error-exception.md) |
| 404 | Resource not found | [`OrgsPackagesPackageNameVersionsPackageVersionIdRestore404ErrorException`](../../doc/models/orgs-packages-package-name-versions-package-version-id-restore-404-error-exception.md) |


# Packages List-Packages-for-Authenticated-User

Lists packages owned by the authenticated user within the user's namespace.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#list-packages-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#list-packages-for-the-authenticated-user)

```java
CompletableFuture<List<Package>> packagesListPackagesForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final Visibility636Enum visibility)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Query, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `visibility` | [`Visibility636Enum`](../../doc/models/visibility-636-enum.md) | Query, Optional | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.<br><br>The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`.<br>For the list of GitHub Packages registries that support granular permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)." |

## Response Type

[`List<Package>`](../../doc/models/package.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;

packagesController.packagesListPackagesForAuthenticatedUserAsync(packageType, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 197,
    "name": "hello_docker",
    "package_type": "container",
    "owner": {
      "login": "monalisa",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.monalisausercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "User",
      "site_admin": false
    },
    "version_count": 1,
    "visibility": "private",
    "url": "https://api.github.com/orgs/github/packages/container/hello_docker",
    "created_at": "2020-05-19T22:19:11Z",
    "updated_at": "2020-05-19T22:19:11Z",
    "html_url": "https://github.com/orgs/github/packages/container/package/hello_docker"
  },
  {
    "id": 198,
    "name": "goodbye_docker",
    "package_type": "container",
    "owner": {
      "login": "github",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "User",
      "site_admin": false
    },
    "version_count": 2,
    "visibility": "private",
    "url": "https://api.github.com/user/monalisa/packages/container/goodbye_docker",
    "created_at": "2020-05-20T22:19:11Z",
    "updated_at": "2020-05-20T22:19:11Z",
    "html_url": "https://github.com/user/monalisa/packages/container/package/goodbye_docker"
  }
]
```


# Packages Get-Package-for-Authenticated-User

Gets a specific package for a package owned by the authenticated user.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#get-a-package-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#get-a-package-for-the-authenticated-user)

```java
CompletableFuture<UserPackagesResponse> packagesGetPackageForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |

## Response Type

[`UserPackagesResponse`](../../doc/models/user-packages-response.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";

packagesController.packagesGetPackageForAuthenticatedUserAsync(packageType, packageName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 40201,
  "name": "octo-name",
  "package_type": "rubygems",
  "owner": {
    "login": "octocat",
    "id": 209477,
    "node_id": "MDQ6VXNlcjIwOTQ3Nw==",
    "avatar_url": "https://avatars.githubusercontent.com/u/209477?v=4",
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
    "site_admin": true
  },
  "version_count": 3,
  "visibility": "public",
  "url": "https://api.github.com/users/octocat/packages/rubygems/octo-name",
  "created_at": "2019-10-20T14:17:14Z",
  "updated_at": "2019-10-20T14:17:14Z",
  "repository": {
    "id": 216219492,
    "node_id": "MDEwOlJlcG9zaXRvcnkyMTYyMTk0OTI=",
    "name": "octo-name-repo",
    "full_name": "octocat/octo-name-repo",
    "private": false,
    "owner": {
      "login": "octocat",
      "id": 209477,
      "node_id": "MDQ6VXNlcjIwOTQ3Nw==",
      "avatar_url": "https://avatars.githubusercontent.com/u/209477?v=4",
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
      "site_admin": true
    },
    "html_url": "https://github.com/octocat/octo-name-repo",
    "description": "Project for octocats",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/octo-name-repo",
    "forks_url": "https://api.github.com/repos/octocat/octo-name-repo/forks",
    "keys_url": "https://api.github.com/repos/octocat/octo-name-repo/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/octocat/octo-name-repo/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/octocat/octo-name-repo/teams",
    "hooks_url": "https://api.github.com/repos/octocat/octo-name-repo/hooks",
    "issue_events_url": "https://api.github.com/repos/octocat/octo-name-repo/issues/events{/number}",
    "events_url": "https://api.github.com/repos/octocat/octo-name-repo/events",
    "assignees_url": "https://api.github.com/repos/octocat/octo-name-repo/assignees{/user}",
    "branches_url": "https://api.github.com/repos/octocat/octo-name-repo/branches{/branch}",
    "tags_url": "https://api.github.com/repos/octocat/octo-name-repo/tags",
    "blobs_url": "https://api.github.com/repos/octocat/octo-name-repo/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/octo-name-repo/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/octo-name-repo/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/octocat/octo-name-repo/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/octocat/octo-name-repo/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/octocat/octo-name-repo/languages",
    "stargazers_url": "https://api.github.com/repos/octocat/octo-name-repo/stargazers",
    "contributors_url": "https://api.github.com/repos/octocat/octo-name-repo/contributors",
    "subscribers_url": "https://api.github.com/repos/octocat/octo-name-repo/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/octo-name-repo/subscription",
    "commits_url": "https://api.github.com/repos/octocat/octo-name-repo/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/octocat/octo-name-repo/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/octocat/octo-name-repo/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/octocat/octo-name-repo/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/octocat/octo-name-repo/contents/{+path}",
    "compare_url": "https://api.github.com/repos/octocat/octo-name-repo/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/octocat/octo-name-repo/merges",
    "archive_url": "https://api.github.com/repos/octocat/octo-name-repo/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/octocat/octo-name-repo/downloads",
    "issues_url": "https://api.github.com/repos/octocat/octo-name-repo/issues{/number}",
    "pulls_url": "https://api.github.com/repos/octocat/octo-name-repo/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/octocat/octo-name-repo/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/octo-name-repo/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/octocat/octo-name-repo/labels{/name}",
    "releases_url": "https://api.github.com/repos/octocat/octo-name-repo/releases{/id}",
    "deployments_url": "https://api.github.com/repos/octocat/octo-name-repo/deployments"
  },
  "html_url": "https://github.com/octocat/octo-name-repo/packages/40201"
}
```


# Packages Delete-Package-for-Authenticated-User

Deletes a package owned by the authenticated user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes.
If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#delete-a-package-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#delete-a-package-for-the-authenticated-user)

```java
CompletableFuture<Void> packagesDeletePackageForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";

packagesController.packagesDeletePackageForAuthenticatedUserAsync(packageType, packageName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserPackages401ErrorException`](../../doc/models/user-packages-401-error-exception.md) |
| 403 | Forbidden | [`UserPackages403ErrorException`](../../doc/models/user-packages-403-error-exception.md) |
| 404 | Resource not found | [`UserPackages404ErrorException`](../../doc/models/user-packages-404-error-exception.md) |


# Packages Restore-Package-for-Authenticated-User

Restores a package owned by the authenticated user.

You can restore a deleted package under the following conditions:

- The package was deleted within the last 30 days.
- The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#restore-a-package-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#restore-a-package-for-the-authenticated-user)

```java
CompletableFuture<Void> packagesRestorePackageForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String token)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `token` | `String` | Query, Optional | package token |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";

packagesController.packagesRestorePackageForAuthenticatedUserAsync(packageType, packageName, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserPackagesRestore401ErrorException`](../../doc/models/user-packages-restore-401-error-exception.md) |
| 403 | Forbidden | [`UserPackagesRestore403ErrorException`](../../doc/models/user-packages-restore-403-error-exception.md) |
| 404 | Resource not found | [`UserPackagesRestore404ErrorException`](../../doc/models/user-packages-restore-404-error-exception.md) |


# Packages Get-All-Package-Versions-for-Package-Owned-by-Authenticated-User

Lists package versions for a package owned by the authenticated user.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/packages#get-all-package-versions-for-a-package-owned-by-the-authenticated-user](https://docs.github.com/rest/packages#get-all-package-versions-for-a-package-owned-by-the-authenticated-user)

```java
CompletableFuture<List<PackageVersion>> packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final Integer page,
    final Integer perPage,
    final State63Enum state)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `state` | [`State63Enum`](../../doc/models/state-63-enum.md) | Query, Optional | The state of the package, either active or deleted. |

## Response Type

[`List<PackageVersion>`](../../doc/models/package-version.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
Integer page = 1;
Integer perPage = 30;

packagesController.packagesGetAllPackageVersionsForPackageOwnedByAuthenticatedUserAsync(packageType, packageName, page, perPage, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 45763,
    "name": "sha256:08a44bab0bddaddd8837a8b381aebc2e4b933768b981685a9e088360af0d3dd9",
    "url": "https://api.github.com/users/octocat/packages/container/hello_docker/versions/45763",
    "package_html_url": "https://github.com/users/octocat/packages/container/package/hello_docker",
    "created_at": "2020-09-11T21:56:40Z",
    "updated_at": "2021-02-05T21:32:32Z",
    "html_url": "https://github.com/users/octocat/packages/container/hello_docker/45763",
    "metadata": {
      "package_type": "container",
      "container": {
        "tags": [
          "latest"
        ]
      }
    }
  },
  {
    "id": 881,
    "name": "sha256:b3d3e366b55f9a54599220198b3db5da8f53592acbbb7dc7e4e9878762fc5344",
    "url": "https://api.github.com/users/octocat/packages/container/hello_docker/versions/881",
    "package_html_url": "https://github.com/users/octocat/packages/container/package/hello_docker",
    "created_at": "2020-05-21T22:22:20Z",
    "updated_at": "2021-02-05T21:32:32Z",
    "html_url": "https://github.com/users/octocat/packages/container/hello_docker/881",
    "metadata": {
      "package_type": "container",
      "container": {
        "tags": []
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserPackagesVersions401ErrorException`](../../doc/models/user-packages-versions-401-error-exception.md) |
| 403 | Forbidden | [`UserPackagesVersions403ErrorException`](../../doc/models/user-packages-versions-403-error-exception.md) |
| 404 | Resource not found | [`UserPackagesVersions404ErrorException`](../../doc/models/user-packages-versions-404-error-exception.md) |


# Packages Get-Package-Version-for-Authenticated-User

Gets a specific package version for a package owned by the authenticated user.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#get-a-package-version-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#get-a-package-version-for-the-authenticated-user)

```java
CompletableFuture<UserPackagesVersionsPackageVersionIdResponse> packagesGetPackageVersionForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

[`UserPackagesVersionsPackageVersionIdResponse`](../../doc/models/user-packages-versions-package-version-id-response.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
int packageVersionId = 132;

packagesController.packagesGetPackageVersionForAuthenticatedUserAsync(packageType, packageName, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 214,
  "name": "sha256:3561f0cff06caccddb99c93bd26e712fcc56a811de0f8ea7a17bb865f30b176a",
  "url": "https://api.github.com/users/octocat/packages/container/hello_docker/versions/214",
  "package_html_url": "https://github.com/users/octocat/packages/container/package/hello_docker",
  "created_at": "2020-05-15T03:46:45Z",
  "updated_at": "2020-05-15T03:46:45Z",
  "html_url": "https://github.com/users/octocat/packages/container/hello_docker/214",
  "metadata": {
    "package_type": "container",
    "container": {
      "tags": [
        "1.13.6"
      ]
    }
  }
}
```


# Packages Delete-Package-Version-for-Authenticated-User

Deletes a specific package version for a package owned by the authenticated user.  If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.

To use this endpoint, you must have admin permissions in the organization and authenticate using an access token with the `read:packages` and `delete:packages` scopes.
If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#delete-a-package-version-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#delete-a-package-version-for-the-authenticated-user)

```java
CompletableFuture<Void> packagesDeletePackageVersionForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
int packageVersionId = 132;

packagesController.packagesDeletePackageVersionForAuthenticatedUserAsync(packageType, packageName, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserPackagesVersionsPackageVersionId401ErrorException`](../../doc/models/user-packages-versions-package-version-id-401-error-exception.md) |
| 403 | Forbidden | [`UserPackagesVersionsPackageVersionId403ErrorException`](../../doc/models/user-packages-versions-package-version-id-403-error-exception.md) |
| 404 | Resource not found | [`UserPackagesVersionsPackageVersionId404ErrorException`](../../doc/models/user-packages-versions-package-version-id-404-error-exception.md) |


# Packages Restore-Package-Version-for-Authenticated-User

Restores a package version owned by the authenticated user.

You can restore a deleted package version under the following conditions:

- The package was deleted within the last 30 days.
- The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#restore-a-package-version-for-the-authenticated-user](https://docs.github.com/rest/reference/packages#restore-a-package-version-for-the-authenticated-user)

```java
CompletableFuture<Void> packagesRestorePackageVersionForAuthenticatedUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
int packageVersionId = 132;

packagesController.packagesRestorePackageVersionForAuthenticatedUserAsync(packageType, packageName, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserPackagesVersionsPackageVersionIdRestore401ErrorException`](../../doc/models/user-packages-versions-package-version-id-restore-401-error-exception.md) |
| 403 | Forbidden | [`UserPackagesVersionsPackageVersionIdRestore403ErrorException`](../../doc/models/user-packages-versions-package-version-id-restore-403-error-exception.md) |
| 404 | Resource not found | [`UserPackagesVersionsPackageVersionIdRestore404ErrorException`](../../doc/models/user-packages-versions-package-version-id-restore-404-error-exception.md) |


# Packages List-Packages-for-User

Lists all packages in a user's namespace for which the requesting user has access.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#list-packages-for-user](https://docs.github.com/rest/reference/packages#list-packages-for-user)

```java
CompletableFuture<List<Package>> packagesListPackagesForUserAsync(
    final PackageType21Enum packageType,
    final String username,
    final Visibility636Enum visibility)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Query, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `visibility` | [`Visibility636Enum`](../../doc/models/visibility-636-enum.md) | Query, Optional | The selected visibility of the packages.  This parameter is optional and only filters an existing result set.<br><br>The `internal` visibility is only supported for GitHub Packages registries that allow for granular permissions. For other ecosystems `internal` is synonymous with `private`.<br>For the list of GitHub Packages registries that support granular permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)." |

## Response Type

[`List<Package>`](../../doc/models/package.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String username = "username0";

packagesController.packagesListPackagesForUserAsync(packageType, username, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 197,
    "name": "hello_docker",
    "package_type": "container",
    "owner": {
      "login": "monalisa",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.monalisausercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "User",
      "site_admin": false
    },
    "version_count": 1,
    "visibility": "private",
    "url": "https://api.github.com/orgs/github/packages/container/hello_docker",
    "created_at": "2020-05-19T22:19:11Z",
    "updated_at": "2020-05-19T22:19:11Z",
    "html_url": "https://github.com/orgs/github/packages/container/package/hello_docker"
  },
  {
    "id": 198,
    "name": "goodbye_docker",
    "package_type": "container",
    "owner": {
      "login": "github",
      "id": 9919,
      "node_id": "MDEyOk9yZ2FuaXphdGlvbjk5MTk=",
      "avatar_url": "https://avatars.githubusercontent.com/u/9919?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/monalisa",
      "html_url": "https://github.com/github",
      "followers_url": "https://api.github.com/users/github/followers",
      "following_url": "https://api.github.com/users/github/following{/other_user}",
      "gists_url": "https://api.github.com/users/github/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/github/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/github/subscriptions",
      "organizations_url": "https://api.github.com/users/github/orgs",
      "repos_url": "https://api.github.com/users/github/repos",
      "events_url": "https://api.github.com/users/github/events{/privacy}",
      "received_events_url": "https://api.github.com/users/github/received_events",
      "type": "User",
      "site_admin": false
    },
    "version_count": 2,
    "visibility": "private",
    "url": "https://api.github.com/user/monalisa/packages/container/goodbye_docker",
    "created_at": "2020-05-20T22:19:11Z",
    "updated_at": "2020-05-20T22:19:11Z",
    "html_url": "https://github.com/user/monalisa/packages/container/package/goodbye_docker"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UsersPackages401ErrorException`](../../doc/models/users-packages-401-error-exception.md) |
| 403 | Forbidden | [`UsersPackages403ErrorException`](../../doc/models/users-packages-403-error-exception.md) |


# Packages Get-Package-for-User

Gets a specific package metadata for a public package owned by a user.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#get-a-package-for-a-user](https://docs.github.com/rest/reference/packages#get-a-package-for-a-user)

```java
CompletableFuture<UsersPackagesPackageNameResponse> packagesGetPackageForUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`UsersPackagesPackageNameResponse`](../../doc/models/users-packages-package-name-response.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String username = "username0";

packagesController.packagesGetPackageForUserAsync(packageType, packageName, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 40201,
  "name": "octo-name",
  "package_type": "rubygems",
  "owner": {
    "login": "octocat",
    "id": 209477,
    "node_id": "MDQ6VXNlcjIwOTQ3Nw==",
    "avatar_url": "https://avatars.githubusercontent.com/u/209477?v=4",
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
    "site_admin": true
  },
  "version_count": 3,
  "visibility": "public",
  "url": "https://api.github.com/users/octocat/packages/rubygems/octo-name",
  "created_at": "2019-10-20T14:17:14Z",
  "updated_at": "2019-10-20T14:17:14Z",
  "repository": {
    "id": 216219492,
    "node_id": "MDEwOlJlcG9zaXRvcnkyMTYyMTk0OTI=",
    "name": "octo-name-repo",
    "full_name": "octocat/octo-name-repo",
    "private": false,
    "owner": {
      "login": "octocat",
      "id": 209477,
      "node_id": "MDQ6VXNlcjIwOTQ3Nw==",
      "avatar_url": "https://avatars.githubusercontent.com/u/209477?v=4",
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
      "site_admin": true
    },
    "html_url": "https://github.com/octocat/octo-name-repo",
    "description": "Project for octocats",
    "fork": false,
    "url": "https://api.github.com/repos/octocat/octo-name-repo",
    "forks_url": "https://api.github.com/repos/octocat/octo-name-repo/forks",
    "keys_url": "https://api.github.com/repos/octocat/octo-name-repo/keys{/key_id}",
    "collaborators_url": "https://api.github.com/repos/octocat/octo-name-repo/collaborators{/collaborator}",
    "teams_url": "https://api.github.com/repos/octocat/octo-name-repo/teams",
    "hooks_url": "https://api.github.com/repos/octocat/octo-name-repo/hooks",
    "issue_events_url": "https://api.github.com/repos/octocat/octo-name-repo/issues/events{/number}",
    "events_url": "https://api.github.com/repos/octocat/octo-name-repo/events",
    "assignees_url": "https://api.github.com/repos/octocat/octo-name-repo/assignees{/user}",
    "branches_url": "https://api.github.com/repos/octocat/octo-name-repo/branches{/branch}",
    "tags_url": "https://api.github.com/repos/octocat/octo-name-repo/tags",
    "blobs_url": "https://api.github.com/repos/octocat/octo-name-repo/git/blobs{/sha}",
    "git_tags_url": "https://api.github.com/repos/octocat/octo-name-repo/git/tags{/sha}",
    "git_refs_url": "https://api.github.com/repos/octocat/octo-name-repo/git/refs{/sha}",
    "trees_url": "https://api.github.com/repos/octocat/octo-name-repo/git/trees{/sha}",
    "statuses_url": "https://api.github.com/repos/octocat/octo-name-repo/statuses/{sha}",
    "languages_url": "https://api.github.com/repos/octocat/octo-name-repo/languages",
    "stargazers_url": "https://api.github.com/repos/octocat/octo-name-repo/stargazers",
    "contributors_url": "https://api.github.com/repos/octocat/octo-name-repo/contributors",
    "subscribers_url": "https://api.github.com/repos/octocat/octo-name-repo/subscribers",
    "subscription_url": "https://api.github.com/repos/octocat/octo-name-repo/subscription",
    "commits_url": "https://api.github.com/repos/octocat/octo-name-repo/commits{/sha}",
    "git_commits_url": "https://api.github.com/repos/octocat/octo-name-repo/git/commits{/sha}",
    "comments_url": "https://api.github.com/repos/octocat/octo-name-repo/comments{/number}",
    "issue_comment_url": "https://api.github.com/repos/octocat/octo-name-repo/issues/comments{/number}",
    "contents_url": "https://api.github.com/repos/octocat/octo-name-repo/contents/{+path}",
    "compare_url": "https://api.github.com/repos/octocat/octo-name-repo/compare/{base}...{head}",
    "merges_url": "https://api.github.com/repos/octocat/octo-name-repo/merges",
    "archive_url": "https://api.github.com/repos/octocat/octo-name-repo/{archive_format}{/ref}",
    "downloads_url": "https://api.github.com/repos/octocat/octo-name-repo/downloads",
    "issues_url": "https://api.github.com/repos/octocat/octo-name-repo/issues{/number}",
    "pulls_url": "https://api.github.com/repos/octocat/octo-name-repo/pulls{/number}",
    "milestones_url": "https://api.github.com/repos/octocat/octo-name-repo/milestones{/number}",
    "notifications_url": "https://api.github.com/repos/octocat/octo-name-repo/notifications{?since,all,participating}",
    "labels_url": "https://api.github.com/repos/octocat/octo-name-repo/labels{/name}",
    "releases_url": "https://api.github.com/repos/octocat/octo-name-repo/releases{/id}",
    "deployments_url": "https://api.github.com/repos/octocat/octo-name-repo/deployments"
  },
  "html_url": "https://github.com/octocat/octo-name-repo/packages/40201"
}
```


# Packages Delete-Package-for-User

Deletes an entire package for a user. You cannot delete a public package if any version of the package has more than 5,000 downloads. In this scenario, contact GitHub support for further assistance.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#delete-a-package-for-a-user](https://docs.github.com/rest/reference/packages#delete-a-package-for-a-user)

```java
CompletableFuture<Void> packagesDeletePackageForUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String username = "username0";

packagesController.packagesDeletePackageForUserAsync(packageType, packageName, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UsersPackagesPackageName401ErrorException`](../../doc/models/users-packages-package-name-401-error-exception.md) |
| 403 | Forbidden | [`UsersPackagesPackageName403ErrorException`](../../doc/models/users-packages-package-name-403-error-exception.md) |
| 404 | Resource not found | [`UsersPackagesPackageName404ErrorException`](../../doc/models/users-packages-package-name-404-error-exception.md) |


# Packages Restore-Package-for-User

Restores an entire package for a user.

You can restore a deleted package under the following conditions:

- The package was deleted within the last 30 days.
- The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#restore-a-package-for-a-user](https://docs.github.com/rest/reference/packages#restore-a-package-for-a-user)

```java
CompletableFuture<Void> packagesRestorePackageForUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String username,
    final String token)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `token` | `String` | Query, Optional | package token |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String username = "username0";

packagesController.packagesRestorePackageForUserAsync(packageType, packageName, username, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UsersPackagesPackageNameRestore401ErrorException`](../../doc/models/users-packages-package-name-restore-401-error-exception.md) |
| 403 | Forbidden | [`UsersPackagesPackageNameRestore403ErrorException`](../../doc/models/users-packages-package-name-restore-403-error-exception.md) |
| 404 | Resource not found | [`UsersPackagesPackageNameRestore404ErrorException`](../../doc/models/users-packages-package-name-restore-404-error-exception.md) |


# Packages Get-All-Package-Versions-for-Package-Owned-by-User

Lists package versions for a public package owned by a specified user.

To use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/packages#get-all-package-versions-for-a-package-owned-by-a-user](https://docs.github.com/rest/packages#get-all-package-versions-for-a-package-owned-by-a-user)

```java
CompletableFuture<List<PackageVersion>> packagesGetAllPackageVersionsForPackageOwnedByUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`List<PackageVersion>`](../../doc/models/package-version.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String username = "username0";

packagesController.packagesGetAllPackageVersionsForPackageOwnedByUserAsync(packageType, packageName, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "id": 3497268,
    "name": "0.3.0",
    "url": "https://api.github.com/users/octocat/packages/rubygems/octo-name/versions/3497268",
    "package_html_url": "https://github.com/octocat/octo-name-repo/packages/40201",
    "license": "MIT",
    "created_at": "2020-08-31T15:22:11Z",
    "updated_at": "2020-08-31T15:22:12Z",
    "description": "Project for octocats",
    "html_url": "https://github.com/octocat/octo-name-repo/packages/40201?version=0.3.0",
    "metadata": {
      "package_type": "rubygems"
    }
  },
  {
    "id": 387039,
    "name": "0.2.0",
    "url": "https://api.github.com/users/octocat/packages/rubygems/octo-name/versions/387039",
    "package_html_url": "https://github.com/octocat/octo-name-repo/packages/40201",
    "license": "MIT",
    "created_at": "2019-12-01T20:49:29Z",
    "updated_at": "2019-12-01T20:49:30Z",
    "description": "Project for octocats",
    "html_url": "https://github.com/octocat/octo-name-repo/packages/40201?version=0.2.0",
    "metadata": {
      "package_type": "rubygems"
    }
  },
  {
    "id": 169770,
    "name": "0.1.0",
    "url": "https://api.github.com/users/octocat/packages/rubygems/octo-name/versions/169770",
    "package_html_url": "https://github.com/octocat/octo-name-repo/packages/40201",
    "license": "MIT",
    "created_at": "2019-10-20T14:17:14Z",
    "updated_at": "2019-10-20T14:17:15Z",
    "html_url": "https://github.com/octocat/octo-name-repo/packages/40201?version=0.1.0",
    "metadata": {
      "package_type": "rubygems"
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UsersPackagesPackageNameVersions401ErrorException`](../../doc/models/users-packages-package-name-versions-401-error-exception.md) |
| 403 | Forbidden | [`UsersPackagesPackageNameVersions403ErrorException`](../../doc/models/users-packages-package-name-versions-403-error-exception.md) |
| 404 | Resource not found | [`UsersPackagesPackageNameVersions404ErrorException`](../../doc/models/users-packages-package-name-versions-404-error-exception.md) |


# Packages Get-Package-Version-for-User

Gets a specific package version for a public package owned by a specified user.

At this time, to use this endpoint, you must authenticate using an access token with the `read:packages` scope. If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of GitHub Packages registries that only support repository-scoped permissions, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#get-a-package-version-for-a-user](https://docs.github.com/rest/reference/packages#get-a-package-version-for-a-user)

```java
CompletableFuture<UsersPackagesPackageNameVersionsPackageVersionIdResponse> packagesGetPackageVersionForUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final int packageVersionId,
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`UsersPackagesPackageNameVersionsPackageVersionIdResponse`](../../doc/models/users-packages-package-name-versions-package-version-id-response.md)

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
int packageVersionId = 132;
String username = "username0";

packagesController.packagesGetPackageVersionForUserAsync(packageType, packageName, packageVersionId, username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 387039,
  "name": "0.2.0",
  "url": "https://api.github.com/users/octocat/packages/rubygems/octo-name/versions/387039",
  "package_html_url": "https://github.com/octocat/octo-name-repo/packages/40201",
  "license": "MIT",
  "created_at": "2019-12-01T20:49:29Z",
  "updated_at": "2019-12-01T20:49:30Z",
  "description": "Octo-name client for Ruby",
  "html_url": "https://github.com/octocat/octo-name-repo/packages/40201?version=0.2.0",
  "metadata": {
    "package_type": "rubygems"
  }
}
```


# Packages Delete-Package-Version-for-User

Deletes a specific package version for a user. If the package is public and the package version has more than 5,000 downloads, you cannot delete the package version. In this scenario, contact GitHub support for further assistance.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `delete:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to delete. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#delete-a-package-version-for-a-user](https://docs.github.com/rest/reference/packages#delete-a-package-version-for-a-user)

```java
CompletableFuture<Void> packagesDeletePackageVersionForUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String username,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String username = "username0";
int packageVersionId = 132;

packagesController.packagesDeletePackageVersionForUserAsync(packageType, packageName, username, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UsersPackagesPackageNameVersionsPackageVersionId401ErrorException`](../../doc/models/users-packages-package-name-versions-package-version-id-401-error-exception.md) |
| 403 | Forbidden | [`UsersPackagesPackageNameVersionsPackageVersionId403ErrorException`](../../doc/models/users-packages-package-name-versions-package-version-id-403-error-exception.md) |
| 404 | Resource not found | [`UsersPackagesPackageNameVersionsPackageVersionId404ErrorException`](../../doc/models/users-packages-package-name-versions-package-version-id-404-error-exception.md) |


# Packages Restore-Package-Version-for-User

Restores a specific package version for a user.

You can restore a deleted package under the following conditions:

- The package was deleted within the last 30 days.
- The same package namespace and version is still available and not reused for a new package. If the same package namespace is not available, you will not be able to restore your package. In this scenario, to restore the deleted package, you must delete the new package that uses the deleted package's namespace first.

To use this endpoint, you must authenticate using an access token with the `read:packages` and `write:packages` scopes. In addition:

- If the `package_type` belongs to a GitHub Packages registry that only supports repository-scoped permissions, your token must also include the `repo` scope. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#permissions-for-repository-scoped-packages)."
- If the `package_type` belongs to a GitHub Packages registry that supports granular permissions, you must have admin permissions to the package whose version you want to restore. For the list of these registries, see "[About permissions for GitHub Packages](https://docs.github.com/packages/learn-github-packages/about-permissions-for-github-packages#granular-permissions-for-userorganization-scoped-packages)."

API method documentation: [https://docs.github.com/rest/reference/packages#restore-a-package-version-for-a-user](https://docs.github.com/rest/reference/packages#restore-a-package-version-for-a-user)

```java
CompletableFuture<Void> packagesRestorePackageVersionForUserAsync(
    final PackageType21Enum packageType,
    final String packageName,
    final String username,
    final int packageVersionId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `packageType` | [`PackageType21Enum`](../../doc/models/package-type-21-enum.md) | Template, Required | The type of supported package. Packages in GitHub's Gradle registry have the type `maven`. Docker images pushed to GitHub's Container registry (`ghcr.io`) have the type `container`. You can use the type `docker` to find images that were pushed to GitHub's Docker registry (`docker.pkg.github.com`), even if these have now been migrated to the Container registry. |
| `packageName` | `String` | Template, Required | The name of the package. |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `packageVersionId` | `int` | Template, Required | Unique identifier of the package version. |

## Response Type

`void`

## Example Usage

```java
PackageType21Enum packageType = PackageType21Enum.NUGET;
String packageName = "package_name0";
String username = "username0";
int packageVersionId = 132;

packagesController.packagesRestorePackageVersionForUserAsync(packageType, packageName, username, packageVersionId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UsersPackagesPackageNameVersionsPackageVersionIdRestore401ErrorException`](../../doc/models/users-packages-package-name-versions-package-version-id-restore-401-error-exception.md) |
| 403 | Forbidden | [`UsersPackagesPackageNameVersionsPackageVersionIdRestore403ErrorException`](../../doc/models/users-packages-package-name-versions-package-version-id-restore-403-error-exception.md) |
| 404 | Resource not found | [`UsersPackagesPackageNameVersionsPackageVersionIdRestore404ErrorException`](../../doc/models/users-packages-package-name-versions-package-version-id-restore-404-error-exception.md) |

