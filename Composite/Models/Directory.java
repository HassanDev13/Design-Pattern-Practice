package Composite.Models;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSys {
    private List<FileSys> children = new ArrayList<>();
    private Directory parentDirectory;

    public Directory(String name, String permissions) {
        super(name, permissions);
    }

    public void add(FileSys element) {
        children.add(element);
        if (element instanceof Directory) {
            ((Directory) element).parentDirectory = this;
        }
    }

    public void remove(FileSys element) {
        children.remove(element);
    }

    public Directory parent() {
        return parentDirectory;
    }

    public void list() {
        System.out.println("Listing contents of directory: " + name);
        for (FileSys child : children) {
            child.showInfo();
        }
    }

    public Directory cd(String directoryName) {
        for (FileSys child : children) {
            if (child instanceof Directory && child.name.equals(directoryName)) {
                return (Directory) child;
            }
        }
        System.out.println("Directory not found: " + directoryName);
        return null;
    }

    @Override
    public void delete() {
        System.out.println("Deleting directory: " + name);
        for (FileSys child : children) {
            child.delete();
        }
        children.clear();

        if (parentDirectory != null) {
            parentDirectory.remove(this);
        }
    }

    @Override
    public void rename(String newName) {
        System.out.println("Renaming directory " + name + " to " + newName);
        this.name = newName;
    }

    @Override
    public void showInfo() {
        System.out.println("Directory: " + name + ", Permissions: " + permissions);
    }
}