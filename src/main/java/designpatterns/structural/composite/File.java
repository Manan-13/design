package designpatterns.structural.composite;

public class File implements FileSystemComponent {

    public String name;

    File(String name) {
        this.name = name;
    }

    @Override
    public void ls(String indent) {
        System.out.println(indent+"File: "+name);
    }
}
