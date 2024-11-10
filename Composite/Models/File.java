package Composite.Models;

public class File extends FileSys {
    public File(String name, String permissions) {
        super(name, permissions);
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }

    @Override
    public void rename(String newName) {
        System.out.println("Renaming file " + name + " to " + newName);
        this.name = newName;
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name + ", Permissions: " + permissions);
    }
}