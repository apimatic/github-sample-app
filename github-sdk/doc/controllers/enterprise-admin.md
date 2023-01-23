# Enterprise-Admin

Administer a GitHub enterprise.

```java
EnterpriseAdminController enterpriseAdminController = client.getEnterpriseAdminController();
```

## Class Name

`EnterpriseAdminController`

## Methods

* [Enterprise-Admin Enable-Selected-Organization-Github-Actions-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-enable-selected-organization-github-actions-enterprise)
* [Enterprise-Admin List-Self-Hosted-Runner-Groups-for-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-list-self-hosted-runner-groups-for-enterprise)
* [Enterprise-Admin Create-Self-Hosted-Runner-Group-for-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-create-self-hosted-runner-group-for-enterprise)
* [Enterprise-Admin Get-Self-Hosted-Runner-Group-for-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-get-self-hosted-runner-group-for-enterprise)
* [Enterprise-Admin Add-Org-Access-to-Self-Hosted-Runner-Group-in-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-add-org-access-to-self-hosted-runner-group-in-enterprise)
* [Enterprise-Admin Remove-Self-Hosted-Runner-From-Group-for-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-remove-self-hosted-runner-from-group-for-enterprise)
* [Enterprise-Admin Delete-Self-Hosted-Runner-From-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-delete-self-hosted-runner-from-enterprise)
* [Enterprise-Admin List-Labels-for-Self-Hosted-Runner-for-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-list-labels-for-self-hosted-runner-for-enterprise)
* [Enterprise-Admin Add-Custom-Labels-to-Self-Hosted-Runner-for-Enterprise](../../doc/controllers/enterprise-admin.md#enterprise-admin-add-custom-labels-to-self-hosted-runner-for-enterprise)
* [Secret-Scanning Get-Security-Analysis-Settings-for-Enterprise](../../doc/controllers/enterprise-admin.md#secret-scanning-get-security-analysis-settings-for-enterprise)
* [Secret-Scanning Patch-Security-Analysis-Settings-for-Enterprise](../../doc/controllers/enterprise-admin.md#secret-scanning-patch-security-analysis-settings-for-enterprise)
* [Secret-Scanning Post-Security-Product-Enablement-for-Enterprise](../../doc/controllers/enterprise-admin.md#secret-scanning-post-security-product-enablement-for-enterprise)


# Enterprise-Admin Enable-Selected-Organization-Github-Actions-Enterprise

Adds an organization to the list of selected organizations that are enabled for GitHub Actions in an enterprise. To use this endpoint, the enterprise permission policy for `enabled_organizations` must be configured to `selected`. For more information, see "[Set GitHub Actions permissions for an enterprise](#set-github-actions-permissions-for-an-enterprise)."

You must authenticate using an access token with the `admin:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#enable-a-selected-organization-for-github-actions-in-an-enterprise](https://docs.github.com/rest/reference/actions#enable-a-selected-organization-for-github-actions-in-an-enterprise)

```java
CompletableFuture<Void> enterpriseAdminEnableSelectedOrganizationGithubActionsEnterpriseAsync(
    final String enterprise,
    final int orgId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `orgId` | `int` | Template, Required | The unique identifier of the organization. |

## Response Type

`void`

## Example Usage

```java
String enterprise = "enterprise4";
int orgId = 200;

enterpriseAdminController.enterpriseAdminEnableSelectedOrganizationGithubActionsEnterpriseAsync(enterprise, orgId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Enterprise-Admin List-Self-Hosted-Runner-Groups-for-Enterprise

Lists all self-hosted runner groups for an enterprise.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-self-hosted-runner-groups-for-an-enterprise](https://docs.github.com/rest/reference/actions#list-self-hosted-runner-groups-for-an-enterprise)

```java
CompletableFuture<EnterprisesActionsRunnerGroupsResponse> enterpriseAdminListSelfHostedRunnerGroupsForEnterpriseAsync(
    final String enterprise,
    final Integer perPage,
    final Integer page,
    final String visibleToOrganization)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `perPage` | `Integer` | Query, Optional | The number of results per page (max 100).<br>**Default**: `30` |
| `page` | `Integer` | Query, Optional | Page number of the results to fetch.<br>**Default**: `1` |
| `visibleToOrganization` | `String` | Query, Optional | Only return runner groups that are allowed to be used by this organization. |

## Response Type

[`EnterprisesActionsRunnerGroupsResponse`](../../doc/models/enterprises-actions-runner-groups-response.md)

## Example Usage

```java
String enterprise = "enterprise4";
Integer perPage = 30;
Integer page = 1;

enterpriseAdminController.enterpriseAdminListSelfHostedRunnerGroupsForEnterpriseAsync(enterprise, perPage, page, null).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 3,
  "runner_groups": [
    {
      "id": 1,
      "name": "Default",
      "visibility": "all",
      "default": true,
      "runners_url": "https://api.github.com/enterprises/octo-corp/actions/runner_groups/1/runners",
      "allows_public_repositories": false,
      "restricted_to_workflows": false,
      "selected_workflows": [],
      "workflow_restrictions_read_only": false
    },
    {
      "id": 2,
      "name": "octo-runner-group",
      "visibility": "selected",
      "default": false,
      "selected_organizations_url": "https://api.github.com/enterprises/octo-corp/actions/runner_groups/2/organizations",
      "runners_url": "https://api.github.com/enterprises/octo-corp/actions/runner_groups/2/runners",
      "allows_public_repositories": true,
      "restricted_to_workflows": true,
      "selected_workflows": [
        "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
      ],
      "workflow_restrictions_read_only": false
    },
    {
      "id": 3,
      "name": "expensive-hardware",
      "visibility": "private",
      "default": false,
      "runners_url": "https://api.github.com/enterprises/octo-corp/actions/runner_groups/3/runners",
      "allows_public_repositories": true,
      "restricted_to_workflows": false,
      "selected_workflows": [
        "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
      ],
      "workflow_restrictions_read_only": false
    }
  ]
}
```


# Enterprise-Admin Create-Self-Hosted-Runner-Group-for-Enterprise

Creates a new self-hosted runner group for an enterprise.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#create-self-hosted-runner-group-for-an-enterprise](https://docs.github.com/rest/reference/actions#create-self-hosted-runner-group-for-an-enterprise)

```java
CompletableFuture<RunnerGroupsEnterprise> enterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseAsync(
    final String enterprise,
    final EnterprisesActionsRunnerGroupsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `body` | [`EnterprisesActionsRunnerGroupsRequest`](../../doc/models/enterprises-actions-runner-groups-request.md) | Body, Required | - |

## Response Type

[`RunnerGroupsEnterprise`](../../doc/models/runner-groups-enterprise.md)

## Example Usage

```java
String enterprise = "enterprise4";
EnterprisesActionsRunnerGroupsRequest body = new EnterprisesActionsRunnerGroupsRequest();
body.setName("Expensive hardware runners");
body.setVisibility(Visibility78Enum.SELECTED);
List<Integer> selectedOrganizationIds = new LinkedList<>();
selectedOrganizationIds.add(32);
selectedOrganizationIds.add(91);

body.setSelectedOrganizationIds(selectedOrganizationIds);
List<Integer> runners = new LinkedList<>();
runners.add(9);
runners.add(2);

body.setRunners(runners);

enterpriseAdminController.enterpriseAdminCreateSelfHostedRunnerGroupForEnterpriseAsync(enterprise, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 2,
  "name": "octo-runner-group",
  "visibility": "selected",
  "default": false,
  "selected_organizations_url": "https://api.github.com/enterprises/octo-corp/actions/runner-groups/2/organizations",
  "runners_url": "https://api.github.com/enterprises/octo-corp/actions/runner-groups/2/runners",
  "allows_public_repositories": false,
  "restricted_to_workflows": true,
  "selected_workflows": [
    "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
  ],
  "workflow_restrictions_read_only": false
}
```


# Enterprise-Admin Get-Self-Hosted-Runner-Group-for-Enterprise

Gets a specific self-hosted runner group for an enterprise.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-group-for-an-enterprise](https://docs.github.com/rest/reference/actions#get-a-self-hosted-runner-group-for-an-enterprise)

```java
CompletableFuture<RunnerGroupsEnterprise> enterpriseAdminGetSelfHostedRunnerGroupForEnterpriseAsync(
    final String enterprise,
    final int runnerGroupId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |

## Response Type

[`RunnerGroupsEnterprise`](../../doc/models/runner-groups-enterprise.md)

## Example Usage

```java
String enterprise = "enterprise4";
int runnerGroupId = 142;

enterpriseAdminController.enterpriseAdminGetSelfHostedRunnerGroupForEnterpriseAsync(enterprise, runnerGroupId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "id": 2,
  "name": "octo-runner-group",
  "visibility": "selected",
  "default": false,
  "selected_organizations_url": "https://api.github.com/enterprises/octo-corp/actions/runner-groups/2/organizations",
  "runners_url": "https://api.github.com/enterprises/octo-corp/actions/runner-groups/2/runners",
  "allows_public_repositories": false,
  "restricted_to_workflows": true,
  "selected_workflows": [
    "octo-org/octo-repo/.github/workflows/deploy.yaml@refs/heads/main"
  ],
  "workflow_restrictions_read_only": false
}
```


# Enterprise-Admin Add-Org-Access-to-Self-Hosted-Runner-Group-in-Enterprise

Adds an organization to the list of selected organizations that can access a self-hosted runner group. The runner group must have `visibility` set to `selected`. For more information, see "[Create a self-hosted runner group for an enterprise](#create-a-self-hosted-runner-group-for-an-enterprise)."

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#add-organization-access-to-a-self-hosted-runner-group-in-an-enterprise](https://docs.github.com/rest/reference/actions#add-organization-access-to-a-self-hosted-runner-group-in-an-enterprise)

```java
CompletableFuture<Void> enterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseAsync(
    final String enterprise,
    final int runnerGroupId,
    final int orgId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `orgId` | `int` | Template, Required | The unique identifier of the organization. |

## Response Type

`void`

## Example Usage

```java
String enterprise = "enterprise4";
int runnerGroupId = 142;
int orgId = 200;

enterpriseAdminController.enterpriseAdminAddOrgAccessToSelfHostedRunnerGroupInEnterpriseAsync(enterprise, runnerGroupId, orgId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Enterprise-Admin Remove-Self-Hosted-Runner-From-Group-for-Enterprise

Removes a self-hosted runner from a group configured in an enterprise. The runner is then returned to the default group.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#remove-a-self-hosted-runner-from-a-group-for-an-enterprise](https://docs.github.com/rest/reference/actions#remove-a-self-hosted-runner-from-a-group-for-an-enterprise)

```java
CompletableFuture<Void> enterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseAsync(
    final String enterprise,
    final int runnerGroupId,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `runnerGroupId` | `int` | Template, Required | Unique identifier of the self-hosted runner group. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

`void`

## Example Usage

```java
String enterprise = "enterprise4";
int runnerGroupId = 142;
int runnerId = 22;

enterpriseAdminController.enterpriseAdminRemoveSelfHostedRunnerFromGroupForEnterpriseAsync(enterprise, runnerGroupId, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Enterprise-Admin Delete-Self-Hosted-Runner-From-Enterprise

Forces the removal of a self-hosted runner from an enterprise. You can use this endpoint to completely remove the runner when the machine you were using no longer exists.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#delete-self-hosted-runner-from-an-enterprise](https://docs.github.com/rest/reference/actions#delete-self-hosted-runner-from-an-enterprise)

```java
CompletableFuture<Void> enterpriseAdminDeleteSelfHostedRunnerFromEnterpriseAsync(
    final String enterprise,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

`void`

## Example Usage

```java
String enterprise = "enterprise4";
int runnerId = 22;

enterpriseAdminController.enterpriseAdminDeleteSelfHostedRunnerFromEnterpriseAsync(enterprise, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```


# Enterprise-Admin List-Labels-for-Self-Hosted-Runner-for-Enterprise

Lists all labels for a self-hosted runner configured in an enterprise.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#list-labels-for-a-self-hosted-runner-for-an-enterprise](https://docs.github.com/rest/reference/actions#list-labels-for-a-self-hosted-runner-for-an-enterprise)

```java
CompletableFuture<ActionsRunnerLabels> enterpriseAdminListLabelsForSelfHostedRunnerForEnterpriseAsync(
    final String enterprise,
    final int runnerId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String enterprise = "enterprise4";
int runnerId = 22;

enterpriseAdminController.enterpriseAdminListLabelsForSelfHostedRunnerForEnterpriseAsync(enterprise, runnerId).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`EnterprisesActionsRunnersLabels404ErrorException`](../../doc/models/enterprises-actions-runners-labels-404-error-exception.md) |


# Enterprise-Admin Add-Custom-Labels-to-Self-Hosted-Runner-for-Enterprise

Add custom labels to a self-hosted runner configured in an enterprise.

You must authenticate using an access token with the `manage_runners:enterprise` scope to use this endpoint.

API method documentation: [https://docs.github.com/rest/reference/actions#add-custom-labels-to-a-self-hosted-runner-for-an-enterprise](https://docs.github.com/rest/reference/actions#add-custom-labels-to-a-self-hosted-runner-for-an-enterprise)

```java
CompletableFuture<ActionsRunnerLabels> enterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseAsync(
    final String enterprise,
    final int runnerId,
    final EnterprisesActionsRunnersLabelsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `runnerId` | `int` | Template, Required | Unique identifier of the self-hosted runner. |
| `body` | [`EnterprisesActionsRunnersLabelsRequest`](../../doc/models/enterprises-actions-runners-labels-request.md) | Body, Required | - |

## Response Type

[`ActionsRunnerLabels`](../../doc/models/actions-runner-labels.md)

## Example Usage

```java
String enterprise = "enterprise4";
int runnerId = 22;
EnterprisesActionsRunnersLabelsRequest body = new EnterprisesActionsRunnersLabelsRequest();
List<String> labels = new LinkedList<>();
labels.add("gpu");
labels.add("accelerated");

body.setLabels(labels);

enterpriseAdminController.enterpriseAdminAddCustomLabelsToSelfHostedRunnerForEnterpriseAsync(enterprise, runnerId, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "total_count": 4,
  "labels": [
    {
      "id": 5,
      "name": "self-hosted",
      "type": "read-only"
    },
    {
      "id": 7,
      "name": "X64",
      "type": "read-only"
    },
    {
      "id": 20,
      "name": "macOS",
      "type": "read-only"
    },
    {
      "id": 21,
      "name": "no-gpu",
      "type": "custom"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`EnterprisesActionsRunnersLabels404ErrorException`](../../doc/models/enterprises-actions-runners-labels-404-error-exception.md) |
| 422 | Validation failed, or the endpoint has been spammed. | [`EnterprisesActionsRunnersLabels422ErrorException`](../../doc/models/enterprises-actions-runners-labels-422-error-exception.md) |


# Secret-Scanning Get-Security-Analysis-Settings-for-Enterprise

Gets code security and analysis settings for the specified enterprise.
To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.

API method documentation: [https://docs.github.com/rest/enterprise-admin#get-code-security-analysis-features-for-an-enterprise](https://docs.github.com/rest/enterprise-admin#get-code-security-analysis-features-for-an-enterprise)

```java
CompletableFuture<EnterpriseSecurityAnalysisSettings> secretScanningGetSecurityAnalysisSettingsForEnterpriseAsync(
    final String enterprise)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |

## Response Type

[`EnterpriseSecurityAnalysisSettings`](../../doc/models/enterprise-security-analysis-settings.md)

## Example Usage

```java
String enterprise = "enterprise4";

enterpriseAdminController.secretScanningGetSecurityAnalysisSettingsForEnterpriseAsync(enterprise).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "advanced_security_enabled_for_new_repositories": true,
  "secret_scanning_enabled_for_new_repositories": true,
  "secret_scanning_push_protection_enabled_for_new_repositories": true,
  "secret_scanning_push_protection_custom_link": "https://github.com/test-org/test-repo/blob/main/README.md"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`EnterprisesCodeSecurityAndAnalysis404ErrorException`](../../doc/models/enterprises-code-security-and-analysis-404-error-exception.md) |


# Secret-Scanning Patch-Security-Analysis-Settings-for-Enterprise

Updates the settings for advanced security, secret scanning, and push protection for new repositories in an enterprise.
To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.

API method documentation: [https://docs.github.com/rest/enterprise-admin#update-code-security-and-analysis-features-for-an-enterprise](https://docs.github.com/rest/enterprise-admin#update-code-security-and-analysis-features-for-an-enterprise)

```java
CompletableFuture<Void> secretScanningPatchSecurityAnalysisSettingsForEnterpriseAsync(
    final String enterprise,
    final EnterprisesCodeSecurityAndAnalysisRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `body` | [`EnterprisesCodeSecurityAndAnalysisRequest`](../../doc/models/enterprises-code-security-and-analysis-request.md) | Body, Optional | - |

## Response Type

`void`

## Example Usage

```java
String enterprise = "enterprise4";
EnterprisesCodeSecurityAndAnalysisRequest body = new EnterprisesCodeSecurityAndAnalysisRequest();
body.setAdvancedSecurityEnabledForNewRepositories(true);
body.setSecretScanningEnabledForNewRepositories(true);
body.setSecretScanningPushProtectionEnabledForNewRepositories(true);
body.setSecretScanningPushProtectionCustomLink("https://github.com/test-org/test-repo/blob/main/README.md");

enterpriseAdminController.secretScanningPatchSecurityAnalysisSettingsForEnterpriseAsync(enterprise, body).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`EnterprisesCodeSecurityAndAnalysis404ErrorException`](../../doc/models/enterprises-code-security-and-analysis-404-error-exception.md) |
| 422 | The action could not be taken due to an in progress enablement, or a policy is preventing enablement | `ApiException` |


# Secret-Scanning Post-Security-Product-Enablement-for-Enterprise

Enables or disables the specified security feature for all repositories in an enterprise.

To use this endpoint, you must be an administrator of the enterprise, and you must use an access token with the `admin:enterprise` scope.

API method documentation: [https://docs.github.com/rest/enterprise-admin#enable-or-disable-a-security-feature](https://docs.github.com/rest/enterprise-admin#enable-or-disable-a-security-feature)

```java
CompletableFuture<Void> secretScanningPostSecurityProductEnablementForEnterpriseAsync(
    final String enterprise,
    final SecurityProduct2Enum securityProduct,
    final Enablement1Enum enablement)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `enterprise` | `String` | Template, Required | The slug version of the enterprise name. You can also substitute this value with the enterprise id. |
| `securityProduct` | [`SecurityProduct2Enum`](../../doc/models/security-product-2-enum.md) | Template, Required | The security feature to enable or disable. |
| `enablement` | [`Enablement1Enum`](../../doc/models/enablement-1-enum.md) | Template, Required | The action to take.<br><br>`enable_all` means to enable the specified security feature for all repositories in the enterprise.<br>`disable_all` means to disable the specified security feature for all repositories in the enterprise. |

## Response Type

`void`

## Example Usage

```java
String enterprise = "enterprise4";
SecurityProduct2Enum securityProduct = SecurityProduct2Enum.SECRET_SCANNING;
Enablement1Enum enablement = Enablement1Enum.ENABLE_ALL;

enterpriseAdminController.secretScanningPostSecurityProductEnablementForEnterpriseAsync(enterprise, securityProduct, enablement).thenAccept(result -> {
    // TODO success callback handler
}).exceptionally(exception -> {
    // TODO failure callback handler
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 404 | Resource not found | [`EnterprisesEnablement404ErrorException`](../../doc/models/enterprises-enablement-404-error-exception.md) |
| 422 | The action could not be taken due to an in progress enablement, or a policy is preventing enablement | `ApiException` |

