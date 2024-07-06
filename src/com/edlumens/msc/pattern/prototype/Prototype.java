package com.edlumens.msc.pattern.prototype;

public interface Prototype extends Cloneable {
public AccessControl clone() throws CloneNotSupportedException;
}