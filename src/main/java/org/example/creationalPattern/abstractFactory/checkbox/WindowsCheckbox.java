package org.example.creationalPattern.abstractFactory.checkbox;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint(){
        System.out.println("You have created WindowsCheckbox.");
    }
}
