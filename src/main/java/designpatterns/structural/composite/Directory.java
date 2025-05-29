package designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent{

    public String name;
    public List<FileSystemComponent> components;

    Directory(String name, List<FileSystemComponent> components){
        this.name = name;
        this.components = new ArrayList<>(components);
    }

    public void add(FileSystemComponent component){
        components.add(component);
    }

    public void remove(FileSystemComponent component){
        components.remove(component);
    }

    @Override
    public void ls(String indent) {
        System.out.println(indent+"Directory: "+name);
        for(FileSystemComponent component: components){
            component.ls(indent+" ");
        }
    }
}
