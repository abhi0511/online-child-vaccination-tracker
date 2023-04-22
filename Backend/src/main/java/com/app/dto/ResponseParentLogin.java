package com.app.dto;

import java.util.List;

import com.app.pojos.Child;
import com.app.pojos.Parent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class ResponseParentLogin {
	
	public ResponseParentLogin() {
		super();
	}
	public ResponseParentLogin(Parent parent, List<Child> childs) {
		super();
		this.parent = parent;
		this.childs = childs;
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	public List<Child> getChilds() {
		return childs;
	}
	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}
	private Parent parent; 
	private List<Child> childs;
	
	@Override
	public String toString() {
		return "ResponseParentLogin [parent=" + parent + ", childs=" + childs + "]";
	}
}
