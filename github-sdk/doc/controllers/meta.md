# Meta

Endpoints that give information about the API.

```java
MetaController metaController = client.getMetaController();
```

## Class Name

`MetaController`

## Methods

* [Meta Root](../../doc/controllers/meta.md#meta-root)
* [Meta Get](../../doc/controllers/meta.md#meta-get)
* [Meta Get-Octocat](../../doc/controllers/meta.md#meta-get-octocat)
* [Meta Get-All-Versions](../../doc/controllers/meta.md#meta-get-all-versions)
* [Meta Get-Zen](../../doc/controllers/meta.md#meta-get-zen)


# Meta Root

Get Hypermedia links to resources accessible in GitHub's REST API

API method documentation: [https://docs.github.com/rest/overview/resources-in-the-rest-api#root-endpoint](https://docs.github.com/rest/overview/resources-in-the-rest-api#root-endpoint)

```java
CompletableFuture<Root> metaRootAsync()
```

## Response Type

[`Root`](../../doc/models/root.md)

## Example Usage

```java
metaController.metaRootAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "current_user_url": "https://api.github.com/user",
  "current_user_authorizations_html_url": "https://github.com/settings/connections/applications{/client_id}",
  "authorizations_url": "https://api.github.com/authorizations",
  "code_search_url": "https://api.github.com/search/code?q={query}{&page,per_page,sort,order}",
  "commit_search_url": "https://api.github.com/search/commits?q={query}{&page,per_page,sort,order}",
  "emails_url": "https://api.github.com/user/emails",
  "emojis_url": "https://api.github.com/emojis",
  "events_url": "https://api.github.com/events",
  "feeds_url": "https://api.github.com/feeds",
  "followers_url": "https://api.github.com/user/followers",
  "following_url": "https://api.github.com/user/following{/target}",
  "gists_url": "https://api.github.com/gists{/gist_id}",
  "hub_url": "https://api.github.com/hub",
  "issue_search_url": "https://api.github.com/search/issues?q={query}{&page,per_page,sort,order}",
  "issues_url": "https://api.github.com/issues",
  "keys_url": "https://api.github.com/user/keys",
  "label_search_url": "https://api.github.com/search/labels?q={query}&repository_id={repository_id}{&page,per_page}",
  "notifications_url": "https://api.github.com/notifications",
  "organization_url": "https://api.github.com/orgs/{org}",
  "organization_repositories_url": "https://api.github.com/orgs/{org}/repos{?type,page,per_page,sort}",
  "organization_teams_url": "https://api.github.com/orgs/{org}/teams",
  "public_gists_url": "https://api.github.com/gists/public",
  "rate_limit_url": "https://api.github.com/rate_limit",
  "repository_url": "https://api.github.com/repos/{owner}/{repo}",
  "repository_search_url": "https://api.github.com/search/repositories?q={query}{&page,per_page,sort,order}",
  "current_user_repositories_url": "https://api.github.com/user/repos{?type,page,per_page,sort}",
  "starred_url": "https://api.github.com/user/starred{/owner}{/repo}",
  "starred_gists_url": "https://api.github.com/gists/starred",
  "topic_search_url": "https://api.github.com/search/topics?q={query}{&page,per_page}",
  "user_url": "https://api.github.com/users/{user}",
  "user_organizations_url": "https://api.github.com/user/orgs",
  "user_repositories_url": "https://api.github.com/users/{user}/repos{?type,page,per_page,sort}",
  "user_search_url": "https://api.github.com/search/users?q={query}{&page,per_page,sort,order}"
}
```


# Meta Get

Returns meta information about GitHub, including a list of GitHub's IP addresses. For more information, see "[About GitHub's IP addresses](https://docs.github.com/articles/about-github-s-ip-addresses/)."

**Note:** The IP addresses shown in the documentation's response are only example values. You must always query the API directly to get the latest list of IP addresses.

API method documentation: [https://docs.github.com/rest/reference/meta#get-github-meta-information](https://docs.github.com/rest/reference/meta#get-github-meta-information)

```java
CompletableFuture<MetaResponse> metaGetAsync()
```

## Response Type

[`MetaResponse`](../../doc/models/meta-response.md)

## Example Usage

```java
metaController.metaGetAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "verifiable_password_authentication": true,
  "ssh_key_fingerprints": {
    "SHA256_RSA": "nThbg6kXUpJWGl7E1IGOCspRomTxdCARLviKw6E5SY8",
    "SHA256_DSA": "br9IjFspm1vxR3iA35FWE+4VTyz1hYVLIE2t1/CeyWQ",
    "SHA256_ECDSA": "p2QAMXNIC1TJYWeIOttrVc98/R1BUFWu3/LiyKgUfQM",
    "SHA256_ED25519": "+DiY3wvvV6TuJJhbpZisF/zLDA0zPMSvHdkr4UvCOqU"
  },
  "ssh_keys": [
    "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIOMqqnkVzrm0SdG6UOoqKLsabgH5C9okWi0dh2l9GKJl",
    "ecdsa-sha2-nistp256 AAAAE2VjZHNhLXNoYTItbmlzdHAyNTYAAAAIbmlzdHAyNTYAAABBBEmKSENjQEezOmxkZMy7opKgwFB9nkt5YRrYMjNuG5N87uRgg6CLrbo5wAdT/y6v0mKV0U2w0WZ2YB/++Tpockg=",
    "ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAQEAq2A7hRGmdnm9tUDbO9IDSwBK6TbQa+PXYPCPy6rbTrTtw7PHkccKrpp0yVhp5HdEIcKr6pLlVDBfOLX9QUsyCOV0wzfjIJNlGEYsdlLJizHhbn2mUjvSAHQqZETYP81eFzLQNnPHt4EVVUh7VfDESU84KezmD5QlWpXLmvU31/yMf+Se8xhHTvKSCZIFImWwoG6mbUoWf9nzpIoaSjB+weqqUUmpaaasXVal72J+UX2B+2RPW3RcT0eOzQgqlJL3RKrTJvdsjE3JEAvGq3lGHSZXy28G3skua2SmVi/w4yCE6gbODqnTWlg7+wC604ydGXA8VJiS5ap43JXiUFFAaQ=="
  ],
  "hooks": [
    "192.30.252.0/22"
  ],
  "web": [
    "192.30.252.0/22",
    "185.199.108.0/22"
  ],
  "api": [
    "192.30.252.0/22",
    "185.199.108.0/22"
  ],
  "git": [
    "192.30.252.0/22"
  ],
  "packages": [
    "192.30.252.0/22"
  ],
  "pages": [
    "192.30.252.153/32",
    "192.30.252.154/32"
  ],
  "importer": [
    "54.158.161.132",
    "54.226.70.38"
  ],
  "actions": [
    "13.64.0.0/16",
    "13.65.0.0/16"
  ],
  "dependabot": [
    "54.158.161.132"
  ]
}
```


# Meta Get-Octocat

Get the octocat as ASCII art

API method documentation: [https://docs.github.com/rest/reference/meta#get-octocat](https://docs.github.com/rest/reference/meta#get-octocat)

```java
CompletableFuture<DynamicResponse> metaGetOctocatAsync(
    final String s)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `s` | `String` | Query, Optional | The words to show in Octocat's speech bubble |

## Response Type

`DynamicResponse`

## Example Usage

```java
metaController.metaGetOctocatAsync(null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Meta Get-All-Versions

Get all supported GitHub API versions.

API method documentation: [https://docs.github.com/rest/reference/meta#get-all-api-versions](https://docs.github.com/rest/reference/meta#get-all-api-versions)

```java
CompletableFuture<List<LocalDate>> metaGetAllVersionsAsync()
```

## Response Type

`List<LocalDate>`

## Example Usage

```java
metaController.metaGetAllVersionsAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
[
  "2021-01-01",
  "2021-06-01",
  "2022-01-01"
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Versions404ErrorException`](../../doc/models/versions-404-error-exception.md) |


# Meta Get-Zen

Get a random sentence from the Zen of GitHub

API method documentation: [https://docs.github.com/rest/meta#get-the-zen-of-github](https://docs.github.com/rest/meta#get-the-zen-of-github)

```java
CompletableFuture<String> metaGetZenAsync()
```

## Response Type

`String`

## Example Usage

```java
metaController.metaGetZenAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
"Responsive is better than fast"
```

