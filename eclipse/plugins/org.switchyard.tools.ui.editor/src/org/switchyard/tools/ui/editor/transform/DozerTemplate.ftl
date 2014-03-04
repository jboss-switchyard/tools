<?xml version="1.0" encoding="UTF-8"?>
<mappings xmlns="http://dozer.sourceforge.net"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://dozer.sourceforge.net http://dozer.sourceforge.net/schema/beanmapping.xsd">
  
  <configuration>
    <!-- default dateformat will apply to all class maps unless the class mapping explicitly overrides it -->
    <date-format>MM/dd/yyyy HH:mm</date-format>
    <!-- default wildcard policy that will apply to all class maps unless the class mapping explicitly overrides it -->
    <wildcard>true</wildcard>
  </configuration>

<#list transforms as transform>

  <mapping>
    <class-a>${transform.from.localPart}</class-a>
    <class-b>${transform.to.localPart}</class-b>
    
    <!-- insert field-level mappings below -->
    <!-- 
        <field>
            <a>fieldA</a>
            <b>fieldB</b>
        </field> 
    -->
  </mapping>

</#list>

</mappings>