
# Orgs Request

## Structure

`OrgsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BillingEmail` | `String` | Optional | Billing email address. This address is not publicized. | String getBillingEmail() | setBillingEmail(String billingEmail) |
| `Company` | `String` | Optional | The company name. | String getCompany() | setCompany(String company) |
| `Email` | `String` | Optional | The publicly visible email address. | String getEmail() | setEmail(String email) |
| `TwitterUsername` | `String` | Optional | The Twitter username of the company. | String getTwitterUsername() | setTwitterUsername(String twitterUsername) |
| `Location` | `String` | Optional | The location. | String getLocation() | setLocation(String location) |
| `Name` | `String` | Optional | The shorthand name of the company. | String getName() | setName(String name) |
| `Description` | `String` | Optional | The description of the company. | String getDescription() | setDescription(String description) |
| `HasOrganizationProjects` | `Boolean` | Optional | Whether an organization can use organization projects. | Boolean getHasOrganizationProjects() | setHasOrganizationProjects(Boolean hasOrganizationProjects) |
| `HasRepositoryProjects` | `Boolean` | Optional | Whether repositories that belong to the organization can use repository projects. | Boolean getHasRepositoryProjects() | setHasRepositoryProjects(Boolean hasRepositoryProjects) |
| `DefaultRepositoryPermission` | [`DefaultRepositoryPermissionEnum`](../../doc/models/default-repository-permission-enum.md) | Optional | - | DefaultRepositoryPermissionEnum getDefaultRepositoryPermission() | setDefaultRepositoryPermission(DefaultRepositoryPermissionEnum defaultRepositoryPermission) |
| `MembersCanCreateRepositories` | `Boolean` | Optional | Whether of non-admin organization members can create repositories. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.<br>**Default**: `true` | Boolean getMembersCanCreateRepositories() | setMembersCanCreateRepositories(Boolean membersCanCreateRepositories) |
| `MembersCanCreateInternalRepositories` | `Boolean` | Optional | Whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation. | Boolean getMembersCanCreateInternalRepositories() | setMembersCanCreateInternalRepositories(Boolean membersCanCreateInternalRepositories) |
| `MembersCanCreatePrivateRepositories` | `Boolean` | Optional | Whether organization members can create private repositories, which are visible to organization members with permission. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation. | Boolean getMembersCanCreatePrivateRepositories() | setMembersCanCreatePrivateRepositories(Boolean membersCanCreatePrivateRepositories) |
| `MembersCanCreatePublicRepositories` | `Boolean` | Optional | Whether organization members can create public repositories, which are visible to anyone. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation. | Boolean getMembersCanCreatePublicRepositories() | setMembersCanCreatePublicRepositories(Boolean membersCanCreatePublicRepositories) |
| `MembersAllowedRepositoryCreationType` | [`MembersAllowedRepositoryCreationTypeEnum`](../../doc/models/members-allowed-repository-creation-type-enum.md) | Optional | - | MembersAllowedRepositoryCreationTypeEnum getMembersAllowedRepositoryCreationType() | setMembersAllowedRepositoryCreationType(MembersAllowedRepositoryCreationTypeEnum membersAllowedRepositoryCreationType) |
| `MembersCanCreatePages` | `Boolean` | Optional | Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.<br>**Default**: `true` | Boolean getMembersCanCreatePages() | setMembersCanCreatePages(Boolean membersCanCreatePages) |
| `MembersCanCreatePublicPages` | `Boolean` | Optional | Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.<br>**Default**: `true` | Boolean getMembersCanCreatePublicPages() | setMembersCanCreatePublicPages(Boolean membersCanCreatePublicPages) |
| `MembersCanCreatePrivatePages` | `Boolean` | Optional | Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted.<br>**Default**: `true` | Boolean getMembersCanCreatePrivatePages() | setMembersCanCreatePrivatePages(Boolean membersCanCreatePrivatePages) |
| `MembersCanForkPrivateRepositories` | `Boolean` | Optional | Whether organization members can fork private organization repositories.<br>**Default**: `false` | Boolean getMembersCanForkPrivateRepositories() | setMembersCanForkPrivateRepositories(Boolean membersCanForkPrivateRepositories) |
| `WebCommitSignoffRequired` | `Boolean` | Optional | Whether contributors to organization repositories are required to sign off on commits they make through GitHub's web interface.<br>**Default**: `false` | Boolean getWebCommitSignoffRequired() | setWebCommitSignoffRequired(Boolean webCommitSignoffRequired) |
| `Blog` | `String` | Optional | - | String getBlog() | setBlog(String blog) |
| `AdvancedSecurityEnabledForNewRepositories` | `Boolean` | Optional | Whether GitHub Advanced Security is automatically enabled for new repositories.<br><br>To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."<br><br>You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. | Boolean getAdvancedSecurityEnabledForNewRepositories() | setAdvancedSecurityEnabledForNewRepositories(Boolean advancedSecurityEnabledForNewRepositories) |
| `DependabotAlertsEnabledForNewRepositories` | `Boolean` | Optional | Whether Dependabot alerts is automatically enabled for new repositories.<br><br>To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."<br><br>You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. | Boolean getDependabotAlertsEnabledForNewRepositories() | setDependabotAlertsEnabledForNewRepositories(Boolean dependabotAlertsEnabledForNewRepositories) |
| `DependabotSecurityUpdatesEnabledForNewRepositories` | `Boolean` | Optional | Whether Dependabot security updates is automatically enabled for new repositories.<br><br>To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."<br><br>You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. | Boolean getDependabotSecurityUpdatesEnabledForNewRepositories() | setDependabotSecurityUpdatesEnabledForNewRepositories(Boolean dependabotSecurityUpdatesEnabledForNewRepositories) |
| `DependencyGraphEnabledForNewRepositories` | `Boolean` | Optional | Whether dependency graph is automatically enabled for new repositories.<br><br>To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."<br><br>You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. | Boolean getDependencyGraphEnabledForNewRepositories() | setDependencyGraphEnabledForNewRepositories(Boolean dependencyGraphEnabledForNewRepositories) |
| `SecretScanningEnabledForNewRepositories` | `Boolean` | Optional | Whether secret scanning is automatically enabled for new repositories.<br><br>To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."<br><br>You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. | Boolean getSecretScanningEnabledForNewRepositories() | setSecretScanningEnabledForNewRepositories(Boolean secretScanningEnabledForNewRepositories) |
| `SecretScanningPushProtectionEnabledForNewRepositories` | `Boolean` | Optional | Whether secret scanning push protection is automatically enabled for new repositories.<br><br>To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the organization that owns the repository. For more information, see "[Managing security managers in your organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-security-managers-in-your-organization)."<br><br>You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request. | Boolean getSecretScanningPushProtectionEnabledForNewRepositories() | setSecretScanningPushProtectionEnabledForNewRepositories(Boolean secretScanningPushProtectionEnabledForNewRepositories) |
| `SecretScanningPushProtectionCustomLinkEnabled` | `Boolean` | Optional | Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection. | Boolean getSecretScanningPushProtectionCustomLinkEnabled() | setSecretScanningPushProtectionCustomLinkEnabled(Boolean secretScanningPushProtectionCustomLinkEnabled) |
| `SecretScanningPushProtectionCustomLink` | `String` | Optional | If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors who are blocked from pushing a secret. | String getSecretScanningPushProtectionCustomLink() | setSecretScanningPushProtectionCustomLink(String secretScanningPushProtectionCustomLink) |

## Example (as JSON)

```json
{
  "billing_email": null,
  "company": null,
  "email": null,
  "twitter_username": null,
  "location": null,
  "name": null,
  "description": null,
  "has_organization_projects": null,
  "has_repository_projects": null,
  "default_repository_permission": null,
  "members_can_create_repositories": null,
  "members_can_create_internal_repositories": null,
  "members_can_create_private_repositories": null,
  "members_can_create_public_repositories": null,
  "members_allowed_repository_creation_type": null,
  "members_can_create_pages": null,
  "members_can_create_public_pages": null,
  "members_can_create_private_pages": null,
  "members_can_fork_private_repositories": null,
  "web_commit_signoff_required": null,
  "blog": null,
  "advanced_security_enabled_for_new_repositories": null,
  "dependabot_alerts_enabled_for_new_repositories": null,
  "dependabot_security_updates_enabled_for_new_repositories": null,
  "dependency_graph_enabled_for_new_repositories": null,
  "secret_scanning_enabled_for_new_repositories": null,
  "secret_scanning_push_protection_enabled_for_new_repositories": null,
  "secret_scanning_push_protection_custom_link_enabled": null,
  "secret_scanning_push_protection_custom_link": null
}
```

