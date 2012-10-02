<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<#list transforms as transform>

<#if transform.from.namespaceURI = "">
  <xsl:template match="${transform.from.localPart}">
<#else>
  <xsl:template match="fromNS:${transform.from.localPart}" xmlns:fromNS="${transform.from.namespaceURI}">
</#if>
<#if transform.to.namespaceURI = "">
    <${transform.to.localPart}>
<#else>
    <toNS:${transform.to.localPart} xmlns:toNS="${transform.to.namespaceURI}">
</#if>
      <!-- TODO: Add content for target -->
<#if transform.to.namespaceURI = "">
    </${transform.to.localPart}>
<#else>
    </toNS:${transform.to.localPart}>
</#if>
  </xsl:template>
</#list>

</xsl:stylesheet>