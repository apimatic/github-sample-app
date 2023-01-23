# Billing

Monitor charges and usage from Actions and Packages.

```java
BillingController billingController = client.getBillingController();
```

## Class Name

`BillingController`

## Methods

* [Billing Get-Github-Actions-Billing-Org](../../doc/controllers/billing.md#billing-get-github-actions-billing-org)
* [Billing Get-Github-Packages-Billing-Org](../../doc/controllers/billing.md#billing-get-github-packages-billing-org)
* [Billing Get-Shared-Storage-Billing-Org](../../doc/controllers/billing.md#billing-get-shared-storage-billing-org)
* [Billing Get-Github-Actions-Billing-User](../../doc/controllers/billing.md#billing-get-github-actions-billing-user)
* [Billing Get-Github-Packages-Billing-User](../../doc/controllers/billing.md#billing-get-github-packages-billing-user)
* [Billing Get-Shared-Storage-Billing-User](../../doc/controllers/billing.md#billing-get-shared-storage-billing-user)


# Billing Get-Github-Actions-Billing-Org

Gets the summary of the free and paid GitHub Actions minutes used.

Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".

Access tokens must have the `repo` or `admin:org` scope.

API method documentation: [https://docs.github.com/rest/reference/billing#get-github-actions-billing-for-an-organization](https://docs.github.com/rest/reference/billing#get-github-actions-billing-for-an-organization)

```java
CompletableFuture<ActionsBillingUsage> billingGetGithubActionsBillingOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`ActionsBillingUsage`](../../doc/models/actions-billing-usage.md)

## Example Usage

```java
String org = "org6";

billingController.billingGetGithubActionsBillingOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_minutes_used": 305,
  "total_paid_minutes_used": 0,
  "included_minutes": 3000,
  "minutes_used_breakdown": {
    "UBUNTU": 205,
    "MACOS": 10,
    "WINDOWS": 90
  }
}
```


# Billing Get-Github-Packages-Billing-Org

Gets the free and paid storage used for GitHub Packages in gigabytes.

Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."

Access tokens must have the `repo` or `admin:org` scope.

API method documentation: [https://docs.github.com/rest/reference/billing#get-github-packages-billing-for-an-organization](https://docs.github.com/rest/reference/billing#get-github-packages-billing-for-an-organization)

```java
CompletableFuture<PackagesBillingUsage> billingGetGithubPackagesBillingOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`PackagesBillingUsage`](../../doc/models/packages-billing-usage.md)

## Example Usage

```java
String org = "org6";

billingController.billingGetGithubPackagesBillingOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_gigabytes_bandwidth_used": 50,
  "total_paid_gigabytes_bandwidth_used": 40,
  "included_gigabytes_bandwidth": 10
}
```


# Billing Get-Shared-Storage-Billing-Org

Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.

Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."

Access tokens must have the `repo` or `admin:org` scope.

API method documentation: [https://docs.github.com/rest/reference/billing#get-shared-storage-billing-for-an-organization](https://docs.github.com/rest/reference/billing#get-shared-storage-billing-for-an-organization)

```java
CompletableFuture<CombinedBillingUsage> billingGetSharedStorageBillingOrgAsync(
    final String org)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `org` | `String` | Template, Required | The organization name. The name is not case sensitive. |

## Response Type

[`CombinedBillingUsage`](../../doc/models/combined-billing-usage.md)

## Example Usage

```java
String org = "org6";

billingController.billingGetSharedStorageBillingOrgAsync(org).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "days_left_in_billing_cycle": 20,
  "estimated_paid_storage_for_month": 15,
  "estimated_storage_for_month": 40
}
```


# Billing Get-Github-Actions-Billing-User

Gets the summary of the free and paid GitHub Actions minutes used.

Paid minutes only apply to workflows in private repositories that use GitHub-hosted runners. Minutes used is listed for each GitHub-hosted runner operating system. Any job re-runs are also included in the usage. The usage returned includes any minute multipliers for macOS and Windows runners, and is rounded up to the nearest whole minute. For more information, see "[Managing billing for GitHub Actions](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-actions)".

Access tokens must have the `user` scope.

API method documentation: [https://docs.github.com/rest/reference/billing#get-github-actions-billing-for-a-user](https://docs.github.com/rest/reference/billing#get-github-actions-billing-for-a-user)

```java
CompletableFuture<ActionsBillingUsage> billingGetGithubActionsBillingUserAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`ActionsBillingUsage`](../../doc/models/actions-billing-usage.md)

## Example Usage

```java
String username = "username0";

billingController.billingGetGithubActionsBillingUserAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_minutes_used": 305,
  "total_paid_minutes_used": 0,
  "included_minutes": 3000,
  "minutes_used_breakdown": {
    "UBUNTU": 205,
    "MACOS": 10,
    "WINDOWS": 90
  }
}
```


# Billing Get-Github-Packages-Billing-User

Gets the free and paid storage used for GitHub Packages in gigabytes.

Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."

Access tokens must have the `user` scope.

API method documentation: [https://docs.github.com/rest/reference/billing#get-github-packages-billing-for-a-user](https://docs.github.com/rest/reference/billing#get-github-packages-billing-for-a-user)

```java
CompletableFuture<PackagesBillingUsage> billingGetGithubPackagesBillingUserAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`PackagesBillingUsage`](../../doc/models/packages-billing-usage.md)

## Example Usage

```java
String username = "username0";

billingController.billingGetGithubPackagesBillingUserAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_gigabytes_bandwidth_used": 50,
  "total_paid_gigabytes_bandwidth_used": 40,
  "included_gigabytes_bandwidth": 10
}
```


# Billing Get-Shared-Storage-Billing-User

Gets the estimated paid and estimated total storage used for GitHub Actions and GitHub Packages.

Paid minutes only apply to packages stored for private repositories. For more information, see "[Managing billing for GitHub Packages](https://docs.github.com/github/setting-up-and-managing-billing-and-payments-on-github/managing-billing-for-github-packages)."

Access tokens must have the `user` scope.

API method documentation: [https://docs.github.com/rest/reference/billing#get-shared-storage-billing-for-a-user](https://docs.github.com/rest/reference/billing#get-shared-storage-billing-for-a-user)

```java
CompletableFuture<CombinedBillingUsage> billingGetSharedStorageBillingUserAsync(
    final String username)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `username` | `String` | Template, Required | The handle for the GitHub user account. |

## Response Type

[`CombinedBillingUsage`](../../doc/models/combined-billing-usage.md)

## Example Usage

```java
String username = "username0";

billingController.billingGetSharedStorageBillingUserAsync(username).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "days_left_in_billing_cycle": 20,
  "estimated_paid_storage_for_month": 15,
  "estimated_storage_for_month": 40
}
```

