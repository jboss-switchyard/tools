<?xml version="1.0" encoding="UTF-8"?>
<bpmn2:definitions xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:bpmn2="http://www.omg.org/spec/BPMN/20100524/MODEL" xmlns:bpmndi="http://www.omg.org/spec/BPMN/20100524/DI" xmlns:dc="http://www.omg.org/spec/DD/20100524/DC" xmlns:di="http://www.omg.org/spec/DD/20100524/DI" xmlns:tns="http://www.jboss.org/drools" xmlns="http://www.jboss.org/drools" xsi:schemaLocation="http://www.omg.org/spec/BPMN/20100524/MODEL BPMN20.xsd http://www.jboss.org/drools drools.xsd http://www.bpsim.org/schemas/1.0 bpsim.xsd" id="Definition" expressionLanguage="http://www.mvel.org/2.0" targetNamespace="http://www.jboss.org/drools" typeLanguage="http://www.java.com/javaTypes">
  <bpmn2:process id="${processID}" tns:version="1" tns:packageName="${packageName}" tns:adHoc="false" name="${processName}" isExecutable="true" processType="Private">
    <bpmn2:extensionElements>
      <tns:import name="java.lang.Object"/>
    </bpmn2:extensionElements>
    <bpmn2:property id="${messageInName}" itemSubjectRef="ItemDefinition_1"/>
    <bpmn2:property id="${messageOutName}" itemSubjectRef="ItemDefinition_1"/>
    <bpmn2:endEvent id="EndEvent_1" name="EndProcess">
      <bpmn2:incoming>SequenceFlow_1</bpmn2:incoming>
    </bpmn2:endEvent>
    <bpmn2:startEvent id="StartEvent_1" name="StartProcess">
      <bpmn2:outgoing>SequenceFlow_1</bpmn2:outgoing>
    </bpmn2:startEvent>
    <bpmn2:sequenceFlow id="SequenceFlow_1" tns:priority="1" name="" sourceRef="StartEvent_1" targetRef="EndEvent_1"/>
  </bpmn2:process>
  <bpmn2:itemDefinition id="ItemDefinition_1" itemKind="Physical" structureRef="java.lang.Object"/>
  <bpmndi:BPMNDiagram id="BPMNDiagram_1">
    <bpmndi:BPMNPlane id="BPMNPlane_Process_1" bpmnElement="${packageName}.${processID}">
      <bpmndi:BPMNShape id="BPMNShape_StartEvent_1" bpmnElement="StartEvent_1">
        <dc:Bounds height="36.0" width="36.0" x="50.0" y="52.0"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNShape id="BPMNShape_EndEvent_1" bpmnElement="EndEvent_1">
        <dc:Bounds height="36.0" width="36.0" x="202.0" y="52.0"/>
      </bpmndi:BPMNShape>
      <bpmndi:BPMNEdge id="BPMNEdge_SequenceFlow_1" bpmnElement="SequenceFlow_1" sourceElement="BPMNShape_StartEvent_1" targetElement="BPMNShape_EndEvent_1">
        <di:waypoint xsi:type="dc:Point" x="86.0" y="70.0"/>
        <di:waypoint xsi:type="dc:Point" x="202.0" y="70.0"/>
      </bpmndi:BPMNEdge>
    </bpmndi:BPMNPlane>
  </bpmndi:BPMNDiagram>
</bpmn2:definitions>
