package Composite.Models;


public abstract class FileSys {
    protected String name;
    protected String permissions;

    public FileSys(String name, String permissions) {
        this.name = name;
        this.permissions = permissions;
    }

    public abstract void delete();
    public abstract void rename(String newName);
    public abstract void showInfo();
}