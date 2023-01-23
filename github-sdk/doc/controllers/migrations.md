# Migrations

Move projects to or from GitHub.

```java
MigrationsController migrationsController = client.getMigrationsController();
```

## Class Name

`MigrationsController`

## Methods

* [Migrations List-for-Org](../../doc/controllers/migrations.md#migrations-list-for-org)
* [Migrations Start-for-Org](../../doc/controllers/migrations.md#migrations-start-for-org)
* [Migrations Get-Status-for-Org](../../doc/controllers/migrations.md#migrations-get-status-for-org)
* [Migrations Download-Archive-for-Org](../../doc/controllers/migrations.md#migrations-download-archive-for-org)
* [Migrations Delete-Archive-for-Org](../../doc/controllers/migrations.md#migrations-delete-archive-for-org)
* [Migrations Unlock-Repo-for-Org](../../doc/controllers/migrations.md#migrations-unlock-repo-for-org)
* [Migrations List-Repos-for-Org](../../doc/controllers/migrations.md#migrations-list-repos-for-org)
* [Migrations Get-Import-Status](../../doc/controllers/migrations.md#migrations-get-import-status)
* [Migrations Start-Import](../../doc/controllers/migrations.md#migrations-start-import)
* [Migrations Update-Import](../../doc/controllers/migrations.md#migrations-update-import)
* [Migrations Cancel-Import](../../doc/controllers/migrations.md#migrations-cancel-import)
* [Migrations Get-Commit-Authors](../../doc/controllers/migrations.md#migrations-get-commit-authors)
* [Migrations Map-Commit-Author](../../doc/controllers/migrations.md#migrations-map-commit-author)
* [Migrations Get-Large-Files](../../doc/controllers/migrations.md#migrations-get-large-files)
* [Migrations Set-Lfs-Preference](../../doc/controllers/migrations.md#migrations-set-lfs-preference)
* [Migrations List-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-list-for-authenticated-user)
* [Migrations Start-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-start-for-authenticated-user)
* [Migrations Get-Status-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-get-status-for-authenticated-user)
* [Migrations Get-Archive-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-get-archive-for-authenticated-user)
* [Migrations Delete-Archive-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-delete-archive-for-authenticated-user)
* [Migrations Unlock-Repo-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-unlock-repo-for-authenticated-user)
* [Migrations List-Repos-for-Authenticated-User](../../doc/controllers/migrations.md#migrations-list-repos-for-authenticated-user)


# Migrations List-for-Org

Lists the most recent migrations.

API method documentation: [https://docs.github.com/rest/reference/migrations#list-organization-migrations](https://docs.github.com/rest/reference/migrations#list-organization-migrations)

```java
CompletableFuture<List<Migration>> migrationsListForOrgAsync(
    final String org,
    final Integer perPage,
    final Integer page,
    final List<ExcludeEnum> exclude)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `exclude` | [`List<ExcludeEnum>`](../../doc/models/exclude-enum.md) | Query, Optional | Exclude attributes from the API response to improve performance |

## Response Type

[`List<Migration>`](../../doc/models/migration.md)

## Example Usage

```java
String org = "org6";
Integer perPage = 30;
Integer page = 1;
migrationsController.migrationsListForOrgAsync(org, perPage, page, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Migrations Start-for-Org

Initiates the generation of a migration archive.

API method documentation: [https://docs.github.com/rest/reference/migrations#start-an-organization-migration](https://docs.github.com/rest/reference/migrations#start-an-organization-migration)

```java
CompletableFuture<OrgsMigrationsResponse> migrationsStartForOrgAsync(
    final String org,
    final OrgsMigrationsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `body` | [`OrgsMigrationsRequest`](../../doc/models/orgs-migrations-request.md) | Body, Required | - |

## Response Type

[`OrgsMigrationsResponse`](../../doc/models/orgs-migrations-response.md)

## Example Usage

```java
String org = "org6";
OrgsMigrationsRequest body = new OrgsMigrationsRequest();
List<String> repositories = new LinkedList<>();
repositories.add("github/Hello-World");

body.setRepositories(repositories);
body.setLockRepositories(true);

migrationsController.migrationsStartForOrgAsync(org, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsMigrations404ErrorException`](../../doc/models/orgs-migrations-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`OrgsMigrations422ErrorException`](../../doc/models/orgs-migrations-422-error-exception.md) |


# Migrations Get-Status-for-Org

Fetches the status of a migration.

The `state` of a migration can be one of the following values:

* `pending`, which means the migration hasn't started yet.
* `exporting`, which means the migration is in progress.
* `exported`, which means the migration finished successfully.
* `failed`, which means the migration failed.

API method documentation: [https://docs.github.com/rest/reference/migrations#get-an-organization-migration-status](https://docs.github.com/rest/reference/migrations#get-an-organization-migration-status)

```java
CompletableFuture<OrgsMigrationsResponse> migrationsGetStatusForOrgAsync(
    final String org,
    final int migrationId,
    final List<ExcludeEnum> exclude)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |
| `exclude` | [`List<ExcludeEnum>`](../../doc/models/exclude-enum.md) | Query, Optional | Exclude attributes from the API response to improve performance |

## Response Type

[`OrgsMigrationsResponse`](../../doc/models/orgs-migrations-response.md)

## Example Usage

```java
String org = "org6";
int migrationId = 48;
migrationsController.migrationsGetStatusForOrgAsync(org, migrationId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsMigrations404ErrorException`](../../doc/models/orgs-migrations-404-error-exception.md) |


# Migrations Download-Archive-for-Org

Fetches the URL to a migration archive.

API method documentation: [https://docs.github.com/rest/reference/migrations#download-an-organization-migration-archive](https://docs.github.com/rest/reference/migrations#download-an-organization-migration-archive)

```java
CompletableFuture<Void> migrationsDownloadArchiveForOrgAsync(
    final String org,
    final int migrationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int migrationId = 48;

migrationsController.migrationsDownloadArchiveForOrgAsync(org, migrationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsMigrationsArchive404ErrorException`](../../doc/models/orgs-migrations-archive-404-error-exception.md) |


# Migrations Delete-Archive-for-Org

Deletes a previous migration archive. Migration archives are automatically deleted after seven days.

API method documentation: [https://docs.github.com/rest/reference/migrations#delete-an-organization-migration-archive](https://docs.github.com/rest/reference/migrations#delete-an-organization-migration-archive)

```java
CompletableFuture<Void> migrationsDeleteArchiveForOrgAsync(
    final String org,
    final int migrationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int migrationId = 48;

migrationsController.migrationsDeleteArchiveForOrgAsync(org, migrationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsMigrationsArchive404ErrorException`](../../doc/models/orgs-migrations-archive-404-error-exception.md) |


# Migrations Unlock-Repo-for-Org

Unlocks a repository that was locked for migration. You should unlock each migrated repository and [delete them](https://docs.github.com/rest/reference/repos#delete-a-repository) when the migration is complete and you no longer need the source data.

API method documentation: [https://docs.github.com/rest/reference/migrations#unlock-an-organization-repository](https://docs.github.com/rest/reference/migrations#unlock-an-organization-repository)

```java
CompletableFuture<Void> migrationsUnlockRepoForOrgAsync(
    final String org,
    final int migrationId,
    final String repoName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |
| `repoName` | `String` | Template, Required | repo_name parameter |

## Response Type

`void`

## Example Usage

```java
String org = "org6";
int migrationId = 48;
String repoName = "repo_name6";

migrationsController.migrationsUnlockRepoForOrgAsync(org, migrationId, repoName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsMigrationsReposRepoNameLock404ErrorException`](../../doc/models/orgs-migrations-repos-repo-name-lock-404-error-exception.md) |


# Migrations List-Repos-for-Org

List all the repositories for this organization migration.

API method documentation: [https://docs.github.com/rest/reference/migrations#list-repositories-in-an-organization-migration](https://docs.github.com/rest/reference/migrations#list-repositories-in-an-organization-migration)

```java
CompletableFuture<List<MinimalRepository>> migrationsListReposForOrgAsync(
    final String org,
    final int migrationId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MinimalRepository>`](../../doc/models/minimal-repository.md)

## Example Usage

```java
String org = "org6";
int migrationId = 48;
Integer perPage = 30;
Integer page = 1;

migrationsController.migrationsListReposForOrgAsync(org, migrationId, perPage, page).thenAccept(result -> {
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
    "is_template": false,
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
    "has_discussions": false,
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
    "security_and_analysis": {
      "advanced_security": {
        "status": "enabled"
      },
      "secret_scanning": {
        "status": "enabled"
      },
      "secret_scanning_push_protection": {
        "status": "disabled"
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`OrgsMigrationsRepositories404ErrorException`](../../doc/models/orgs-migrations-repositories-404-error-exception.md) |


# Migrations Get-Import-Status

View the progress of an import.

**Import status**

This section includes details about the possible values of the `status` field of the Import Progress response.

An import that does not have errors will progress through these steps:

* `detecting` - the "detection" step of the import is in progress because the request did not include a `vcs` parameter. The import is identifying the type of source control present at the URL.
* `importing` - the "raw" step of the import is in progress. This is where commit data is fetched from the original repository. The import progress response will include `commit_count` (the total number of raw commits that will be imported) and `percent` (0 - 100, the current progress through the import).
* `mapping` - the "rewrite" step of the import is in progress. This is where SVN branches are converted to Git branches, and where author updates are applied. The import progress response does not include progress information.
* `pushing` - the "push" step of the import is in progress. This is where the importer updates the repository on GitHub. The import progress response will include `push_percent`, which is the percent value reported by `git push` when it is "Writing objects".
* `complete` - the import is complete, and the repository is ready on GitHub.

If there are problems, you will see one of these in the `status` field:

* `auth_failed` - the import requires authentication in order to connect to the original repository. To update authentication for the import, please see the [Update an import](https://docs.github.com/rest/reference/migrations#update-an-import) section.
* `error` - the import encountered an error. The import progress response will include the `failed_step` and an error message. Contact [GitHub Support](https://support.github.com/contact?tags=dotcom-rest-api) for more information.
* `detection_needs_auth` - the importer requires authentication for the originating repository to continue detection. To update authentication for the import, please see the [Update an import](https://docs.github.com/rest/reference/migrations#update-an-import) section.
* `detection_found_nothing` - the importer didn't recognize any source control at the URL. To resolve, [Cancel the import](https://docs.github.com/rest/reference/migrations#cancel-an-import) and [retry](https://docs.github.com/rest/reference/migrations#start-an-import) with the correct URL.
* `detection_found_multiple` - the importer found several projects or repositories at the provided URL. When this is the case, the Import Progress response will also include a `project_choices` field with the possible project choices as values. To update project choice, please see the [Update an import](https://docs.github.com/rest/reference/migrations#update-an-import) section.

**The project_choices field**

When multiple projects are found at the provided URL, the response hash will include a `project_choices` field, the value of which is an array of hashes each representing a project choice. The exact key/value pairs of the project hashes will differ depending on the version control type.

**Git LFS related fields**

This section includes details about Git LFS related fields that may be present in the Import Progress response.

* `use_lfs` - describes whether the import has been opted in or out of using Git LFS. The value can be `opt_in`, `opt_out`, or `undecided` if no action has been taken.
* `has_large_files` - the boolean value describing whether files larger than 100MB were found during the `importing` step.
* `large_files_size` - the total size in gigabytes of files larger than 100MB found in the originating repository.
* `large_files_count` - the total number of files larger than 100MB found in the originating repository. To see a list of these files, make a "Get Large Files" request.

API method documentation: [https://docs.github.com/rest/reference/migrations#get-an-import-status](https://docs.github.com/rest/reference/migrations#get-an-import-status)

```java
CompletableFuture<ReposImportResponse> migrationsGetImportStatusAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`ReposImportResponse`](../../doc/models/repos-import-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

migrationsController.migrationsGetImportStatusAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "vcs": "subversion",
  "use_lfs": true,
  "vcs_url": "http://svn.mycompany.com/svn/myproject",
  "status": "complete",
  "status_text": "Done",
  "has_large_files": true,
  "large_files_size": 132331036,
  "large_files_count": 1,
  "authors_count": 4,
  "url": "https://api.github.com/repos/octocat/socm/import",
  "html_url": "https://import.github.com/octocat/socm/import",
  "authors_url": "https://api.github.com/repos/octocat/socm/import/authors",
  "repository_url": "https://api.github.com/repos/octocat/socm"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposImport404ErrorException`](../../doc/models/repos-import-404-error-exception.md) |
| 503 | Unavailable due to service under maintenance. | [`ReposImport503ErrorException`](../../doc/models/repos-import-503-error-exception.md) |


# Migrations Start-Import

Start a source import to a GitHub repository using GitHub Importer.

API method documentation: [https://docs.github.com/rest/reference/migrations#start-an-import](https://docs.github.com/rest/reference/migrations#start-an-import)

```java
CompletableFuture<ReposImportResponse> migrationsStartImportAsync(
    final String owner,
    final String repo,
    final ReposImportRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposImportRequest`](../../doc/models/repos-import-request.md) | Body, Required | - |

## Response Type

[`ReposImportResponse`](../../doc/models/repos-import-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposImportRequest body = new ReposImportRequest();
body.setVcsUrl("http://svn.mycompany.com/svn/myproject");
body.setVcs(VcsEnum.SUBVERSION);
body.setVcsUsername("octocat");
body.setVcsPassword("secret");

migrationsController.migrationsStartImportAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "vcs": "subversion",
  "use_lfs": true,
  "vcs_url": "http://svn.mycompany.com/svn/myproject",
  "status": "importing",
  "status_text": "Importing...",
  "has_large_files": false,
  "large_files_size": 0,
  "large_files_count": 0,
  "authors_count": 0,
  "commit_count": 1042,
  "url": "https://api.github.com/repos/octocat/socm/import",
  "html_url": "https://import.github.com/octocat/socm/import",
  "authors_url": "https://api.github.com/repos/octocat/socm/import/authors",
  "repository_url": "https://api.github.com/repos/octocat/socm"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposImport404ErrorException`](../../doc/models/repos-import-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposImport422ErrorException`](../../doc/models/repos-import-422-error-exception.md) |
| 503 | Unavailable due to service under maintenance. | [`ReposImport503ErrorException`](../../doc/models/repos-import-503-error-exception.md) |


# Migrations Update-Import

An import can be updated with credentials or a project choice by passing in the appropriate parameters in this API
request. If no parameters are provided, the import will be restarted.

Some servers (e.g. TFS servers) can have several projects at a single URL. In those cases the import progress will
have the status `detection_found_multiple` and the Import Progress response will include a `project_choices` array.
You can select the project to import by providing one of the objects in the `project_choices` array in the update request.

API method documentation: [https://docs.github.com/rest/reference/migrations#update-an-import](https://docs.github.com/rest/reference/migrations#update-an-import)

```java
CompletableFuture<ReposImportResponse> migrationsUpdateImportAsync(
    final String owner,
    final String repo,
    final Object body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | `Object` | Body, Optional | - |

## Response Type

[`ReposImportResponse`](../../doc/models/repos-import-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
Object body = com.github.api.ApiHelper.deserialize("{\"vcs_username\":\"octocat\",\"vcs_password\":\"secret\"}");

migrationsController.migrationsUpdateImportAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "vcs": "subversion",
  "use_lfs": true,
  "vcs_url": "http://svn.mycompany.com/svn/myproject",
  "status": "detecting",
  "url": "https://api.github.com/repos/octocat/socm/import",
  "html_url": "https://import.github.com/octocat/socm/import",
  "authors_url": "https://api.github.com/repos/octocat/socm/import/authors",
  "repository_url": "https://api.github.com/repos/octocat/socm"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 503 | Unavailable due to service under maintenance. | [`ReposImport503ErrorException`](../../doc/models/repos-import-503-error-exception.md) |


# Migrations Cancel-Import

Stop an import for a repository.

API method documentation: [https://docs.github.com/rest/reference/migrations#cancel-an-import](https://docs.github.com/rest/reference/migrations#cancel-an-import)

```java
CompletableFuture<Void> migrationsCancelImportAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

migrationsController.migrationsCancelImportAsync(owner, repo).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 503 | Unavailable due to service under maintenance. | [`ReposImport503ErrorException`](../../doc/models/repos-import-503-error-exception.md) |


# Migrations Get-Commit-Authors

Each type of source control system represents authors in a different way. For example, a Git commit author has a display name and an email address, but a Subversion commit author just has a username. The GitHub Importer will make the author information valid, but the author might not be correct. For example, it will change the bare Subversion username `hubot` into something like `hubot <hubot@12341234-abab-fefe-8787-fedcba987654>`.

This endpoint and the [Map a commit author](https://docs.github.com/rest/reference/migrations#map-a-commit-author) endpoint allow you to provide correct Git author information.

API method documentation: [https://docs.github.com/rest/reference/migrations#get-commit-authors](https://docs.github.com/rest/reference/migrations#get-commit-authors)

```java
CompletableFuture<List<PorterAuthor>> migrationsGetCommitAuthorsAsync(
    final String owner,
    final String repo,
    final Integer since)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `since` | `Integer` | Query, Optional | A user ID. Only return users with an ID greater than this ID. |

## Response Type

[`List<PorterAuthor>`](../../doc/models/porter-author.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

migrationsController.migrationsGetCommitAuthorsAsync(owner, repo, null).thenAccept(result -> {
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
    "id": 2268557,
    "remote_id": "nobody@fc7da526-431c-80fe-3c8c-c148ff18d7ef",
    "remote_name": "nobody",
    "email": "hubot@github.com",
    "name": "Hubot",
    "url": "https://api.github.com/repos/octocat/socm/import/authors/2268557",
    "import_url": "https://api.github.com/repos/octocat/socm/import"
  },
  {
    "id": 2268558,
    "remote_id": "svner@fc7da526-431c-80fe-3c8c-c148ff18d7ef",
    "remote_name": "svner",
    "email": "svner@fc7da526-431c-80fe-3c8c-c148ff18d7ef",
    "name": "svner",
    "url": "https://api.github.com/repos/octocat/socm/import/authors/2268558",
    "import_url": "https://api.github.com/repos/octocat/socm/import"
  },
  {
    "id": 2268559,
    "remote_id": "svner@example.com@fc7da526-431c-80fe-3c8c-c148ff18d7ef",
    "remote_name": "svner@example.com",
    "email": "svner@example.com@fc7da526-431c-80fe-3c8c-c148ff18d7ef",
    "name": "svner@example.com",
    "url": "https://api.github.com/repos/octocat/socm/import/authors/2268559",
    "import_url": "https://api.github.com/repos/octocat/socm/import"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposImportAuthors404ErrorException`](../../doc/models/repos-import-authors-404-error-exception.md) |
| 503 | Unavailable due to service under maintenance. | [`ReposImportAuthors503ErrorException`](../../doc/models/repos-import-authors-503-error-exception.md) |


# Migrations Map-Commit-Author

Update an author's identity for the import. Your application can continue updating authors any time before you push new commits to the repository.

API method documentation: [https://docs.github.com/rest/reference/migrations#map-a-commit-author](https://docs.github.com/rest/reference/migrations#map-a-commit-author)

```java
CompletableFuture<ReposImportAuthorsAuthorIdResponse> migrationsMapCommitAuthorAsync(
    final String owner,
    final String repo,
    final int authorId,
    final ReposImportAuthorsAuthorIdRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `authorId` | `int` | Template, Required | - |
| `body` | [`ReposImportAuthorsAuthorIdRequest`](../../doc/models/repos-import-authors-author-id-request.md) | Body, Optional | - |

## Response Type

[`ReposImportAuthorsAuthorIdResponse`](../../doc/models/repos-import-authors-author-id-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
int authorId = 158;
ReposImportAuthorsAuthorIdRequest body = new ReposImportAuthorsAuthorIdRequest();
body.setEmail("hubot@github.com");
body.setName("Hubot the Robot");

migrationsController.migrationsMapCommitAuthorAsync(owner, repo, authorId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 2268557,
  "remote_id": "nobody@fc7da526-431c-80fe-3c8c-c148ff18d7ef",
  "remote_name": "nobody",
  "email": "hubot@github.com",
  "name": "Hubot",
  "url": "https://api.github.com/repos/octocat/socm/import/authors/2268557",
  "import_url": "https://api.github.com/repos/octocat/socm/import"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposImportAuthorsAuthorId404ErrorException`](../../doc/models/repos-import-authors-author-id-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposImportAuthorsAuthorId422ErrorException`](../../doc/models/repos-import-authors-author-id-422-error-exception.md) |
| 503 | Unavailable due to service under maintenance. | [`ReposImportAuthorsAuthorId503ErrorException`](../../doc/models/repos-import-authors-author-id-503-error-exception.md) |


# Migrations Get-Large-Files

List files larger than 100MB found during the import

API method documentation: [https://docs.github.com/rest/reference/migrations#get-large-files](https://docs.github.com/rest/reference/migrations#get-large-files)

```java
CompletableFuture<List<PorterLargeFile>> migrationsGetLargeFilesAsync(
    final String owner,
    final String repo)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |

## Response Type

[`List<PorterLargeFile>`](../../doc/models/porter-large-file.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";

migrationsController.migrationsGetLargeFilesAsync(owner, repo).thenAccept(result -> {
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
    "ref_name": "refs/heads/master",
    "path": "foo/bar/1",
    "oid": "d3d9446802a44259755d38e6d163e820",
    "size": 10485760
  },
  {
    "ref_name": "refs/heads/master",
    "path": "foo/bar/2",
    "oid": "6512bd43d9caa6e02c990b0a82652dca",
    "size": 11534336
  },
  {
    "ref_name": "refs/heads/master",
    "path": "foo/bar/3",
    "oid": "c20ad4d76fe97759aa27a0c99bff6710",
    "size": 12582912
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 503 | Unavailable due to service under maintenance. | [`ReposImportLargeFiles503ErrorException`](../../doc/models/repos-import-large-files-503-error-exception.md) |


# Migrations Set-Lfs-Preference

You can import repositories from Subversion, Mercurial, and TFS that include files larger than 100MB. This ability is powered by [Git LFS](https://git-lfs.github.com). You can learn more about our LFS feature and working with large files [on our help site](https://docs.github.com/articles/versioning-large-files/).

API method documentation: [https://docs.github.com/rest/reference/migrations#update-git-lfs-preference](https://docs.github.com/rest/reference/migrations#update-git-lfs-preference)

```java
CompletableFuture<ReposImportLfsResponse> migrationsSetLfsPreferenceAsync(
    final String owner,
    final String repo,
    final ReposImportLfsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposImportLfsRequest`](../../doc/models/repos-import-lfs-request.md) | Body, Required | - |

## Response Type

[`ReposImportLfsResponse`](../../doc/models/repos-import-lfs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposImportLfsRequest body = new ReposImportLfsRequest();
body.setUseLfs(UseLfsEnum.OPT_IN);

migrationsController.migrationsSetLfsPreferenceAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "vcs": "subversion",
  "use_lfs": true,
  "vcs_url": "http://svn.mycompany.com/svn/myproject",
  "status": "complete",
  "status_text": "Done",
  "has_large_files": true,
  "large_files_size": 132331036,
  "large_files_count": 1,
  "authors_count": 4,
  "url": "https://api.github.com/repos/octocat/socm/import",
  "html_url": "https://import.github.com/octocat/socm/import",
  "authors_url": "https://api.github.com/repos/octocat/socm/import/authors",
  "repository_url": "https://api.github.com/repos/octocat/socm"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposImportLfs422ErrorException`](../../doc/models/repos-import-lfs-422-error-exception.md) |
| 503 | Unavailable due to service under maintenance. | [`ReposImportLfs503ErrorException`](../../doc/models/repos-import-lfs-503-error-exception.md) |


# Migrations List-for-Authenticated-User

Lists all migrations a user has started.

API method documentation: [https://docs.github.com/rest/reference/migrations#list-user-migrations](https://docs.github.com/rest/reference/migrations#list-user-migrations)

```java
CompletableFuture<List<Migration>> migrationsListForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Migration>`](../../doc/models/migration.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

migrationsController.migrationsListForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMigrations401ErrorException`](../../doc/models/user-migrations-401-error-exception.md) |
| 403 | Forbidden | [`UserMigrations403ErrorException`](../../doc/models/user-migrations-403-error-exception.md) |


# Migrations Start-for-Authenticated-User

Initiates the generation of a user migration archive.

API method documentation: [https://docs.github.com/rest/reference/migrations#start-a-user-migration](https://docs.github.com/rest/reference/migrations#start-a-user-migration)

```java
CompletableFuture<UserMigrationsResponse> migrationsStartForAuthenticatedUserAsync(
    final UserMigrationsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserMigrationsRequest`](../../doc/models/user-migrations-request.md) | Body, Required | - |

## Response Type

[`UserMigrationsResponse`](../../doc/models/user-migrations-response.md)

## Example Usage

```java
UserMigrationsRequest body = new UserMigrationsRequest();
List<String> repositories = new LinkedList<>();
repositories.add("octocat/Hello-World");

body.setRepositories(repositories);
body.setLockRepositories(true);

migrationsController.migrationsStartForAuthenticatedUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMigrations401ErrorException`](../../doc/models/user-migrations-401-error-exception.md) |
| 403 | Forbidden | [`UserMigrations403ErrorException`](../../doc/models/user-migrations-403-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserMigrations422ErrorException`](../../doc/models/user-migrations-422-error-exception.md) |


# Migrations Get-Status-for-Authenticated-User

Fetches a single user migration. The response includes the `state` of the migration, which can be one of the following values:

* `pending` - the migration hasn't started yet.
* `exporting` - the migration is in progress.
* `exported` - the migration finished successfully.
* `failed` - the migration failed.

Once the migration has been `exported` you can [download the migration archive](https://docs.github.com/rest/reference/migrations#download-a-user-migration-archive).

API method documentation: [https://docs.github.com/rest/reference/migrations#get-a-user-migration-status](https://docs.github.com/rest/reference/migrations#get-a-user-migration-status)

```java
CompletableFuture<UserMigrationsResponse> migrationsGetStatusForAuthenticatedUserAsync(
    final int migrationId,
    final List<String> exclude)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |
| `exclude` | `List<String>` | Query, Optional | - |

## Response Type

[`UserMigrationsResponse`](../../doc/models/user-migrations-response.md)

## Example Usage

```java
int migrationId = 48;
migrationsController.migrationsGetStatusForAuthenticatedUserAsync(migrationId, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMigrations401ErrorException`](../../doc/models/user-migrations-401-error-exception.md) |
| 403 | Forbidden | [`UserMigrations403ErrorException`](../../doc/models/user-migrations-403-error-exception.md) |
| 404 | Resource not found | [`UserMigrations404ErrorException`](../../doc/models/user-migrations-404-error-exception.md) |


# Migrations Get-Archive-for-Authenticated-User

Fetches the URL to download the migration archive as a `tar.gz` file. Depending on the resources your repository uses, the migration archive can contain JSON files with data for these objects:

* attachments
* bases
* commit\_comments
* issue\_comments
* issue\_events
* issues
* milestones
* organizations
* projects
* protected\_branches
* pull\_request\_reviews
* pull\_requests
* releases
* repositories
* review\_comments
* schema
* users

The archive will also contain an `attachments` directory that includes all attachment files uploaded to GitHub.com and a `repositories` directory that contains the repository's Git data.

API method documentation: [https://docs.github.com/rest/reference/migrations#download-a-user-migration-archive](https://docs.github.com/rest/reference/migrations#download-a-user-migration-archive)

```java
CompletableFuture<Void> migrationsGetArchiveForAuthenticatedUserAsync(
    final int migrationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |

## Response Type

`void`

## Example Usage

```java
int migrationId = 48;

migrationsController.migrationsGetArchiveForAuthenticatedUserAsync(migrationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMigrationsArchive401ErrorException`](../../doc/models/user-migrations-archive-401-error-exception.md) |
| 403 | Forbidden | [`UserMigrationsArchive403ErrorException`](../../doc/models/user-migrations-archive-403-error-exception.md) |


# Migrations Delete-Archive-for-Authenticated-User

Deletes a previous migration archive. Downloadable migration archives are automatically deleted after seven days. Migration metadata, which is returned in the [List user migrations](https://docs.github.com/rest/reference/migrations#list-user-migrations) and [Get a user migration status](https://docs.github.com/rest/reference/migrations#get-a-user-migration-status) endpoints, will continue to be available even after an archive is deleted.

API method documentation: [https://docs.github.com/rest/reference/migrations#delete-a-user-migration-archive](https://docs.github.com/rest/reference/migrations#delete-a-user-migration-archive)

```java
CompletableFuture<Void> migrationsDeleteArchiveForAuthenticatedUserAsync(
    final int migrationId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |

## Response Type

`void`

## Example Usage

```java
int migrationId = 48;

migrationsController.migrationsDeleteArchiveForAuthenticatedUserAsync(migrationId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMigrationsArchive401ErrorException`](../../doc/models/user-migrations-archive-401-error-exception.md) |
| 403 | Forbidden | [`UserMigrationsArchive403ErrorException`](../../doc/models/user-migrations-archive-403-error-exception.md) |
| 404 | Resource not found | [`UserMigrationsArchive404ErrorException`](../../doc/models/user-migrations-archive-404-error-exception.md) |


# Migrations Unlock-Repo-for-Authenticated-User

Unlocks a repository. You can lock repositories when you [start a user migration](https://docs.github.com/rest/reference/migrations#start-a-user-migration). Once the migration is complete you can unlock each repository to begin using it again or [delete the repository](https://docs.github.com/rest/reference/repos#delete-a-repository) if you no longer need the source data. Returns a status of `404 Not Found` if the repository is not locked.

API method documentation: [https://docs.github.com/rest/reference/migrations#unlock-a-user-repository](https://docs.github.com/rest/reference/migrations#unlock-a-user-repository)

```java
CompletableFuture<Void> migrationsUnlockRepoForAuthenticatedUserAsync(
    final int migrationId,
    final String repoName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |
| `repoName` | `String` | Template, Required | repo_name parameter |

## Response Type

`void`

## Example Usage

```java
int migrationId = 48;
String repoName = "repo_name6";

migrationsController.migrationsUnlockRepoForAuthenticatedUserAsync(migrationId, repoName).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserMigrationsReposLock401ErrorException`](../../doc/models/user-migrations-repos-lock-401-error-exception.md) |
| 403 | Forbidden | [`UserMigrationsReposLock403ErrorException`](../../doc/models/user-migrations-repos-lock-403-error-exception.md) |
| 404 | Resource not found | [`UserMigrationsReposLock404ErrorException`](../../doc/models/user-migrations-repos-lock-404-error-exception.md) |


# Migrations List-Repos-for-Authenticated-User

Lists all the repositories for this user migration.

API method documentation: [https://docs.github.com/rest/reference/migrations#list-repositories-for-a-user-migration](https://docs.github.com/rest/reference/migrations#list-repositories-for-a-user-migration)

```java
CompletableFuture<List<MinimalRepository>> migrationsListReposForAuthenticatedUserAsync(
    final int migrationId,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `migrationId` | `int` | Template, Required | The unique identifier of the migration. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<MinimalRepository>`](../../doc/models/minimal-repository.md)

## Example Usage

```java
int migrationId = 48;
Integer perPage = 30;
Integer page = 1;

migrationsController.migrationsListReposForAuthenticatedUserAsync(migrationId, perPage, page).thenAccept(result -> {
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
    "is_template": false,
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
    "has_discussions": false,
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
    "security_and_analysis": {
      "advanced_security": {
        "status": "enabled"
      },
      "secret_scanning": {
        "status": "enabled"
      },
      "secret_scanning_push_protection": {
        "status": "disabled"
      }
    }
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`UserMigrationsRepositories404ErrorException`](../../doc/models/user-migrations-repositories-404-error-exception.md) |

