package com.proretention.scrm.Integration.visitor;

public class Computer implements ComputerPart {
    ComputerPart[] part;
    public Computer()
    {
        part = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};

    }
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for(int i=0;i<part.length;i++)
        {
            part[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);

    }
}
