# Users

Interact with and view information about users and also current user.

```java
UsersController usersController = client.getUsersController();
```

## Class Name

`UsersController`

## Methods

* [Users Get-Authenticated](../../doc/controllers/users.md#users-get-authenticated)
* [Users Update-Authenticated](../../doc/controllers/users.md#users-update-authenticated)
* [Users List-Blocked-by-Authenticated-User](../../doc/controllers/users.md#users-list-blocked-by-authenticated-user)
* [Users Check-Blocked](../../doc/controllers/users.md#users-check-blocked)
* [Users Block](../../doc/controllers/users.md#users-block)
* [Users Unblock](../../doc/controllers/users.md#users-unblock)
* [Users Set-Primary-Email-Visibility-for-Authenticated-User](../../doc/controllers/users.md#users-set-primary-email-visibility-for-authenticated-user)
* [Users List-Emails-for-Authenticated-User](../../doc/controllers/users.md#users-list-emails-for-authenticated-user)
* [Users Add-Email-for-Authenticated-User](../../doc/controllers/users.md#users-add-email-for-authenticated-user)
* [Users Delete-Email-for-Authenticated-User](../../doc/controllers/users.md#users-delete-email-for-authenticated-user)
* [Users List-Followers-for-Authenticated-User](../../doc/controllers/users.md#users-list-followers-for-authenticated-user)
* [Users List-Followed-by-Authenticated-User](../../doc/controllers/users.md#users-list-followed-by-authenticated-user)
* [Users Check-Person-Is-Followed-by-Authenticated](../../doc/controllers/users.md#users-check-person-is-followed-by-authenticated)
* [Users Follow](../../doc/controllers/users.md#users-follow)
* [Users Unfollow](../../doc/controllers/users.md#users-unfollow)
* [Users List-Gpg-Keys-for-Authenticated-User](../../doc/controllers/users.md#users-list-gpg-keys-for-authenticated-user)
* [Users Create-Gpg-Key-for-Authenticated-User](../../doc/controllers/users.md#users-create-gpg-key-for-authenticated-user)
* [Users Get-Gpg-Key-for-Authenticated-User](../../doc/controllers/users.md#users-get-gpg-key-for-authenticated-user)
* [Users Delete-Gpg-Key-for-Authenticated-User](../../doc/controllers/users.md#users-delete-gpg-key-for-authenticated-user)
* [Users List-Public-Ssh-Keys-for-Authenticated-User](../../doc/controllers/users.md#users-list-public-ssh-keys-for-authenticated-user)
* [Users Create-Public-Ssh-Key-for-Authenticated-User](../../doc/controllers/users.md#users-create-public-ssh-key-for-authenticated-user)
* [Users Get-Public-Ssh-Key-for-Authenticated-User](../../doc/controllers/users.md#users-get-public-ssh-key-for-authenticated-user)
* [Users Delete-Public-Ssh-Key-for-Authenticated-User](../../doc/controllers/users.md#users-delete-public-ssh-key-for-authenticated-user)
* [Users List-Public-Emails-for-Authenticated-User](../../doc/controllers/users.md#users-list-public-emails-for-authenticated-user)
* [Users List-Ssh-Signing-Keys-for-Authenticated-User](../../doc/controllers/users.md#users-list-ssh-signing-keys-for-authenticated-user)
* [Users Create-Ssh-Signing-Key-for-Authenticated-User](../../doc/controllers/users.md#users-create-ssh-signing-key-for-authenticated-user)
* [Users Get-Ssh-Signing-Key-for-Authenticated-User](../../doc/controllers/users.md#users-get-ssh-signing-key-for-authenticated-user)
* [Users Delete-Ssh-Signing-Key-for-Authenticated-User](../../doc/controllers/users.md#users-delete-ssh-signing-key-for-authenticated-user)
* [Users List](../../doc/controllers/users.md#users-list)
* [Users Get-by-Username](../../doc/controllers/users.md#users-get-by-username)
* [Users List-Followers-for-User](../../doc/controllers/users.md#users-list-followers-for-user)
* [Users List-Following-for-User](../../doc/controllers/users.md#users-list-following-for-user)
* [Users Check-Following-for-User](../../doc/controllers/users.md#users-check-following-for-user)
* [Users List-Gpg-Keys-for-User](../../doc/controllers/users.md#users-list-gpg-keys-for-user)
* [Users Get-Context-for-User](../../doc/controllers/users.md#users-get-context-for-user)
* [Users List-Public-Keys-for-User](../../doc/controllers/users.md#users-list-public-keys-for-user)
* [Users List-Ssh-Signing-Keys-for-User](../../doc/controllers/users.md#users-list-ssh-signing-keys-for-user)


# Users Get-Authenticated

If the authenticated user is authenticated through basic authentication or OAuth with the `user` scope, then the response lists public and private profile information.

If the authenticated user is authenticated through OAuth without the `user` scope, then the response lists only public profile information.

API method documentation: [https://docs.github.com/rest/reference/users#get-the-authenticated-user](https://docs.github.com/rest/reference/users#get-the-authenticated-user)

```java
CompletableFuture<UsersGetAuthenticatedResponse> usersGetAuthenticatedAsync()
```

## Response Type

`UsersGetAuthenticatedResponse`

## Example Usage

```java
usersController.usersGetAuthenticatedAsync().thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
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
  "site_admin": false,
  "name": "monalisa octocat",
  "company": "GitHub",
  "blog": "https://github.com/blog",
  "location": "San Francisco",
  "email": "octocat@github.com",
  "hireable": false,
  "bio": "There once was...",
  "twitter_username": "monatheoctocat",
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "created_at": "2008-01-14T04:33:35Z",
  "updated_at": "2008-01-14T04:33:35Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`User401ErrorException`](../../doc/models/user-401-error-exception.md) |
| 403 | Forbidden | [`User403ErrorException`](../../doc/models/user-403-error-exception.md) |


# Users Update-Authenticated

**Note:** If your email is set to private and you send an `email` parameter as part of this request to update your profile, your privacy settings are still enforced: the email address will not be displayed on your public profile or via the API.

API method documentation: [https://docs.github.com/rest/reference/users/#update-the-authenticated-user](https://docs.github.com/rest/reference/users/#update-the-authenticated-user)

```java
CompletableFuture<UserResponse> usersUpdateAuthenticatedAsync(
    final UserRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserRequest`](../../doc/models/user-request.md) | Body, Optional | - |

## Response Type

[`UserResponse`](../../doc/models/user-response.md)

## Example Usage

```java
UserRequest body = new UserRequest();
body.setName("monalisa octocat");
body.setBlog("https://github.com/blog");

usersController.usersUpdateAuthenticatedAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
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
  "site_admin": false,
  "name": "monalisa octocat",
  "company": "GitHub",
  "blog": "https://github.com/blog",
  "location": "San Francisco",
  "email": "octocat@github.com",
  "hireable": false,
  "bio": "There once was...",
  "twitter_username": "monatheoctocat",
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "created_at": "2008-01-14T04:33:35Z",
  "updated_at": "2008-01-14T04:33:35Z",
  "private_gists": 81,
  "total_private_repos": 100,
  "owned_private_repos": 100,
  "disk_usage": 10000,
  "collaborators": 8,
  "two_factor_authentication": true,
  "plan": {
    "name": "Medium",
    "space": 400,
    "private_repos": 20,
    "collaborators": 0
  }
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`User401ErrorException`](../../doc/models/user-401-error-exception.md) |
| 403 | Forbidden | [`User403ErrorException`](../../doc/models/user-403-error-exception.md) |
| 404 | Resource not found | [`User404ErrorException`](../../doc/models/user-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`User422ErrorException`](../../doc/models/user-422-error-exception.md) |


# Users List-Blocked-by-Authenticated-User

List the users you've blocked on your personal account.

API method documentation: [https://docs.github.com/rest/reference/users#list-users-blocked-by-the-authenticated-user](https://docs.github.com/rest/reference/users#list-users-blocked-by-the-authenticated-user)

```java
CompletableFuture<List<SimpleUser>> usersListBlockedByAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListBlockedByAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserBlocks401ErrorException`](../../doc/models/user-blocks-401-error-exception.md) |
| 403 | Forbidden | [`UserBlocks403ErrorException`](../../doc/models/user-blocks-403-error-exception.md) |
| 404 | Resource not found | [`UserBlocks404ErrorException`](../../doc/models/user-blocks-404-error-exception.md) |


# Users Check-Blocked

Check if a user is blocked by the authenticated user

API method documentation: [https://docs.github.com/rest/reference/users#check-if-a-user-is-blocked-by-the-authenticated-user](https://docs.github.com/rest/reference/users#check-if-a-user-is-blocked-by-the-authenticated-user)

```java
CompletableFuture<Void> usersCheckBlockedAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

usersController.usersCheckBlockedAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserBlocks401ErrorException`](../../doc/models/user-blocks-401-error-exception.md) |
| 403 | Forbidden | [`UserBlocks403ErrorException`](../../doc/models/user-blocks-403-error-exception.md) |
| 404 | If the user is not blocked | [`UserBlocks404ErrorException`](../../doc/models/user-blocks-404-error-exception.md) |


# Users Block

Block a user

API method documentation: [https://docs.github.com/rest/reference/users#block-a-user](https://docs.github.com/rest/reference/users#block-a-user)

```java
CompletableFuture<Void> usersBlockAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

usersController.usersBlockAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserBlocks401ErrorException`](../../doc/models/user-blocks-401-error-exception.md) |
| 403 | Forbidden | [`UserBlocks403ErrorException`](../../doc/models/user-blocks-403-error-exception.md) |
| 404 | Resource not found | [`UserBlocks404ErrorException`](../../doc/models/user-blocks-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserBlocks422ErrorException`](../../doc/models/user-blocks-422-error-exception.md) |


# Users Unblock

Unblock a user

API method documentation: [https://docs.github.com/rest/reference/users#unblock-a-user](https://docs.github.com/rest/reference/users#unblock-a-user)

```java
CompletableFuture<Void> usersUnblockAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

usersController.usersUnblockAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserBlocks401ErrorException`](../../doc/models/user-blocks-401-error-exception.md) |
| 403 | Forbidden | [`UserBlocks403ErrorException`](../../doc/models/user-blocks-403-error-exception.md) |
| 404 | Resource not found | [`UserBlocks404ErrorException`](../../doc/models/user-blocks-404-error-exception.md) |


# Users Set-Primary-Email-Visibility-for-Authenticated-User

Sets the visibility for your primary email addresses.

API method documentation: [https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user)

```java
CompletableFuture<List<Email>> usersSetPrimaryEmailVisibilityForAuthenticatedUserAsync(
    final UserEmailVisibilityRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserEmailVisibilityRequest`](../../doc/models/user-email-visibility-request.md) | Body, Required | - |

## Response Type

[`List<Email>`](../../doc/models/email.md)

## Example Usage

```java
UserEmailVisibilityRequest body = new UserEmailVisibilityRequest();
body.setVisibility(Visibility90Enum.ENUM_PRIVATE);

usersController.usersSetPrimaryEmailVisibilityForAuthenticatedUserAsync(body).thenAccept(result -> {
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
    "email": "octocat@github.com",
    "primary": true,
    "verified": true,
    "visibility": "private"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserEmailVisibility401ErrorException`](../../doc/models/user-email-visibility-401-error-exception.md) |
| 403 | Forbidden | [`UserEmailVisibility403ErrorException`](../../doc/models/user-email-visibility-403-error-exception.md) |
| 404 | Resource not found | [`UserEmailVisibility404ErrorException`](../../doc/models/user-email-visibility-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserEmailVisibility422ErrorException`](../../doc/models/user-email-visibility-422-error-exception.md) |


# Users List-Emails-for-Authenticated-User

Lists all of your email addresses, and specifies which one is visible to the public. This endpoint is accessible with the `user:email` scope.

API method documentation: [https://docs.github.com/rest/reference/users#list-email-addresses-for-the-authenticated-user](https://docs.github.com/rest/reference/users#list-email-addresses-for-the-authenticated-user)

```java
CompletableFuture<List<Email>> usersListEmailsForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Email>`](../../doc/models/email.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListEmailsForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "email": "octocat@github.com",
    "verified": true,
    "primary": true,
    "visibility": "public"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserEmails401ErrorException`](../../doc/models/user-emails-401-error-exception.md) |
| 403 | Forbidden | [`UserEmails403ErrorException`](../../doc/models/user-emails-403-error-exception.md) |
| 404 | Resource not found | [`UserEmails404ErrorException`](../../doc/models/user-emails-404-error-exception.md) |


# Users Add-Email-for-Authenticated-User

This endpoint is accessible with the `user` scope.

API method documentation: [https://docs.github.com/rest/reference/users#add-an-email-address-for-the-authenticated-user](https://docs.github.com/rest/reference/users#add-an-email-address-for-the-authenticated-user)

```java
CompletableFuture<List<Email>> usersAddEmailForAuthenticatedUserAsync(
    final UsersAddEmailForAuthenticatedUserBody body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UsersAddEmailForAuthenticatedUserBody`]($m/UsersAddEmailForAuthenticatedUserBody) | Body, Optional | - |

## Response Type

[`List<Email>`](../../doc/models/email.md)

## Example Usage

```java
UserEmailsRequest body = new UserEmailsRequest();
List<String> emails = new LinkedList<>();
emails.add("octocat@github.com");
emails.add("mona@github.com");
emails.add("octocat@octocat.org");

body.setEmails(emails);


UsersAddEmailForAuthenticatedUserBody bodyContainer = UsersAddEmailForAuthenticatedUserBody.fromUserEmailsRequest(body);

usersController.usersAddEmailForAuthenticatedUserAsync(bodyContainer).thenAccept(result -> {
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
    "email": "octocat@octocat.org",
    "primary": false,
    "verified": false,
    "visibility": "public"
  },
  {
    "email": "octocat@github.com",
    "primary": false,
    "verified": false,
    "visibility": null
  },
  {
    "email": "mona@github.com",
    "primary": false,
    "verified": false,
    "visibility": null
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserEmails401ErrorException`](../../doc/models/user-emails-401-error-exception.md) |
| 403 | Forbidden | [`UserEmails403ErrorException`](../../doc/models/user-emails-403-error-exception.md) |
| 404 | Resource not found | [`UserEmails404ErrorException`](../../doc/models/user-emails-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserEmails422ErrorException`](../../doc/models/user-emails-422-error-exception.md) |


# Users Delete-Email-for-Authenticated-User

This endpoint is accessible with the `user` scope.

API method documentation: [https://docs.github.com/rest/reference/users#delete-an-email-address-for-the-authenticated-user](https://docs.github.com/rest/reference/users#delete-an-email-address-for-the-authenticated-user)

```java
CompletableFuture<Void> usersDeleteEmailForAuthenticatedUserAsync(
    final ContentType3Enum contentType)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `contentType` | [`ContentType3Enum`](../../doc/models/content-type-3-enum.md) | Header, Required | - |

## Response Type

`void`

## Example Usage

```java
ContentType3Enum contentType = ContentType3Enum.ENUM_APPLICATIONJSON;

usersController.usersDeleteEmailForAuthenticatedUserAsync(contentType).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserEmails401ErrorException`](../../doc/models/user-emails-401-error-exception.md) |
| 403 | Forbidden | [`UserEmails403ErrorException`](../../doc/models/user-emails-403-error-exception.md) |
| 404 | Resource not found | [`UserEmails404ErrorException`](../../doc/models/user-emails-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserEmails422ErrorException`](../../doc/models/user-emails-422-error-exception.md) |


# Users List-Followers-for-Authenticated-User

Lists the people following the authenticated user.

API method documentation: [https://docs.github.com/rest/reference/users#list-followers-of-the-authenticated-user](https://docs.github.com/rest/reference/users#list-followers-of-the-authenticated-user)

```java
CompletableFuture<List<SimpleUser>> usersListFollowersForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListFollowersForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserFollowers401ErrorException`](../../doc/models/user-followers-401-error-exception.md) |
| 403 | Forbidden | [`UserFollowers403ErrorException`](../../doc/models/user-followers-403-error-exception.md) |


# Users List-Followed-by-Authenticated-User

Lists the people who the authenticated user follows.

API method documentation: [https://docs.github.com/rest/reference/users#list-the-people-the-authenticated-user-follows](https://docs.github.com/rest/reference/users#list-the-people-the-authenticated-user-follows)

```java
CompletableFuture<List<SimpleUser>> usersListFollowedByAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListFollowedByAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserFollowing401ErrorException`](../../doc/models/user-following-401-error-exception.md) |
| 403 | Forbidden | [`UserFollowing403ErrorException`](../../doc/models/user-following-403-error-exception.md) |


# Users Check-Person-Is-Followed-by-Authenticated

Check if a person is followed by the authenticated user

API method documentation: [https://docs.github.com/rest/reference/users#check-if-a-person-is-followed-by-the-authenticated-user](https://docs.github.com/rest/reference/users#check-if-a-person-is-followed-by-the-authenticated-user)

```java
CompletableFuture<Void> usersCheckPersonIsFollowedByAuthenticatedAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

usersController.usersCheckPersonIsFollowedByAuthenticatedAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserFollowing401ErrorException`](../../doc/models/user-following-401-error-exception.md) |
| 403 | Forbidden | [`UserFollowing403ErrorException`](../../doc/models/user-following-403-error-exception.md) |
| 404 | if the person is not followed by the authenticated user | [`UserFollowing404ErrorException`](../../doc/models/user-following-404-error-exception.md) |


# Users Follow

Note that you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://docs.github.com/rest/overview/resources-in-the-rest-api#http-verbs)."

Following a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.

API method documentation: [https://docs.github.com/rest/reference/users#follow-a-user](https://docs.github.com/rest/reference/users#follow-a-user)

```java
CompletableFuture<Void> usersFollowAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

usersController.usersFollowAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserFollowing401ErrorException`](../../doc/models/user-following-401-error-exception.md) |
| 403 | Forbidden | [`UserFollowing403ErrorException`](../../doc/models/user-following-403-error-exception.md) |
| 404 | Resource not found | [`UserFollowing404ErrorException`](../../doc/models/user-following-404-error-exception.md) |


# Users Unfollow

Unfollowing a user requires the user to be logged in and authenticated with basic auth or OAuth with the `user:follow` scope.

API method documentation: [https://docs.github.com/rest/reference/users#unfollow-a-user](https://docs.github.com/rest/reference/users#unfollow-a-user)

```java
CompletableFuture<Void> usersUnfollowAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`void`

## Example Usage

```java
String username = "username0";

usersController.usersUnfollowAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserFollowing401ErrorException`](../../doc/models/user-following-401-error-exception.md) |
| 403 | Forbidden | [`UserFollowing403ErrorException`](../../doc/models/user-following-403-error-exception.md) |
| 404 | Resource not found | [`UserFollowing404ErrorException`](../../doc/models/user-following-404-error-exception.md) |


# Users List-Gpg-Keys-for-Authenticated-User

Lists the current user's GPG keys. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#list-gpg-keys-for-the-authenticated-user](https://docs.github.com/rest/reference/users#list-gpg-keys-for-the-authenticated-user)

```java
CompletableFuture<List<GPGKey>> usersListGpgKeysForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<GPGKey>`](../../doc/models/gpg-key.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListGpgKeysForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "id": 3,
    "name": "Octocat's GPG Key",
    "primary_key_id": 2,
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
        "expires_at": "2016-03-24T11:31:04-07:00",
        "revoked": false
      }
    ],
    "can_sign": true,
    "can_encrypt_comms": false,
    "can_encrypt_storage": false,
    "can_certify": true,
    "created_at": "2016-03-24T11:31:04-06:00",
    "expires_at": "2016-03-24T11:31:04-07:00",
    "revoked": false,
    "raw_key": "string"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserGpgKeys401ErrorException`](../../doc/models/user-gpg-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserGpgKeys403ErrorException`](../../doc/models/user-gpg-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserGpgKeys404ErrorException`](../../doc/models/user-gpg-keys-404-error-exception.md) |


# Users Create-Gpg-Key-for-Authenticated-User

Adds a GPG key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#create-a-gpg-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#create-a-gpg-key-for-the-authenticated-user)

```java
CompletableFuture<UserGpgKeysResponse> usersCreateGpgKeyForAuthenticatedUserAsync(
    final UserGpgKeysRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserGpgKeysRequest`](../../doc/models/user-gpg-keys-request.md) | Body, Required | - |

## Response Type

[`UserGpgKeysResponse`](../../doc/models/user-gpg-keys-response.md)

## Example Usage

```java
UserGpgKeysRequest body = new UserGpgKeysRequest();
body.setArmoredPublicKey("-----BEGIN PGP PUBLIC KEY BLOCK-----\\nVersion: GnuPG v1\\n\\nmQINBFnZ2ZIBEADQ2Z7Z7\\n-----END PGP PUBLIC KEY BLOCK-----");
body.setName("Octocat's GPG Key");

usersController.usersCreateGpgKeyForAuthenticatedUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 3,
  "name": "Octocat's GPG Key",
  "primary_key_id": 2,
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
      "expires_at": "2016-03-24T11:31:04-07:00",
      "revoked": false
    }
  ],
  "can_sign": true,
  "can_encrypt_comms": false,
  "can_encrypt_storage": false,
  "can_certify": true,
  "created_at": "2016-03-24T11:31:04-06:00",
  "expires_at": "2016-03-24T11:31:04-07:00",
  "revoked": false,
  "raw_key": "\"-----BEGIN PGP PUBLIC KEY BLOCK-----\\nVersion: GnuPG v2\\n\\nmQENBFayYZ0BCAC4hScoJXXpyR+MXGcrBxElqw3FzCVvkViuyeko+Jp76QJhg8kr\\nucRTxbnOoHfda/FmilEa/wxf9ch5/PSrrL26FxEoPHhJolp8fnIDLQeITn94NYdB\\nZtnnEKslpPrG97qSUWIchvyqCPtvOb8+8fWvGx9K/ZWcEEdh1X8+WFR2jMENMeoX\\nwxHWQoPnS7LpX/85/M7VUcJxvDVfv+eHsnQupmE5bGarKNih0oMe3LbdN3qA5PTz\\nSCm6Iudar1VsQ+xTz08ymL7t4pnEtLguQ7EyatFHCjxNblv5RzxoL0tDgN3HqoDz\\nc7TEA+q4RtDQl9amcvQ95emnXmZ974u7UkYdABEBAAG0HlNvbWUgVXNlciA8c29t\\nZXVzZXJAZ21haWwuY29tPokBOAQTAQIAIgUCVrJhnQIbAwYLCQgHAwIGFQgCCQoL\\nBBYCAwECHgECF4AACgkQMmLv8lug0nAViQgArWjI55+7p48URr2z9Jvak+yrBTx1\\nzkufltQAnHTJkq+Kl9dySSmTnOop8o3rE4++IOpYV5Y36PkKf9EZMk4n1RQiDPKE\\nAFtRVTkRaoWzOir9KQXJPfhKrl01j/QzY+utfiMvUoBJZ9ybq8Pa885SljW9lbaX\\nIYw+hl8ZdJ2KStvGrEyfQvRyq3aN5c9TV//4BdGnwx7Qabq/U+G18lizG6f/yq15\\ned7t0KELaCfeKPvytp4VE9/z/Ksah/h3+Qilx07/oG2Ae5kC1bEC9coD/ogPUhbv\\nb2bsBIoY9E9YwsLoif2lU+o1t76zLgUktuNscRRUKobW028H1zuFS/XQhrkBDQRW\\nsmGdAQgApnyyv3i144OLYy0O4UKQxd3e10Y3WpDwfnGIBefAI1m7RxnUxBag/DsU\\n7gi9qLEC4VHSfq4eiNfr1LJOyCL2edTgCWFgBhVjbXjZe6YAOrAnhxwCErnN0Y7N\\n6s8wVh9fObSOyf8ZE6G7JeKpcq9Q6gd/KxagfD48a1v+fyRHpyQc6J9pUEmtrDJ7\\nBjmsd2VWzLBvNWdHyxDNtZweIaqIO9VUYYpr1mtTliNBOZLUelmgrt7HBRcJpWMA\\nS8muVVbuP5MK0trLBq/JB8qUH3zRzB/PhMgzmkIfjEK1VYDWm4E8DYyTWEJcHqkb\\neqFsNjrIlwPaA122BWC6gUOPwwH+oQARAQABiQEfBBgBAgAJBQJWsmGdAhsMAAoJ\\nEDJi7/JboNJwAyAIALd4xcdmGbZD98gScJzqwzkOMcO8zFHqHNvJ42xIFvGny7c0\\n1Rx7iyrdypOby5AxE+viQcjG4rpLZW/xKYBNGrCfDyQO7511I0v8x20EICMlMfD/\\nNrWQCzesEPcUlKTP07d+sFyP8AyseOidbzY/92CpskTgdSBjY/ntLSaoknl/fjJE\\nQM8OkPqU7IraO1Jzzdnm20d5PZL9+PIwIWdSTedU/vBMTJyNcoqvSfKf1wNC66XP\\nhqfYgXJE564AdWZKA3C0IyCqiv+LHwxLnUHio1a4/r91C8KPzxs6tGxRDjXLd7ms\\nuYFGWymiUGOE/giHlcxdYcHzwLnPDliMQOLiTkK5AQ0EVuxMygEIAOD+bW1cDTmE\\nBxh5JECoqeHuwgl6DlLhnubWPkQ4ZeRzBRAsFcEJQlwlJjrzFDicL+lnm6Qq4tt0\\n560TwHdf15/AKTZIZu7H25axvGNzgeaUkJEJdYAq9zTKWwX7wKyzBszi485nQg97\\nMfAqwhMpDW0Qqf8+7Ug+WEmfBSGv9uL3aQC6WEeIsHfri0n0n8v4XgwhfShXguxO\\nCsOztEsuW7WWKW9P4TngKKv4lCHdPlV6FwxeMzODBJvc2fkHVHnqc0PqszJ5xcF8\\n6gZCpMM027SbpeYWCAD5zwJyYP9ntfO1p2HjnQ1dZaP9FeNcO7uIV1Lnd1eGCu6I\\nsrVp5k1f3isAEQEAAYkCPgQYAQIACQUCVuxMygIbAgEpCRAyYu/yW6DScMBdIAQZ\\nAQIABgUCVuxMygAKCRCKohN4dhq2b4tcCACHxmOHVXNpu47OvUGYQydLgMACUlXN\\nlj+HfE0VReqShxdDmpasAY9IRpuMB2RsGK8GbNP+4SlOlAiPf5SMhS7nZNkNDgQQ\\naZ3HFpgrFmFwmE10BKT4iQtoxELLM57z0qGOAfTsEjWFQa4sF+6IHAQR/ptkdkkI\\nBUEXiMnAwVwBysLIJiLO8qdjB6qp52QkT074JVrwywT/P+DkMfC2k4r/AfEbf6eF\\ndmPDuPk6KD87+hJZsSa5MaMUBQVvRO/mgEkhJRITVu58eWGaBOcQJ8gqurhCqM5P\\nDfUA4TJ7wiqM6sS764vV1rOioTTXkszzhClQqET7hPVnVQjenYgv0EZHNyQH/1f1\\n/CYqvV1vFjM9vJjMbxXsATCkZe6wvBVKD8vLsJAr8N+onKQz+4OPc3kmKq7aESu3\\nCi/iuie5KKVwnuNhr9AzT61vEkKxwHcVFEvHB77F6ZAAInhRvjzmQbD2dlPLLQCC\\nqDj71ODSSAPTEmUy6969bgD9PfWei7kNkBIx7s3eBv8yzytSc2EcuUgopqFazquw\\nFs1+tqGHjBvQfTo6bqbJjp/9Ci2pvde3ElV2rAgUlb3lqXyXjRDqrXosh5GcRPQj\\nK8Nhj1BNhnrCVskE4BP0LYbOHuzgm86uXwGCFsY+w2VOsSm16Jx5GHyG5S5WU3+D\\nIts/HFYRLiFgDLmTlxo=\\n=+OzK\\n-----END PGP PUBLIC KEY BLOCK-----\""
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserGpgKeys401ErrorException`](../../doc/models/user-gpg-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserGpgKeys403ErrorException`](../../doc/models/user-gpg-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserGpgKeys404ErrorException`](../../doc/models/user-gpg-keys-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserGpgKeys422ErrorException`](../../doc/models/user-gpg-keys-422-error-exception.md) |


# Users Get-Gpg-Key-for-Authenticated-User

View extended details for a single GPG key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#get-a-gpg-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#get-a-gpg-key-for-the-authenticated-user)

```java
CompletableFuture<UserGpgKeysResponse> usersGetGpgKeyForAuthenticatedUserAsync(
    final int gpgKeyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gpgKeyId` | `int` | Template, Required | The unique identifier of the GPG key. |

## Response Type

[`UserGpgKeysResponse`](../../doc/models/user-gpg-keys-response.md)

## Example Usage

```java
int gpgKeyId = 230;

usersController.usersGetGpgKeyForAuthenticatedUserAsync(gpgKeyId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 3,
  "name": "Octocat's GPG Key",
  "primary_key_id": 2,
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
      "expires_at": "2016-03-24T11:31:04-07:00",
      "revoked": false
    }
  ],
  "can_sign": true,
  "can_encrypt_comms": false,
  "can_encrypt_storage": false,
  "can_certify": true,
  "created_at": "2016-03-24T11:31:04-06:00",
  "expires_at": "2016-03-24T11:31:04-07:00",
  "revoked": false,
  "raw_key": "\"-----BEGIN PGP PUBLIC KEY BLOCK-----\\nVersion: GnuPG v2\\n\\nmQENBFayYZ0BCAC4hScoJXXpyR+MXGcrBxElqw3FzCVvkViuyeko+Jp76QJhg8kr\\nucRTxbnOoHfda/FmilEa/wxf9ch5/PSrrL26FxEoPHhJolp8fnIDLQeITn94NYdB\\nZtnnEKslpPrG97qSUWIchvyqCPtvOb8+8fWvGx9K/ZWcEEdh1X8+WFR2jMENMeoX\\nwxHWQoPnS7LpX/85/M7VUcJxvDVfv+eHsnQupmE5bGarKNih0oMe3LbdN3qA5PTz\\nSCm6Iudar1VsQ+xTz08ymL7t4pnEtLguQ7EyatFHCjxNblv5RzxoL0tDgN3HqoDz\\nc7TEA+q4RtDQl9amcvQ95emnXmZ974u7UkYdABEBAAG0HlNvbWUgVXNlciA8c29t\\nZXVzZXJAZ21haWwuY29tPokBOAQTAQIAIgUCVrJhnQIbAwYLCQgHAwIGFQgCCQoL\\nBBYCAwECHgECF4AACgkQMmLv8lug0nAViQgArWjI55+7p48URr2z9Jvak+yrBTx1\\nzkufltQAnHTJkq+Kl9dySSmTnOop8o3rE4++IOpYV5Y36PkKf9EZMk4n1RQiDPKE\\nAFtRVTkRaoWzOir9KQXJPfhKrl01j/QzY+utfiMvUoBJZ9ybq8Pa885SljW9lbaX\\nIYw+hl8ZdJ2KStvGrEyfQvRyq3aN5c9TV//4BdGnwx7Qabq/U+G18lizG6f/yq15\\ned7t0KELaCfeKPvytp4VE9/z/Ksah/h3+Qilx07/oG2Ae5kC1bEC9coD/ogPUhbv\\nb2bsBIoY9E9YwsLoif2lU+o1t76zLgUktuNscRRUKobW028H1zuFS/XQhrkBDQRW\\nsmGdAQgApnyyv3i144OLYy0O4UKQxd3e10Y3WpDwfnGIBefAI1m7RxnUxBag/DsU\\n7gi9qLEC4VHSfq4eiNfr1LJOyCL2edTgCWFgBhVjbXjZe6YAOrAnhxwCErnN0Y7N\\n6s8wVh9fObSOyf8ZE6G7JeKpcq9Q6gd/KxagfD48a1v+fyRHpyQc6J9pUEmtrDJ7\\nBjmsd2VWzLBvNWdHyxDNtZweIaqIO9VUYYpr1mtTliNBOZLUelmgrt7HBRcJpWMA\\nS8muVVbuP5MK0trLBq/JB8qUH3zRzB/PhMgzmkIfjEK1VYDWm4E8DYyTWEJcHqkb\\neqFsNjrIlwPaA122BWC6gUOPwwH+oQARAQABiQEfBBgBAgAJBQJWsmGdAhsMAAoJ\\nEDJi7/JboNJwAyAIALd4xcdmGbZD98gScJzqwzkOMcO8zFHqHNvJ42xIFvGny7c0\\n1Rx7iyrdypOby5AxE+viQcjG4rpLZW/xKYBNGrCfDyQO7511I0v8x20EICMlMfD/\\nNrWQCzesEPcUlKTP07d+sFyP8AyseOidbzY/92CpskTgdSBjY/ntLSaoknl/fjJE\\nQM8OkPqU7IraO1Jzzdnm20d5PZL9+PIwIWdSTedU/vBMTJyNcoqvSfKf1wNC66XP\\nhqfYgXJE564AdWZKA3C0IyCqiv+LHwxLnUHio1a4/r91C8KPzxs6tGxRDjXLd7ms\\nuYFGWymiUGOE/giHlcxdYcHzwLnPDliMQOLiTkK5AQ0EVuxMygEIAOD+bW1cDTmE\\nBxh5JECoqeHuwgl6DlLhnubWPkQ4ZeRzBRAsFcEJQlwlJjrzFDicL+lnm6Qq4tt0\\n560TwHdf15/AKTZIZu7H25axvGNzgeaUkJEJdYAq9zTKWwX7wKyzBszi485nQg97\\nMfAqwhMpDW0Qqf8+7Ug+WEmfBSGv9uL3aQC6WEeIsHfri0n0n8v4XgwhfShXguxO\\nCsOztEsuW7WWKW9P4TngKKv4lCHdPlV6FwxeMzODBJvc2fkHVHnqc0PqszJ5xcF8\\n6gZCpMM027SbpeYWCAD5zwJyYP9ntfO1p2HjnQ1dZaP9FeNcO7uIV1Lnd1eGCu6I\\nsrVp5k1f3isAEQEAAYkCPgQYAQIACQUCVuxMygIbAgEpCRAyYu/yW6DScMBdIAQZ\\nAQIABgUCVuxMygAKCRCKohN4dhq2b4tcCACHxmOHVXNpu47OvUGYQydLgMACUlXN\\nlj+HfE0VReqShxdDmpasAY9IRpuMB2RsGK8GbNP+4SlOlAiPf5SMhS7nZNkNDgQQ\\naZ3HFpgrFmFwmE10BKT4iQtoxELLM57z0qGOAfTsEjWFQa4sF+6IHAQR/ptkdkkI\\nBUEXiMnAwVwBysLIJiLO8qdjB6qp52QkT074JVrwywT/P+DkMfC2k4r/AfEbf6eF\\ndmPDuPk6KD87+hJZsSa5MaMUBQVvRO/mgEkhJRITVu58eWGaBOcQJ8gqurhCqM5P\\nDfUA4TJ7wiqM6sS764vV1rOioTTXkszzhClQqET7hPVnVQjenYgv0EZHNyQH/1f1\\n/CYqvV1vFjM9vJjMbxXsATCkZe6wvBVKD8vLsJAr8N+onKQz+4OPc3kmKq7aESu3\\nCi/iuie5KKVwnuNhr9AzT61vEkKxwHcVFEvHB77F6ZAAInhRvjzmQbD2dlPLLQCC\\nqDj71ODSSAPTEmUy6969bgD9PfWei7kNkBIx7s3eBv8yzytSc2EcuUgopqFazquw\\nFs1+tqGHjBvQfTo6bqbJjp/9Ci2pvde3ElV2rAgUlb3lqXyXjRDqrXosh5GcRPQj\\nK8Nhj1BNhnrCVskE4BP0LYbOHuzgm86uXwGCFsY+w2VOsSm16Jx5GHyG5S5WU3+D\\nIts/HFYRLiFgDLmTlxo=\\n=+OzK\\n-----END PGP PUBLIC KEY BLOCK-----\""
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserGpgKeys401ErrorException`](../../doc/models/user-gpg-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserGpgKeys403ErrorException`](../../doc/models/user-gpg-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserGpgKeys404ErrorException`](../../doc/models/user-gpg-keys-404-error-exception.md) |


# Users Delete-Gpg-Key-for-Authenticated-User

Removes a GPG key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:gpg_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#delete-a-gpg-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#delete-a-gpg-key-for-the-authenticated-user)

```java
CompletableFuture<Void> usersDeleteGpgKeyForAuthenticatedUserAsync(
    final int gpgKeyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `gpgKeyId` | `int` | Template, Required | The unique identifier of the GPG key. |

## Response Type

`void`

## Example Usage

```java
int gpgKeyId = 230;

usersController.usersDeleteGpgKeyForAuthenticatedUserAsync(gpgKeyId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserGpgKeys401ErrorException`](../../doc/models/user-gpg-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserGpgKeys403ErrorException`](../../doc/models/user-gpg-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserGpgKeys404ErrorException`](../../doc/models/user-gpg-keys-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserGpgKeys422ErrorException`](../../doc/models/user-gpg-keys-422-error-exception.md) |


# Users List-Public-Ssh-Keys-for-Authenticated-User

Lists the public SSH keys for the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#list-public-ssh-keys-for-the-authenticated-user](https://docs.github.com/rest/reference/users#list-public-ssh-keys-for-the-authenticated-user)

```java
CompletableFuture<List<Key>> usersListPublicSshKeysForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Key>`](../../doc/models/key.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListPublicSshKeysForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
    "id": 2,
    "url": "https://api.github.com/user/keys/2",
    "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
    "created_at": "2020-06-11T21:31:57Z",
    "verified": false,
    "read_only": false
  },
  {
    "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJy931234",
    "id": 3,
    "url": "https://api.github.com/user/keys/3",
    "title": "ssh-rsa AAAAB3NzaC1yc2EAAB",
    "created_at": "2020-07-11T21:31:57Z",
    "verified": false,
    "read_only": false
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserKeys401ErrorException`](../../doc/models/user-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserKeys403ErrorException`](../../doc/models/user-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserKeys404ErrorException`](../../doc/models/user-keys-404-error-exception.md) |


# Users Create-Public-Ssh-Key-for-Authenticated-User

Adds a public SSH key to the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth, or OAuth with at least `write:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#create-a-public-ssh-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#create-a-public-ssh-key-for-the-authenticated-user)

```java
CompletableFuture<UserKeysResponse> usersCreatePublicSshKeyForAuthenticatedUserAsync(
    final UserKeysRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserKeysRequest`](../../doc/models/user-keys-request.md) | Body, Required | - |

## Response Type

[`UserKeysResponse`](../../doc/models/user-keys-response.md)

## Example Usage

```java
UserKeysRequest body = new UserKeysRequest();
body.setKey("key6");

usersController.usersCreatePublicSshKeyForAuthenticatedUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
  "id": 2,
  "url": "https://api.github.com/user/keys/2",
  "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
  "created_at": "2020-06-11T21:31:57Z",
  "verified": false,
  "read_only": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserKeys401ErrorException`](../../doc/models/user-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserKeys403ErrorException`](../../doc/models/user-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserKeys404ErrorException`](../../doc/models/user-keys-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserKeys422ErrorException`](../../doc/models/user-keys-422-error-exception.md) |


# Users Get-Public-Ssh-Key-for-Authenticated-User

View extended details for a single public SSH key. Requires that you are authenticated via Basic Auth or via OAuth with at least `read:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#get-a-public-ssh-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#get-a-public-ssh-key-for-the-authenticated-user)

```java
CompletableFuture<UserKeysResponse> usersGetPublicSshKeyForAuthenticatedUserAsync(
    final int keyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `keyId` | `int` | Template, Required | The unique identifier of the key. |

## Response Type

[`UserKeysResponse`](../../doc/models/user-keys-response.md)

## Example Usage

```java
int keyId = 160;

usersController.usersGetPublicSshKeyForAuthenticatedUserAsync(keyId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
  "id": 2,
  "url": "https://api.github.com/user/keys/2",
  "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
  "created_at": "2020-06-11T21:31:57Z",
  "verified": false,
  "read_only": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserKeys401ErrorException`](../../doc/models/user-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserKeys403ErrorException`](../../doc/models/user-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserKeys404ErrorException`](../../doc/models/user-keys-404-error-exception.md) |


# Users Delete-Public-Ssh-Key-for-Authenticated-User

Removes a public SSH key from the authenticated user's GitHub account. Requires that you are authenticated via Basic Auth or via OAuth with at least `admin:public_key` [scope](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/).

API method documentation: [https://docs.github.com/rest/reference/users#delete-a-public-ssh-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#delete-a-public-ssh-key-for-the-authenticated-user)

```java
CompletableFuture<Void> usersDeletePublicSshKeyForAuthenticatedUserAsync(
    final int keyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `keyId` | `int` | Template, Required | The unique identifier of the key. |

## Response Type

`void`

## Example Usage

```java
int keyId = 160;

usersController.usersDeletePublicSshKeyForAuthenticatedUserAsync(keyId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserKeys401ErrorException`](../../doc/models/user-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserKeys403ErrorException`](../../doc/models/user-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserKeys404ErrorException`](../../doc/models/user-keys-404-error-exception.md) |


# Users List-Public-Emails-for-Authenticated-User

Lists your publicly visible email address, which you can set with the [Set primary email visibility for the authenticated user](https://docs.github.com/rest/reference/users#set-primary-email-visibility-for-the-authenticated-user) endpoint. This endpoint is accessible with the `user:email` scope.

API method documentation: [https://docs.github.com/rest/reference/users#list-public-email-addresses-for-the-authenticated-user](https://docs.github.com/rest/reference/users#list-public-email-addresses-for-the-authenticated-user)

```java
CompletableFuture<List<Email>> usersListPublicEmailsForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<Email>`](../../doc/models/email.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListPublicEmailsForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "email": "octocat@github.com",
    "verified": true,
    "primary": true,
    "visibility": "public"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserPublicEmails401ErrorException`](../../doc/models/user-public-emails-401-error-exception.md) |
| 403 | Forbidden | [`UserPublicEmails403ErrorException`](../../doc/models/user-public-emails-403-error-exception.md) |
| 404 | Resource not found | [`UserPublicEmails404ErrorException`](../../doc/models/user-public-emails-404-error-exception.md) |


# Users List-Ssh-Signing-Keys-for-Authenticated-User

Lists the SSH signing keys for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."

API method documentation: [https://docs.github.com/rest/reference/users#list-public-ssh-signing-keys-for-the-authenticated-user](https://docs.github.com/rest/reference/users#list-public-ssh-signing-keys-for-the-authenticated-user)

```java
CompletableFuture<List<SSHSigningKey>> usersListSshSigningKeysForAuthenticatedUserAsync(
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SSHSigningKey>`](../../doc/models/ssh-signing-key.md)

## Example Usage

```java
Integer perPage = 30;
Integer page = 1;

usersController.usersListSshSigningKeysForAuthenticatedUserAsync(perPage, page).thenAccept(result -> {
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
    "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
    "id": 2,
    "url": "https://api.github.com/user/keys/2",
    "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
    "created_at": "2020-06-11T21:31:57Z"
  },
  {
    "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJy931234",
    "id": 3,
    "url": "https://api.github.com/user/keys/3",
    "title": "ssh-rsa AAAAB3NzaC1yc2EAAB",
    "created_at": "2020-07-11T21:31:57Z"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserSshSigningKeys401ErrorException`](../../doc/models/user-ssh-signing-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserSshSigningKeys403ErrorException`](../../doc/models/user-ssh-signing-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserSshSigningKeys404ErrorException`](../../doc/models/user-ssh-signing-keys-404-error-exception.md) |


# Users Create-Ssh-Signing-Key-for-Authenticated-User

Creates an SSH signing key for the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `write:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."

API method documentation: [https://docs.github.com/rest/reference/users#create-an-ssh-signing-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#create-an-ssh-signing-key-for-the-authenticated-user)

```java
CompletableFuture<UserSshSigningKeysResponse> usersCreateSshSigningKeyForAuthenticatedUserAsync(
    final UserSshSigningKeysRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`UserSshSigningKeysRequest`](../../doc/models/user-ssh-signing-keys-request.md) | Body, Required | - |

## Response Type

[`UserSshSigningKeysResponse`](../../doc/models/user-ssh-signing-keys-response.md)

## Example Usage

```java
UserSshSigningKeysRequest body = new UserSshSigningKeysRequest();
body.setKey("key6");

usersController.usersCreateSshSigningKeyForAuthenticatedUserAsync(body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
  "id": 2,
  "url": "https://api.github.com/user/keys/2",
  "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
  "created_at": "2020-06-11T21:31:57Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserSshSigningKeys401ErrorException`](../../doc/models/user-ssh-signing-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserSshSigningKeys403ErrorException`](../../doc/models/user-ssh-signing-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserSshSigningKeys404ErrorException`](../../doc/models/user-ssh-signing-keys-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UserSshSigningKeys422ErrorException`](../../doc/models/user-ssh-signing-keys-422-error-exception.md) |


# Users Get-Ssh-Signing-Key-for-Authenticated-User

Gets extended details for an SSH signing key. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `read:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."

API method documentation: [https://docs.github.com/rest/reference/users#get-a-ssh-signing-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#get-a-ssh-signing-key-for-the-authenticated-user)

```java
CompletableFuture<UserSshSigningKeysResponse> usersGetSshSigningKeyForAuthenticatedUserAsync(
    final int sshSigningKeyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sshSigningKeyId` | `int` | Template, Required | The unique identifier of the SSH signing key. |

## Response Type

[`UserSshSigningKeysResponse`](../../doc/models/user-ssh-signing-keys-response.md)

## Example Usage

```java
int sshSigningKeyId = 252;

usersController.usersGetSshSigningKeyForAuthenticatedUserAsync(sshSigningKeyId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
  "id": 2,
  "url": "https://api.github.com/user/keys/2",
  "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
  "created_at": "2020-06-11T21:31:57Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserSshSigningKeys401ErrorException`](../../doc/models/user-ssh-signing-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserSshSigningKeys403ErrorException`](../../doc/models/user-ssh-signing-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserSshSigningKeys404ErrorException`](../../doc/models/user-ssh-signing-keys-404-error-exception.md) |


# Users Delete-Ssh-Signing-Key-for-Authenticated-User

Deletes an SSH signing key from the authenticated user's GitHub account. You must authenticate with Basic Authentication, or you must authenticate with OAuth with at least `admin:ssh_signing_key` scope. For more information, see "[Understanding scopes for OAuth apps](https://docs.github.com/apps/building-oauth-apps/understanding-scopes-for-oauth-apps/)."

API method documentation: [https://docs.github.com/rest/reference/users#delete-a-ssh-signing-key-for-the-authenticated-user](https://docs.github.com/rest/reference/users#delete-a-ssh-signing-key-for-the-authenticated-user)

```java
CompletableFuture<Void> usersDeleteSshSigningKeyForAuthenticatedUserAsync(
    final int sshSigningKeyId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `sshSigningKeyId` | `int` | Template, Required | The unique identifier of the SSH signing key. |

## Response Type

`void`

## Example Usage

```java
int sshSigningKeyId = 252;

usersController.usersDeleteSshSigningKeyForAuthenticatedUserAsync(sshSigningKeyId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Requires authentication | [`UserSshSigningKeys401ErrorException`](../../doc/models/user-ssh-signing-keys-401-error-exception.md) |
| 403 | Forbidden | [`UserSshSigningKeys403ErrorException`](../../doc/models/user-ssh-signing-keys-403-error-exception.md) |
| 404 | Resource not found | [`UserSshSigningKeys404ErrorException`](../../doc/models/user-ssh-signing-keys-404-error-exception.md) |


# Users List

Lists all users, in the order that they signed up on GitHub. This list includes personal user accounts and organization accounts.

Note: Pagination is powered exclusively by the `since` parameter. Use the [Link header](https://docs.github.com/rest/overview/resources-in-the-rest-api#link-header) to get the URL for the next page of users.

API method documentation: [https://docs.github.com/rest/reference/users#list-users](https://docs.github.com/rest/reference/users#list-users)

```java
CompletableFuture<List<SimpleUser>> usersListAsync(
    final Integer since,
    final Integer perPage)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `since` | `Integer` | Query, Optional | A user ID. Only return users with an ID greater than this ID. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
Integer perPage = 30;

usersController.usersListAsync(null, perPage).thenAccept(result -> {
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
  }
]
```


# Users Get-by-Username

Provides publicly available information about someone with a GitHub account.

GitHub Apps with the `Plan` user permission can use this endpoint to retrieve information about a user's GitHub plan. The GitHub App must be authenticated as a user. See "[Identifying and authorizing users for GitHub Apps](https://docs.github.com/apps/building-github-apps/identifying-and-authorizing-users-for-github-apps/)" for details about authentication. For an example response, see 'Response with GitHub plan information' below"

The `email` key in the following response is the publicly visible email address from your GitHub [profile page](https://github.com/settings/profile). When setting up your profile, you can select a primary email address to be “public” which provides an email entry for this endpoint. If you do not set a public email address for `email`, then it will have a value of `null`. You only see publicly visible email addresses when authenticated with GitHub. For more information, see [Authentication](https://docs.github.com/rest/overview/resources-in-the-rest-api#authentication).

The Emails API enables you to list all of your email addresses, and toggle a primary email to be visible publicly. For more information, see "[Emails API](https://docs.github.com/rest/reference/users#emails)".

API method documentation: [https://docs.github.com/rest/reference/users#get-a-user](https://docs.github.com/rest/reference/users#get-a-user)

```java
CompletableFuture<UsersGetByUsernameResponse> usersGetByUsernameAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

`UsersGetByUsernameResponse`

## Example Usage

```java
String username = "username0";

usersController.usersGetByUsernameAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response

```
{
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
  "site_admin": false,
  "name": "monalisa octocat",
  "company": "GitHub",
  "blog": "https://github.com/blog",
  "location": "San Francisco",
  "email": "octocat@github.com",
  "hireable": false,
  "bio": "There once was...",
  "twitter_username": "monatheoctocat",
  "public_repos": 2,
  "public_gists": 1,
  "followers": 20,
  "following": 0,
  "created_at": "2008-01-14T04:33:35Z",
  "updated_at": "2008-01-14T04:33:35Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`Users404ErrorException`](../../doc/models/users-404-error-exception.md) |


# Users List-Followers-for-User

Lists the people following the specified user.

API method documentation: [https://docs.github.com/rest/reference/users#list-followers-of-a-user](https://docs.github.com/rest/reference/users#list-followers-of-a-user)

```java
CompletableFuture<List<SimpleUser>> usersListFollowersForUserAsync(
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

usersController.usersListFollowersForUserAsync(username, perPage, page).thenAccept(result -> {
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
  }
]
```


# Users List-Following-for-User

Lists the people who the specified user follows.

API method documentation: [https://docs.github.com/rest/reference/users#list-the-people-a-user-follows](https://docs.github.com/rest/reference/users#list-the-people-a-user-follows)

```java
CompletableFuture<List<SimpleUser>> usersListFollowingForUserAsync(
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SimpleUser>`](../../doc/models/simple-user.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

usersController.usersListFollowingForUserAsync(username, perPage, page).thenAccept(result -> {
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
  }
]
```


# Users Check-Following-for-User

Check if a user follows another user

API method documentation: [https://docs.github.com/rest/reference/users#check-if-a-user-follows-another-user](https://docs.github.com/rest/reference/users#check-if-a-user-follows-another-user)

```java
CompletableFuture<Void> usersCheckFollowingForUserAsync(
    final String username,
    final String targetUser)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `targetUser` | `String` | Template, Required | - |

## Response Type

`void`

## Example Usage

```java
String username = "username0";
String targetUser = "target_user4";

usersController.usersCheckFollowingForUserAsync(username, targetUser).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | if the user does not follow the target user | `ApiException` |


# Users List-Gpg-Keys-for-User

Lists the GPG keys for a user. This information is accessible by anyone.

API method documentation: [https://docs.github.com/rest/reference/users#list-gpg-keys-for-a-user](https://docs.github.com/rest/reference/users#list-gpg-keys-for-a-user)

```java
CompletableFuture<List<GPGKey>> usersListGpgKeysForUserAsync(
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<GPGKey>`](../../doc/models/gpg-key.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

usersController.usersListGpgKeysForUserAsync(username, perPage, page).thenAccept(result -> {
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
    "id": 3,
    "name": "Octocat's GPG Key",
    "primary_key_id": 2,
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
        "expires_at": "2016-03-24T11:31:04-07:00",
        "revoked": false
      }
    ],
    "can_sign": true,
    "can_encrypt_comms": false,
    "can_encrypt_storage": false,
    "can_certify": true,
    "created_at": "2016-03-24T11:31:04-06:00",
    "expires_at": "2016-03-24T11:31:04-07:00",
    "revoked": false,
    "raw_key": "string"
  }
]
```


# Users Get-Context-for-User

Provides hovercard information when authenticated through basic auth or OAuth with the `repo` scope. You can find out more about someone in relation to their pull requests, issues, repositories, and organizations.

The `subject_type` and `subject_id` parameters provide context for the person's hovercard, which returns more information than without the parameters. For example, if you wanted to find out more about `octocat` who owns the `Spoon-Knife` repository via cURL, it would look like this:

```shell
 curl -u username:token
  https://api.github.com/users/octocat/hovercard?subject_type=repository&subject_id=1300192
```

API method documentation: [https://docs.github.com/rest/reference/users#get-contextual-information-for-a-user](https://docs.github.com/rest/reference/users#get-contextual-information-for-a-user)

```java
CompletableFuture<UsersHovercardResponse> usersGetContextForUserAsync(
    final String username,
    final SubjectType1Enum subjectType,
    final String subjectId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `subjectType` | [`SubjectType1Enum`](../../doc/models/subject-type-1-enum.md) | Query, Optional | Identifies which additional information you'd like to receive about the person's hovercard. Can be `organization`, `repository`, `issue`, `pull_request`. **Required** when using `subject_id`. |
| `subjectId` | `String` | Query, Optional | Uses the ID for the `subject_type` you specified. **Required** when using `subject_type`. |

## Response Type

[`UsersHovercardResponse`](../../doc/models/users-hovercard-response.md)

## Example Usage

```java
String username = "username0";

usersController.usersGetContextForUserAsync(username, null, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "contexts": [
    {
      "message": "Owns this repository",
      "octicon": "repo"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`UsersHovercard404ErrorException`](../../doc/models/users-hovercard-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`UsersHovercard422ErrorException`](../../doc/models/users-hovercard-422-error-exception.md) |


# Users List-Public-Keys-for-User

Lists the _verified_ public SSH keys for a user. This is accessible by anyone.

API method documentation: [https://docs.github.com/rest/reference/users#list-public-keys-for-a-user](https://docs.github.com/rest/reference/users#list-public-keys-for-a-user)

```java
CompletableFuture<List<KeySimple>> usersListPublicKeysForUserAsync(
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<KeySimple>`](../../doc/models/key-simple.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

usersController.usersListPublicKeysForUserAsync(username, perPage, page).thenAccept(result -> {
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
    "id": 1,
    "key": "ssh-rsa AAA..."
  }
]
```


# Users List-Ssh-Signing-Keys-for-User

Lists the SSH signing keys for a user. This operation is accessible by anyone.

API method documentation: [https://docs.github.com/rest/reference/users#list-ssh-signing-keys-for-a-user](https://docs.github.com/rest/reference/users#list-ssh-signing-keys-for-a-user)

```java
CompletableFuture<List<SSHSigningKey>> usersListSshSigningKeysForUserAsync(
    final String username,
    final Integer perPage,
    final Integer page)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |

## Response Type

[`List<SSHSigningKey>`](../../doc/models/ssh-signing-key.md)

## Example Usage

```java
String username = "username0";
Integer perPage = 30;
Integer page = 1;

usersController.usersListSshSigningKeysForUserAsync(username, perPage, page).thenAccept(result -> {
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
    "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
    "id": 2,
    "url": "https://api.github.com/user/keys/2",
    "title": "ssh-rsa AAAAB3NzaC1yc2EAAA",
    "created_at": "2020-06-11T21:31:57Z"
  },
  {
    "key": "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJy931234",
    "id": 3,
    "url": "https://api.github.com/user/keys/3",
    "title": "ssh-rsa AAAAB3NzaC1yc2EAAB",
    "created_at": "2020-07-11T21:31:57Z"
  }
]
```

