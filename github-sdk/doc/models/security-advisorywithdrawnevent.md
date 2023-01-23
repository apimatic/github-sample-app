
# Security Advisorywithdrawnevent

## Structure

`SecurityAdvisorywithdrawnevent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Action` | `String` | Required, Constant | **Default**: `"withdrawn"` | String getAction() | setAction(String action) |
| `Enterprise` | [`Enterprise1`](../../doc/models/enterprise-1.md) | Optional | - | Enterprise1 getEnterprise() | setEnterprise(Enterprise1 enterprise) |
| `Installation` | [`Installation1`](../../doc/models/installation-1.md) | Optional | - | Installation1 getInstallation() | setInstallation(Installation1 installation) |
| `Organization` | [`Organization2`](../../doc/models/organization-2.md) | Optional | - | Organization2 getOrganization() | setOrganization(Organization2 organization) |
| `Repository` | [`Repository3`](../../doc/models/repository-3.md) | Optional | - | Repository3 getRepository() | setRepository(Repository3 repository) |
| `SecurityAdvisory` | [`SecurityAdvisory4`](../../doc/models/security-advisory-4.md) | Required | - | SecurityAdvisory4 getSecurityAdvisory() | setSecurityAdvisory(SecurityAdvisory4 securityAdvisory) |
| `Sender` | [`Sender`](../../doc/models/sender.md) | Optional | - | Sender getSender() | setSender(Sender sender) |

## Example (as JSON)

```json
{
  "action": "withdrawn",
  "security_advisory": null
}
```

