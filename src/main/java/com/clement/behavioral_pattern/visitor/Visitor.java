package com.clement.behavioral_pattern.visitor;

public interface Visitor {
    void visit(Love love);
    void visit(Work work);
}
