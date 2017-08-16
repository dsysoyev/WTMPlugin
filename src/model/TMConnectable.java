package model;

@FunctionalInterface
public interface TMConnectable<T> {
    T login(String user, String password, String url);
}
