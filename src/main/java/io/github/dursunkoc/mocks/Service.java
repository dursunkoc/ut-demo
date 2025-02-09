package io.github.dursunkoc.mocks;

public class Service {
    private final Dependency dependency;

    public Service(Dependency dependency) {
        this.dependency = dependency;
    }

    public String process() {
       String data =  dependency.getData();
        return "Processing - " + data;
    }
}
