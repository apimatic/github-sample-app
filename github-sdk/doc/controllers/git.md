# Git

Raw Git functionality.

```java
GitController gitController = client.getGitController();
```

## Class Name

`GitController`

## Methods

* [Git Create-Blob](../../doc/controllers/git.md#git-create-blob)
* [Git Get-Blob](../../doc/controllers/git.md#git-get-blob)
* [Git Create-Commit](../../doc/controllers/git.md#git-create-commit)
* [Git Get-Commit](../../doc/controllers/git.md#git-get-commit)
* [Git List-Matching-Refs](../../doc/controllers/git.md#git-list-matching-refs)
* [Git Get-Ref](../../doc/controllers/git.md#git-get-ref)
* [Git Create-Ref](../../doc/controllers/git.md#git-create-ref)
* [Git Update-Ref](../../doc/controllers/git.md#git-update-ref)
* [Git Delete-Ref](../../doc/controllers/git.md#git-delete-ref)
* [Git Create-Tag](../../doc/controllers/git.md#git-create-tag)
* [Git Get-Tag](../../doc/controllers/git.md#git-get-tag)
* [Git Create-Tree](../../doc/controllers/git.md#git-create-tree)
* [Git Get-Tree](../../doc/controllers/git.md#git-get-tree)


# Git Create-Blob

Create a blob

API method documentation: [https://docs.github.com/rest/reference/git#create-a-blob](https://docs.github.com/rest/reference/git#create-a-blob)

```java
CompletableFuture<Commit3> gitCreateBlobAsync(
    final String owner,
    final String repo,
    final ReposGitBlobsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposGitBlobsRequest`](../../doc/models/repos-git-blobs-request.md) | Body, Required | - |

## Response Type

[`Commit3`](../../doc/models/commit-3.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposGitBlobsRequest body = new ReposGitBlobsRequest();
body.setContent("Content of the blob");
body.setEncoding("utf-8");

gitController.gitCreateBlobAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "url": "https://api.github.com/repos/octocat/example/git/blobs/3a0f86fb8db8eea7ccbb9a95f325ddbedfb25e15",
  "sha": "3a0f86fb8db8eea7ccbb9a95f325ddbedfb25e15"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposGitBlobs403ErrorException`](../../doc/models/repos-git-blobs-403-error-exception.md) |
| 404 | Resource not found | [`ReposGitBlobs404ErrorException`](../../doc/models/repos-git-blobs-404-error-exception.md) |
| 409 | Conflict | [`ReposGitBlobs409ErrorException`](../../doc/models/repos-git-blobs-409-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitBlobs422ErrorException`](../../doc/models/repos-git-blobs-422-error-exception.md) |


# Git Get-Blob

The `content` in the response will always be Base64 encoded.

_Note_: This API supports blobs up to 100 megabytes in size.

API method documentation: [https://docs.github.com/rest/reference/git#get-a-blob](https://docs.github.com/rest/reference/git#get-a-blob)

```java
CompletableFuture<ReposGitBlobsFileShaResponse> gitGetBlobAsync(
    final String owner,
    final String repo,
    final String fileSha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `fileSha` | `String` | Template, Required | - |

## Response Type

[`ReposGitBlobsFileShaResponse`](../../doc/models/repos-git-blobs-file-sha-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String fileSha = "file_sha8";

gitController.gitGetBlobAsync(owner, repo, fileSha).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "content": "Q29udGVudCBvZiB0aGUgYmxvYg==",
  "encoding": "base64",
  "url": "https://api.github.com/repos/octocat/example/git/blobs/3a0f86fb8db8eea7ccbb9a95f325ddbedfb25e15",
  "sha": "3a0f86fb8db8eea7ccbb9a95f325ddbedfb25e15",
  "size": 19,
  "node_id": "Q29udGVudCBvZiB0aGUgYmxvYg=="
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposGitBlobsFileSha403ErrorException`](../../doc/models/repos-git-blobs-file-sha-403-error-exception.md) |
| 404 | Resource not found | [`ReposGitBlobsFileSha404ErrorException`](../../doc/models/repos-git-blobs-file-sha-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitBlobsFileSha422ErrorException`](../../doc/models/repos-git-blobs-file-sha-422-error-exception.md) |


# Git Create-Commit

Creates a new Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).

**Signature verification object**

The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:

| Name | Type | Description |
| ---- | ---- | ----------- |
| `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
| `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the table below. |
| `signature` | `string` | The signature that was extracted from the commit. |
| `payload` | `string` | The value that was signed. |

These are the possible values for `reason` in the `verification` object:

| Value | Description |
| ----- | ----------- |
| `expired_key` | The key that made the signature is expired. |
| `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
| `gpgverify_error` | There was an error communicating with the signature verification service. |
| `gpgverify_unavailable` | The signature verification service is currently unavailable. |
| `unsigned` | The object does not include a signature. |
| `unknown_signature_type` | A non-PGP signature was found in the commit. |
| `no_user` | No user was associated with the `committer` email address in the commit. |
| `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
| `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
| `unknown_key` | The key that made the signature has not been registered with any user's account. |
| `malformed_signature` | There was an error parsing the signature. |
| `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
| `valid` | None of the above errors applied, so the signature is considered to be verified. |

API method documentation: [https://docs.github.com/rest/reference/git#create-a-commit](https://docs.github.com/rest/reference/git#create-a-commit)

```java
CompletableFuture<ReposGitCommitsResponse> gitCreateCommitAsync(
    final String owner,
    final String repo,
    final ReposGitCommitsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposGitCommitsRequest`](../../doc/models/repos-git-commits-request.md) | Body, Required | - |

## Response Type

[`ReposGitCommitsResponse`](../../doc/models/repos-git-commits-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposGitCommitsRequest body = new ReposGitCommitsRequest();
body.setMessage("my commit message");
body.setTree("827efc6d56897b048c772eb4087f854f46256132");
List<String> parents = new LinkedList<>();
parents.add("7d1b31e74ee336d15cbd21741bc88a537ed063a0");

body.setParents(parents);
Author18 author = new Author18();
author.setName("Mona Octocat");
author.setEmail("octocat@github.com");
author.setDate(LocalDateTime.parse("2008-07-09T10:13:30+06:00", DateTimeFormatter.ISO_DATE_TIME));

body.setAuthor(author);
body.setSignature("-----BEGIN PGP SIGNATURE-----\\n\\niQIzBAABAQAdFiEESn/54jMNIrGSE6Tp6cQjvhfv7nAFAlnT71cACgkQ6cQjvhfv\\n7nCWwA//XVqBKWO0zF+bZl6pggvky3Oc2j1pNFuRWZ29LXpNuD5WUGXGG209B0hI\\nDkmcGk19ZKUTnEUJV2Xd0R7AW01S/YSub7OYcgBkI7qUE13FVHN5ln1KvH2all2n\\n2+JCV1HcJLEoTjqIFZSSu/sMdhkLQ9/NsmMAzpf/iIM0nQOyU4YRex9eD1bYj6nA\\nOQPIDdAuaTQj1gFPHYLzM4zJnCqGdRlg0sOM/zC5apBNzIwlgREatOYQSCfCKV7k\\nnrU34X8b9BzQaUx48Qa+Dmfn5KQ8dl27RNeWAqlkuWyv3pUauH9UeYW+KyuJeMkU\\n+NyHgAsWFaCFl23kCHThbLStMZOYEnGagrd0hnm1TPS4GJkV4wfYMwnI4KuSlHKB\\njHl3Js9vNzEUQipQJbgCgTiWvRJoK3ENwBTMVkKHaqT4x9U4Jk/XZB6Q8MA09ezJ\\n3QgiTjTAGcum9E9QiJqMYdWQPWkaBIRRz5cET6HPB48YNXAAUsfmuYsGrnVLYbG+\\nUpC6I97VybYHTy2O9XSGoaLeMI9CsFn38ycAxxbWagk5mhclNTP5mezIq6wKSwmr\\nX11FW3n1J23fWZn5HJMBsRnUCgzqzX3871IqLYHqRJ/bpZ4h20RhTyPj5c/z7QXp\\neSakNQMfbbMcljkha+ZMuVQX1K9aRlVqbmv3ZMWh+OijLYVU2bc=\\n=5Io4\\n-----END PGP SIGNATURE-----\\n");

gitController.gitCreateCommitAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
  "node_id": "MDY6Q29tbWl0NzYzODQxN2RiNmQ1OWYzYzQzMWQzZTFmMjYxY2M2MzcxNTU2ODRjZA==",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/7638417db6d59f3c431d3e1f261cc637155684cd",
  "author": {
    "date": "2014-11-07T22:01:45Z",
    "name": "Monalisa Octocat",
    "email": "octocat@github.com"
  },
  "committer": {
    "date": "2014-11-07T22:01:45Z",
    "name": "Monalisa Octocat",
    "email": "octocat@github.com"
  },
  "message": "my commit message",
  "tree": {
    "url": "https://api.github.com/repos/octocat/Hello-World/git/trees/827efc6d56897b048c772eb4087f854f46256132",
    "sha": "827efc6d56897b048c772eb4087f854f46256132"
  },
  "parents": [
    {
      "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/7d1b31e74ee336d15cbd21741bc88a537ed063a0",
      "sha": "7d1b31e74ee336d15cbd21741bc88a537ed063a0",
      "html_url": "https://github.com/octocat/Hello-World/commit/7d1b31e74ee336d15cbd21741bc88a537ed063a0"
    }
  ],
  "verification": {
    "verified": false,
    "reason": "unsigned",
    "signature": null,
    "payload": null
  },
  "html_url": "https://github.com/octocat/Hello-World/commit/7638417db6d59f3c431d3e1f261cc637155684cd"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposGitCommits404ErrorException`](../../doc/models/repos-git-commits-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitCommits422ErrorException`](../../doc/models/repos-git-commits-422-error-exception.md) |


# Git Get-Commit

Gets a Git [commit object](https://git-scm.com/book/en/v1/Git-Internals-Git-Objects#Commit-Objects).

**Signature verification object**

The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:

| Name | Type | Description |
| ---- | ---- | ----------- |
| `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
| `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in the table below. |
| `signature` | `string` | The signature that was extracted from the commit. |
| `payload` | `string` | The value that was signed. |

These are the possible values for `reason` in the `verification` object:

| Value | Description |
| ----- | ----------- |
| `expired_key` | The key that made the signature is expired. |
| `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
| `gpgverify_error` | There was an error communicating with the signature verification service. |
| `gpgverify_unavailable` | The signature verification service is currently unavailable. |
| `unsigned` | The object does not include a signature. |
| `unknown_signature_type` | A non-PGP signature was found in the commit. |
| `no_user` | No user was associated with the `committer` email address in the commit. |
| `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
| `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
| `unknown_key` | The key that made the signature has not been registered with any user's account. |
| `malformed_signature` | There was an error parsing the signature. |
| `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
| `valid` | None of the above errors applied, so the signature is considered to be verified. |

API method documentation: [https://docs.github.com/rest/reference/git#get-a-commit](https://docs.github.com/rest/reference/git#get-a-commit)

```java
CompletableFuture<ReposGitCommitsCommitShaResponse> gitGetCommitAsync(
    final String owner,
    final String repo,
    final String commitSha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `commitSha` | `String` | Template, Required | The SHA of the commit. |

## Response Type

[`ReposGitCommitsCommitShaResponse`](../../doc/models/repos-git-commits-commit-sha-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String commitSha = "commit_sha4";

gitController.gitGetCommitAsync(owner, repo, commitSha).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "sha": "7638417db6d59f3c431d3e1f261cc637155684cd",
  "node_id": "MDY6Q29tbWl0NmRjYjA5YjViNTc4NzVmMzM0ZjYxYWViZWQ2OTVlMmU0MTkzZGI1ZQ==",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/7638417db6d59f3c431d3e1f261cc637155684cd",
  "html_url": "https://github.com/octocat/Hello-World/commit/7638417db6d59f3c431d3e1f261cc637155684cd",
  "author": {
    "date": "2014-11-07T22:01:45Z",
    "name": "Monalisa Octocat",
    "email": "octocat@github.com"
  },
  "committer": {
    "date": "2014-11-07T22:01:45Z",
    "name": "Monalisa Octocat",
    "email": "octocat@github.com"
  },
  "message": "added readme, because im a good github citizen",
  "tree": {
    "url": "https://api.github.com/repos/octocat/Hello-World/git/trees/691272480426f78a0138979dd3ce63b77f706feb",
    "sha": "691272480426f78a0138979dd3ce63b77f706feb"
  },
  "parents": [
    {
      "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/1acc419d4d6a9ce985db7be48c6349a0475975b5",
      "sha": "1acc419d4d6a9ce985db7be48c6349a0475975b5",
      "html_url": "https://github.com/octocat/Hello-World/commit/7638417db6d59f3c431d3e1f261cc637155684cd"
    }
  ],
  "verification": {
    "verified": false,
    "reason": "unsigned",
    "signature": null,
    "payload": null
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposGitCommitsCommitSha404ErrorException`](../../doc/models/repos-git-commits-commit-sha-404-error-exception.md) |


# Git List-Matching-Refs

Returns an array of references from your Git database that match the supplied name. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't exist in the repository, but existing refs start with `:ref`, they will be returned as an array.

When you use this endpoint without providing a `:ref`, it will return an array of all the references from your Git database, including notes and stashes if they exist on the server. Anything in the namespace is returned, not just `heads` and `tags`.

**Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".

If you request matching references for a branch named `feature` but the branch `feature` doesn't exist, the response can still include other matching head refs that start with the word `feature`, such as `featureA` and `featureB`.

API method documentation: [https://docs.github.com/rest/reference/git#list-matching-references](https://docs.github.com/rest/reference/git#list-matching-references)

```java
CompletableFuture<List<GitReference>> gitListMatchingRefsAsync(
    final String owner,
    final String repo,
    final String ref)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Template, Required | ref parameter |

## Response Type

[`List<GitReference>`](../../doc/models/git-reference.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "ref0";

gitController.gitListMatchingRefsAsync(owner, repo, ref).thenAccept(result -> {
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
    "ref": "refs/heads/feature-a",
    "node_id": "MDM6UmVmcmVmcy9oZWFkcy9mZWF0dXJlLWE=",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/refs/heads/feature-a",
    "object": {
      "type": "commit",
      "sha": "aa218f56b14c9653891f9e74264a383fa43fefbd",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/aa218f56b14c9653891f9e74264a383fa43fefbd"
    }
  },
  {
    "ref": "refs/heads/feature-b",
    "node_id": "MDM6UmVmcmVmcy9oZWFkcy9mZWF0dXJlLWI=",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/refs/heads/feature-b",
    "object": {
      "type": "commit",
      "sha": "612077ae6dffb4d2fbd8ce0cccaa58893b07b5ac",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/612077ae6dffb4d2fbd8ce0cccaa58893b07b5ac"
    }
  }
]
```


# Git Get-Ref

Returns a single reference from your Git database. The `:ref` in the URL must be formatted as `heads/<branch name>` for branches and `tags/<tag name>` for tags. If the `:ref` doesn't match an existing ref, a `404` is returned.

**Note:** You need to explicitly [request a pull request](https://docs.github.com/rest/reference/pulls#get-a-pull-request) to trigger a test merge commit, which checks the mergeability of pull requests. For more information, see "[Checking mergeability of pull requests](https://docs.github.com/rest/guides/getting-started-with-the-git-database-api#checking-mergeability-of-pull-requests)".

API method documentation: [https://docs.github.com/rest/reference/git#get-a-reference](https://docs.github.com/rest/reference/git#get-a-reference)

```java
CompletableFuture<ReposGitRefRefResponse> gitGetRefAsync(
    final String owner,
    final String repo,
    final String ref)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Template, Required | ref parameter |

## Response Type

[`ReposGitRefRefResponse`](../../doc/models/repos-git-ref-ref-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "ref0";

gitController.gitGetRefAsync(owner, repo, ref).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "ref": "refs/heads/featureA",
  "node_id": "MDM6UmVmcmVmcy9oZWFkcy9mZWF0dXJlQQ==",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/refs/heads/featureA",
  "object": {
    "type": "commit",
    "sha": "aa218f56b14c9653891f9e74264a383fa43fefbd",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/aa218f56b14c9653891f9e74264a383fa43fefbd"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposGitRefRef404ErrorException`](../../doc/models/repos-git-ref-ref-404-error-exception.md) |


# Git Create-Ref

Creates a reference for your repository. You are unable to create new references for empty repositories, even if the commit SHA-1 hash used exists. Empty repositories are repositories without branches.

API method documentation: [https://docs.github.com/rest/reference/git#create-a-reference](https://docs.github.com/rest/reference/git#create-a-reference)

```java
CompletableFuture<ReposGitRefsResponse> gitCreateRefAsync(
    final String owner,
    final String repo,
    final ReposGitRefsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposGitRefsRequest`](../../doc/models/repos-git-refs-request.md) | Body, Required | - |

## Response Type

[`ReposGitRefsResponse`](../../doc/models/repos-git-refs-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposGitRefsRequest body = new ReposGitRefsRequest();
body.setRef("refs/heads/featureA");
body.setSha("aa218f56b14c9653891f9e74264a383fa43fefbd");

gitController.gitCreateRefAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "ref": "refs/heads/featureA",
  "node_id": "MDM6UmVmcmVmcy9oZWFkcy9mZWF0dXJlQQ==",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/refs/heads/featureA",
  "object": {
    "type": "commit",
    "sha": "aa218f56b14c9653891f9e74264a383fa43fefbd",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/aa218f56b14c9653891f9e74264a383fa43fefbd"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitRefs422ErrorException`](../../doc/models/repos-git-refs-422-error-exception.md) |


# Git Update-Ref

Update a reference

API method documentation: [https://docs.github.com/rest/reference/git#update-a-reference](https://docs.github.com/rest/reference/git#update-a-reference)

```java
CompletableFuture<ReposGitRefsRefResponse> gitUpdateRefAsync(
    final String owner,
    final String repo,
    final String ref,
    final ReposGitRefsRefRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Template, Required | The name of the fully qualified reference to update. For example, `refs/heads/master`. If the value doesn't start with `refs` and have at least two slashes, it will be rejected. |
| `body` | [`ReposGitRefsRefRequest`](../../doc/models/repos-git-refs-ref-request.md) | Body, Required | - |

## Response Type

[`ReposGitRefsRefResponse`](../../doc/models/repos-git-refs-ref-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "refs/head/master";
ReposGitRefsRefRequest body = new ReposGitRefsRefRequest();
body.setSha("aa218f56b14c9653891f9e74264a383fa43fefbd");
body.setForce(true);

gitController.gitUpdateRefAsync(owner, repo, ref, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "ref": "refs/heads/featureA",
  "node_id": "MDM6UmVmcmVmcy9oZWFkcy9mZWF0dXJlQQ==",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/refs/heads/featureA",
  "object": {
    "type": "commit",
    "sha": "aa218f56b14c9653891f9e74264a383fa43fefbd",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/aa218f56b14c9653891f9e74264a383fa43fefbd"
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitRefsRef422ErrorException`](../../doc/models/repos-git-refs-ref-422-error-exception.md) |


# Git Delete-Ref

Delete a reference

API method documentation: [https://docs.github.com/rest/reference/git#delete-a-reference](https://docs.github.com/rest/reference/git#delete-a-reference)

```java
CompletableFuture<Void> gitDeleteRefAsync(
    final String owner,
    final String repo,
    final String ref)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `ref` | `String` | Template, Required | ref parameter |

## Response Type

`void`

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String ref = "ref0";

gitController.gitDeleteRefAsync(owner, repo, ref).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitRefsRef422ErrorException`](../../doc/models/repos-git-refs-ref-422-error-exception.md) |


# Git Create-Tag

Note that creating a tag object does not create the reference that makes a tag in Git. If you want to create an annotated tag in Git, you have to do this call to create the tag object, and then [create](https://docs.github.com/rest/reference/git#create-a-reference) the `refs/tags/[tag]` reference. If you want to create a lightweight tag, you only have to [create](https://docs.github.com/rest/reference/git#create-a-reference) the tag reference - this call would be unnecessary.

**Signature verification object**

The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:

| Name | Type | Description |
| ---- | ---- | ----------- |
| `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
| `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
| `signature` | `string` | The signature that was extracted from the commit. |
| `payload` | `string` | The value that was signed. |

These are the possible values for `reason` in the `verification` object:

| Value | Description |
| ----- | ----------- |
| `expired_key` | The key that made the signature is expired. |
| `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
| `gpgverify_error` | There was an error communicating with the signature verification service. |
| `gpgverify_unavailable` | The signature verification service is currently unavailable. |
| `unsigned` | The object does not include a signature. |
| `unknown_signature_type` | A non-PGP signature was found in the commit. |
| `no_user` | No user was associated with the `committer` email address in the commit. |
| `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
| `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
| `unknown_key` | The key that made the signature has not been registered with any user's account. |
| `malformed_signature` | There was an error parsing the signature. |
| `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
| `valid` | None of the above errors applied, so the signature is considered to be verified. |

API method documentation: [https://docs.github.com/rest/reference/git#create-a-tag-object](https://docs.github.com/rest/reference/git#create-a-tag-object)

```java
CompletableFuture<ReposGitTagsResponse> gitCreateTagAsync(
    final String owner,
    final String repo,
    final ReposGitTagsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposGitTagsRequest`](../../doc/models/repos-git-tags-request.md) | Body, Required | - |

## Response Type

[`ReposGitTagsResponse`](../../doc/models/repos-git-tags-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposGitTagsRequest body = new ReposGitTagsRequest();
body.setTag("v0.0.1");
body.setMessage("initial version");
body.setObject("c3d0be41ecbe669545ee3e94d31ed9a4bc91ee3c");
body.setType(Type613Enum.COMMIT);
Tagger12 tagger = new Tagger12();
tagger.setName("Monalisa Octocat");
tagger.setEmail("octocat@github.com");
tagger.setDate(LocalDateTime.parse("2011-06-18T02:53:35+05:00", DateTimeFormatter.ISO_DATE_TIME));

body.setTagger(tagger);

gitController.gitCreateTagAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "node_id": "MDM6VGFnOTQwYmQzMzYyNDhlZmFlMGY5ZWU1YmM3YjJkNWM5ODU4ODdiMTZhYw==",
  "tag": "v0.0.1",
  "sha": "940bd336248efae0f9ee5bc7b2d5c985887b16ac",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/tags/940bd336248efae0f9ee5bc7b2d5c985887b16ac",
  "message": "initial version",
  "tagger": {
    "name": "Monalisa Octocat",
    "email": "octocat@github.com",
    "date": "2014-11-07T22:01:45Z"
  },
  "object": {
    "type": "commit",
    "sha": "c3d0be41ecbe669545ee3e94d31ed9a4bc91ee3c",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/c3d0be41ecbe669545ee3e94d31ed9a4bc91ee3c"
  },
  "verification": {
    "verified": false,
    "reason": "unsigned",
    "signature": null,
    "payload": null
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitTags422ErrorException`](../../doc/models/repos-git-tags-422-error-exception.md) |


# Git Get-Tag

**Signature verification object**

The response will include a `verification` object that describes the result of verifying the commit's signature. The following fields are included in the `verification` object:

| Name | Type | Description |
| ---- | ---- | ----------- |
| `verified` | `boolean` | Indicates whether GitHub considers the signature in this commit to be verified. |
| `reason` | `string` | The reason for verified value. Possible values and their meanings are enumerated in table below. |
| `signature` | `string` | The signature that was extracted from the commit. |
| `payload` | `string` | The value that was signed. |

These are the possible values for `reason` in the `verification` object:

| Value | Description |
| ----- | ----------- |
| `expired_key` | The key that made the signature is expired. |
| `not_signing_key` | The "signing" flag is not among the usage flags in the GPG key that made the signature. |
| `gpgverify_error` | There was an error communicating with the signature verification service. |
| `gpgverify_unavailable` | The signature verification service is currently unavailable. |
| `unsigned` | The object does not include a signature. |
| `unknown_signature_type` | A non-PGP signature was found in the commit. |
| `no_user` | No user was associated with the `committer` email address in the commit. |
| `unverified_email` | The `committer` email address in the commit was associated with a user, but the email address is not verified on her/his account. |
| `bad_email` | The `committer` email address in the commit is not included in the identities of the PGP key that made the signature. |
| `unknown_key` | The key that made the signature has not been registered with any user's account. |
| `malformed_signature` | There was an error parsing the signature. |
| `invalid` | The signature could not be cryptographically verified using the key whose key-id was found in the signature. |
| `valid` | None of the above errors applied, so the signature is considered to be verified. |

API method documentation: [https://docs.github.com/rest/reference/git#get-a-tag](https://docs.github.com/rest/reference/git#get-a-tag)

```java
CompletableFuture<ReposGitTagsTagShaResponse> gitGetTagAsync(
    final String owner,
    final String repo,
    final String tagSha)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `tagSha` | `String` | Template, Required | - |

## Response Type

[`ReposGitTagsTagShaResponse`](../../doc/models/repos-git-tags-tag-sha-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String tagSha = "tag_sha0";

gitController.gitGetTagAsync(owner, repo, tagSha).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "node_id": "MDM6VGFnOTQwYmQzMzYyNDhlZmFlMGY5ZWU1YmM3YjJkNWM5ODU4ODdiMTZhYw==",
  "tag": "v0.0.1",
  "sha": "940bd336248efae0f9ee5bc7b2d5c985887b16ac",
  "url": "https://api.github.com/repos/octocat/Hello-World/git/tags/940bd336248efae0f9ee5bc7b2d5c985887b16ac",
  "message": "initial version",
  "tagger": {
    "name": "Monalisa Octocat",
    "email": "octocat@github.com",
    "date": "2014-11-07T22:01:45Z"
  },
  "object": {
    "type": "commit",
    "sha": "c3d0be41ecbe669545ee3e94d31ed9a4bc91ee3c",
    "url": "https://api.github.com/repos/octocat/Hello-World/git/commits/c3d0be41ecbe669545ee3e94d31ed9a4bc91ee3c"
  },
  "verification": {
    "verified": false,
    "reason": "unsigned",
    "signature": null,
    "payload": null
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposGitTagsTagSha404ErrorException`](../../doc/models/repos-git-tags-tag-sha-404-error-exception.md) |


# Git Create-Tree

The tree creation API accepts nested entries. If you specify both a tree and a nested path modifying that tree, this endpoint will overwrite the contents of the tree with the new path contents, and create a new tree structure.

If you use this endpoint to add, delete, or modify the file contents in a tree, you will need to commit the tree and then update a branch to point to the commit. For more information see "[Create a commit](https://docs.github.com/rest/reference/git#create-a-commit)" and "[Update a reference](https://docs.github.com/rest/reference/git#update-a-reference)."

Returns an error if you try to delete a file that does not exist.

API method documentation: [https://docs.github.com/rest/reference/git#create-a-tree](https://docs.github.com/rest/reference/git#create-a-tree)

```java
CompletableFuture<ReposGitTreesResponse> gitCreateTreeAsync(
    final String owner,
    final String repo,
    final ReposGitTreesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `body` | [`ReposGitTreesRequest`](../../doc/models/repos-git-trees-request.md) | Body, Required | - |

## Response Type

[`ReposGitTreesResponse`](../../doc/models/repos-git-trees-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
ReposGitTreesRequest body = new ReposGitTreesRequest();
List<Tree7> tree = new LinkedList<>();
Tree7 tree0 = new Tree7();
tree0.setPath("file.rb");
tree0.setMode(Mode1Enum.ENUM_100644);
tree0.setType(Type614Enum.BLOB);
tree0.setSha("44b4fc6d56897b048c772eb4087f854f46256132");

tree.add(tree0);

body.setTree(tree);
body.setBaseTree("9fb037999f264ba9a7fc6274d15fa3ae2ab98312");

gitController.gitCreateTreeAsync(owner, repo, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "sha": "cd8274d15fa3ae2ab983129fb037999f264ba9a7",
  "url": "https://api.github.com/repos/octocat/Hello-World/trees/cd8274d15fa3ae2ab983129fb037999f264ba9a7",
  "tree": [
    {
      "path": "file.rb",
      "mode": "100644",
      "type": "blob",
      "size": 132,
      "sha": "7c258a9869f33c1e1e1f74fbb32f07c86cb5a75b",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/blobs/7c258a9869f33c1e1e1f74fbb32f07c86cb5a75b"
    }
  ],
  "truncated": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 403 | Forbidden | [`ReposGitTrees403ErrorException`](../../doc/models/repos-git-trees-403-error-exception.md) |
| 404 | Resource not found | [`ReposGitTrees404ErrorException`](../../doc/models/repos-git-trees-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitTrees422ErrorException`](../../doc/models/repos-git-trees-422-error-exception.md) |


# Git Get-Tree

Returns a single tree using the SHA1 value for that tree.

If `truncated` is `true` in the response then the number of items in the `tree` array exceeded our maximum limit. If you need to fetch more items, use the non-recursive method of fetching trees, and fetch one sub-tree at a time.

**Note**: The limit for the `tree` array is 100,000 entries with a maximum size of 7 MB when using the `recursive` parameter.

API method documentation: [https://docs.github.com/rest/reference/git#get-a-tree](https://docs.github.com/rest/reference/git#get-a-tree)

```java
CompletableFuture<ReposGitTreesTreeShaResponse> gitGetTreeAsync(
    final String owner,
    final String repo,
    final String treeSha,
    final String recursive)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `owner` | `String` | Template, Required | The account owner of the repository. The name is not case sensitive. |
| `repo` | `String` | Template, Required | The name of the repository. The name is not case sensitive. |
| `treeSha` | `String` | Template, Required | - |
| `recursive` | `String` | Query, Optional | Setting this parameter to any value returns the objects or subtrees referenced by the tree specified in `:tree_sha`. For example, setting `recursive` to any of the following will enable returning objects or subtrees: `0`, `1`, `"true"`, and `"false"`. Omit this parameter to prevent recursively returning objects or subtrees. |

## Response Type

[`ReposGitTreesTreeShaResponse`](../../doc/models/repos-git-trees-tree-sha-response.md)

## Example Usage

```java
String owner = "owner4";
String repo = "repo4";
String treeSha = "tree_sha8";

gitController.gitGetTreeAsync(owner, repo, treeSha, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "sha": "9fb037999f264ba9a7fc6274d15fa3ae2ab98312",
  "url": "https://api.github.com/repos/octocat/Hello-World/trees/9fb037999f264ba9a7fc6274d15fa3ae2ab98312",
  "tree": [
    {
      "path": "file.rb",
      "mode": "100644",
      "type": "blob",
      "size": 30,
      "sha": "44b4fc6d56897b048c772eb4087f854f46256132",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/blobs/44b4fc6d56897b048c772eb4087f854f46256132"
    },
    {
      "path": "subdir",
      "mode": "040000",
      "type": "tree",
      "sha": "f484d249c660418515fb01c2b9662073663c242e",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/blobs/f484d249c660418515fb01c2b9662073663c242e"
    },
    {
      "path": "exec_file",
      "mode": "100755",
      "type": "blob",
      "size": 75,
      "sha": "45b983be36b73c0788dc9cbcb76cbb80fc7bb057",
      "url": "https://api.github.com/repos/octocat/Hello-World/git/blobs/45b983be36b73c0788dc9cbcb76cbb80fc7bb057"
    }
  ],
  "truncated": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`ReposGitTreesTreeSha404ErrorException`](../../doc/models/repos-git-trees-tree-sha-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`ReposGitTreesTreeSha422ErrorException`](../../doc/models/repos-git-trees-tree-sha-422-error-exception.md) |

