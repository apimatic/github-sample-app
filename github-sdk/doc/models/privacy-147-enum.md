
# Privacy 147 Enum

The level of privacy this team should have. Editing teams without specifying this parameter leaves `privacy` intact. When a team is nested, the `privacy` for parent teams cannot be `secret`. The options are:  
**For a non-nested team:**

* `secret` - only visible to organization owners and members of this team.
* `closed` - visible to all members of this organization.  
  **For a parent or child team:**
* `closed` - visible to all members of this organization.

## Enumeration

`Privacy147Enum`

## Fields

| Name |
|  --- |
| `Secret` |
| `Closed` |

