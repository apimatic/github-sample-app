
# Alt Domain

## Structure

`AltDomain`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Host` | `String` | Optional | - | String getHost() | setHost(String host) |
| `Uri` | `String` | Optional | - | String getUri() | setUri(String uri) |
| `Nameservers` | `String` | Optional | - | String getNameservers() | setNameservers(String nameservers) |
| `DnsResolves` | `Boolean` | Optional | - | Boolean getDnsResolves() | setDnsResolves(Boolean dnsResolves) |
| `IsProxied` | `Boolean` | Optional | - | Boolean getIsProxied() | setIsProxied(Boolean isProxied) |
| `IsCloudflareIp` | `Boolean` | Optional | - | Boolean getIsCloudflareIp() | setIsCloudflareIp(Boolean isCloudflareIp) |
| `IsFastlyIp` | `Boolean` | Optional | - | Boolean getIsFastlyIp() | setIsFastlyIp(Boolean isFastlyIp) |
| `IsOldIpAddress` | `Boolean` | Optional | - | Boolean getIsOldIpAddress() | setIsOldIpAddress(Boolean isOldIpAddress) |
| `IsARecord` | `Boolean` | Optional | - | Boolean getIsARecord() | setIsARecord(Boolean isARecord) |
| `HasCnameRecord` | `Boolean` | Optional | - | Boolean getHasCnameRecord() | setHasCnameRecord(Boolean hasCnameRecord) |
| `HasMxRecordsPresent` | `Boolean` | Optional | - | Boolean getHasMxRecordsPresent() | setHasMxRecordsPresent(Boolean hasMxRecordsPresent) |
| `IsValidDomain` | `Boolean` | Optional | - | Boolean getIsValidDomain() | setIsValidDomain(Boolean isValidDomain) |
| `IsApexDomain` | `Boolean` | Optional | - | Boolean getIsApexDomain() | setIsApexDomain(Boolean isApexDomain) |
| `ShouldBeARecord` | `Boolean` | Optional | - | Boolean getShouldBeARecord() | setShouldBeARecord(Boolean shouldBeARecord) |
| `IsCnameToGithubUserDomain` | `Boolean` | Optional | - | Boolean getIsCnameToGithubUserDomain() | setIsCnameToGithubUserDomain(Boolean isCnameToGithubUserDomain) |
| `IsCnameToPagesDotGithubDotCom` | `Boolean` | Optional | - | Boolean getIsCnameToPagesDotGithubDotCom() | setIsCnameToPagesDotGithubDotCom(Boolean isCnameToPagesDotGithubDotCom) |
| `IsCnameToFastly` | `Boolean` | Optional | - | Boolean getIsCnameToFastly() | setIsCnameToFastly(Boolean isCnameToFastly) |
| `IsPointedToGithubPagesIp` | `Boolean` | Optional | - | Boolean getIsPointedToGithubPagesIp() | setIsPointedToGithubPagesIp(Boolean isPointedToGithubPagesIp) |
| `IsNonGithubPagesIpPresent` | `Boolean` | Optional | - | Boolean getIsNonGithubPagesIpPresent() | setIsNonGithubPagesIpPresent(Boolean isNonGithubPagesIpPresent) |
| `IsPagesDomain` | `Boolean` | Optional | - | Boolean getIsPagesDomain() | setIsPagesDomain(Boolean isPagesDomain) |
| `IsServedByPages` | `Boolean` | Optional | - | Boolean getIsServedByPages() | setIsServedByPages(Boolean isServedByPages) |
| `IsValid` | `Boolean` | Optional | - | Boolean getIsValid() | setIsValid(Boolean isValid) |
| `Reason` | `String` | Optional | - | String getReason() | setReason(String reason) |
| `RespondsToHttps` | `Boolean` | Optional | - | Boolean getRespondsToHttps() | setRespondsToHttps(Boolean respondsToHttps) |
| `EnforcesHttps` | `Boolean` | Optional | - | Boolean getEnforcesHttps() | setEnforcesHttps(Boolean enforcesHttps) |
| `HttpsError` | `String` | Optional | - | String getHttpsError() | setHttpsError(String httpsError) |
| `IsHttpsEligible` | `Boolean` | Optional | - | Boolean getIsHttpsEligible() | setIsHttpsEligible(Boolean isHttpsEligible) |
| `CaaError` | `String` | Optional | - | String getCaaError() | setCaaError(String caaError) |

## Example (as JSON)

```json
{
  "host": null,
  "uri": null,
  "nameservers": null,
  "dns_resolves": null,
  "is_proxied": null,
  "is_cloudflare_ip": null,
  "is_fastly_ip": null,
  "is_old_ip_address": null,
  "is_a_record": null,
  "has_cname_record": null,
  "has_mx_records_present": null,
  "is_valid_domain": null,
  "is_apex_domain": null,
  "should_be_a_record": null,
  "is_cname_to_github_user_domain": null,
  "is_cname_to_pages_dot_github_dot_com": null,
  "is_cname_to_fastly": null,
  "is_pointed_to_github_pages_ip": null,
  "is_non_github_pages_ip_present": null,
  "is_pages_domain": null,
  "is_served_by_pages": null,
  "is_valid": null,
  "reason": null,
  "responds_to_https": null,
  "enforces_https": null,
  "https_error": null,
  "is_https_eligible": null,
  "caa_error": null
}
```

