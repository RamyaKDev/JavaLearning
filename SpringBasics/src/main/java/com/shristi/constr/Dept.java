package com.shristi.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dept {
private String deptName;
private String deptHead;
public String getDeptName() {
	return deptName;
}
@Value("CSE")
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getDeptHead() {
	return deptHead;
}
@Value("BBB")
public void setDeptHead(String deptHead) {
	this.deptHead = deptHead;
}
@Override
public String toString() {
	return "Dept [deptName=" + deptName + ", deptHead=" + deptHead + "]";
}
}
