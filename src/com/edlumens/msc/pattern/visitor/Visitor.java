package com.edlumens.msc.pattern.visitor;

public interface Visitor {
	public void visit(HtmlElement element);
	public void visit(HtmlParentElement parentElement);
}
