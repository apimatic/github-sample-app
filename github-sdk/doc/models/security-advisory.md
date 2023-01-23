
# Security Advisory

The details of the security advisory, including summary, description, and severity.

## Structure

`SecurityAdvisory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cvss` | [`Cvss1`](../../doc/models/cvss-1.md) | Required | - | Cvss1 getCvss() | setCvss(Cvss1 cvss) |
| `Cwes` | [`List<Cwe1>`](../../doc/models/cwe-1.md) | Required | - | List<Cwe1> getCwes() | setCwes(List<Cwe1> cwes) |
| `Description` | `String` | Required | - | String getDescription() | setDescription(String description) |
| `GhsaId` | `String` | Required | - | String getGhsaId() | setGhsaId(String ghsaId) |
| `Identifiers` | [`List<Identifier1>`](../../doc/models/identifier-1.md) | Required | - | List<Identifier1> getIdentifiers() | setIdentifiers(List<Identifier1> identifiers) |
| `PublishedAt` | `String` | Required | - | String getPublishedAt() | setPublishedAt(String publishedAt) |
| `References` | [`List<Reference1>`](../../doc/models/reference-1.md) | Required | - | List<Reference1> getReferences() | setReferences(List<Reference1> references) |
| `Severity` | `String` | Required | - | String getSeverity() | setSeverity(String severity) |
| `Summary` | `String` | Required | - | String getSummary() | setSummary(String summary) |
| `UpdatedAt` | `String` | Required | - | String getUpdatedAt() | setUpdatedAt(String updatedAt) |
| `Vulnerabilities` | [`List<Vulnerability1>`](../../doc/models/vulnerability-1.md) | Required | - | List<Vulnerability1> getVulnerabilities() | setVulnerabilities(List<Vulnerability1> vulnerabilities) |
| `WithdrawnAt` | `String` | Required | - | String getWithdrawnAt() | setWithdrawnAt(String withdrawnAt) |

## Example (as JSON)

```json
{
  "cvss": {
    "score": 169.06,
    "vector_string": "vector_string6"
  },
  "cwes": [
    {
      "cwe_id": "cwe_id8",
      "name": "name0"
    }
  ],
  "description": "description0",
  "ghsa_id": "ghsa_id0",
  "identifiers": [
    {
      "type": "type4",
      "value": "value8"
    }
  ],
  "published_at": "published_at0",
  "references": [
    {
      "url": "url0"
    },
    {
      "url": "url1"
    }
  ],
  "severity": "severity0",
  "summary": "summary2",
  "updated_at": "updated_at4",
  "vulnerabilities": [
    {
      "first_patched_version": {
        "key1": "val1",
        "key2": "val2"
      },
      "package": {
        "ecosystem": "ecosystem7",
        "name": "name1"
      },
      "severity": "severity9",
      "vulnerable_version_range": "vulnerable_version_range1"
    },
    {
      "first_patched_version": {
        "key1": "val1",
        "key2": "val2"
      },
      "package": {
        "ecosystem": "ecosystem8",
        "name": "name2"
      },
      "severity": "severity0",
      "vulnerable_version_range": "vulnerable_version_range2"
    }
  ],
  "withdrawn_at": "withdrawn_at0"
}
```

